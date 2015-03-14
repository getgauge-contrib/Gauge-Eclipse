/*
* generated by Xtext
*/
package io.getgauge.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class SpecGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cDefinitionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDefinitionsAbstractEntityParserRuleCall_0 = (RuleCall)cDefinitionsAssignment.eContents().get(0);
		
		//Model:
		//	definitions+=AbstractEntity*;
		public ParserRule getRule() { return rule; }

		//definitions+=AbstractEntity*
		public Assignment getDefinitionsAssignment() { return cDefinitionsAssignment; }

		//AbstractEntity
		public RuleCall getDefinitionsAbstractEntityParserRuleCall_0() { return cDefinitionsAbstractEntityParserRuleCall_0; }
	}

	public class AbstractEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractEntity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cAlternatives.eContents().get(0);
		private final RuleCall cSpecParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cScenarioParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cStepParserRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final RuleCall cCommentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractEntity:
		//	(Spec | Scenario | Step) | Comment;
		public ParserRule getRule() { return rule; }

		//(Spec | Scenario | Step) | Comment
		public Alternatives getAlternatives() { return cAlternatives; }

		//Spec | Scenario | Step
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//Spec
		public RuleCall getSpecParserRuleCall_0_0() { return cSpecParserRuleCall_0_0; }

		//Scenario
		public RuleCall getScenarioParserRuleCall_0_1() { return cScenarioParserRuleCall_0_1; }

		//Step
		public RuleCall getStepParserRuleCall_0_2() { return cStepParserRuleCall_0_2; }

		//Comment
		public RuleCall getCommentParserRuleCall_1() { return cCommentParserRuleCall_1; }
	}

	public class SpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Spec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignSpaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameWORDTerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameSEPARATORSTerminalRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final RuleCall cSINGLE_NLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Spec:
		//	"# " name+=(WORD | SEPARATORS)+ SINGLE_NL+;
		public ParserRule getRule() { return rule; }

		//"# " name+=(WORD | SEPARATORS)+ SINGLE_NL+
		public Group getGroup() { return cGroup; }

		//"# "
		public Keyword getNumberSignSpaceKeyword_0() { return cNumberSignSpaceKeyword_0; }

		//name+=(WORD | SEPARATORS)+
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//WORD | SEPARATORS
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }

		//WORD
		public RuleCall getNameWORDTerminalRuleCall_1_0_0() { return cNameWORDTerminalRuleCall_1_0_0; }

		//SEPARATORS
		public RuleCall getNameSEPARATORSTerminalRuleCall_1_0_1() { return cNameSEPARATORSTerminalRuleCall_1_0_1; }

		//SINGLE_NL+
		public RuleCall getSINGLE_NLTerminalRuleCall_2() { return cSINGLE_NLTerminalRuleCall_2; }
	}

	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignNumberSignSpaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameWORDTerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameSEPARATORSTerminalRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final RuleCall cSINGLE_NLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Scenario:
		//	"## " name+=(WORD | SEPARATORS)+ SINGLE_NL+;
		public ParserRule getRule() { return rule; }

		//"## " name+=(WORD | SEPARATORS)+ SINGLE_NL+
		public Group getGroup() { return cGroup; }

		//"## "
		public Keyword getNumberSignNumberSignSpaceKeyword_0() { return cNumberSignNumberSignSpaceKeyword_0; }

		//name+=(WORD | SEPARATORS)+
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//WORD | SEPARATORS
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }

		//WORD
		public RuleCall getNameWORDTerminalRuleCall_1_0_0() { return cNameWORDTerminalRuleCall_1_0_0; }

		//SEPARATORS
		public RuleCall getNameSEPARATORSTerminalRuleCall_1_0_1() { return cNameSEPARATORSTerminalRuleCall_1_0_1; }

		//SINGLE_NL+
		public RuleCall getSINGLE_NLTerminalRuleCall_2() { return cSINGLE_NLTerminalRuleCall_2; }
	}

	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Step");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStepAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAsteriskSpaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Assignment cStaticParamsAssignment_2_0_0 = (Assignment)cAlternatives_2_0.eContents().get(0);
		private final RuleCall cStaticParamsStaticParamParserRuleCall_2_0_0_0 = (RuleCall)cStaticParamsAssignment_2_0_0.eContents().get(0);
		private final Assignment cDynamicParamsAssignment_2_0_1 = (Assignment)cAlternatives_2_0.eContents().get(1);
		private final RuleCall cDynamicParamsDynamicParamParserRuleCall_2_0_1_0 = (RuleCall)cDynamicParamsAssignment_2_0_1.eContents().get(0);
		private final RuleCall cWORDTerminalRuleCall_2_0_2 = (RuleCall)cAlternatives_2_0.eContents().get(2);
		private final RuleCall cSEPARATORSTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cSINGLE_NLTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Step:
		//	{Step} "* " ((staticParams+=StaticParam | dynamicParams+=DynamicParam | WORD) SEPARATORS*)+ SINGLE_NL+;
		public ParserRule getRule() { return rule; }

		//{Step} "* " ((staticParams+=StaticParam | dynamicParams+=DynamicParam | WORD) SEPARATORS*)+ SINGLE_NL+
		public Group getGroup() { return cGroup; }

		//{Step}
		public Action getStepAction_0() { return cStepAction_0; }

		//"* "
		public Keyword getAsteriskSpaceKeyword_1() { return cAsteriskSpaceKeyword_1; }

		//((staticParams+=StaticParam | dynamicParams+=DynamicParam | WORD) SEPARATORS*)+
		public Group getGroup_2() { return cGroup_2; }

		//staticParams+=StaticParam | dynamicParams+=DynamicParam | WORD
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }

		//staticParams+=StaticParam
		public Assignment getStaticParamsAssignment_2_0_0() { return cStaticParamsAssignment_2_0_0; }

		//StaticParam
		public RuleCall getStaticParamsStaticParamParserRuleCall_2_0_0_0() { return cStaticParamsStaticParamParserRuleCall_2_0_0_0; }

		//dynamicParams+=DynamicParam
		public Assignment getDynamicParamsAssignment_2_0_1() { return cDynamicParamsAssignment_2_0_1; }

		//DynamicParam
		public RuleCall getDynamicParamsDynamicParamParserRuleCall_2_0_1_0() { return cDynamicParamsDynamicParamParserRuleCall_2_0_1_0; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_2_0_2() { return cWORDTerminalRuleCall_2_0_2; }

		//SEPARATORS*
		public RuleCall getSEPARATORSTerminalRuleCall_2_1() { return cSEPARATORSTerminalRuleCall_2_1; }

		//SINGLE_NL+
		public RuleCall getSINGLE_NLTerminalRuleCall_3() { return cSINGLE_NLTerminalRuleCall_3; }
	}

	public class StaticParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StaticParam");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTATIC_PARAMTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StaticParam:
		//	value=STATIC_PARAM;
		public ParserRule getRule() { return rule; }

		//value=STATIC_PARAM
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STATIC_PARAM
		public RuleCall getValueSTATIC_PARAMTerminalRuleCall_0() { return cValueSTATIC_PARAMTerminalRuleCall_0; }
	}

	public class DynamicParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DynamicParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cTypeAlternatives_1_0 = (Alternatives)cTypeAssignment_1.eContents().get(0);
		private final Keyword cTypeTableKeyword_1_0_0 = (Keyword)cTypeAlternatives_1_0.eContents().get(0);
		private final Keyword cTypeFileKeyword_1_0_1 = (Keyword)cTypeAlternatives_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueDYNAMIC_PARAM_VALUETerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DynamicParam:
		//	"<" type=("table" | "file") ":" value=DYNAMIC_PARAM_VALUE ">";
		public ParserRule getRule() { return rule; }

		//"<" type=("table" | "file") ":" value=DYNAMIC_PARAM_VALUE ">"
		public Group getGroup() { return cGroup; }

		//"<"
		public Keyword getLessThanSignKeyword_0() { return cLessThanSignKeyword_0; }

		//type=("table" | "file")
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//"table" | "file"
		public Alternatives getTypeAlternatives_1_0() { return cTypeAlternatives_1_0; }

		//"table"
		public Keyword getTypeTableKeyword_1_0_0() { return cTypeTableKeyword_1_0_0; }

		//"file"
		public Keyword getTypeFileKeyword_1_0_1() { return cTypeFileKeyword_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//value=DYNAMIC_PARAM_VALUE
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//DYNAMIC_PARAM_VALUE
		public RuleCall getValueDYNAMIC_PARAM_VALUETerminalRuleCall_3_0() { return cValueDYNAMIC_PARAM_VALUETerminalRuleCall_3_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
	}

	public class CommentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Comment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTextAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cTextAlternatives_0_0 = (Alternatives)cTextAssignment_0.eContents().get(0);
		private final RuleCall cTextWORDTerminalRuleCall_0_0_0 = (RuleCall)cTextAlternatives_0_0.eContents().get(0);
		private final RuleCall cTextSEPARATORSTerminalRuleCall_0_0_1 = (RuleCall)cTextAlternatives_0_0.eContents().get(1);
		private final RuleCall cTextSTATIC_PARAMTerminalRuleCall_0_0_2 = (RuleCall)cTextAlternatives_0_0.eContents().get(2);
		private final Keyword cTextFullStopKeyword_0_0_3 = (Keyword)cTextAlternatives_0_0.eContents().get(3);
		private final RuleCall cSINGLE_NLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Comment:
		//	text+=(WORD | SEPARATORS | STATIC_PARAM | ".")+ SINGLE_NL+;
		public ParserRule getRule() { return rule; }

		//text+=(WORD | SEPARATORS | STATIC_PARAM | ".")+ SINGLE_NL+
		public Group getGroup() { return cGroup; }

		//text+=(WORD | SEPARATORS | STATIC_PARAM | ".")+
		public Assignment getTextAssignment_0() { return cTextAssignment_0; }

		//WORD | SEPARATORS | STATIC_PARAM | "."
		public Alternatives getTextAlternatives_0_0() { return cTextAlternatives_0_0; }

		//WORD
		public RuleCall getTextWORDTerminalRuleCall_0_0_0() { return cTextWORDTerminalRuleCall_0_0_0; }

		//SEPARATORS
		public RuleCall getTextSEPARATORSTerminalRuleCall_0_0_1() { return cTextSEPARATORSTerminalRuleCall_0_0_1; }

		//STATIC_PARAM
		public RuleCall getTextSTATIC_PARAMTerminalRuleCall_0_0_2() { return cTextSTATIC_PARAMTerminalRuleCall_0_0_2; }

		//"."
		public Keyword getTextFullStopKeyword_0_0_3() { return cTextFullStopKeyword_0_0_3; }

		//SINGLE_NL+
		public RuleCall getSINGLE_NLTerminalRuleCall_1() { return cSINGLE_NLTerminalRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractEntityElements pAbstractEntity;
	private final SpecElements pSpec;
	private final ScenarioElements pScenario;
	private final StepElements pStep;
	private final TerminalRule tSINGLE_NL;
	private final TerminalRule tWORD;
	private final TerminalRule tSEPARATORS;
	private final StaticParamElements pStaticParam;
	private final DynamicParamElements pDynamicParam;
	private final TerminalRule tDYNAMIC_PARAM_VALUE;
	private final TerminalRule tSTATIC_PARAM;
	private final CommentElements pComment;
	
	private final Grammar grammar;

	@Inject
	public SpecGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pAbstractEntity = new AbstractEntityElements();
		this.pSpec = new SpecElements();
		this.pScenario = new ScenarioElements();
		this.pStep = new StepElements();
		this.tSINGLE_NL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SINGLE_NL");
		this.tWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WORD");
		this.tSEPARATORS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SEPARATORS");
		this.pStaticParam = new StaticParamElements();
		this.pDynamicParam = new DynamicParamElements();
		this.tDYNAMIC_PARAM_VALUE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DYNAMIC_PARAM_VALUE");
		this.tSTATIC_PARAM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STATIC_PARAM");
		this.pComment = new CommentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("io.getgauge.Spec".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Model:
	//	definitions+=AbstractEntity*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//AbstractEntity:
	//	(Spec | Scenario | Step) | Comment;
	public AbstractEntityElements getAbstractEntityAccess() {
		return pAbstractEntity;
	}
	
	public ParserRule getAbstractEntityRule() {
		return getAbstractEntityAccess().getRule();
	}

	//Spec:
	//	"# " name+=(WORD | SEPARATORS)+ SINGLE_NL+;
	public SpecElements getSpecAccess() {
		return pSpec;
	}
	
	public ParserRule getSpecRule() {
		return getSpecAccess().getRule();
	}

	//Scenario:
	//	"## " name+=(WORD | SEPARATORS)+ SINGLE_NL+;
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}

	//Step:
	//	{Step} "* " ((staticParams+=StaticParam | dynamicParams+=DynamicParam | WORD) SEPARATORS*)+ SINGLE_NL+;
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}

	//terminal SINGLE_NL:
	//	"\r"? "\n";
	public TerminalRule getSINGLE_NLRule() {
		return tSINGLE_NL;
	} 

	//terminal WORD:
	//	("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getWORDRule() {
		return tWORD;
	} 

	//terminal SEPARATORS:
	//	!("\r" | "\n" | "a".."z" | "A".."Z" | "0".."9" | "_");
	public TerminalRule getSEPARATORSRule() {
		return tSEPARATORS;
	} 

	//StaticParam:
	//	value=STATIC_PARAM;
	public StaticParamElements getStaticParamAccess() {
		return pStaticParam;
	}
	
	public ParserRule getStaticParamRule() {
		return getStaticParamAccess().getRule();
	}

	//DynamicParam:
	//	"<" type=("table" | "file") ":" value=DYNAMIC_PARAM_VALUE ">";
	public DynamicParamElements getDynamicParamAccess() {
		return pDynamicParam;
	}
	
	public ParserRule getDynamicParamRule() {
		return getDynamicParamAccess().getRule();
	}

	//terminal DYNAMIC_PARAM_VALUE:
	//	WORD ("." ("txt" | "csv"))?;
	public TerminalRule getDYNAMIC_PARAM_VALUERule() {
		return tDYNAMIC_PARAM_VALUE;
	} 

	//terminal STATIC_PARAM:
	//	"\""->"\"";
	public TerminalRule getSTATIC_PARAMRule() {
		return tSTATIC_PARAM;
	} 

	//Comment:
	//	text+=(WORD | SEPARATORS | STATIC_PARAM | ".")+ SINGLE_NL+;
	public CommentElements getCommentAccess() {
		return pComment;
	}
	
	public ParserRule getCommentRule() {
		return getCommentAccess().getRule();
	}
}
