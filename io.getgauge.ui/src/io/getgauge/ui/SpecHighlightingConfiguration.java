package io.getgauge.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SpecHighlightingConfiguration extends DefaultHighlightingConfiguration{

	public static final String SPEC = "Spec";
	public static final String SCENARIO = "Scenario";
	public static final String STEP = "Step";
	public static final String STATIC_PARAM = "StaticParam";
	public static final String DYNAMIC_PARAM = "DynamicParam";
	public static final String TAGS = "Tags";
	public static final String DEFAULT = "Default";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(SPEC, SPEC , specStyle());
		acceptor.acceptDefaultHighlighting(SCENARIO, SCENARIO, scenarioStyle());
		acceptor.acceptDefaultHighlighting(STEP, STEP , stepStyle());
		acceptor.acceptDefaultHighlighting(STATIC_PARAM, STATIC_PARAM, staticParamStyle());
		acceptor.acceptDefaultHighlighting(DYNAMIC_PARAM, DYNAMIC_PARAM, dynamicParamStyle());
		acceptor.acceptDefaultHighlighting(TAGS, TAGS, getTagsStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT, DEFAULT , defaultTextStyle());
	}

	private TextStyle stepStyle() {
		return stringTextStyle().copy();
	}

	private TextStyle scenarioStyle() {
		TextStyle textStyle = keywordTextStyle().copy();;
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	private TextStyle specStyle() {
		TextStyle textStyle = numberTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	private TextStyle staticParamStyle() {
		TextStyle textStyle = taskTextStyle().copy();
		return textStyle;
	}

	private TextStyle dynamicParamStyle() {
		TextStyle textStyle = taskTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	private TextStyle getTagsStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255, 100, 100));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
