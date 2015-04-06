package io.getgauge.ui;

import io.getgauge.spec.Step;
import io.getgauge.spec.StepDefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class SpecHyperlinkHelper extends HyperlinkHelper {

	private static final String STEP = "Step";
	@Inject
	private EObjectAtOffsetHelper helper;

	@Override
	public IHyperlink[] createHyperlinksByOffset(XtextResource resource,
			int offset, boolean createMultipleHyperlinks) {
		IHyperlink[] original = super.createHyperlinksByOffset(resource, offset,
						createMultipleHyperlinks);
		List<IHyperlink> hyperlinks = (original == null ? new ArrayList<IHyperlink>() : Arrays.asList(original));

		EObject eObject = helper.resolveElementAt(resource, offset);
		if (eObject instanceof StepDefinition) {
			IParseResult parseResult = resource.getParseResult();
			INode node = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			while (!(node instanceof CompositeNode && node.getSemanticElement() instanceof StepDefinition)) {
				node = node.getParent();
			}
			String description = getStepText(node);
			hyperlinks.addAll(findStepDefinition(description, new Region(node.getOffset(), node.getText().trim().length())));
		}
		
		return hyperlinks.isEmpty() ? null : Iterables.toArray(hyperlinks, IHyperlink.class);
	}
	
	private String getStepText(INode node){
		String description = node.getText().replaceAll("^\\*", "").trim();
		Step step = (Step)node.getParent().getSemanticElement();
		if(step.getTable()!=null) {
			// If the step contains a table, the description is automatically appended with a dynamic parameter
			return description.concat(" <table>");
		}
		return description;
	}

	private Collection<? extends IHyperlink> findStepDefinition(
			String description, Region region) {
		SearchPattern pattern = SearchPattern.createPattern(STEP, IJavaSearchConstants.ANNOTATION_TYPE,
				IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE, SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE);

		SearchRequestor requestor = new SearchRequestor() {
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				if (match.getElement() instanceof IMethod) {
					String des = description;
					IMethod method = (IMethod) match.getElement();
					IAnnotation type = method.getAnnotation(STEP);
					String annotationValue = (String) type.getMemberValuePairs()[0].getValue();
					if(stepTextEquals(des, annotationValue)){
						JavaUI.openInEditor(method);
					}
				}
			}
		};

		SearchEngine searchEngine = new SearchEngine();

		try{
			searchEngine.search(pattern, new SearchParticipant[] {SearchEngine.getDefaultSearchParticipant()}, SearchEngine.createWorkspaceScope(), requestor, null );	
		}
		catch(CoreException ex){
			ex.printStackTrace();
		}
		return null;
	}

	private static boolean stepTextEquals(String first, String second) {
		String stepParamRegex = "\"([^\"]*)\"|<([^>]*)>";
		return first.replaceAll(stepParamRegex, "{}").equals(second.replaceAll(stepParamRegex, "{}"));
	}
}
