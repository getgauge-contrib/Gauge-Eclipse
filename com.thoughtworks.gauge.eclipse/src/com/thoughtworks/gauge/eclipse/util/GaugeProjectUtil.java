package com.thoughtworks.gauge.eclipse.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import com.thoughtworks.gauge.eclipse.GaugePlugin;
import com.thoughtworks.gauge.eclipse.project.GaugeWorkspace;

public class GaugeProjectUtil {

	private static final String STEP = "*Step";
	private static final HashMap<String, String> parsedStepTextCache = new HashMap<String, String>();
	
	public static HashMap<String, IMethod> getStepImplementations() {
		
		final HashMap<String, IMethod> stepImpls = new HashMap<String, IMethod>();
		SearchPattern pattern = SearchPattern.createPattern(STEP,
				IJavaSearchConstants.ANNOTATION_TYPE,
				IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE,
				SearchPattern.R_PATTERN_MATCH);

		SearchRequestor requestor = new SearchRequestor() {
			public void acceptSearchMatch(SearchMatch match)
					throws CoreException {
				if (match.getElement() instanceof IMethod) {
					IMethod method = (IMethod) match.getElement();
					
					IAnnotation type = getStepAnnotation(method);
					if(type!=null){
						// TODO: need to fix multi valued steps.
						String annotationValue = (String) type
								.getMemberValuePairs()[0].getValue();
						stepImpls.put(GaugeProjectUtil.getParsedText(annotationValue), method);
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
		return stepImpls;
	}
	
	public static List<String> getImplementedSteps() {
		List<String> list = new ArrayList<String>();
		for (String step : getStepImplementations().keySet()) {
			list.add(step);
		}
		return list;
	}
	
	public static boolean stepTextEquals(String first, String second) {
		String step1 = getParsedText(first);
		String step2 = getParsedText(second);
		return step1.equals(step2);
	}

	public static String getParsedText(String stepText) {
		if (parsedStepTextCache.containsKey(stepText)) {
			return parsedStepTextCache.get(stepText);
		}

		GaugeWorkspace gaugeWorkspace = GaugePlugin.getDefault()
				.getGaugeWorkspace();

		String parsedStep = gaugeWorkspace.getParsedStep(stepText);
		parsedStepTextCache.put(stepText, parsedStep);
		return parsedStep;
	}
	
	private static IAnnotation getStepAnnotation(IMethod method) throws JavaModelException {
		for (IAnnotation a : method.getAnnotations()) {
			if(a.getElementName().equals("Step") || a.getElementName().equals("com.thoughtworks.gauge.Step")) {
				return a;
			}
		}
		return null;
	}
}
