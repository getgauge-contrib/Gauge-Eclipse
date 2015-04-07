package io.getgauge.ui;

import io.getgauge.spec.DynamicParam;
import io.getgauge.spec.StaticParam;
import io.getgauge.spec.Step;
import io.getgauge.spec.StepDefinition;

import java.io.File;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.thoughtworks.gauge.eclipse.GaugePlugin;
import com.thoughtworks.gauge.eclipse.project.Concept;
import com.thoughtworks.gauge.eclipse.project.GaugeWorkspace;

@Singleton
public class SpecHyperlinkHelper extends HyperlinkHelper {

	private static final String STEP = "Step";
	@Inject
	private EObjectAtOffsetHelper helper;
	private static HashMap<String, String> parsedStepTextCache = new HashMap<String, String>();
	private static HashMap<String, IMethod> stepImplementationCache = new HashMap<String, IMethod>();

	@Override
	public IHyperlink[] createHyperlinksByOffset(XtextResource resource,
			int offset, boolean createMultipleHyperlinks) {

		EObject eObject = helper.resolveElementAt(resource, offset);
		if (eObject instanceof StepDefinition || 
				eObject instanceof StaticParam || 
				eObject instanceof DynamicParam) {
			IParseResult parseResult = resource.getParseResult();
			INode node = NodeModelUtils.findLeafNodeAtOffset(
					parseResult.getRootNode(), offset);
			while (!(node instanceof CompositeNode && node.getSemanticElement() instanceof StepDefinition)) {
				node = node.getParent();
			}
			String description = getStepText(node);
			if (!openConceptDefinition(eObject, description)) {
				openStepDefinition(eObject, description);
			}
		}
		return null;
	}

	private String getStepText(INode node) {
		String description = node.getText().replaceAll("^\\*", "").trim();
		Step step = (Step) node.getParent().getSemanticElement();
		if (step.getTable() != null) {
			// If the step contains a table, the description is automatically
			// appended with a dynamic parameter
			return description.concat(" <table>");
		}
		return description;
	}

	private boolean openConceptDefinition(EObject eobj, String stepText) {
		GaugeWorkspace gaugeWorkspace = GaugePlugin.getDefault()
				.getGaugeWorkspace();
		IProject project = getProjectFor(eobj);
		Concept concept = gaugeWorkspace.searchConcept(project, stepText);
		if (concept != null) {
			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
			File file = new File(concept.getFilePath());
			try {
				IEditorDescriptor desc = PlatformUI.getWorkbench()
						.getEditorRegistry().getDefaultEditor(file.getName());
				IEditorPart editor = IDE.openEditor(activePage, file.toURI(), desc.getId(), true);
				goToLineNumber(editor, concept.getLineNumber());
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

	private static void goToLineNumber(IEditorPart editorPart, int lineNumber) {
		if (!(editorPart instanceof ITextEditor) || lineNumber <= 0) {
			return;
		}
		ITextEditor editor = (ITextEditor) editorPart;
		IDocument document = editor.getDocumentProvider().getDocument(
				editor.getEditorInput());
		if (document != null) {
			IRegion lineInfo = null;
			try {
				lineInfo = document.getLineInformation(lineNumber - 1);
			} catch (BadLocationException e) {
				// do nothing
			}
			if (lineInfo != null) {
				editor.selectAndReveal(lineInfo.getOffset(),
						lineInfo.getLength());
			}
		}
	}

	private void openStepDefinition(EObject eObject, String description) {
		SearchPattern pattern = SearchPattern.createPattern(STEP,
				IJavaSearchConstants.ANNOTATION_TYPE,
				IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE,
				SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE);

		String parsedText = getParsedText(eObject, description);
		if (stepImplementationCache.containsKey(parsedText)) {
			try {
				JavaUI.openInEditor(stepImplementationCache.get(parsedText));
				return;
			} catch (PartInitException | JavaModelException e) {
				e.printStackTrace();
			}
		}

		SearchRequestor requestor = new SearchRequestor() {
			public void acceptSearchMatch(SearchMatch match)
					throws CoreException {
				if (match.getElement() instanceof IMethod) {
					String des = description;
					IMethod method = (IMethod) match.getElement();
					IAnnotation type = method.getAnnotation(STEP);
					String annotationValue = (String) type
							.getMemberValuePairs()[0].getValue();
					if (stepTextEquals(eObject, des, annotationValue)) {
						stepImplementationCache.put(parsedText, method);
						JavaUI.openInEditor(method);
					}
				}
			}
		};

		SearchEngine searchEngine = new SearchEngine();

		try {
			searchEngine.search(pattern, new SearchParticipant[] { SearchEngine
					.getDefaultSearchParticipant() }, SearchEngine
					.createWorkspaceScope(), requestor, null);
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
	}

	private boolean stepTextEquals(EObject eobj, String first, String second) {
		String step1 = getParsedText(eobj, first);
		String step2 = getParsedText(eobj, second);
		return step1.equals(step2);
	}

	private String getParsedText(EObject eobj, String stepText) {
		if (parsedStepTextCache.containsKey(stepText)) {
			return parsedStepTextCache.get(stepText);
		}
		IProject project = getProjectFor(eobj);

		GaugeWorkspace gaugeWorkspace = GaugePlugin.getDefault()
				.getGaugeWorkspace();

		String parsedStep = gaugeWorkspace.getParsedStep(project, stepText);
		parsedStepTextCache.put(stepText, parsedStep);
		return parsedStep;
	}

	private IProject getProjectFor(EObject eobj) {
		String platformString = eobj.eResource().getURI()
				.toPlatformString(true);
		IFile currentFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(platformString));
		return currentFile.getProject();
	}
}
