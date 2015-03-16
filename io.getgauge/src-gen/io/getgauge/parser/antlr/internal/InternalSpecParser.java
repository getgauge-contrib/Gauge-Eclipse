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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_SEPARATORS", "RULE_SINGLE_NL", "RULE_STATIC_PARAM", "RULE_DYNAMIC_PARAM", "'# '", "'='", "'## '", "'-'", "'* '"
    };
    public static final int T__9=9;
    public static final int RULE_SINGLE_NL=6;
    public static final int RULE_STATIC_PARAM=7;
    public static final int RULE_WORD=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=5;
    public static final int RULE_DYNAMIC_PARAM=8;
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

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_SEPARATORS)||(LA1_0>=RULE_STATIC_PARAM && LA1_0<=9)||LA1_0==11||LA1_0==13) ) {
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:115:1: ruleAbstractEntity returns [EObject current=null] : (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Spec_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_Step_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:118:28: ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:119:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment )
            int alt2=4;
            alt2 = dfa2.predict(input);
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
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec339);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec349); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:175:1: ruleSpec returns [EObject current=null] : ( (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token this_SINGLE_NL_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token this_SINGLE_NL_4=null;
        Token otherlv_5=null;
        Token this_SINGLE_NL_6=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:178:28: ( ( (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:1: ( (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:1: ( (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==9) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_SEPARATORS)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:2: (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:2: (otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:4: otherlv_0= '# ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleSpec387); 

                        	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:183:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_SEPARATORS)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:184:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:184:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:185:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:185:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_WORD) ) {
                    	        alt3=1;
                    	    }
                    	    else if ( (LA3_0==RULE_SEPARATORS) ) {
                    	        alt3=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 3, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:186:3: lv_name_1_1= RULE_WORD
                    	            {
                    	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleSpec406); 

                    	            			newLeafNode(lv_name_1_1, grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_0_1_0_0()); 
                    	            		

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
                    	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleSpec426); 

                    	            			newLeafNode(lv_name_1_2, grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_0_1_0_1()); 
                    	            		

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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_SINGLE_NL) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec447); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
                    	        

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


                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:224:6: ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:224:6: ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:224:7: ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:224:7: ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_WORD && LA7_0<=RULE_SEPARATORS)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:225:1: ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:225:1: ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:226:1: (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:226:1: (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==RULE_WORD) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==RULE_SEPARATORS) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:227:3: lv_name_3_1= RULE_WORD
                    	            {
                    	            lv_name_3_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleSpec475); 

                    	            			newLeafNode(lv_name_3_1, grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSpecRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"name",
                    	                    		lv_name_3_1, 
                    	                    		"WORD");
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:242:8: lv_name_3_2= RULE_SEPARATORS
                    	            {
                    	            lv_name_3_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleSpec495); 

                    	            			newLeafNode(lv_name_3_2, grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_0_1()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSpecRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"name",
                    	                    		lv_name_3_2, 
                    	                    		"SEPARATORS");
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec515); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:264:1: ( (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:264:2: (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:264:2: (otherlv_5= '=' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==10) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:264:4: otherlv_5= '='
                    	    {
                    	    otherlv_5=(Token)match(input,10,FOLLOW_10_in_ruleSpec528); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2_0());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:268:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:268:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec542); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
                    	        

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleScenario"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:280:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:281:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:282:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario581);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario591); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:289:1: ruleScenario returns [EObject current=null] : ( (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token this_SINGLE_NL_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token this_SINGLE_NL_4=null;
        Token otherlv_5=null;
        Token this_SINGLE_NL_6=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:292:28: ( ( (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:293:1: ( (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:293:1: ( (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_SEPARATORS)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:293:2: (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:293:2: (otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:293:4: otherlv_0= '## ' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleScenario629); 

                        	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:297:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_WORD && LA12_0<=RULE_SEPARATORS)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS ) )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:299:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:299:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS )
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==RULE_WORD) ) {
                    	        alt11=1;
                    	    }
                    	    else if ( (LA11_0==RULE_SEPARATORS) ) {
                    	        alt11=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:300:3: lv_name_1_1= RULE_WORD
                    	            {
                    	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleScenario648); 

                    	            			newLeafNode(lv_name_1_1, grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_0_1_0_0()); 
                    	            		

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
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:315:8: lv_name_1_2= RULE_SEPARATORS
                    	            {
                    	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleScenario668); 

                    	            			newLeafNode(lv_name_1_2, grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_0_1_0_1()); 
                    	            		

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
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario689); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
                    	        

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
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:6: ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:6: ( ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:7: ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:7: ( ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=RULE_WORD && LA15_0<=RULE_SEPARATORS)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:339:1: ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:339:1: ( (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS ) )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:340:1: (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:340:1: (lv_name_3_1= RULE_WORD | lv_name_3_2= RULE_SEPARATORS )
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_WORD) ) {
                    	        alt14=1;
                    	    }
                    	    else if ( (LA14_0==RULE_SEPARATORS) ) {
                    	        alt14=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:341:3: lv_name_3_1= RULE_WORD
                    	            {
                    	            lv_name_3_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleScenario717); 

                    	            			newLeafNode(lv_name_3_1, grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getScenarioRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"name",
                    	                    		lv_name_3_1, 
                    	                    		"WORD");
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:356:8: lv_name_3_2= RULE_SEPARATORS
                    	            {
                    	            lv_name_3_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleScenario737); 

                    	            			newLeafNode(lv_name_3_2, grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_0_1()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getScenarioRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"name",
                    	                    		lv_name_3_2, 
                    	                    		"SEPARATORS");
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario757); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:1: ( (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:2: (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:2: (otherlv_5= '-' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==12) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:4: otherlv_5= '-'
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleScenario770); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2_0());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:382:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:382:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario784); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
                    	        

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:394:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:395:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:396:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep823);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep833); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:403:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )* )+ (this_SINGLE_NL_8= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WORD_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_SEPARATORS_7=null;
        Token this_SINGLE_NL_8=null;
        EObject lv_staticParams_2_0 = null;

        EObject lv_dynamicParams_3_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:406:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )* )+ (this_SINGLE_NL_8= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:407:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )* )+ (this_SINGLE_NL_8= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:407:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )* )+ (this_SINGLE_NL_8= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:407:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )* )+ (this_SINGLE_NL_8= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:407:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:408:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStep879); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )* )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WORD||(LA21_0>=RULE_STATIC_PARAM && LA21_0<=RULE_DYNAMIC_PARAM)||LA21_0==10||LA21_0==12) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' ) (this_SEPARATORS_7= RULE_SEPARATORS )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' )
            	    int alt19=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 10:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:418:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:418:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:419:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStep902);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:436:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:436:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:437:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:437:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:438:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStep929);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:455:6: this_WORD_4= RULE_WORD
            	            {
            	            this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStep946); 
            	             
            	                newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:7: otherlv_5= '-'
            	            {
            	            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleStep963); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3());
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:465:7: otherlv_6= '='
            	            {
            	            otherlv_6=(Token)match(input,10,FOLLOW_10_in_ruleStep981); 

            	                	newLeafNode(otherlv_6, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4());
            	                

            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:469:2: (this_SEPARATORS_7= RULE_SEPARATORS )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==RULE_SEPARATORS) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:469:3: this_SEPARATORS_7= RULE_SEPARATORS
            	    	    {
            	    	    this_SEPARATORS_7=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStep994); 
            	    	     
            	    	        newLeafNode(this_SEPARATORS_7, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:473:5: (this_SINGLE_NL_8= RULE_SINGLE_NL )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SINGLE_NL) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:473:6: this_SINGLE_NL_8= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_8=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep1009); 
            	     
            	        newLeafNode(this_SINGLE_NL_8, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:485:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:486:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:487:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam1046);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam1056); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:494:1: ruleStaticParam returns [EObject current=null] : ( (lv_name_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:497:28: ( ( (lv_name_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:498:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:498:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:499:1: (lv_name_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:499:1: (lv_name_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:500:3: lv_name_0_0= RULE_STATIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam1097); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStaticParamAccess().getNameSTATIC_PARAMTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStaticParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:524:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:525:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:526:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1137);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam1147); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:533:1: ruleDynamicParam returns [EObject current=null] : ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:536:28: ( ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:537:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:537:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:539:3: lv_name_0_0= RULE_DYNAMIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1188); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDynamicParamAccess().getNameDYNAMIC_PARAMTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"DYNAMIC_PARAM");
            	    

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
    // $ANTLR end "ruleDynamicParam"


    // $ANTLR start "entryRuleComment"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:563:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:564:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:565:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1228);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1238); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:572:1: ruleComment returns [EObject current=null] : ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) ) ) ( ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_1=null;
        Token lv_text_0_2=null;
        Token lv_text_0_3=null;
        Token lv_text_1_1=null;
        Token lv_text_1_2=null;
        Token lv_text_1_3=null;
        Token lv_text_1_4=null;
        Token lv_text_1_5=null;
        Token lv_text_1_6=null;
        Token this_SINGLE_NL_2=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:575:28: ( ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) ) ) ( ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:576:1: ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) ) ) ( ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:576:1: ( ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) ) ) ( ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:576:2: ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) ) ) ( ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:576:2: ( ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:577:1: ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:577:1: ( (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:578:1: (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:578:1: (lv_text_0_1= RULE_WORD | lv_text_0_2= RULE_STATIC_PARAM | lv_text_0_3= RULE_DYNAMIC_PARAM )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt23=1;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt23=2;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:579:3: lv_text_0_1= RULE_WORD
                    {
                    lv_text_0_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleComment1282); 

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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:594:8: lv_text_0_2= RULE_STATIC_PARAM
                    {
                    lv_text_0_2=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleComment1302); 

                    			newLeafNode(lv_text_0_2, grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommentRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_0_2, 
                            		"STATIC_PARAM");
                    	    

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:609:8: lv_text_0_3= RULE_DYNAMIC_PARAM
                    {
                    lv_text_0_3=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleComment1322); 

                    			newLeafNode(lv_text_0_3, grammarAccess.getCommentAccess().getTextDYNAMIC_PARAMTerminalRuleCall_0_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommentRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_0_3, 
                            		"DYNAMIC_PARAM");
                    	    

                    }
                    break;

            }


            }


            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:627:2: ( ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_SEPARATORS)||(LA25_0>=RULE_STATIC_PARAM && LA25_0<=RULE_DYNAMIC_PARAM)||LA25_0==10||LA25_0==12) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:628:1: ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:628:1: ( (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:629:1: (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:629:1: (lv_text_1_1= RULE_WORD | lv_text_1_2= RULE_SEPARATORS | lv_text_1_3= RULE_STATIC_PARAM | lv_text_1_4= RULE_DYNAMIC_PARAM | lv_text_1_5= '-' | lv_text_1_6= '=' )
            	    int alt24=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 10:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:630:3: lv_text_1_1= RULE_WORD
            	            {
            	            lv_text_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleComment1349); 

            	            			newLeafNode(lv_text_1_1, grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_1_1, 
            	                    		"WORD");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:645:8: lv_text_1_2= RULE_SEPARATORS
            	            {
            	            lv_text_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleComment1369); 

            	            			newLeafNode(lv_text_1_2, grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_1_2, 
            	                    		"SEPARATORS");
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:660:8: lv_text_1_3= RULE_STATIC_PARAM
            	            {
            	            lv_text_1_3=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleComment1389); 

            	            			newLeafNode(lv_text_1_3, grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_1_0_2()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_1_3, 
            	                    		"STATIC_PARAM");
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:675:8: lv_text_1_4= RULE_DYNAMIC_PARAM
            	            {
            	            lv_text_1_4=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleComment1409); 

            	            			newLeafNode(lv_text_1_4, grammarAccess.getCommentAccess().getTextDYNAMIC_PARAMTerminalRuleCall_1_0_3()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_1_4, 
            	                    		"DYNAMIC_PARAM");
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:690:8: lv_text_1_5= '-'
            	            {
            	            lv_text_1_5=(Token)match(input,12,FOLLOW_12_in_ruleComment1430); 

            	                    newLeafNode(lv_text_1_5, grammarAccess.getCommentAccess().getTextHyphenMinusKeyword_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "text", lv_text_1_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:702:8: lv_text_1_6= '='
            	            {
            	            lv_text_1_6=(Token)match(input,10,FOLLOW_10_in_ruleComment1459); 

            	                    newLeafNode(lv_text_1_6, grammarAccess.getCommentAccess().getTextEqualsSignKeyword_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "text", lv_text_1_6, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:717:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SINGLE_NL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:717:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1488); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\13\uffff\1\6";
    static final String DFA2_minS =
        "\1\4\1\uffff\2\4\3\uffff\1\12\4\4";
    static final String DFA2_maxS =
        "\1\15\1\uffff\1\14\1\6\3\uffff\3\14\1\6\1\15";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\5\uffff";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\1\uffff\2\6\1\1\1\uffff\1\4\1\uffff\1\5",
            "",
            "\1\10\1\11\1\7\2\6\1\uffff\1\6\1\uffff\1\6",
            "\1\12\1\3\1\7",
            "",
            "",
            "",
            "\1\1\1\uffff\1\4",
            "\1\10\1\11\1\13\2\6\1\uffff\1\6\1\uffff\1\6",
            "\1\10\1\11\1\13\2\6\1\uffff\1\6\1\uffff\1\6",
            "\1\12\1\3\1\7",
            "\6\6\1\1\1\6\1\4\1\6"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "119:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_ruleModel130 = new BitSet(new long[]{0x0000000000002BB2L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleAbstractEntity223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleAbstractEntity250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAbstractEntity277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleAbstractEntity304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleSpec387 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleSpec406 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleSpec426 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec447 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleSpec475 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleSpec495 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec515 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleSpec528 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec542 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleScenario629 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleScenario648 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleScenario668 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario689 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleScenario717 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleScenario737 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario757 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenario770 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario784 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStep879 = new BitSet(new long[]{0x0000000000001590L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStep902 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStep929 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStep946 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_12_in_ruleStep963 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_10_in_ruleStep981 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStep994 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep1009 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleComment1282 = new BitSet(new long[]{0x00000000000015B0L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleComment1302 = new BitSet(new long[]{0x00000000000015B0L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleComment1322 = new BitSet(new long[]{0x00000000000015B0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleComment1349 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleComment1369 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleComment1389 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleComment1409 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_12_in_ruleComment1430 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_10_in_ruleComment1459 = new BitSet(new long[]{0x00000000000015F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1488 = new BitSet(new long[]{0x0000000000000042L});

}