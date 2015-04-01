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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_1 = null;

        EObject lv_definitions_0_2 = null;

        EObject lv_definitions_0_3 = null;

        EObject lv_definitions_0_4 = null;

        EObject lv_definitions_0_5 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:79:28: ( ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags ) ) )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags ) ) )*
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_DYNAMIC_PARAM)||LA2_0==11||LA2_0==13||(LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:1: ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:1: ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:82:1: (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:82:1: (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags )
            	    int alt1=5;
            	    alt1 = dfa1.predict(input);
            	    switch (alt1) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:83:3: lv_definitions_0_1= ruleSpec
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsSpecParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleSpec_in_ruleModel132);
            	            lv_definitions_0_1=ruleSpec();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_0_1, 
            	                    		"Spec");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:98:8: lv_definitions_0_2= ruleScenario
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsScenarioParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleScenario_in_ruleModel151);
            	            lv_definitions_0_2=ruleScenario();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_0_2, 
            	                    		"Scenario");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:113:8: lv_definitions_0_3= ruleStep
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsStepParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStep_in_ruleModel170);
            	            lv_definitions_0_3=ruleStep();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_0_3, 
            	                    		"Step");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:128:8: lv_definitions_0_4= ruleComment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsCommentParserRuleCall_0_3()); 
            	            	    
            	            pushFollow(FOLLOW_ruleComment_in_ruleModel189);
            	            lv_definitions_0_4=ruleComment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_0_4, 
            	                    		"Comment");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:143:8: lv_definitions_0_5= ruleTags
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsTagsParserRuleCall_0_4()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTags_in_ruleModel208);
            	            lv_definitions_0_5=ruleTags();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"definitions",
            	                    		lv_definitions_0_5, 
            	                    		"Tags");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleSpec"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:169:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:170:2: (iv_ruleSpec= ruleSpec EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:171:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec247);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec257); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:178:1: ruleSpec returns [EObject current=null] : ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:181:28: ( ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:182:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:182:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_WORD && LA8_0<=RULE_DYNAMIC_PARAM)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:182:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:182:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:182:4: otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpec295); 

                        	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:186:1: ( (lv_name_1_0= ruleTextPart ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:187:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:187:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:188:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec316);
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:204:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_SINGLE_NL) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:204:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec329); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
                    	        

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


                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:209:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:209:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:209:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:209:7: ( (lv_name_3_0= ruleTextPart ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_WORD && LA5_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:210:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:210:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:211:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec359);
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
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec371); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:231:1: (otherlv_5= '=' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==12) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:231:3: otherlv_5= '='
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSpec383); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:235:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_SINGLE_NL) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:235:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec397); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_3()); 
                    	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:247:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:248:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:249:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario435);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario445); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:256:1: ruleScenario returns [EObject current=null] : ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:259:28: ( ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:260:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:260:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_WORD && LA14_0<=RULE_DYNAMIC_PARAM)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:260:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:260:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:260:4: otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScenario483); 

                        	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:264:1: ( (lv_name_1_0= ruleTextPart ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:265:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:265:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:266:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario504);
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:282:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_SINGLE_NL) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:282:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario517); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
                    	        

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


                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:287:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:287:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:287:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:287:7: ( (lv_name_3_0= ruleTextPart ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_WORD && LA11_0<=RULE_DYNAMIC_PARAM)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:288:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:288:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:289:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario547);
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario559); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:309:1: (otherlv_5= '-' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:309:3: otherlv_5= '-'
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario571); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:313:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:313:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario585); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_3()); 
                    	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:325:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:326:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:327:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep623);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep633); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:334:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:337:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:339:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStep679); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_WS)||(LA17_0>=RULE_STATIC_PARAM && LA17_0<=RULE_DYNAMIC_PARAM)||LA17_0==12||LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS )
            	    int alt15=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt15=5;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt15=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:348:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:349:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:349:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:350:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStep702);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:367:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:367:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:368:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:368:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:369:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStep729);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:386:6: this_WORD_4= RULE_WORD
            	            {
            	            this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStep746); 
            	             
            	                newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:391:7: otherlv_5= '-'
            	            {
            	            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStep763); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3());
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:396:7: otherlv_6= '='
            	            {
            	            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStep781); 

            	                	newLeafNode(otherlv_6, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4());
            	                

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:401:6: this_WS_7= RULE_WS
            	            {
            	            this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleStep798); 
            	             
            	                newLeafNode(this_WS_7, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:405:2: (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_SEPARATORS) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:405:3: this_SEPARATORS_8= RULE_SEPARATORS
            	    	    {
            	    	    this_SEPARATORS_8=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStep810); 
            	    	     
            	    	        newLeafNode(this_SEPARATORS_8, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);


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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:409:5: (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:409:6: this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) )
                    {
                    this_SINGLE_NL_9=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep825); 
                     
                        newLeafNode(this_SINGLE_NL_9, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_0()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:413:1: (this_SINGLE_NL_10= RULE_SINGLE_NL )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_SINGLE_NL) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:413:2: this_SINGLE_NL_10= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_10=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep836); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_10, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:3: ( (lv_table_11_0= ruleTable ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:418:1: (lv_table_11_0= ruleTable )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:418:1: (lv_table_11_0= ruleTable )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:419:3: lv_table_11_0= ruleTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTable_in_ruleStep858);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:435:4: (this_SINGLE_NL_12= RULE_SINGLE_NL )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SINGLE_NL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:435:5: this_SINGLE_NL_12= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_12=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep872); 
            	     
            	        newLeafNode(this_SINGLE_NL_12, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_4()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:447:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:448:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:449:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam909);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam919); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:456:1: ruleStaticParam returns [EObject current=null] : ( (lv_name_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:459:28: ( ( (lv_name_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:461:1: (lv_name_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:461:1: (lv_name_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:462:3: lv_name_0_0= RULE_STATIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam960); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:486:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:487:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:488:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1000);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam1010); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:495:1: ruleDynamicParam returns [EObject current=null] : ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:498:28: ( ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:499:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:499:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:500:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:500:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:501:3: lv_name_0_0= RULE_DYNAMIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1051); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:525:1: entryRuleTags returns [EObject current=null] : iv_ruleTags= ruleTags EOF ;
    public final EObject entryRuleTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTags = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:526:2: (iv_ruleTags= ruleTags EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:527:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_ruleTags_in_entryRuleTags1091);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTags1101); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:534:1: ruleTags returns [EObject current=null] : ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:537:28: ( ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:1: ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:1: ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:2: () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:539:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTagsAccess().getTagsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTags1147); 

                	newLeafNode(otherlv_1, grammarAccess.getTagsAccess().getTagsKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:548:1: (this_WS_2= RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:548:2: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1159); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTagsAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTags1172); 

                	newLeafNode(otherlv_3, grammarAccess.getTagsAccess().getColonKeyword_3());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:556:1: (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=4;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt22=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt22=2;
                    }
                    break;
                case 18:
                    {
                    alt22=3;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:556:2: this_WORD_4= RULE_WORD
            	    {
            	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTags1184); 
            	     
            	        newLeafNode(this_WORD_4, grammarAccess.getTagsAccess().getWORDTerminalRuleCall_4_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:561:6: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1200); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getTagsAccess().getWSTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:566:7: otherlv_6= ','
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleTags1217); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTagsAccess().getCommaKeyword_4_2());
            	        

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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:570:3: (this_SINGLE_NL_7= RULE_SINGLE_NL )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SINGLE_NL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:570:4: this_SINGLE_NL_7= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_7=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleTags1231); 
            	     
            	        newLeafNode(this_SINGLE_NL_7, grammarAccess.getTagsAccess().getSINGLE_NLTerminalRuleCall_5()); 
            	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:582:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:583:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:584:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1268);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1278); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:591:1: ruleComment returns [EObject current=null] : ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:594:28: ( ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:595:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:595:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:595:2: ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:595:2: ( (lv_name_0_0= ruleTextPart ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:596:1: (lv_name_0_0= ruleTextPart )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:596:1: (lv_name_0_0= ruleTextPart )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:597:3: lv_name_0_0= ruleTextPart
            {
             
            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1324);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:613:2: ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_DYNAMIC_PARAM)||LA25_0==12||LA25_0==14||(LA25_0>=17 && LA25_0<=19)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:614:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:614:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:615:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:615:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    int alt24=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	    case RULE_WS:
            	    case RULE_SEPARATORS:
            	    case RULE_STATIC_PARAM:
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 17:
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:616:3: lv_name_1_1= ruleTextPart
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1347);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:631:8: lv_name_1_2= '-'
            	            {
            	            lv_name_1_2=(Token)match(input,14,FOLLOW_14_in_ruleComment1363); 

            	                    newLeafNode(lv_name_1_2, grammarAccess.getCommentAccess().getNameHyphenMinusKeyword_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:643:8: lv_name_1_3= '='
            	            {
            	            lv_name_1_3=(Token)match(input,12,FOLLOW_12_in_ruleComment1392); 

            	                    newLeafNode(lv_name_1_3, grammarAccess.getCommentAccess().getNameEqualsSignKeyword_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:655:8: lv_name_1_4= '|'
            	            {
            	            lv_name_1_4=(Token)match(input,19,FOLLOW_19_in_ruleComment1421); 

            	                    newLeafNode(lv_name_1_4, grammarAccess.getCommentAccess().getNameVerticalLineKeyword_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:667:8: lv_name_1_5= ','
            	            {
            	            lv_name_1_5=(Token)match(input,18,FOLLOW_18_in_ruleComment1450); 

            	                    newLeafNode(lv_name_1_5, grammarAccess.getCommentAccess().getNameCommaKeyword_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:679:8: lv_name_1_6= ':'
            	            {
            	            lv_name_1_6=(Token)match(input,17,FOLLOW_17_in_ruleComment1479); 

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
            	    break loop25;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:694:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:694:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1508); 
            	     
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


    // $ANTLR start "entryRuleTextPart"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:706:1: entryRuleTextPart returns [String current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final String entryRuleTextPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextPart = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:707:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:708:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1546);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1557); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:715:1: ruleTextPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleTextPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_SEPARATORS_1=null;
        Token this_STATIC_PARAM_2=null;
        Token this_DYNAMIC_PARAM_3=null;
        Token this_WS_4=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:718:28: ( (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:719:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:719:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt27=1;
                }
                break;
            case RULE_SEPARATORS:
                {
                alt27=2;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt27=3;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt27=4;
                }
                break;
            case RULE_WS:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:719:6: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTextPart1597); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getTextPartAccess().getWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:727:10: this_SEPARATORS_1= RULE_SEPARATORS
                    {
                    this_SEPARATORS_1=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTextPart1623); 

                    		current.merge(this_SEPARATORS_1);
                        
                     
                        newLeafNode(this_SEPARATORS_1, grammarAccess.getTextPartAccess().getSEPARATORSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:735:10: this_STATIC_PARAM_2= RULE_STATIC_PARAM
                    {
                    this_STATIC_PARAM_2=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1649); 

                    		current.merge(this_STATIC_PARAM_2);
                        
                     
                        newLeafNode(this_STATIC_PARAM_2, grammarAccess.getTextPartAccess().getSTATIC_PARAMTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:743:10: this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM
                    {
                    this_DYNAMIC_PARAM_3=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1675); 

                    		current.merge(this_DYNAMIC_PARAM_3);
                        
                     
                        newLeafNode(this_DYNAMIC_PARAM_3, grammarAccess.getTextPartAccess().getDYNAMIC_PARAMTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:751:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTextPart1701); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:766:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:767:2: (iv_ruleTable= ruleTable EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:768:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable1746);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable1756); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:775:1: ruleTable returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:778:28: ( ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:779:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:779:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:779:2: (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:779:2: (this_WS_0= RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:779:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1793); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getTableAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:783:3: ( (lv_heading_1_0= ruleTableRow ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:784:1: (lv_heading_1_0= ruleTableRow )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:784:1: (lv_heading_1_0= ruleTableRow )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:785:3: lv_heading_1_0= ruleTableRow
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getHeadingTableRowParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTableRow_in_ruleTable1815);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:801:2: (this_WS_2= RULE_WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:801:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1827); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTableAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:805:3: (otherlv_3= '|' (otherlv_4= '-' )+ )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:805:5: otherlv_3= '|' (otherlv_4= '-' )+
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTable1841); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0());
            	        
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:809:1: (otherlv_4= '-' )+
            	    int cnt30=0;
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==14) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:809:3: otherlv_4= '-'
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTable1854); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt30 >= 1 ) break loop30;
            	                EarlyExitException eee =
            	                    new EarlyExitException(30, input);
            	                throw eee;
            	        }
            	        cnt30++;
            	    } while (true);


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

            this_TABLE_ROW_END_5=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1869); 
             
                newLeafNode(this_TABLE_ROW_END_5, grammarAccess.getTableAccess().getTABLE_ROW_ENDTerminalRuleCall_4()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:817:1: ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WS||LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:817:2: (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:817:2: (this_WS_6= RULE_WS )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==RULE_WS) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:817:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1881); 
            	    	     
            	    	        newLeafNode(this_WS_6, grammarAccess.getTableAccess().getWSTerminalRuleCall_5_0()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:821:3: ( (lv_rows_7_0= ruleTableRow ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:1: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:1: (lv_rows_7_0= ruleTableRow )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:823:3: lv_rows_7_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable1903);
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:847:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:848:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:849:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow1941);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow1951); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:856:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token this_TABLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:859:28: ( ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:2: ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:2: ( (lv_cells_0_0= ruleTableCell ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==19) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:861:1: (lv_cells_0_0= ruleTableCell )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:861:1: (lv_cells_0_0= ruleTableCell )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:862:3: lv_cells_0_0= ruleTableCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableCell_in_ruleTableRow1997);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            this_TABLE_ROW_END_1=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2009); 
             
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:890:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:891:2: (iv_ruleTableCell= ruleTableCell EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:892:2: iv_ruleTableCell= ruleTableCell EOF
            {
             newCompositeNode(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_ruleTableCell_in_entryRuleTableCell2044);
            iv_ruleTableCell=ruleTableCell();

            state._fsp--;

             current =iv_ruleTableCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableCell2054); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:899:1: ruleTableCell returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) ;
    public final EObject ruleTableCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:902:28: ( (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:3: otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTableCell2091); 

                	newLeafNode(otherlv_0, grammarAccess.getTableCellAccess().getVerticalLineKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:907:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_WORD && LA36_0<=RULE_SEPARATORS)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:908:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:908:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:909:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:909:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    int alt35=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:910:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTableCell2110); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:925:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTableCell2130); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:940:8: lv_name_1_3= RULE_WS
            	            {
            	            lv_name_1_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTableCell2150); 

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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\12\uffff\1\20\6\uffff";
    static final String DFA1_minS =
        "\1\5\1\uffff\5\4\3\uffff\6\4\1\uffff";
    static final String DFA1_maxS =
        "\1\20\1\uffff\5\23\3\uffff\1\20\5\23\1\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3\1\5\6\uffff\1\4";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "82:1: (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment | lv_definitions_0_5= ruleTags )";
        }
    }
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\1\uffff\1\2\2\uffff\1\2\6\uffff";
    static final String DFA19_minS =
        "\2\4\1\uffff\2\4\1\uffff\5\4";
    static final String DFA19_maxS =
        "\1\4\1\23\1\uffff\2\23\1\uffff\5\23";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\5\uffff";
    static final String DFA19_specialS =
        "\13\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\4\1\2\1\3\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\1\5",
            "",
            "\2\2\1\6\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\7",
            "\1\4\1\2\1\3\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\1\5",
            "",
            "\2\2\1\6\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\7",
            "\1\2\1\10\1\12\1\11\2\2\2\uffff\1\2\1\uffff\1\2\2\uffff\3\2",
            "\1\2\1\10\1\12\1\11\2\2\1\5\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\7",
            "\1\2\1\10\1\12\1\11\2\2\1\5\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\7",
            "\1\2\1\10\1\12\1\11\2\2\1\5\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\7"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "409:5: (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleModel132 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleModel151 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleStep_in_ruleModel170 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleComment_in_ruleModel189 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleTags_in_ruleModel208 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpec295 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec316 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec329 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec359 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpec383 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec397 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScenario483 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario504 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario517 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario547 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario559 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario571 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario585 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStep679 = new BitSet(new long[]{0x0000000000005360L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStep702 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStep729 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStep746 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_14_in_ruleStep763 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_12_in_ruleStep781 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleStep798 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStep810 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep825 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep836 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep872 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTags_in_entryRuleTags1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTags1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTags1147 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1159 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleTags1172 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTags1184 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1200 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_18_in_ruleTags1217 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleTags1231 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1324 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1347 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_14_in_ruleComment1363 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_12_in_ruleComment1392 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_19_in_ruleComment1421 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_18_in_ruleComment1450 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_17_in_ruleComment1479 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1508 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTextPart1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTextPart1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTextPart1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1793 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1815 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1827 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleTable1841 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTable1854 = new BitSet(new long[]{0x0000000000084400L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1869 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1881 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1903 = new BitSet(new long[]{0x0000000000080052L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_ruleTableRow1997 = new BitSet(new long[]{0x0000000000080450L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_entryRuleTableCell2044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableCell2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTableCell2091 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTableCell2110 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTableCell2130 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTableCell2150 = new BitSet(new long[]{0x00000000000000E2L});

}