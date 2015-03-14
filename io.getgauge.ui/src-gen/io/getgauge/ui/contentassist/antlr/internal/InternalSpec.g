/*
* generated by Xtext
*/
grammar InternalSpec;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package io.getgauge.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package io.getgauge.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import io.getgauge.services.SpecGrammarAccess;

}

@parser::members {
 
 	private SpecGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SpecGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getDefinitionsAssignment()); }
(rule__Model__DefinitionsAssignment)*
{ after(grammarAccess.getModelAccess().getDefinitionsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractEntity
entryRuleAbstractEntity 
:
{ before(grammarAccess.getAbstractEntityRule()); }
	 ruleAbstractEntity
{ after(grammarAccess.getAbstractEntityRule()); } 
	 EOF 
;

// Rule AbstractEntity
ruleAbstractEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractEntityAccess().getAlternatives()); }
(rule__AbstractEntity__Alternatives)
{ after(grammarAccess.getAbstractEntityAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSpec
entryRuleSpec 
:
{ before(grammarAccess.getSpecRule()); }
	 ruleSpec
{ after(grammarAccess.getSpecRule()); } 
	 EOF 
;

// Rule Spec
ruleSpec
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSpecAccess().getGroup()); }
(rule__Spec__Group__0)
{ after(grammarAccess.getSpecAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleScenario
entryRuleScenario 
:
{ before(grammarAccess.getScenarioRule()); }
	 ruleScenario
{ after(grammarAccess.getScenarioRule()); } 
	 EOF 
;

// Rule Scenario
ruleScenario
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getScenarioAccess().getGroup()); }
(rule__Scenario__Group__0)
{ after(grammarAccess.getScenarioAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStep
entryRuleStep 
:
{ before(grammarAccess.getStepRule()); }
	 ruleStep
{ after(grammarAccess.getStepRule()); } 
	 EOF 
;

// Rule Step
ruleStep
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStepAccess().getGroup()); }
(rule__Step__Group__0)
{ after(grammarAccess.getStepAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStaticParam
entryRuleStaticParam 
:
{ before(grammarAccess.getStaticParamRule()); }
	 ruleStaticParam
{ after(grammarAccess.getStaticParamRule()); } 
	 EOF 
;

// Rule StaticParam
ruleStaticParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStaticParamAccess().getValueAssignment()); }
(rule__StaticParam__ValueAssignment)
{ after(grammarAccess.getStaticParamAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDynamicParam
entryRuleDynamicParam 
:
{ before(grammarAccess.getDynamicParamRule()); }
	 ruleDynamicParam
{ after(grammarAccess.getDynamicParamRule()); } 
	 EOF 
;

// Rule DynamicParam
ruleDynamicParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDynamicParamAccess().getGroup()); }
(rule__DynamicParam__Group__0)
{ after(grammarAccess.getDynamicParamAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComment
entryRuleComment 
:
{ before(grammarAccess.getCommentRule()); }
	 ruleComment
{ after(grammarAccess.getCommentRule()); } 
	 EOF 
;

// Rule Comment
ruleComment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCommentAccess().getGroup()); }
(rule__Comment__Group__0)
{ after(grammarAccess.getCommentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__AbstractEntity__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractEntityAccess().getAlternatives_0()); }
(rule__AbstractEntity__Alternatives_0)
{ after(grammarAccess.getAbstractEntityAccess().getAlternatives_0()); }
)

    |(
{ before(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_1()); }
	ruleComment
{ after(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractEntity__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0_0()); }
	ruleSpec
{ after(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_0_1()); }
	ruleScenario
{ after(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_0_1()); }
)

    |(
{ before(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_0_2()); }
	ruleStep
{ after(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__NameAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0()); }
	RULE_WORD
{ after(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0()); }
)

    |(
{ before(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); }
	RULE_SEPARATORS
{ after(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__NameAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0()); }
	RULE_WORD
{ after(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0()); }
)

    |(
{ before(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); }
	RULE_SEPARATORS
{ after(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Alternatives_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getStaticParamsAssignment_2_0_0()); }
(rule__Step__StaticParamsAssignment_2_0_0)
{ after(grammarAccess.getStepAccess().getStaticParamsAssignment_2_0_0()); }
)

    |(
{ before(grammarAccess.getStepAccess().getDynamicParamsAssignment_2_0_1()); }
(rule__Step__DynamicParamsAssignment_2_0_1)
{ after(grammarAccess.getStepAccess().getDynamicParamsAssignment_2_0_1()); }
)

    |(
{ before(grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); }
	RULE_WORD
{ after(grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__TypeAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getTypeTableKeyword_1_0_0()); }

	'table' 

{ after(grammarAccess.getDynamicParamAccess().getTypeTableKeyword_1_0_0()); }
)

    |(
{ before(grammarAccess.getDynamicParamAccess().getTypeFileKeyword_1_0_1()); }

	'file' 

{ after(grammarAccess.getDynamicParamAccess().getTypeFileKeyword_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Comment__TextAlternatives_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); }
	RULE_WORD
{ after(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); }
)

    |(
{ before(grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_0_0_1()); }
	RULE_SEPARATORS
{ after(grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_0_0_1()); }
)

    |(
{ before(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_2()); }
	RULE_STATIC_PARAM
{ after(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_2()); }
)

    |(
{ before(grammarAccess.getCommentAccess().getTextFullStopKeyword_0_0_3()); }

	'.' 

{ after(grammarAccess.getCommentAccess().getTextFullStopKeyword_0_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Spec__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group__0__Impl
	rule__Spec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0()); }

	'# ' 

{ after(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group__1__Impl
	rule__Spec__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getSpecAccess().getNameAssignment_1()); }
(rule__Spec__NameAssignment_1)
{ after(grammarAccess.getSpecAccess().getNameAssignment_1()); }
)
(
{ before(grammarAccess.getSpecAccess().getNameAssignment_1()); }
(rule__Spec__NameAssignment_1)*
{ after(grammarAccess.getSpecAccess().getNameAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spec__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); }
(	RULE_SINGLE_NL)
{ after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); }
)
(
{ before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); }
(	RULE_SINGLE_NL)*
{ after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Scenario__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__0__Impl
	rule__Scenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0()); }

	'## ' 

