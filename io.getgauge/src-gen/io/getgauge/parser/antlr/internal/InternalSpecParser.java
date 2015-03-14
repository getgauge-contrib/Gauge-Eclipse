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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_SEPARATORS", "RULE_SINGLE_NL", "RULE_STATIC_PARAM", "RULE_DYNAMIC_PARAM_VALUE", "'# '", "'## '", "'* '", "'<'", "'table'", "'file'", "':'", "'>'", "'.'"
    };
    public static final int T__9=9;
    public static final int RULE_SINGLE_NL=6;
    public static final int RULE_DYNAMIC_PARAM_VALUE=8;
    public static final int RULE_STATIC_PARAM=7;
    public static final int RULE_WORD=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=5;
    public static final int T__10=10;

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

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_SEPARATORS)||LA1_0==RULE_STATIC_PARAM||(LA1_0>=9 && LA1_0<=11)||LA1_0==17) ) {
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:115:1: ruleAbstractEntity returns [EObject current=null] : ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep ) | this_Comment_3= ruleComment ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Spec_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_Step_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:118:28: ( ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep ) | this_Comment_3= ruleComment ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:1: ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep ) | this_Comment_3= ruleComment )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:1: ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep ) | this_Comment_3= ruleComment )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=9 && LA3_0<=11)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_SEPARATORS)||LA3_0==RULE_STATIC_PARAM||LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:2: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:2: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep )
                    int alt2=3;
                    switch ( input.LA(1) ) {
                    case 9:
                        {
                        alt2=1;
                        }
                        break;
                    case 10:
                        {
                        alt2=2;
                        }
                        break;
                    case 11:
                        {
                        alt2=3;
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
                             
                                    newCompositeNode(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruleSpec_in_ruleAbstractEntity224);
                            this_Spec_0=ruleSpec();

                            state._fsp--;

                             
                                    current = this_Spec_0; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:130:5: this_Scenario_1= ruleScenario
                            {
                             
                                    newCompositeNode(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleScenario_in_ruleAbstractEntity251);
                            this_Scenario_1=ruleScenario();

                            state._fsp--;

                             
                                    current = this_Scenario_1; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:140:5: this_Step_2= ruleStep
                            {
                             
                                    newCompositeNode(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleStep_in_ruleAbstractEntity278);
                            this_Step_2=ruleStep();

                            state._fsp--;

                             
                                    current = this_Step_2; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:150:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleAbstractEntity306);
                    this_Comment_3=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_3; 
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:166:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:167:2: (iv_ruleSpec= ruleSpec EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:168:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec341);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec351); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:175:1: ruleSpec returns [EObject current=null] : (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token this_SINGLE_NL_2=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:178:28: ( (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:1: (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:1: (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:3: otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleSpec388); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:183:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_WORD && LA5_0<=RULE_SEPARATORS)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:184:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:184:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:185:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:185:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_WORD) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==RULE_SEPARATORS) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:186:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleSpec407); 

            	            			newLeafNode(lv_name_1_1, grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSpecRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_1, 
            	                    		"WORD");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:201:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleSpec427); 

            	            			newLeafNode(lv_name_1_2, grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSpecRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_2, 
            	                    		"SEPARATORS");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SINGLE_NL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec448); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:231:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:232:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:233:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario485);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario495); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:240:1: ruleScenario returns [EObject current=null] : (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token this_SINGLE_NL_2=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:243:28: ( (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:244:1: (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:244:1: (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:244:3: otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleScenario532); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:248:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_WORD && LA8_0<=RULE_SEPARATORS)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:249:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:249:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:250:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:250:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_WORD) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_SEPARATORS) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:251:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleScenario551); 

            	            			newLeafNode(lv_name_1_1, grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getScenarioRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_1, 
            	                    		"WORD");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:266:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleScenario571); 

            	            			newLeafNode(lv_name_1_2, grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getScenarioRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_2, 
            	                    		"SEPARATORS");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:284:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SINGLE_NL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:284:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario592); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:296:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:297:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep629);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep639); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:305:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )* )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WORD_4=null;
        Token this_SEPARATORS_5=null;
        Token this_SINGLE_NL_6=null;
        EObject lv_staticParams_2_0 = null;

        EObject lv_dynamicParams_3_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:308:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )* )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:309:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )* )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:309:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )* )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:309:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )* )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:309:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleStep685); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )* )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD||LA12_0==RULE_STATIC_PARAM||LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD ) (this_SEPARATORS_5= RULE_SEPARATORS )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD )
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:320:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:320:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:321:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStep708);
            	            lv_staticParams_2_0=ruleStaticParam();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"staticParams",
            	                    		lv_staticParams_2_0, 
            	                    		"StaticParam");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:339:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:339:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:340:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStep735);
            	            lv_dynamicParams_3_0=ruleDynamicParam();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"dynamicParams",
            	                    		lv_dynamicParams_3_0, 
            	                    		"DynamicParam");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:357:6: this_WORD_4= RULE_WORD
            	            {
            	            this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStep752); 
            	             
            	                newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:361:2: (this_SEPARATORS_5= RULE_SEPARATORS )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_SEPARATORS) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:361:3: this_SEPARATORS_5= RULE_SEPARATORS
            	    	    {
            	    	    this_SEPARATORS_5=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStep764); 
            	    	     
            	    	        newLeafNode(this_SEPARATORS_5, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:365:5: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SINGLE_NL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:365:6: this_SINGLE_NL_6= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep779); 
            	     
            	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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


    // $ANTLR start "entryRuleStaticParam"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:377:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:379:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam816);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam826); 

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
    // $ANTLR end "entryRuleStaticParam"


    // $ANTLR start "ruleStaticParam"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:386:1: ruleStaticParam returns [EObject current=null] : ( (lv_value_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:389:28: ( ( (lv_value_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:390:1: ( (lv_value_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:390:1: ( (lv_value_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:391:1: (lv_value_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:391:1: (lv_value_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:392:3: lv_value_0_0= RULE_STATIC_PARAM
            {
            lv_value_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam867); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStaticParamAccess().getValueSTATIC_PARAMTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStaticParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STATIC_PARAM");
            	    

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
    // $ANTLR end "ruleStaticParam"


    // $ANTLR start "entryRuleDynamicParam"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:416:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:418:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam907);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam917); 

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
    // $ANTLR end "entryRuleDynamicParam"


    // $ANTLR start "ruleDynamicParam"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:425:1: ruleDynamicParam returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE ) ) otherlv_4= '>' ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:428:28: ( (otherlv_0= '<' ( ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE ) ) otherlv_4= '>' ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:429:1: (otherlv_0= '<' ( ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE ) ) otherlv_4= '>' )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:429:1: (otherlv_0= '<' ( ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE ) ) otherlv_4= '>' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:429:3: otherlv_0= '<' ( ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDynamicParam954); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamicParamAccess().getLessThanSignKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:433:1: ( ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:434:1: ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:434:1: ( (lv_type_1_1= 'table' | lv_type_1_2= 'file' ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:435:1: (lv_type_1_1= 'table' | lv_type_1_2= 'file' )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:435:1: (lv_type_1_1= 'table' | lv_type_1_2= 'file' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:436:3: lv_type_1_1= 'table'
                    {
                    lv_type_1_1=(Token)match(input,13,FOLLOW_13_in_ruleDynamicParam974); 

                            newLeafNode(lv_type_1_1, grammarAccess.getDynamicParamAccess().getTypeTableKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDynamicParamRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:448:8: lv_type_1_2= 'file'
                    {
                    lv_type_1_2=(Token)match(input,14,FOLLOW_14_in_ruleDynamicParam1003); 

                            newLeafNode(lv_type_1_2, grammarAccess.getDynamicParamAccess().getTypeFileKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDynamicParamRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDynamicParam1031); 

                	newLeafNode(otherlv_2, grammarAccess.getDynamicParamAccess().getColonKeyword_2());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:467:1: ( (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:468:1: (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:468:1: (lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:469:3: lv_value_3_0= RULE_DYNAMIC_PARAM_VALUE
            {
            lv_value_3_0=(Token)match(input,RULE_DYNAMIC_PARAM_VALUE,FOLLOW_RULE_DYNAMIC_PARAM_VALUE_in_ruleDynamicParam1048); 

            			newLeafNode(lv_value_3_0, grammarAccess.getDynamicParamAccess().getValueDYNAMIC_PARAM_VALUETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"DYNAMIC_PARAM_VALUE");
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDynamicParam1065); 

                	newLeafNode(otherlv_4, grammarAccess.getDynamicParamAccess().getGreaterThanSignKeyword_4());
                

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
    // $ANTLR end "ruleDynamicParam"


    // $ANTLR start "entryRuleComment"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:497:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:498:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:499:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1101);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1111); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:506:1: ruleComment returns [EObject current=null] : ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) ) )+ (this_SINGLE_NL_1= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_1=null;
        Token lv_text_0_2=null;
        Token lv_text_0_3=null;
        Token lv_text_0_4=null;
        Token this_SINGLE_NL_1=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:509:28: ( ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) ) )+ (this_SINGLE_NL_1= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:1: ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) ) )+ (this_SINGLE_NL_1= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:1: ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) ) )+ (this_SINGLE_NL_1= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:2: ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) ) )+ (this_SINGLE_NL_1= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:2: ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_WORD && LA16_0<=RULE_SEPARATORS)||LA16_0==RULE_STATIC_PARAM||LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:511:1: ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:511:1: ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:512:1: (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:512:1: (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_SEPARATORS | lv_text_0_3= RULE_STATIC_PARAM | lv_text_0_4= '.' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:513:3: lv_text_0_1= RULE_WORD
            	            {
            	            lv_text_0_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleComment1155); 

            	            			newLeafNode(lv_text_0_1, grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_0_1, 
            	                    		"WORD");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:528:8: lv_text_0_2= RULE_SEPARATORS
            	            {
            	            lv_text_0_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleComment1175); 

            	            			newLeafNode(lv_text_0_2, grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_0_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_0_2, 
            	                    		"SEPARATORS");
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:543:8: lv_text_0_3= RULE_STATIC_PARAM
            	            {
            	            lv_text_0_3=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleComment1195); 

            	            			newLeafNode(lv_text_0_3, grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_2()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_0_3, 
            	                    		"STATIC_PARAM");
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:558:8: lv_text_0_4= '.'
            	            {
            	            lv_text_0_4=(Token)match(input,17,FOLLOW_17_in_ruleComment1216); 

            	                    newLeafNode(lv_text_0_4, grammarAccess.getCommentAccess().getTextFullStopKeyword_0_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "text", lv_text_0_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:573:3: (this_SINGLE_NL_1= RULE_SINGLE_NL )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SINGLE_NL) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:573:4: this_SINGLE_NL_1= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_1=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1245); 
            	     
            	        newLeafNode(this_SINGLE_NL_1, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_ruleModel130 = new BitSet(new long[]{0x0000000000020EB2L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleAbstractEntity224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleAbstractEntity251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAbstractEntity278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleAbstractEntity306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleSpec388 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleSpec407 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleSpec427 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec448 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleScenario532 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleScenario551 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleScenario571 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario592 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStep685 = new BitSet(new long[]{0x0000000000001090L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStep708 = new BitSet(new long[]{0x00000000000010F0L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStep735 = new BitSet(new long[]{0x00000000000010F0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStep752 = new BitSet(new long[]{0x00000000000010F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStep764 = new BitSet(new long[]{0x00000000000010F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep779 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDynamicParam954 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleDynamicParam974 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleDynamicParam1003 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDynamicParam1031 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_VALUE_in_ruleDynamicParam1048 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDynamicParam1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleComment1155 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleComment1175 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleComment1195 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_17_in_ruleComment1216 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1245 = new BitSet(new long[]{0x0000000000000042L});

}