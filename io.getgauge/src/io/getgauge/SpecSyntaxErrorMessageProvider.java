package io.getgauge;

import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class SpecSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		// Ref: https://github.com/getgauge/Gauge-Eclipse/issues/5
		// HACK : Ideally the Spec.xtext grammar should allow EOF to be a valid line end
		// The grammar workarounds do not seem to work without major refactoring.
		// Added this to prevent enforcing a newline at the end of a file.
		if(!context.getDefaultMessage().contains("'<EOF>'"))
			return super.getSyntaxErrorMessage(context);
		return null;
	}
}
