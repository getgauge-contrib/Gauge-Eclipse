package io.getgauge.serializer;

import com.google.inject.Inject;
import io.getgauge.services.SpecGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SpecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SpecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Comment_SINGLE_NLTerminalRuleCall_1_p;
	protected AbstractElementAlias match_Scenario_SINGLE_NLTerminalRuleCall_2_p;
	protected AbstractElementAlias match_Spec_SINGLE_NLTerminalRuleCall_2_p;
	protected AbstractElementAlias match_Step_SINGLE_NLTerminalRuleCall_3_p;
	protected AbstractElementAlias match_Step___SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2__a;
	protected AbstractElementAlias match_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__a;
	protected AbstractElementAlias match_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpecGrammarAccess) access;
		match_Comment_SINGLE_NLTerminalRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1());
		match_Scenario_SINGLE_NLTerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2());
		match_Spec_SINGLE_NLTerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2());
		match_Step_SINGLE_NLTerminalRuleCall_3_p = new TokenAlias(true, false, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3());
		match_Step___SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()));
		match_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()), new TokenAlias(true, true, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()));
		match_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()), new TokenAlias(true, true, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSEPARATORSRule())
			return getSEPARATORSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSINGLE_NLRule())
			return getSINGLE_NLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWORDRule())
			return getWORDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SEPARATORS:
	 * 	!('\r' | '\n' | 'a'..'z' | 'A'..'Z' | '0'..'9' | '_' ) 
	 * ;
	 */
	protected String getSEPARATORSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal SINGLE_NL:
	 * 	'\r'? '\n'
	 * ;
	 */
	protected String getSINGLE_NLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * terminal WORD: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Comment_SINGLE_NLTerminalRuleCall_1_p.equals(syntax))
				emit_Comment_SINGLE_NLTerminalRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Scenario_SINGLE_NLTerminalRuleCall_2_p.equals(syntax))
				emit_Scenario_SINGLE_NLTerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Spec_SINGLE_NLTerminalRuleCall_2_p.equals(syntax))
				emit_Spec_SINGLE_NLTerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step_SINGLE_NLTerminalRuleCall_3_p.equals(syntax))
				emit_Step_SINGLE_NLTerminalRuleCall_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step___SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2__a.equals(syntax))
				emit_Step___SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__a.equals(syntax))
				emit_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__p.equals(syntax))
				emit_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Comment_SINGLE_NLTerminalRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Scenario_SINGLE_NLTerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Spec_SINGLE_NLTerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Step_SINGLE_NLTerminalRuleCall_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (SEPARATORS | WORD)*
	 */
	protected void emit_Step___SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (WORD SEPARATORS*)*
	 */
	protected void emit_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (WORD SEPARATORS*)+
	 */
	protected void emit_Step___WORDTerminalRuleCall_2_0_2_SEPARATORSTerminalRuleCall_2_1_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
