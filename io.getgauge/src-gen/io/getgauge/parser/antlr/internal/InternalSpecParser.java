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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LINE_TEXT", "RULE_SINGLE_NL", "RULE_MULTI_NL", "'# '", "'## '", "'* '"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SINGLE_NL=5;
    public static final int T__7=7;
    public static final int RULE_LINE_TEXT=4;
    public static final int RULE_MULTI_NL=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecParser.tokenNames; }
    public String getGrammarFileName() { return "../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:76:1: ruleModel returns [EObject current=null] : ( (lv_definitions_0_0= ruleAbstractEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:79:28: ( ( (lv_definitions_0_0= ruleAbstractEntity ) )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( (lv_definitions_0_0= ruleAbstractEntity ) )*
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( (lv_definitions_0_0= ruleAbstractEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_LINE_TEXT && LA1_0<=9)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:1: (lv_definitions_0_0= ruleAbstractEntity )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:1: (lv_definitions_0_0= ruleAbstractEntity )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:82:3: lv_definitions_0_0= ruleAbstractEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsAbstractEntityParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractEntity_in_ruleModel130);
            	    lv_definitions_0_0=ruleAbstractEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_0_0, 
            	            		"AbstractEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractEntity"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:106:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:107:2: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:108:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity166);
            iv_ruleAbstractEntity=ruleAbstractEntity();

            state._fsp--;

             current =iv_ruleAbstractEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntity176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractEntity"


    // $ANTLR start "ruleAbstractEntity"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:115:1: ruleAbstractEntity returns [EObject current=null] : (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | ruleBlankLine ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Spec_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_Step_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:118:28: ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | ruleBlankLine ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | ruleBlankLine )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | ruleBlankLine )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 7:
                {
                alt2=1;
                }
                break;
            case 8:
                {
                alt2=2;
                }
                break;
            case 9:
                {
                alt2=3;
                }
                break;
            case RULE_LINE_TEXT:
                {
                alt2=4;
                }
                break;
            case RULE_SINGLE_NL:
            case RULE_MULTI_NL:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:120:5: this_Spec_0= ruleSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSpec_in_ruleAbstractEntity223);
                    this_Spec_0=ruleSpec();

                    state._fsp--;

                     
                            current = this_Spec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:130:5: this_Scenario_1= ruleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScenario_in_ruleAbstractEntity250);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;

                     
                            current = this_Scenario_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:140:5: this_Step_2= ruleStep
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStep_in_ruleAbstractEntity277);
                    this_Step_2=ruleStep();

                    state._fsp--;

                     
                            current = this_Step_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:150:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleAbstractEntity304);
                    this_Comment_3=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:160:5: ruleBlankLine
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getBlankLineParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBlankLine_in_ruleAbstractEntity325);
                    ruleBlankLine();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractEntity"


    // $ANTLR start "entryRuleSpec"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:175:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:176:2: (iv_ruleSpec= ruleSpec EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:177:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec360);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:184:1: ruleSpec returns [EObject current=null] : (otherlv_0= '# ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:187:28: ( (otherlv_0= '# ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:188:1: (otherlv_0= '# ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:188:1: (otherlv_0= '# ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:188:3: otherlv_0= '# ' ( (lv_name_1_0= RULE_LINE_TEXT ) )
            {
            otherlv_0=(Token)match(input,7,FOLLOW_7_in_ruleSpec407); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:192:1: ( (lv_name_1_0= RULE_LINE_TEXT ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:193:1: (lv_name_1_0= RULE_LINE_TEXT )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:193:1: (lv_name_1_0= RULE_LINE_TEXT )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:194:3: lv_name_1_0= RULE_LINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_LINE_TEXT,FOLLOW_RULE_LINE_TEXT_in_ruleSpec424); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSpecAccess().getNameLINE_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"LINE_TEXT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleScenario"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:218:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:220:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario465);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario475); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:227:1: ruleScenario returns [EObject current=null] : (otherlv_0= '## ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:230:28: ( (otherlv_0= '## ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:231:1: (otherlv_0= '## ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:231:1: (otherlv_0= '## ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:231:3: otherlv_0= '## ' ( (lv_name_1_0= RULE_LINE_TEXT ) )
            {
            otherlv_0=(Token)match(input,8,FOLLOW_8_in_ruleScenario512); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:235:1: ( (lv_name_1_0= RULE_LINE_TEXT ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:236:1: (lv_name_1_0= RULE_LINE_TEXT )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:236:1: (lv_name_1_0= RULE_LINE_TEXT )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:237:3: lv_name_1_0= RULE_LINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_LINE_TEXT,FOLLOW_RULE_LINE_TEXT_in_ruleScenario529); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameLINE_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"LINE_TEXT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:261:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:262:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:263:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep570);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:270:1: ruleStep returns [EObject current=null] : (otherlv_0= '* ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:273:28: ( (otherlv_0= '* ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:274:1: (otherlv_0= '* ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:274:1: (otherlv_0= '* ' ( (lv_name_1_0= RULE_LINE_TEXT ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:274:3: otherlv_0= '* ' ( (lv_name_1_0= RULE_LINE_TEXT ) )
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleStep617); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:278:1: ( (lv_name_1_0= RULE_LINE_TEXT ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:279:1: (lv_name_1_0= RULE_LINE_TEXT )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:279:1: (lv_name_1_0= RULE_LINE_TEXT )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:280:3: lv_name_1_0= RULE_LINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_LINE_TEXT,FOLLOW_RULE_LINE_TEXT_in_ruleStep634); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameLINE_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStepRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"LINE_TEXT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleComment"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:304:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:305:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:306:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment675);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment685); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:313:1: ruleComment returns [EObject current=null] : ( (lv_text_0_0= RULE_LINE_TEXT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:316:28: ( ( (lv_text_0_0= RULE_LINE_TEXT ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:317:1: ( (lv_text_0_0= RULE_LINE_TEXT ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:317:1: ( (lv_text_0_0= RULE_LINE_TEXT ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:318:1: (lv_text_0_0= RULE_LINE_TEXT )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:318:1: (lv_text_0_0= RULE_LINE_TEXT )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:3: lv_text_0_0= RULE_LINE_TEXT
            {
            lv_text_0_0=(Token)match(input,RULE_LINE_TEXT,FOLLOW_RULE_LINE_TEXT_in_ruleComment726); 

            			newLeafNode(lv_text_0_0, grammarAccess.getCommentAccess().getTextLINE_TEXTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"LINE_TEXT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleBlankLine"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:343:1: entryRuleBlankLine returns [String current=null] : iv_ruleBlankLine= ruleBlankLine EOF ;
    public final String entryRuleBlankLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlankLine = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:344:2: (iv_ruleBlankLine= ruleBlankLine EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:345:2: iv_ruleBlankLine= ruleBlankLine EOF
            {
             newCompositeNode(grammarAccess.getBlankLineRule()); 
            pushFollow(FOLLOW_ruleBlankLine_in_entryRuleBlankLine767);
            iv_ruleBlankLine=ruleBlankLine();

            state._fsp--;

             current =iv_ruleBlankLine.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankLine778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlankLine"


    // $ANTLR start "ruleBlankLine"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:352:1: ruleBlankLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SINGLE_NL_0= RULE_SINGLE_NL | this_MULTI_NL_1= RULE_MULTI_NL ) ;
    public final AntlrDatatypeRuleToken ruleBlankLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_NL_0=null;
        Token this_MULTI_NL_1=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:355:28: ( (this_SINGLE_NL_0= RULE_SINGLE_NL | this_MULTI_NL_1= RULE_MULTI_NL ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:356:1: (this_SINGLE_NL_0= RULE_SINGLE_NL | this_MULTI_NL_1= RULE_MULTI_NL )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:356:1: (this_SINGLE_NL_0= RULE_SINGLE_NL | this_MULTI_NL_1= RULE_MULTI_NL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SINGLE_NL) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_MULTI_NL) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:356:6: this_SINGLE_NL_0= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_0=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleBlankLine818); 

                    		current.merge(this_SINGLE_NL_0);
                        
                     
                        newLeafNode(this_SINGLE_NL_0, grammarAccess.getBlankLineAccess().getSINGLE_NLTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:364:10: this_MULTI_NL_1= RULE_MULTI_NL
                    {
                    this_MULTI_NL_1=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleBlankLine844); 

                    		current.merge(this_MULTI_NL_1);
                        
                     
                        newLeafNode(this_MULTI_NL_1, grammarAccess.getBlankLineAccess().getMULTI_NLTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlankLine"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_ruleModel130 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleAbstractEntity223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleAbstractEntity250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAbstractEntity277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleAbstractEntity304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankLine_in_ruleAbstractEntity325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_ruleSpec407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LINE_TEXT_in_ruleSpec424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleScenario512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LINE_TEXT_in_ruleScenario529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleStep617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LINE_TEXT_in_ruleStep634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TEXT_in_ruleComment726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankLine_in_entryRuleBlankLine767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankLine778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleBlankLine818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleBlankLine844 = new BitSet(new long[]{0x0000000000000002L});

}