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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_NL", "RULE_WORD", "RULE_WS", "RULE_SEPARATORS", "RULE_STATIC_PARAM", "RULE_DYNAMIC_PARAM", "RULE_TABLE_ROW_END", "'# '", "'='", "'## '", "'-'", "'* '", "'tags'", "':'", "','", "'|'"
    };
    public static final int RULE_STATIC_PARAM=8;
    public static final int RULE_WORD=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=7;
    public static final int RULE_TABLE_ROW_END=10;
    public static final int RULE_SINGLE_NL=4;
    public static final int RULE_WS=6;
    public static final int RULE_DYNAMIC_PARAM=9;

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:76:1: ruleModel returns [EObject current=null] : ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_SINGLE_NL_1=null;
        EObject lv_definitions_2_1 = null;

        EObject lv_definitions_2_2 = null;

        EObject lv_definitions_2_3 = null;

        EObject lv_definitions_2_4 = null;

        EObject lv_definitions_2_5 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:79:28: ( ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) ) )* ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) ) )* )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) ) )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:2: () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) ) )*
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:86:2: (this_SINGLE_NL_1= RULE_SINGLE_NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SINGLE_NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:86:3: this_SINGLE_NL_1= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_1=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleModel131); 
            	     
            	        newLeafNode(this_SINGLE_NL_1, grammarAccess.getModelAccess().getSINGLE_NLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:90:3: ( ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_DYNAMIC_PARAM)||LA3_0==11||LA3_0==13||(LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:91:1: ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:91:1: ( (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:92:1: (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:92:1: (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags )
            	    int alt2=5;
            	    alt2 = dfa2.predict(input);
            	    switch (alt2) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:93:3: lv_definitions_2_1= ruleSpec
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsSpecParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleSpec_in_ruleModel155);
            	            lv_definitions_2_1=ruleSpec();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_2_1, 
            	                    		"Spec");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:108:8: lv_definitions_2_2= ruleScenario
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsScenarioParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleScenario_in_ruleModel174);
            	            lv_definitions_2_2=ruleScenario();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_2_2, 
            	                    		"Scenario");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:123:8: lv_definitions_2_3= ruleStep
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsStepParserRuleCall_2_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStep_in_ruleModel193);
            	            lv_definitions_2_3=ruleStep();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_2_3, 
            	                    		"Step");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:138:8: lv_definitions_2_4= ruleComment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsCommentParserRuleCall_2_0_3()); 
            	            	    
            	            pushFollow(FOLLOW_ruleComment_in_ruleModel212);
            	            lv_definitions_2_4=ruleComment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_2_4, 
            	                    		"Comment");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:153:8: lv_definitions_2_5= ruleTags
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsTagsParserRuleCall_2_0_4()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTags_in_ruleModel231);
            	            lv_definitions_2_5=ruleTags();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_2_5, 
            	                    		"Tags");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpec"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:179:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:180:2: (iv_ruleSpec= ruleSpec EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:181:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec271);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec281); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:188:1: ruleSpec returns [EObject current=null] : ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SINGLE_NL_2=null;
        Token this_SINGLE_NL_4=null;
        Token otherlv_5=null;
        Token this_SINGLE_NL_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:191:28: ( ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:192:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:192:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_DYNAMIC_PARAM)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:192:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:192:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:192:4: otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpec319); 

                        	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:196:1: ( (lv_name_1_0= ruleTextPart ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:197:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:197:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:198:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec340);
                    	    lv_name_1_0=ruleTextPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"name",
                    	            		lv_name_1_0, 
                    	            		"TextPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:214:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:214:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec353); 
                    	     
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:219:7: ( (lv_name_3_0= ruleTextPart ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_WORD && LA6_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:220:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:220:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:221:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec383);
                    	    lv_name_3_0=ruleTextPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"name",
                    	            		lv_name_3_0, 
                    	            		"TextPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec395); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:241:1: (otherlv_5= '=' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:241:3: otherlv_5= '='
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSpec407); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_SINGLE_NL) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec421); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_3()); 
                    	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:257:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:258:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:259:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario459);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario469); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:266:1: ruleScenario returns [EObject current=null] : ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SINGLE_NL_2=null;
        Token this_SINGLE_NL_4=null;
        Token otherlv_5=null;
        Token this_SINGLE_NL_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:269:28: ( ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:270:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:270:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_WORD && LA15_0<=RULE_DYNAMIC_PARAM)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:270:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:270:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:270:4: otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScenario507); 

                        	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:274:1: ( (lv_name_1_0= ruleTextPart ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:275:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:275:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:276:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario528);
                    	    lv_name_1_0=ruleTextPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"name",
                    	            		lv_name_1_0, 
                    	            		"TextPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:292:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_SINGLE_NL) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:292:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario541); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:297:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:297:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:297:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:297:7: ( (lv_name_3_0= ruleTextPart ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_WORD && LA12_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:299:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario571);
                    	    lv_name_3_0=ruleTextPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"name",
                    	            		lv_name_3_0, 
                    	            		"TextPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario583); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:1: (otherlv_5= '-' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:3: otherlv_5= '-'
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario595); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:323:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_SINGLE_NL) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:323:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario609); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_3()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:335:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:336:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:337:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep647);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep657); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:344:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ this_SINGLE_NL_9= RULE_SINGLE_NL ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )* ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WORD_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_WS_7=null;
        Token this_SEPARATORS_8=null;
        Token this_SINGLE_NL_9=null;
        Token this_SINGLE_NL_10=null;
        Token this_SINGLE_NL_12=null;
        EObject lv_staticParams_2_0 = null;

        EObject lv_dynamicParams_3_0 = null;

        EObject lv_table_11_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:347:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ this_SINGLE_NL_9= RULE_SINGLE_NL ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )* ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ this_SINGLE_NL_9= RULE_SINGLE_NL ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )* )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ this_SINGLE_NL_9= RULE_SINGLE_NL ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ this_SINGLE_NL_9= RULE_SINGLE_NL ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )*
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:349:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStep703); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:358:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_WS)||(LA18_0>=RULE_STATIC_PARAM && LA18_0<=RULE_DYNAMIC_PARAM)||LA18_0==12||LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:358:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:358:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS )
            	    int alt16=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:358:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:358:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:359:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:359:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:360:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStep726);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:377:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:377:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:378:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:379:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStep753);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:396:6: this_WORD_4= RULE_WORD
            	            {
            	            this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStep770); 
            	             
            	                newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:401:7: otherlv_5= '-'
            	            {
            	            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStep787); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3());
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:406:7: otherlv_6= '='
            	            {
            	            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStep805); 

            	                	newLeafNode(otherlv_6, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4());
            	                

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:411:6: this_WS_7= RULE_WS
            	            {
            	            this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleStep822); 
            	             
            	                newLeafNode(this_WS_7, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:415:2: (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==RULE_SEPARATORS) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:415:3: this_SEPARATORS_8= RULE_SEPARATORS
            	    	    {
            	    	    this_SEPARATORS_8=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStep834); 
            	    	     
            	    	        newLeafNode(this_SEPARATORS_8, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            this_SINGLE_NL_9=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep848); 
             
                newLeafNode(this_SINGLE_NL_9, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:423:1: ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:423:2: (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:423:2: (this_SINGLE_NL_10= RULE_SINGLE_NL )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_SINGLE_NL) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:423:3: this_SINGLE_NL_10= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_10=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep860); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_10, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_4_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:427:3: ( (lv_table_11_0= ruleTable ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:428:1: (lv_table_11_0= ruleTable )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:428:1: (lv_table_11_0= ruleTable )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:429:3: lv_table_11_0= ruleTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTable_in_ruleStep882);
                    lv_table_11_0=ruleTable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStepRule());
                    	        }
                           		set(
                           			current, 
                           			"table",
                            		lv_table_11_0, 
                            		"Table");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:445:4: (this_SINGLE_NL_12= RULE_SINGLE_NL )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_SINGLE_NL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:445:5: this_SINGLE_NL_12= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_12=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep896); 
            	     
            	        newLeafNode(this_SINGLE_NL_12, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:457:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:458:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:459:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam933);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam943); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:466:1: ruleStaticParam returns [EObject current=null] : ( (lv_name_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:469:28: ( ( (lv_name_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:470:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:470:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:471:1: (lv_name_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:471:1: (lv_name_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:3: lv_name_0_0= RULE_STATIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam984); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:496:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:497:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:498:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1024);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam1034); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:505:1: ruleDynamicParam returns [EObject current=null] : ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:508:28: ( ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:509:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:509:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:511:3: lv_name_0_0= RULE_DYNAMIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1075); 

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


    // $ANTLR start "entryRuleTags"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:535:1: entryRuleTags returns [EObject current=null] : iv_ruleTags= ruleTags EOF ;
    public final EObject entryRuleTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTags = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:536:2: (iv_ruleTags= ruleTags EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:537:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_ruleTags_in_entryRuleTags1115);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTags1125); 

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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:544:1: ruleTags returns [EObject current=null] : ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WORD_4=null;
        Token this_WS_5=null;
        Token otherlv_6=null;
        Token this_SINGLE_NL_7=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:547:28: ( ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:548:1: ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:548:1: ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:548:2: () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:548:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:549:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTagsAccess().getTagsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTags1171); 

                	newLeafNode(otherlv_1, grammarAccess.getTagsAccess().getTagsKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:558:1: (this_WS_2= RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:558:2: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1183); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTagsAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTags1196); 

                	newLeafNode(otherlv_3, grammarAccess.getTagsAccess().getColonKeyword_3());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:566:1: (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=4;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt23=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt23=2;
                    }
                    break;
                case 18:
                    {
                    alt23=3;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:566:2: this_WORD_4= RULE_WORD
            	    {
            	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTags1208); 
            	     
            	        newLeafNode(this_WORD_4, grammarAccess.getTagsAccess().getWORDTerminalRuleCall_4_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:571:6: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1224); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getTagsAccess().getWSTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:576:7: otherlv_6= ','
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleTags1241); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTagsAccess().getCommaKeyword_4_2());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:580:3: (this_SINGLE_NL_7= RULE_SINGLE_NL )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_SINGLE_NL) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:580:4: this_SINGLE_NL_7= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_7=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleTags1255); 
            	     
            	        newLeafNode(this_SINGLE_NL_7, grammarAccess.getTagsAccess().getSINGLE_NLTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleComment"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:592:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:593:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:594:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1292);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1302); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:601:1: ruleComment returns [EObject current=null] : ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token lv_name_1_5=null;
        Token lv_name_1_6=null;
        Token this_SINGLE_NL_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_1 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:604:28: ( ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:605:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:605:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:605:2: ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:605:2: ( (lv_name_0_0= ruleTextPart ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:606:1: (lv_name_0_0= ruleTextPart )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:606:1: (lv_name_0_0= ruleTextPart )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:607:3: lv_name_0_0= ruleTextPart
            {
             
            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1348);
            lv_name_0_0=ruleTextPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommentRule());
            	        }
                   		add(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TextPart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:623:2: ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_WORD && LA26_0<=RULE_DYNAMIC_PARAM)||LA26_0==12||LA26_0==14||(LA26_0>=17 && LA26_0<=19)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:624:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:624:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:625:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:625:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    int alt25=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	    case RULE_WS:
            	    case RULE_SEPARATORS:
            	    case RULE_STATIC_PARAM:
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt25=5;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt25=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:626:3: lv_name_1_1= ruleTextPart
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1371);
            	            lv_name_1_1=ruleTextPart();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getCommentRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_1, 
            	                    		"TextPart");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:641:8: lv_name_1_2= '-'
            	            {
            	            lv_name_1_2=(Token)match(input,14,FOLLOW_14_in_ruleComment1387); 

            	                    newLeafNode(lv_name_1_2, grammarAccess.getCommentAccess().getNameHyphenMinusKeyword_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:653:8: lv_name_1_3= '='
            	            {
            	            lv_name_1_3=(Token)match(input,12,FOLLOW_12_in_ruleComment1416); 

            	                    newLeafNode(lv_name_1_3, grammarAccess.getCommentAccess().getNameEqualsSignKeyword_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:665:8: lv_name_1_4= '|'
            	            {
            	            lv_name_1_4=(Token)match(input,19,FOLLOW_19_in_ruleComment1445); 

            	                    newLeafNode(lv_name_1_4, grammarAccess.getCommentAccess().getNameVerticalLineKeyword_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:677:8: lv_name_1_5= ','
            	            {
            	            lv_name_1_5=(Token)match(input,18,FOLLOW_18_in_ruleComment1474); 

            	                    newLeafNode(lv_name_1_5, grammarAccess.getCommentAccess().getNameCommaKeyword_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:689:8: lv_name_1_6= ':'
            	            {
            	            lv_name_1_6=(Token)match(input,17,FOLLOW_17_in_ruleComment1503); 

            	                    newLeafNode(lv_name_1_6, grammarAccess.getCommentAccess().getNameColonKeyword_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_6, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:704:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_SINGLE_NL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:704:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1532); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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


    // $ANTLR start "entryRuleTextPart"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:716:1: entryRuleTextPart returns [String current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final String entryRuleTextPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextPart = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:717:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:718:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1570);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1581); 

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
    // $ANTLR end "entryRuleTextPart"


    // $ANTLR start "ruleTextPart"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:725:1: ruleTextPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleTextPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_SEPARATORS_1=null;
        Token this_STATIC_PARAM_2=null;
        Token this_DYNAMIC_PARAM_3=null;
        Token this_WS_4=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:728:28: ( (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:729:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:729:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            int alt28=5;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt28=1;
                }
                break;
            case RULE_SEPARATORS:
                {
                alt28=2;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt28=3;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt28=4;
                }
                break;
            case RULE_WS:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:729:6: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTextPart1621); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getTextPartAccess().getWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:737:10: this_SEPARATORS_1= RULE_SEPARATORS
                    {
                    this_SEPARATORS_1=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTextPart1647); 

                    		current.merge(this_SEPARATORS_1);
                        
                     
                        newLeafNode(this_SEPARATORS_1, grammarAccess.getTextPartAccess().getSEPARATORSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:745:10: this_STATIC_PARAM_2= RULE_STATIC_PARAM
                    {
                    this_STATIC_PARAM_2=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1673); 

                    		current.merge(this_STATIC_PARAM_2);
                        
                     
                        newLeafNode(this_STATIC_PARAM_2, grammarAccess.getTextPartAccess().getSTATIC_PARAMTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:753:10: this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM
                    {
                    this_DYNAMIC_PARAM_3=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1699); 

                    		current.merge(this_DYNAMIC_PARAM_3);
                        
                     
                        newLeafNode(this_DYNAMIC_PARAM_3, grammarAccess.getTextPartAccess().getDYNAMIC_PARAMTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:761:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTextPart1725); 

                    		current.merge(this_WS_4);
                        
                     
                        newLeafNode(this_WS_4, grammarAccess.getTextPartAccess().getWSTerminalRuleCall_4()); 
                        

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
    // $ANTLR end "ruleTextPart"


    // $ANTLR start "entryRuleTable"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:776:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:777:2: (iv_ruleTable= ruleTable EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:778:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable1770);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable1780); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:785:1: ruleTable returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_TABLE_ROW_END_5=null;
        Token this_WS_6=null;
        EObject lv_heading_1_0 = null;

        EObject lv_rows_7_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:788:28: ( ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:789:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:789:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:789:2: (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:789:2: (this_WS_0= RULE_WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:789:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1817); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getTableAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:793:3: ( (lv_heading_1_0= ruleTableRow ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:794:1: (lv_heading_1_0= ruleTableRow )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:794:1: (lv_heading_1_0= ruleTableRow )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:795:3: lv_heading_1_0= ruleTableRow
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getHeadingTableRowParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTableRow_in_ruleTable1839);
            lv_heading_1_0=ruleTableRow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"TableRow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:811:2: (this_WS_2= RULE_WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:811:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1851); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTableAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:815:3: (otherlv_3= '|' (otherlv_4= '-' )+ )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:815:5: otherlv_3= '|' (otherlv_4= '-' )+
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTable1865); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0());
            	        
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:819:1: (otherlv_4= '-' )+
            	    int cnt31=0;
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==14) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:819:3: otherlv_4= '-'
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTable1878); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt31 >= 1 ) break loop31;
            	                EarlyExitException eee =
            	                    new EarlyExitException(31, input);
            	                throw eee;
            	        }
            	        cnt31++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            this_TABLE_ROW_END_5=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1893); 
             
                newLeafNode(this_TABLE_ROW_END_5, grammarAccess.getTableAccess().getTABLE_ROW_ENDTerminalRuleCall_4()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:827:1: ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:827:2: (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:827:2: (this_WS_6= RULE_WS )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==RULE_WS) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:827:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1905); 
            	    	     
            	    	        newLeafNode(this_WS_6, grammarAccess.getTableAccess().getWSTerminalRuleCall_5_0()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:831:3: ( (lv_rows_7_0= ruleTableRow ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:832:1: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:832:1: (lv_rows_7_0= ruleTableRow )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:833:3: lv_rows_7_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable1927);
            	    lv_rows_7_0=ruleTableRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_7_0, 
            	            		"TableRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:857:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:858:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:859:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow1965);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow1975); 

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
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:866:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token this_TABLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:869:28: ( ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:870:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:870:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:870:2: ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:870:2: ( (lv_cells_0_0= ruleTableCell ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:871:1: (lv_cells_0_0= ruleTableCell )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:871:1: (lv_cells_0_0= ruleTableCell )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:872:3: lv_cells_0_0= ruleTableCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableCell_in_ruleTableRow2021);
            	    lv_cells_0_0=ruleTableCell();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_0_0, 
            	            		"TableCell");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            this_TABLE_ROW_END_1=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2033); 
             
                newLeafNode(this_TABLE_ROW_END_1, grammarAccess.getTableRowAccess().getTABLE_ROW_ENDTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableCell"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:900:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:901:2: (iv_ruleTableCell= ruleTableCell EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:902:2: iv_ruleTableCell= ruleTableCell EOF
            {
             newCompositeNode(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_ruleTableCell_in_entryRuleTableCell2068);
            iv_ruleTableCell=ruleTableCell();

            state._fsp--;

             current =iv_ruleTableCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableCell2078); 

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
    // $ANTLR end "entryRuleTableCell"


    // $ANTLR start "ruleTableCell"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:909:1: ruleTableCell returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) ;
    public final EObject ruleTableCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:912:28: ( (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:913:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:913:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:913:3: otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTableCell2115); 

                	newLeafNode(otherlv_0, grammarAccess.getTableCellAccess().getVerticalLineKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:917:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_WORD && LA37_0<=RULE_SEPARATORS)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:918:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:918:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:919:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:919:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:920:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTableCell2134); 

            	            			newLeafNode(lv_name_1_1, grammarAccess.getTableCellAccess().getNameWORDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTableCellRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_1, 
            	                    		"WORD");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:935:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTableCell2154); 

            	            			newLeafNode(lv_name_1_2, grammarAccess.getTableCellAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTableCellRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_2, 
            	                    		"SEPARATORS");
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:950:8: lv_name_1_3= RULE_WS
            	            {
            	            lv_name_1_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTableCell2174); 

            	            			newLeafNode(lv_name_1_3, grammarAccess.getTableCellAccess().getNameWSTerminalRuleCall_1_0_2()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTableCellRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_1_3, 
            	                    		"WS");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // $ANTLR end "ruleTableCell"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\12\uffff\1\20\6\uffff";
    static final String DFA2_minS =
        "\1\5\1\uffff\5\4\3\uffff\6\4\1\uffff";
    static final String DFA2_maxS =
        "\1\20\1\uffff\5\23\3\uffff\1\20\5\23\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3\1\5\6\uffff\1\4";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\6\1\3\1\4\1\5\1\uffff\1\1\1\uffff\1\7\1\uffff\1\10\1\11",
            "",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "",
            "",
            "",
            "\6\20\1\uffff\1\20\1\1\1\20\1\7\2\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            "\1\12\1\13\1\17\1\14\1\15\1\16\2\uffff\1\20\1\uffff\1\20\2\uffff\3\20",
            ""
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
            return "92:1: (lv_definitions_2_1= ruleSpec | lv_definitions_2_2= ruleScenario | lv_definitions_2_3= ruleStep | lv_definitions_2_4= ruleComment | lv_definitions_2_5= ruleTags )";
        }
    }
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\2\4\10\uffff";
    static final String DFA20_minS =
        "\3\4\2\uffff\5\4";
    static final String DFA20_maxS =
        "\3\23\2\uffff\5\23";
    static final String DFA20_acceptS =
        "\3\uffff\1\1\1\2\5\uffff";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\4\1\2\3\4\1\uffff\1\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\3",
            "\1\1\1\4\1\2\3\4\1\uffff\1\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\3",
            "\2\4\1\5\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\1\6",
            "",
            "",
            "\2\4\1\5\3\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\1\6",
            "\1\4\1\7\1\11\1\10\2\4\2\uffff\1\4\1\uffff\1\4\2\uffff\3\4",
            "\1\4\1\7\1\11\1\10\2\4\1\3\1\uffff\1\4\1\uffff\1\4\2\uffff\2\4\1\6",
            "\1\4\1\7\1\11\1\10\2\4\1\3\1\uffff\1\4\1\uffff\1\4\2\uffff\2\4\1\6",
            "\1\4\1\7\1\11\1\10\2\4\1\3\1\uffff\1\4\1\uffff\1\4\2\uffff\2\4\1\6"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "423:1: ( (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?";
        }
    }
    static final String DFA34_eotS =
        "\11\uffff";
    static final String DFA34_eofS =
        "\1\1\10\uffff";
    static final String DFA34_minS =
        "\1\4\1\uffff\1\4\1\uffff\5\4";
    static final String DFA34_maxS =
        "\1\23\1\uffff\1\23\1\uffff\5\23";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\5\uffff";
    static final String DFA34_specialS =
        "\11\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\1\1\2\3\1\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1\2\uffff\1\3",
            "",
            "\2\1\1\4\3\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\5",
            "",
            "\2\1\1\4\3\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\5",
            "\1\1\1\6\1\10\1\7\2\1\2\uffff\1\1\1\uffff\1\1\2\uffff\3\1",
            "\1\1\1\6\1\10\1\7\2\1\1\3\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\5",
            "\1\1\1\6\1\10\1\7\2\1\1\3\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\5",
            "\1\1\1\6\1\10\1\7\2\1\1\3\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\5"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()+ loopback of 827:1: ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleModel131 = new BitSet(new long[]{0x000000000001ABF2L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleModel155 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleModel174 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleStep_in_ruleModel193 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleComment_in_ruleModel212 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleTags_in_ruleModel231 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpec319 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec340 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec353 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec383 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec395 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpec407 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec421 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScenario507 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario528 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario541 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario571 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario583 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario595 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario609 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStep703 = new BitSet(new long[]{0x0000000000005360L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStep726 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStep753 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStep770 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_14_in_ruleStep787 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_12_in_ruleStep805 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleStep822 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStep834 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep848 = new BitSet(new long[]{0x0000000000080052L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep860 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep882 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep896 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTags_in_entryRuleTags1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTags1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTags1171 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1183 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleTags1196 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTags1208 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1224 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_18_in_ruleTags1241 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleTags1255 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1348 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1371 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_14_in_ruleComment1387 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_12_in_ruleComment1416 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_19_in_ruleComment1445 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_18_in_ruleComment1474 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_17_in_ruleComment1503 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1532 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTextPart1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTextPart1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTextPart1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1817 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1839 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1851 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleTable1865 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTable1878 = new BitSet(new long[]{0x0000000000084400L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1893 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1905 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1927 = new BitSet(new long[]{0x0000000000080052L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_ruleTableRow2021 = new BitSet(new long[]{0x0000000000080450L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_entryRuleTableCell2068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableCell2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTableCell2115 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTableCell2134 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTableCell2154 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTableCell2174 = new BitSet(new long[]{0x00000000000000E2L});

}