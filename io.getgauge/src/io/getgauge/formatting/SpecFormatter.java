/*
 * generated by Xtext
 */
package io.getgauge.formatting;

import com.google.inject.Inject;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import io.getgauge.services.SpecGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class SpecFormatter extends AbstractDeclarativeFormatter {
	
	@Inject
	private SpecGrammarAccess grammarAccess; 

	@Override
	protected void configureFormatting(FormattingConfig c) {
		c.setLinewrap(0, 1, 2).after(grammarAccess.getSpecRule());
		c.setLinewrap(0, 1, 2).after(grammarAccess.getStepRule());
		c.setLinewrap(0, 1, 2).after(grammarAccess.getScenarioRule());
	}
}