{ after(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__1__Impl
	rule__Scenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getScenarioAccess().getNameAssignment_1()); }
(rule__Scenario__NameAssignment_1)
{ after(grammarAccess.getScenarioAccess().getNameAssignment_1()); }
)
(
{ before(grammarAccess.getScenarioAccess().getNameAssignment_1()); }
(rule__Scenario__NameAssignment_1)*
{ after(grammarAccess.getScenarioAccess().getNameAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); }
(	RULE_SINGLE_NL)
{ after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); }
)
(
{ before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); }
(	RULE_SINGLE_NL)*
{ after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Step__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Step__Group__0__Impl
	rule__Step__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getStepAction_0()); }
(

)
{ after(grammarAccess.getStepAccess().getStepAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Step__Group__1__Impl
	rule__Step__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1()); }

	'* ' 

{ after(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Step__Group__2__Impl
	rule__Step__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getStepAccess().getGroup_2()); }
(rule__Step__Group_2__0)
{ after(grammarAccess.getStepAccess().getGroup_2()); }
)
(
{ before(grammarAccess.getStepAccess().getGroup_2()); }
(rule__Step__Group_2__0)*
{ after(grammarAccess.getStepAccess().getGroup_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Step__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); }
(	RULE_SINGLE_NL)
{ after(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); }
)
(
{ before(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); }
(	RULE_SINGLE_NL)*
{ after(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Step__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Step__Group_2__0__Impl
	rule__Step__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getAlternatives_2_0()); }
(rule__Step__Alternatives_2_0)
{ after(grammarAccess.getStepAccess().getAlternatives_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Step__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); }
(	RULE_SEPARATORS)*
{ after(grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DynamicParam__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DynamicParam__Group__0__Impl
	rule__DynamicParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getLessThanSignKeyword_0()); }

	'<' 

{ after(grammarAccess.getDynamicParamAccess().getLessThanSignKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicParam__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DynamicParam__Group__1__Impl
	rule__DynamicParam__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getTypeAssignment_1()); }
(rule__DynamicParam__TypeAssignment_1)
{ after(grammarAccess.getDynamicParamAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicParam__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DynamicParam__Group__2__Impl
	rule__DynamicParam__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getDynamicParamAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicParam__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DynamicParam__Group__3__Impl
	rule__DynamicParam__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getValueAssignment_3()); }
(rule__DynamicParam__ValueAssignment_3)
{ after(grammarAccess.getDynamicParamAccess().getValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicParam__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DynamicParam__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getGreaterThanSignKeyword_4()); }

	'>' 

{ after(grammarAccess.getDynamicParamAccess().getGreaterThanSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Comment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Comment__Group__0__Impl
	rule__Comment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getCommentAccess().getTextAssignment_0()); }
(rule__Comment__TextAssignment_0)
{ after(grammarAccess.getCommentAccess().getTextAssignment_0()); }
)
(
{ before(grammarAccess.getCommentAccess().getTextAssignment_0()); }
(rule__Comment__TextAssignment_0)*
{ after(grammarAccess.getCommentAccess().getTextAssignment_0()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Comment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Comment__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); }
(	RULE_SINGLE_NL)
{ after(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); }
)
(
{ before(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); }
(	RULE_SINGLE_NL)*
{ after(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__DefinitionsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDefinitionsAbstractEntityParserRuleCall_0()); }
	ruleAbstractEntity{ after(grammarAccess.getModelAccess().getDefinitionsAbstractEntityParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecAccess().getNameAlternatives_1_0()); }
(rule__Spec__NameAlternatives_1_0)
{ after(grammarAccess.getSpecAccess().getNameAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getNameAlternatives_1_0()); }
(rule__Scenario__NameAlternatives_1_0)
{ after(grammarAccess.getScenarioAccess().getNameAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Step__StaticParamsAssignment_2_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); }
	ruleStaticParam{ after(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Step__DynamicParamsAssignment_2_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); }
	ruleDynamicParam{ after(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StaticParam__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStaticParamAccess().getValueSTATIC_PARAMTerminalRuleCall_0()); }
	RULE_STATIC_PARAM{ after(grammarAccess.getStaticParamAccess().getValueSTATIC_PARAMTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getTypeAlternatives_1_0()); }
(rule__DynamicParam__TypeAlternatives_1_0)
{ after(grammarAccess.getDynamicParamAccess().getTypeAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicParam__ValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDynamicParamAccess().getValueDYNAMIC_PARAM_VALUETerminalRuleCall_3_0()); }
	RULE_DYNAMIC_PARAM_VALUE{ after(grammarAccess.getDynamicParamAccess().getValueDYNAMIC_PARAM_VALUETerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Comment__TextAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommentAccess().getTextAlternatives_0_0()); }
(rule__Comment__TextAlternatives_0_0)
{ after(grammarAccess.getCommentAccess().getTextAlternatives_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_SINGLE_NL : '\r'? '\n';

RULE_WORD : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_SEPARATORS : ~(('\r'|'\n'|'a'..'z'|'A'..'Z'|'0'..'9'|'_'));

RULE_DYNAMIC_PARAM_VALUE : RULE_WORD ('.' ('txt'|'csv'))?;

RULE_STATIC_PARAM : '"' ( options {greedy=false;} : . )*'"';

