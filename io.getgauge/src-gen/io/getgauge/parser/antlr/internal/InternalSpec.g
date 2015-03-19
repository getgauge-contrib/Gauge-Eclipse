/*
* generated by Xtext
*/
grammar InternalSpec;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package io.getgauge.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package io.getgauge.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.getgauge.services.SpecGrammarAccess;

}

@parser::members {

 	private SpecGrammarAccess grammarAccess;
 	
    public InternalSpecParser(TokenStream input, SpecGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected SpecGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsSpecParserRuleCall_0_0()); 
	    }
		lv_definitions_0_1=ruleSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"definitions",
        		lv_definitions_0_1, 
        		"Spec");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsScenarioParserRuleCall_0_1()); 
	    }
		lv_definitions_0_2=ruleScenario		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"definitions",
        		lv_definitions_0_2, 
        		"Scenario");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsStepParserRuleCall_0_2()); 
	    }
		lv_definitions_0_3=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"definitions",
        		lv_definitions_0_3, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsCommentParserRuleCall_0_3()); 
	    }
		lv_definitions_0_4=ruleComment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"definitions",
        		lv_definitions_0_4, 
        		"Comment");
	        afterParserOrEnumRuleCall();
	    }

)

)
)*
;





// Entry rule entryRuleSpec
entryRuleSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSpecRule()); }
	 iv_ruleSpec=ruleSpec 
	 { $current=$iv_ruleSpec.current; } 
	 EOF 
;

// Rule Spec
ruleSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='# ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_0_1_0()); 
	    }
		lv_name_1_0=ruleTextPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSpecRule());
	        }
       		add(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"TextPart");
	        afterParserOrEnumRuleCall();
	    }

)
)+(this_SINGLE_NL_2=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_2, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
    }
)+)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_1_0_0()); 
	    }
		lv_name_3_0=ruleTextPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSpecRule());
	        }
       		add(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"TextPart");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_SINGLE_NL_4=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_4, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
    }
(	otherlv_5='=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2());
    }
)+(this_SINGLE_NL_6=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_6, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_3()); 
    }
)+))
;





// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	 iv_ruleScenario=ruleScenario 
	 { $current=$iv_ruleScenario.current; } 
	 EOF 
;

// Rule Scenario
ruleScenario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='## ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_0_1_0()); 
	    }
		lv_name_1_0=ruleTextPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"TextPart");
	        afterParserOrEnumRuleCall();
	    }

)
)+(this_SINGLE_NL_2=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_2, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
    }
)+)
    |(((
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_1_0_0_0()); 
	    }
		lv_name_3_0=ruleTextPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"TextPart");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_SINGLE_NL_4=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_0_1()); 
    }
(	otherlv_5='-' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_0_2());
    }
)+(this_SINGLE_NL_6=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_6, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_0_3()); 
    }
)+)(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getCommentsCommentParserRuleCall_1_1_0()); 
	    }
		lv_comments_7_0=ruleComment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"comments",
        		lv_comments_7_0, 
        		"Comment");
	        afterParserOrEnumRuleCall();
	    }

)
)+((
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagsParserRuleCall_1_2_0_0()); 
	    }
		lv_tags_8_0=ruleTags		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		set(
       			$current, 
       			"tags",
        		lv_tags_8_0, 
        		"Tags");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_SINGLE_NL_9=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_9, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
    }
)+)?))
;





// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	 iv_ruleStep=ruleStep 
	 { $current=$iv_ruleStep.current; } 
	 EOF 
;

// Rule Step
ruleStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStepAccess().getStepAction_0(),
            $current);
    }
)	otherlv_1='* ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
    }
(((
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
	    }
		lv_staticParams_2_0=ruleStaticParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		add(
       			$current, 
       			"staticParams",
        		lv_staticParams_2_0, 
        		"StaticParam");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
	    }
		lv_dynamicParams_3_0=ruleDynamicParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		add(
       			$current, 
       			"dynamicParams",
        		lv_dynamicParams_3_0, 
        		"DynamicParam");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |this_WORD_4=RULE_WORD
    { 
    newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
    }

    |	otherlv_5='-' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3());
    }

    |	otherlv_6='=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4());
    }

    |this_WS_7=RULE_WS
    { 
    newLeafNode(this_WS_7, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5()); 
    }
)(this_SEPARATORS_8=RULE_SEPARATORS
    { 
    newLeafNode(this_SEPARATORS_8, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
    }
)*)+(this_SINGLE_NL_9=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_9, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_0()); 
    }
(this_SINGLE_NL_10=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_10, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_1()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_2_0()); 
	    }
		lv_table_11_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		set(
       			$current, 
       			"table",
        		lv_table_11_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
))?(this_SINGLE_NL_12=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_12, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_4()); 
    }
)+)
;





// Entry rule entryRuleStaticParam
entryRuleStaticParam returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStaticParamRule()); }
	 iv_ruleStaticParam=ruleStaticParam 
	 { $current=$iv_ruleStaticParam.current; } 
	 EOF 
