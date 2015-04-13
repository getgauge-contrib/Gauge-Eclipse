package io.getgauge;

import io.getgauge.spec.Element;
import io.getgauge.spec.Step;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class StepUtil {

	public static String getStepText(Step step) {
		INode stepNode = NodeModelUtils.findActualNodeFor(step.getDefinition());
		String description = stepNode.getText().replaceAll("^\\*", "").trim();
		if (step.getTable() != null) {
			// If the step contains a table, the description is automatically
			// appended with a dynamic parameter
			return description.concat(" <table>");
		}
		return description;
	}
	
	public static String getElementText(Element scenario) {
		INode scenarioNode = NodeModelUtils.findActualNodeFor(scenario);
		return scenarioNode.getText();
	}

	public static String getStepText(INode node) {
		Step step = (Step) node.getParent().getSemanticElement();
		return getStepText(step);
	}
}
