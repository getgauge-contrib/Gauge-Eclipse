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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_1 = null;

        EObject lv_definitions_0_2 = null;

        EObject lv_definitions_0_3 = null;

        EObject lv_definitions_0_4 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:79:28: ( ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment ) ) )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment ) ) )*
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_DYNAMIC_PARAM)||LA2_0==11||LA2_0==13||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:1: ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:81:1: ( (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:82:1: (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:82:1: (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment )
            	    int alt1=4;
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:154:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:155:2: (iv_ruleSpec= ruleSpec EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:156:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec228);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec238); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:163:1: ruleSpec returns [EObject current=null] : ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:166:28: ( ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:167:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:167:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:167:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:167:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:167:4: otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpec276); 

                        	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:171:1: ( (lv_name_1_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:172:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:172:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:173:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec297);
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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:189:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:189:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec310); 
                    	     
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:194:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:194:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:194:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:194:7: ( (lv_name_3_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:195:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:195:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:196:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec340);
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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec352); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:216:1: (otherlv_5= '=' )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:216:3: otherlv_5= '='
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSpec364); 

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:220:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:220:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec378); 
                    	     
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:232:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:233:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:234:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario416);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario426); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:241:1: ruleScenario returns [EObject current=null] : ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )? ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SINGLE_NL_2=null;
        Token this_SINGLE_NL_4=null;
        Token otherlv_5=null;
        Token this_SINGLE_NL_6=null;
        Token this_SINGLE_NL_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_comments_7_0 = null;

        AntlrDatatypeRuleToken lv_tags_8_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:244:28: ( ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )? ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )? ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_DYNAMIC_PARAM)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:4: otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScenario464); 

                        	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:249:1: ( (lv_name_1_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:250:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:250:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:251:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario485);
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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:267:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:267:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario498); 
                    	     
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:6: ( ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )? )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:6: ( ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )? )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:7: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ( (lv_comments_7_0= ruleComment ) )+ ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )?
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:7: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:8: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:8: ( (lv_name_3_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:273:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:273:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:274:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_1_0_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario529);
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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario541); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_0_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:294:1: (otherlv_5= '-' )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:294:3: otherlv_5= '-'
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario553); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_0_2());
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:298:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario567); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_6, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_0_3()); 
                    	        

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:302:4: ( (lv_comments_7_0= ruleComment ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:303:1: (lv_comments_7_0= ruleComment )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:303:1: (lv_comments_7_0= ruleComment )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:304:3: lv_comments_7_0= ruleComment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getCommentsCommentParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComment_in_ruleScenario590);
                    	    lv_comments_7_0=ruleComment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"comments",
                    	            		lv_comments_7_0, 
                    	            		"Comment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:320:3: ( ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+ )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==16) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:320:4: ( (lv_tags_8_0= ruleTags ) ) (this_SINGLE_NL_9= RULE_SINGLE_NL )+
                            {
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:320:4: ( (lv_tags_8_0= ruleTags ) )
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:321:1: (lv_tags_8_0= ruleTags )
                            {
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:321:1: (lv_tags_8_0= ruleTags )
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:322:3: lv_tags_8_0= ruleTags
                            {
                             
                            	        newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagsParserRuleCall_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTags_in_ruleScenario613);
                            lv_tags_8_0=ruleTags();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"tags",
                                    		lv_tags_8_0, 
                                    		"Tags");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:2: (this_SINGLE_NL_9= RULE_SINGLE_NL )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_SINGLE_NL) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:338:3: this_SINGLE_NL_9= RULE_SINGLE_NL
                            	    {
                            	    this_SINGLE_NL_9=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario625); 
                            	     
                            	        newLeafNode(this_SINGLE_NL_9, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
                            	        

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


                            }
                            break;

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:350:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:351:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:352:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep665);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep675); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:359:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:362:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:363:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:363:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:363:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:363:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:364:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStep721); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:373:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_WS)||(LA20_0>=RULE_STATIC_PARAM && LA20_0<=RULE_DYNAMIC_PARAM)||LA20_0==12||LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:373:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:373:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS )
            	    int alt18=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt18=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:373:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:373:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:374:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:374:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:375:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStep744);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:392:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:392:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:393:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:393:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:394:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStep771);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:411:6: this_WORD_4= RULE_WORD
            	            {
            	            this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStep788); 
            	             
            	                newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:416:7: otherlv_5= '-'
            	            {
            	            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStep805); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3());
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:421:7: otherlv_6= '='
            	            {
            	            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStep823); 

            	                	newLeafNode(otherlv_6, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4());
            	                

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:426:6: this_WS_7= RULE_WS
            	            {
            	            this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleStep840); 
            	             
            	                newLeafNode(this_WS_7, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:430:2: (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_SEPARATORS) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:430:3: this_SEPARATORS_8= RULE_SEPARATORS
            	    	    {
            	    	    this_SEPARATORS_8=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStep852); 
            	    	     
            	    	        newLeafNode(this_SEPARATORS_8, grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:434:5: (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:434:6: this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) )
                    {
                    this_SINGLE_NL_9=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep867); 
                     
                        newLeafNode(this_SINGLE_NL_9, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_0()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:438:1: (this_SINGLE_NL_10= RULE_SINGLE_NL )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_SINGLE_NL) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:438:2: this_SINGLE_NL_10= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_10=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep878); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_10, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:442:3: ( (lv_table_11_0= ruleTable ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:443:1: (lv_table_11_0= ruleTable )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:443:1: (lv_table_11_0= ruleTable )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:444:3: lv_table_11_0= ruleTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTable_in_ruleStep900);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:4: (this_SINGLE_NL_12= RULE_SINGLE_NL )+
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:5: this_SINGLE_NL_12= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_12=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep914); 
            	     
            	        newLeafNode(this_SINGLE_NL_12, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_4()); 
            	        

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleStaticParam"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:473:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:474:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam951);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam961); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:481:1: ruleStaticParam returns [EObject current=null] : ( (lv_name_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:484:28: ( ( (lv_name_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:485:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:485:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:486:1: (lv_name_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:486:1: (lv_name_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:487:3: lv_name_0_0= RULE_STATIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam1002); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:511:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:512:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:513:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1042);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam1052); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:520:1: ruleDynamicParam returns [EObject current=null] : ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:523:28: ( ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:524:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:524:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:525:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:525:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:526:3: lv_name_0_0= RULE_DYNAMIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1093); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:550:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:551:2: (iv_ruleTags= ruleTags EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:552:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_ruleTags_in_entryRuleTags1134);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTags1145); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:559:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'tags' (this_WS_1= RULE_WS )* kw= ':' (this_WS_3= RULE_WS )* (this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )? )+ this_SINGLE_NL_7= RULE_SINGLE_NL ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_1=null;
        Token this_WS_3=null;
        Token this_WORD_4=null;
        Token this_WS_5=null;
        Token this_SINGLE_NL_7=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:562:28: ( (kw= 'tags' (this_WS_1= RULE_WS )* kw= ':' (this_WS_3= RULE_WS )* (this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )? )+ this_SINGLE_NL_7= RULE_SINGLE_NL ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:563:1: (kw= 'tags' (this_WS_1= RULE_WS )* kw= ':' (this_WS_3= RULE_WS )* (this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )? )+ this_SINGLE_NL_7= RULE_SINGLE_NL )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:563:1: (kw= 'tags' (this_WS_1= RULE_WS )* kw= ':' (this_WS_3= RULE_WS )* (this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )? )+ this_SINGLE_NL_7= RULE_SINGLE_NL )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:564:2: kw= 'tags' (this_WS_1= RULE_WS )* kw= ':' (this_WS_3= RULE_WS )* (this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )? )+ this_SINGLE_NL_7= RULE_SINGLE_NL
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleTags1183); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTagsAccess().getTagsKeyword_0()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:569:1: (this_WS_1= RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:569:6: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1199); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        newLeafNode(this_WS_1, grammarAccess.getTagsAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            kw=(Token)match(input,17,FOLLOW_17_in_ruleTags1219); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTagsAccess().getColonKeyword_2()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:582:1: (this_WS_3= RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:582:6: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1235); 

            	    		current.merge(this_WS_3);
            	        
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getTagsAccess().getWSTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:589:3: (this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )? )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WORD) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:589:8: this_WORD_4= RULE_WORD (this_WS_5= RULE_WS | kw= ',' )?
            	    {
            	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTags1258); 

            	    		current.merge(this_WORD_4);
            	        
            	     
            	        newLeafNode(this_WORD_4, grammarAccess.getTagsAccess().getWORDTerminalRuleCall_4_0()); 
            	        
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:596:1: (this_WS_5= RULE_WS | kw= ',' )?
            	    int alt26=3;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_WS) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==18) ) {
            	        alt26=2;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:596:6: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1279); 

            	            		current.merge(this_WS_5);
            	                
            	             
            	                newLeafNode(this_WS_5, grammarAccess.getTagsAccess().getWSTerminalRuleCall_4_1_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:605:2: kw= ','
            	            {
            	            kw=(Token)match(input,18,FOLLOW_18_in_ruleTags1303); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTagsAccess().getCommaKeyword_4_1_1()); 
            	                

            	            }
            	            break;

            	    }


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

            this_SINGLE_NL_7=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleTags1322); 

            		current.merge(this_SINGLE_NL_7);
                
             
                newLeafNode(this_SINGLE_NL_7, grammarAccess.getTagsAccess().getSINGLE_NLTerminalRuleCall_5()); 
                

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:625:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:626:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:627:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1367);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1377); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:634:1: ruleComment returns [EObject current=null] : ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:637:28: ( ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:638:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:638:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:638:2: ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:638:2: ( (lv_name_0_0= ruleTextPart ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:639:1: (lv_name_0_0= ruleTextPart )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:639:1: (lv_name_0_0= ruleTextPart )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:640:3: lv_name_0_0= ruleTextPart
            {
             
            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1423);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:656:2: ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_DYNAMIC_PARAM)||LA29_0==12||LA29_0==14||(LA29_0>=17 && LA29_0<=19)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:657:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:657:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:658:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:658:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    int alt28=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	    case RULE_WS:
            	    case RULE_SEPARATORS:
            	    case RULE_STATIC_PARAM:
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt28=5;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt28=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:659:3: lv_name_1_1= ruleTextPart
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1446);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:674:8: lv_name_1_2= '-'
            	            {
            	            lv_name_1_2=(Token)match(input,14,FOLLOW_14_in_ruleComment1462); 

            	                    newLeafNode(lv_name_1_2, grammarAccess.getCommentAccess().getNameHyphenMinusKeyword_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:686:8: lv_name_1_3= '='
            	            {
            	            lv_name_1_3=(Token)match(input,12,FOLLOW_12_in_ruleComment1491); 

            	                    newLeafNode(lv_name_1_3, grammarAccess.getCommentAccess().getNameEqualsSignKeyword_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:698:8: lv_name_1_4= '|'
            	            {
            	            lv_name_1_4=(Token)match(input,19,FOLLOW_19_in_ruleComment1520); 

            	                    newLeafNode(lv_name_1_4, grammarAccess.getCommentAccess().getNameVerticalLineKeyword_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:710:8: lv_name_1_5= ','
            	            {
            	            lv_name_1_5=(Token)match(input,18,FOLLOW_18_in_ruleComment1549); 

            	                    newLeafNode(lv_name_1_5, grammarAccess.getCommentAccess().getNameCommaKeyword_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:722:8: lv_name_1_6= ':'
            	            {
            	            lv_name_1_6=(Token)match(input,17,FOLLOW_17_in_ruleComment1578); 

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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:737:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SINGLE_NL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:737:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1607); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:749:1: entryRuleTextPart returns [String current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final String entryRuleTextPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextPart = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:750:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:751:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1645);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1656); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:758:1: ruleTextPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleTextPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_SEPARATORS_1=null;
        Token this_STATIC_PARAM_2=null;
        Token this_DYNAMIC_PARAM_3=null;
        Token this_WS_4=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:761:28: ( (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:762:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:762:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            int alt31=5;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt31=1;
                }
                break;
            case RULE_SEPARATORS:
                {
                alt31=2;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt31=3;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt31=4;
                }
                break;
            case RULE_WS:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:762:6: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTextPart1696); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getTextPartAccess().getWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:770:10: this_SEPARATORS_1= RULE_SEPARATORS
                    {
                    this_SEPARATORS_1=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTextPart1722); 

                    		current.merge(this_SEPARATORS_1);
                        
                     
                        newLeafNode(this_SEPARATORS_1, grammarAccess.getTextPartAccess().getSEPARATORSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:778:10: this_STATIC_PARAM_2= RULE_STATIC_PARAM
                    {
                    this_STATIC_PARAM_2=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1748); 

                    		current.merge(this_STATIC_PARAM_2);
                        
                     
                        newLeafNode(this_STATIC_PARAM_2, grammarAccess.getTextPartAccess().getSTATIC_PARAMTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:786:10: this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM
                    {
                    this_DYNAMIC_PARAM_3=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1774); 

                    		current.merge(this_DYNAMIC_PARAM_3);
                        
                     
                        newLeafNode(this_DYNAMIC_PARAM_3, grammarAccess.getTextPartAccess().getDYNAMIC_PARAMTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:794:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTextPart1800); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:809:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:810:2: (iv_ruleTable= ruleTable EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:811:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable1845);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable1855); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:818:1: ruleTable returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:821:28: ( ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:2: (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:2: (this_WS_0= RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:822:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1892); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getTableAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:826:3: ( (lv_heading_1_0= ruleTableRow ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:827:1: (lv_heading_1_0= ruleTableRow )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:827:1: (lv_heading_1_0= ruleTableRow )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:828:3: lv_heading_1_0= ruleTableRow
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getHeadingTableRowParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTableRow_in_ruleTable1914);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:844:2: (this_WS_2= RULE_WS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:844:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1926); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTableAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:848:3: (otherlv_3= '|' (otherlv_4= '-' )+ )+
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:848:5: otherlv_3= '|' (otherlv_4= '-' )+
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTable1940); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0());
            	        
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:852:1: (otherlv_4= '-' )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==14) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:852:3: otherlv_4= '-'
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTable1953); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1());
            	    	        

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
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            this_TABLE_ROW_END_5=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1968); 
             
                newLeafNode(this_TABLE_ROW_END_5, grammarAccess.getTableAccess().getTABLE_ROW_ENDTerminalRuleCall_4()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:1: (this_WS_6= RULE_WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_WS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:2: this_WS_6= RULE_WS
            	    {
            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1979); 
            	     
            	        newLeafNode(this_WS_6, grammarAccess.getTableAccess().getWSTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:864:3: ( (lv_rows_7_0= ruleTableRow ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:865:1: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:865:1: (lv_rows_7_0= ruleTableRow )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:866:3: lv_rows_7_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable2001);
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:890:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:891:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:892:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow2038);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow2048); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:899:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token this_TABLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:902:28: ( ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:2: ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:903:2: ( (lv_cells_0_0= ruleTableCell ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==19) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:904:1: (lv_cells_0_0= ruleTableCell )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:904:1: (lv_cells_0_0= ruleTableCell )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:905:3: lv_cells_0_0= ruleTableCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableCell_in_ruleTableRow2094);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            this_TABLE_ROW_END_1=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2106); 
             
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:933:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:934:2: (iv_ruleTableCell= ruleTableCell EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:935:2: iv_ruleTableCell= ruleTableCell EOF
            {
             newCompositeNode(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_ruleTableCell_in_entryRuleTableCell2141);
            iv_ruleTableCell=ruleTableCell();

            state._fsp--;

             current =iv_ruleTableCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableCell2151); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:942:1: ruleTableCell returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) ;
    public final EObject ruleTableCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:945:28: ( (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:946:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:946:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:946:3: otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTableCell2188); 

                	newLeafNode(otherlv_0, grammarAccess.getTableCellAccess().getVerticalLineKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:950:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_WORD && LA40_0<=RULE_SEPARATORS)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:951:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:951:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:952:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:952:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:953:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTableCell2207); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:968:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTableCell2227); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:983:8: lv_name_1_3= RULE_WS
            	            {
            	            lv_name_1_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTableCell2247); 

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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\20\uffff\1\16";
    static final String DFA1_minS =
        "\1\5\1\uffff\5\4\2\uffff\5\4\1\uffff\1\14\1\4";
    static final String DFA1_maxS =
        "\1\17\1\uffff\5\23\2\uffff\5\23\1\uffff\1\16\1\17";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3\5\uffff\1\4\2\uffff";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\6\1\3\1\4\1\5\1\uffff\1\1\1\uffff\1\7\1\uffff\1\10",
            "",
            "\1\17\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\17\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\17\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\17\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\17\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "",
            "",
            "\1\20\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\20\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\20\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\20\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "\1\20\1\11\1\15\1\12\1\13\1\14\2\uffff\1\16\1\uffff\1\16\2\uffff\3\16",
            "",
            "\1\1\1\uffff\1\7",
            "\6\16\1\uffff\1\16\1\1\1\16\1\7\1\16"
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
            return "82:1: (lv_definitions_0_1= ruleSpec | lv_definitions_0_2= ruleScenario | lv_definitions_0_3= ruleStep | lv_definitions_0_4= ruleComment )";
        }
    }
    static final String DFA14_eotS =
        "\30\uffff";
    static final String DFA14_eofS =
        "\1\1\27\uffff";
    static final String DFA14_minS =
        "\1\5\1\uffff\17\4\2\uffff\5\4";
    static final String DFA14_maxS =
        "\1\20\1\uffff\17\23\2\uffff\5\23";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\17\uffff\2\1\5\uffff";
    static final String DFA14_specialS =
        "\30\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\6\1\3\1\4\1\5\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1",
            "",
            "\1\1\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\1\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\1\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\1\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\1\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\21\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\21\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\21\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\21\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\21\1\7\1\13\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "",
            "",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16",
            "\1\22\1\23\1\27\1\24\1\25\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\20\1\17\1\16"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 302:4: ( (lv_comments_7_0= ruleComment ) )+";
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\1\uffff\2\5\10\uffff";
    static final String DFA22_minS =
        "\4\4\2\uffff\5\4";
    static final String DFA22_maxS =
        "\1\4\3\23\2\uffff\5\23";
    static final String DFA22_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA22_specialS =
        "\13\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1",
            "\1\2\1\5\1\3\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\1\4",
            "\1\2\1\5\1\3\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\1\4",
            "\2\5\1\6\3\5\2\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\7",
            "",
            "",
            "\2\5\1\6\3\5\2\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\7",
            "\1\5\1\10\1\12\1\11\2\5\2\uffff\1\5\1\uffff\1\5\2\uffff\3\5",
            "\1\5\1\10\1\12\1\11\2\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\7",
            "\1\5\1\10\1\12\1\11\2\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\7",
            "\1\5\1\10\1\12\1\11\2\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\7"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "434:5: (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleModel132 = new BitSet(new long[]{0x000000000000ABE2L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleModel151 = new BitSet(new long[]{0x000000000000ABE2L});
    public static final BitSet FOLLOW_ruleStep_in_ruleModel170 = new BitSet(new long[]{0x000000000000ABE2L});
    public static final BitSet FOLLOW_ruleComment_in_ruleModel189 = new BitSet(new long[]{0x000000000000ABE2L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpec276 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec297 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec310 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec340 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec352 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpec364 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec378 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScenario464 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario485 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario498 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario529 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario553 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario567 = new BitSet(new long[]{0x000000000001ABF0L});
    public static final BitSet FOLLOW_ruleComment_in_ruleScenario590 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleTags_in_ruleScenario613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario625 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStep721 = new BitSet(new long[]{0x0000000000005360L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStep744 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStep771 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStep788 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_14_in_ruleStep805 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_12_in_ruleStep823 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleStep840 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStep852 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep867 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep878 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep914 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTags_in_entryRuleTags1134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTags1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTags1183 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1199 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleTags1219 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1235 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTags1258 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1279 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18_in_ruleTags1303 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleTags1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1423 = new BitSet(new long[]{0x00000000000E5BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1446 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_14_in_ruleComment1462 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_12_in_ruleComment1491 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_19_in_ruleComment1520 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_18_in_ruleComment1549 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_17_in_ruleComment1578 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1607 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTextPart1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTextPart1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTextPart1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1892 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1914 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1926 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleTable1940 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTable1953 = new BitSet(new long[]{0x0000000000084400L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1968 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1979 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable2001 = new BitSet(new long[]{0x0000000000080052L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_ruleTableRow2094 = new BitSet(new long[]{0x0000000000080450L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_entryRuleTableCell2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableCell2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTableCell2188 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTableCell2207 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTableCell2227 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTableCell2247 = new BitSet(new long[]{0x00000000000000E2L});

}