;

// Rule StaticParam
ruleStaticParam returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_STATIC_PARAM
		{
			newLeafNode(lv_name_0_0, grammarAccess.getStaticParamAccess().getNameSTATIC_PARAMTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStaticParamRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STATIC_PARAM");
	    }

)
)
;





// Entry rule entryRuleDynamicParam
entryRuleDynamicParam returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDynamicParamRule()); }
	 iv_ruleDynamicParam=ruleDynamicParam 
	 { $current=$iv_ruleDynamicParam.current; } 
	 EOF 
;

// Rule DynamicParam
ruleDynamicParam returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_DYNAMIC_PARAM
		{
			newLeafNode(lv_name_0_0, grammarAccess.getDynamicParamAccess().getNameDYNAMIC_PARAMTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDynamicParamRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"DYNAMIC_PARAM");
	    }

)
)
;





// Entry rule entryRuleTags
entryRuleTags returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTagsRule()); } 
	 iv_ruleTags=ruleTags 
	 { $current=$iv_ruleTags.current.getText(); }  
	 EOF 
;

// Rule Tags
ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='tags' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTagsAccess().getTagsKeyword_0()); 
    }
(    this_WS_1=RULE_WS    {
		$current.merge(this_WS_1);
    }

    { 
    newLeafNode(this_WS_1, grammarAccess.getTagsAccess().getWSTerminalRuleCall_1()); 
    }
)*
	kw=':' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTagsAccess().getColonKeyword_2()); 
    }
(    this_WS_3=RULE_WS    {
		$current.merge(this_WS_3);
    }

    { 
    newLeafNode(this_WS_3, grammarAccess.getTagsAccess().getWSTerminalRuleCall_3()); 
    }
)*(    this_WORD_4=RULE_WORD    {
		$current.merge(this_WORD_4);
    }

    { 
    newLeafNode(this_WORD_4, grammarAccess.getTagsAccess().getWORDTerminalRuleCall_4_0()); 
    }
(    this_WS_5=RULE_WS    {
		$current.merge(this_WS_5);
    }

    { 
    newLeafNode(this_WS_5, grammarAccess.getTagsAccess().getWSTerminalRuleCall_4_1_0()); 
    }

    |
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTagsAccess().getCommaKeyword_4_1_1()); 
    }
)?)+    this_SINGLE_NL_7=RULE_SINGLE_NL    {
		$current.merge(this_SINGLE_NL_7);
    }

    { 
    newLeafNode(this_SINGLE_NL_7, grammarAccess.getTagsAccess().getSINGLE_NLTerminalRuleCall_5()); 
    }
)
    ;





// Entry rule entryRuleComment
entryRuleComment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	 iv_ruleComment=ruleComment 
	 { $current=$iv_ruleComment.current; } 
	 EOF 
;

// Rule Comment
ruleComment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleTextPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommentRule());
	        }
       		add(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"TextPart");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_1_0_0()); 
	    }
		lv_name_1_1=ruleTextPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommentRule());
	        }
       		add(
       			$current, 
       			"name",
        		lv_name_1_1, 
        		"TextPart");
	        afterParserOrEnumRuleCall();
	    }

    |		lv_name_1_2=	'-' 
    {
        newLeafNode(lv_name_1_2, grammarAccess.getCommentAccess().getNameHyphenMinusKeyword_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommentRule());
	        }
       		addWithLastConsumed($current, "name", lv_name_1_2, null);
	    }

    |		lv_name_1_3=	'=' 
    {
        newLeafNode(lv_name_1_3, grammarAccess.getCommentAccess().getNameEqualsSignKeyword_1_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommentRule());
	        }
       		addWithLastConsumed($current, "name", lv_name_1_3, null);
	    }

    |		lv_name_1_4=	'|' 
    {
        newLeafNode(lv_name_1_4, grammarAccess.getCommentAccess().getNameVerticalLineKeyword_1_0_3());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommentRule());
	        }
       		addWithLastConsumed($current, "name", lv_name_1_4, null);
	    }

    |		lv_name_1_5=	',' 
    {
        newLeafNode(lv_name_1_5, grammarAccess.getCommentAccess().getNameCommaKeyword_1_0_4());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommentRule());
	        }
       		addWithLastConsumed($current, "name", lv_name_1_5, null);
	    }

    |		lv_name_1_6=	':' 
    {
        newLeafNode(lv_name_1_6, grammarAccess.getCommentAccess().getNameColonKeyword_1_0_5());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommentRule());
	        }
       		addWithLastConsumed($current, "name", lv_name_1_6, null);
	    }

)

)
)+(this_SINGLE_NL_2=RULE_SINGLE_NL
    { 
    newLeafNode(this_SINGLE_NL_2, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
    }
)+)
;





// Entry rule entryRuleTextPart
entryRuleTextPart returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextPartRule()); } 
	 iv_ruleTextPart=ruleTextPart 
	 { $current=$iv_ruleTextPart.current.getText(); }  
	 EOF 
;

