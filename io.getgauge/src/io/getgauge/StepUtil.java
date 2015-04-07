package io.getgauge;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import io.getgauge.spec.Step;

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

	public static String getStepText(INode node) {
		Step step = (Step) node.getParent().getSemanticElement();
		return getStepText(step);
	}
}
