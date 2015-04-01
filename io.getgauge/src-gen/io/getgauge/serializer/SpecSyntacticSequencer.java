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
	protected AbstractElementAlias match_Comment_SINGLE_NLTerminalRuleCall_2_p;
	protected AbstractElementAlias match_Scenario_HyphenMinusKeyword_1_2_p;
	protected AbstractElementAlias match_Scenario_SINGLE_NLTerminalRuleCall_0_2_p;
	protected AbstractElementAlias match_Scenario_SINGLE_NLTerminalRuleCall_1_3_p;
	protected AbstractElementAlias match_Spec_EqualsSignKeyword_1_2_p;
	protected AbstractElementAlias match_Spec_SINGLE_NLTerminalRuleCall_0_2_p;
	protected AbstractElementAlias match_Spec_SINGLE_NLTerminalRuleCall_1_3_p;
	protected AbstractElementAlias match_Step_SINGLE_NLTerminalRuleCall_3_1_a;
	protected AbstractElementAlias match_Step_SINGLE_NLTerminalRuleCall_4_p;
	protected AbstractElementAlias match_Step___EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5__a;
	protected AbstractElementAlias match_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__a;
	protected AbstractElementAlias match_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__p;
	protected AbstractElementAlias match_Table_WSTerminalRuleCall_0_a;
	protected AbstractElementAlias match_Table_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_Table_WSTerminalRuleCall_5_0_a;
	protected AbstractElementAlias match_Table___VerticalLineKeyword_3_0_HyphenMinusKeyword_3_1_p__p;
	protected AbstractElementAlias match_Tags_SINGLE_NLTerminalRuleCall_5_p;
	protected AbstractElementAlias match_Tags_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_Tags___CommaKeyword_4_2_or_WORDTerminalRuleCall_4_0_or_WSTerminalRuleCall_4_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpecGrammarAccess) access;
		match_Comment_SINGLE_NLTerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2());
		match_Scenario_HyphenMinusKeyword_1_2_p = new TokenAlias(true, false, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2());
		match_Scenario_SINGLE_NLTerminalRuleCall_0_2_p = new TokenAlias(true, false, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2());
		match_Scenario_SINGLE_NLTerminalRuleCall_1_3_p = new TokenAlias(true, false, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_3());
		match_Spec_EqualsSignKeyword_1_2_p = new TokenAlias(true, false, grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2());
		match_Spec_SINGLE_NLTerminalRuleCall_0_2_p = new TokenAlias(true, false, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2());
		match_Spec_SINGLE_NLTerminalRuleCall_1_3_p = new TokenAlias(true, false, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_3());
		match_Step_SINGLE_NLTerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_1());
		match_Step_SINGLE_NLTerminalRuleCall_4_p = new TokenAlias(true, false, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_4());
		match_Step___EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4()), new TokenAlias(false, false, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3()), new TokenAlias(false, false, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5()));
		match_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4()), new TokenAlias(false, false, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5())), new TokenAlias(true, true, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()));
		match_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__p = new GroupAlias(true, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4()), new TokenAlias(false, false, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()), new TokenAlias(false, false, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5())), new TokenAlias(true, true, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()));
		match_Table_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getTableAccess().getWSTerminalRuleCall_0());
		match_Table_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getTableAccess().getWSTerminalRuleCall_2());
		match_Table_WSTerminalRuleCall_5_0_a = new TokenAlias(true, true, grammarAccess.getTableAccess().getWSTerminalRuleCall_5_0());
		match_Table___VerticalLineKeyword_3_0_HyphenMinusKeyword_3_1_p__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0()), new TokenAlias(true, false, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1()));
		match_Tags_SINGLE_NLTerminalRuleCall_5_p = new TokenAlias(true, false, grammarAccess.getTagsAccess().getSINGLE_NLTerminalRuleCall_5());
		match_Tags_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getTagsAccess().getWSTerminalRuleCall_2());
		match_Tags___CommaKeyword_4_2_or_WORDTerminalRuleCall_4_0_or_WSTerminalRuleCall_4_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getTagsAccess().getCommaKeyword_4_2()), new TokenAlias(false, false, grammarAccess.getTagsAccess().getWORDTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getTagsAccess().getWSTerminalRuleCall_4_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSEPARATORSRule())
			return getSEPARATORSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSINGLE_NLRule())
			return getSINGLE_NLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTABLE_ROW_ENDRule())
			return getTABLE_ROW_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWORDRule())
			return getWORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SEPARATORS: !('\r' | '\n' | 'a'..'z' | 'A'..'Z' | '0'..'9' | '_' | ' ' | '\t');
	 */
	protected String getSEPARATORSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal SINGLE_NL: ('\r'? '\n') | EOF;
	 */
	protected String getSINGLE_NLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * terminal TABLE_ROW_END: '|' SINGLE_NL;
	 */
	protected String getTABLE_ROW_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|\n";
	}
	
	/**
	 * terminal WORD: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal WS: ' ' | '\t';
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Comment_SINGLE_NLTerminalRuleCall_2_p.equals(syntax))
				emit_Comment_SINGLE_NLTerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Scenario_HyphenMinusKeyword_1_2_p.equals(syntax))
				emit_Scenario_HyphenMinusKeyword_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Scenario_SINGLE_NLTerminalRuleCall_0_2_p.equals(syntax))
				emit_Scenario_SINGLE_NLTerminalRuleCall_0_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Scenario_SINGLE_NLTerminalRuleCall_1_3_p.equals(syntax))
				emit_Scenario_SINGLE_NLTerminalRuleCall_1_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Spec_EqualsSignKeyword_1_2_p.equals(syntax))
				emit_Spec_EqualsSignKeyword_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Spec_SINGLE_NLTerminalRuleCall_0_2_p.equals(syntax))
				emit_Spec_SINGLE_NLTerminalRuleCall_0_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Spec_SINGLE_NLTerminalRuleCall_1_3_p.equals(syntax))
				emit_Spec_SINGLE_NLTerminalRuleCall_1_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step_SINGLE_NLTerminalRuleCall_3_1_a.equals(syntax))
				emit_Step_SINGLE_NLTerminalRuleCall_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step_SINGLE_NLTerminalRuleCall_4_p.equals(syntax))
				emit_Step_SINGLE_NLTerminalRuleCall_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step___EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5__a.equals(syntax))
				emit_Step___EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__a.equals(syntax))
				emit_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__p.equals(syntax))
				emit_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Table_WSTerminalRuleCall_0_a.equals(syntax))
				emit_Table_WSTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Table_WSTerminalRuleCall_2_a.equals(syntax))
				emit_Table_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Table_WSTerminalRuleCall_5_0_a.equals(syntax))
				emit_Table_WSTerminalRuleCall_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Table___VerticalLineKeyword_3_0_HyphenMinusKeyword_3_1_p__p.equals(syntax))
				emit_Table___VerticalLineKeyword_3_0_HyphenMinusKeyword_3_1_p__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Tags_SINGLE_NLTerminalRuleCall_5_p.equals(syntax))
				emit_Tags_SINGLE_NLTerminalRuleCall_5_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Tags_WSTerminalRuleCall_2_a.equals(syntax))
				emit_Tags_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Tags___CommaKeyword_4_2_or_WORDTerminalRuleCall_4_0_or_WSTerminalRuleCall_4_1__p.equals(syntax))
				emit_Tags___CommaKeyword_4_2_or_WORDTerminalRuleCall_4_0_or_WSTerminalRuleCall_4_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Comment_SINGLE_NLTerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'+
	 */
	protected void emit_Scenario_HyphenMinusKeyword_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Scenario_SINGLE_NLTerminalRuleCall_0_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Scenario_SINGLE_NLTerminalRuleCall_1_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_Spec_EqualsSignKeyword_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Spec_SINGLE_NLTerminalRuleCall_0_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Spec_SINGLE_NLTerminalRuleCall_1_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL*
	 */
	protected void emit_Step_SINGLE_NLTerminalRuleCall_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Step_SINGLE_NLTerminalRuleCall_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (SEPARATORS | WORD | '-' | '=' | WS)*
	 */
	protected void emit_Step___EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_SEPARATORSTerminalRuleCall_2_1_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((WORD | '-' | '=' | WS) SEPARATORS*)*
	 */
	protected void emit_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((WORD | '-' | '=' | WS) SEPARATORS*)+
	 */
	protected void emit_Step_____EqualsSignKeyword_2_0_4_or_HyphenMinusKeyword_2_0_3_or_WORDTerminalRuleCall_2_0_2_or_WSTerminalRuleCall_2_0_5___SEPARATORSTerminalRuleCall_2_1_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Table_WSTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Table_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Table_WSTerminalRuleCall_5_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('|' '-'+)+
	 */
	protected void emit_Table___VerticalLineKeyword_3_0_HyphenMinusKeyword_3_1_p__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SINGLE_NL+
	 */
	protected void emit_Tags_SINGLE_NLTerminalRuleCall_5_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Tags_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (WORD | WS | ',')+
	 */
	protected void emit_Tags___CommaKeyword_4_2_or_WORDTerminalRuleCall_4_0_or_WSTerminalRuleCall_4_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