// Rule TextPart
ruleTextPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_WORD_0=RULE_WORD    {
		$current.merge(this_WORD_0);
    }

    { 
    newLeafNode(this_WORD_0, grammarAccess.getTextPartAccess().getWORDTerminalRuleCall_0()); 
    }

    |    this_SEPARATORS_1=RULE_SEPARATORS    {
		$current.merge(this_SEPARATORS_1);
    }

    { 
    newLeafNode(this_SEPARATORS_1, grammarAccess.getTextPartAccess().getSEPARATORSTerminalRuleCall_1()); 
    }

    |    this_STATIC_PARAM_2=RULE_STATIC_PARAM    {
		$current.merge(this_STATIC_PARAM_2);
    }

    { 
    newLeafNode(this_STATIC_PARAM_2, grammarAccess.getTextPartAccess().getSTATIC_PARAMTerminalRuleCall_2()); 
    }

    |    this_DYNAMIC_PARAM_3=RULE_DYNAMIC_PARAM    {
		$current.merge(this_DYNAMIC_PARAM_3);
    }

    { 
    newLeafNode(this_DYNAMIC_PARAM_3, grammarAccess.getTextPartAccess().getDYNAMIC_PARAMTerminalRuleCall_3()); 
    }

    |    this_WS_4=RULE_WS    {
		$current.merge(this_WS_4);
    }

    { 
    newLeafNode(this_WS_4, grammarAccess.getTextPartAccess().getWSTerminalRuleCall_4()); 
    }
)
    ;





// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	 iv_ruleTable=ruleTable 
	 { $current=$iv_ruleTable.current; } 
	 EOF 
;

// Rule Table
ruleTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getTableAccess().getWSTerminalRuleCall_0()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getTableAccess().getHeadingTableRowParserRuleCall_1_0()); 
	    }
		lv_heading_1_0=ruleTableRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRule());
	        }
       		set(
       			$current, 
       			"heading",
        		lv_heading_1_0, 
        		"TableRow");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getTableAccess().getWSTerminalRuleCall_2()); 
    }
)*(	otherlv_3='|' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0());
    }
(	otherlv_4='-' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1());
    }
)+)+this_TABLE_ROW_END_5=RULE_TABLE_ROW_END
    { 
    newLeafNode(this_TABLE_ROW_END_5, grammarAccess.getTableAccess().getTABLE_ROW_ENDTerminalRuleCall_4()); 
    }
(this_WS_6=RULE_WS
    { 
    newLeafNode(this_WS_6, grammarAccess.getTableAccess().getWSTerminalRuleCall_5()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_6_0()); 
	    }
		lv_rows_7_0=ruleTableRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_7_0, 
        		"TableRow");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleTableRow
entryRuleTableRow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRowRule()); }
	 iv_ruleTableRow=ruleTableRow 
	 { $current=$iv_ruleTableRow.current; } 
	 EOF 
;

// Rule TableRow
ruleTableRow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_0_0()); 
	    }
		lv_cells_0_0=ruleTableCell		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRowRule());
	        }
       		add(
       			$current, 
       			"cells",
        		lv_cells_0_0, 
        		"TableCell");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_TABLE_ROW_END_1=RULE_TABLE_ROW_END
    { 
    newLeafNode(this_TABLE_ROW_END_1, grammarAccess.getTableRowAccess().getTABLE_ROW_ENDTerminalRuleCall_1()); 
    }
)
;





// Entry rule entryRuleTableCell
entryRuleTableCell returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableCellRule()); }
	 iv_ruleTableCell=ruleTableCell 
	 { $current=$iv_ruleTableCell.current; } 
	 EOF 
;

// Rule TableCell
ruleTableCell returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='|' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTableCellAccess().getVerticalLineKeyword_0());
    }
(
(
(
		lv_name_1_1=RULE_WORD
		{
			newLeafNode(lv_name_1_1, grammarAccess.getTableCellAccess().getNameWORDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableCellRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_1, 
        		"WORD");
	    }

    |		lv_name_1_2=RULE_SEPARATORS
		{
			newLeafNode(lv_name_1_2, grammarAccess.getTableCellAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableCellRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_2, 
        		"SEPARATORS");
	    }

    |		lv_name_1_3=RULE_WS
		{
			newLeafNode(lv_name_1_3, grammarAccess.getTableCellAccess().getNameWSTerminalRuleCall_1_0_2()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableCellRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_3, 
        		"WS");
	    }

)

)
)+)
;





RULE_SINGLE_NL : '\r'? '\n';

RULE_WORD : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STATIC_PARAM : '"' ( options {greedy=false;} : . )*'"';

RULE_DYNAMIC_PARAM : '<' ( options {greedy=false;} : . )*'>';

RULE_TABLE_ROW_END : '|' RULE_WS* RULE_SINGLE_NL;

RULE_WS : (' '|'\t');

RULE_SEPARATORS : ~(('\r'|'\n'|'a'..'z'|'A'..'Z'|'0'..'9'|'_'|' '|'\t'));


