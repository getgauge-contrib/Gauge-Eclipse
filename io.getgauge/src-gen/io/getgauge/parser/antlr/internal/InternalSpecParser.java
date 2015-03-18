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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_NL", "RULE_WORD", "RULE_WS", "RULE_SEPARATORS", "RULE_STATIC_PARAM", "RULE_DYNAMIC_PARAM", "RULE_TABLE_ROW_END", "'# '", "'='", "'## '", "'-'", "'* '", "'|'"
    };
    public static final int RULE_TABLE_ROW_END=10;
    public static final int RULE_SINGLE_NL=4;
    public static final int RULE_WS=6;
    public static final int RULE_STATIC_PARAM=8;
    public static final int RULE_WORD=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=7;
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:241:1: ruleScenario returns [EObject current=null] : ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:244:28: ( ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:245:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:272:7: ( (lv_name_3_0= ruleTextPart ) )+
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
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario528);
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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario540); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
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
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario552); 

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
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario566); 
                    	     
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:310:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:311:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:312:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep604);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep614); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:319:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:322:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:323:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:323:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:323:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+ (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )? (this_SINGLE_NL_12= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:323:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:324:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStep660); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )* )+
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS ) (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | this_WORD_4= RULE_WORD | otherlv_5= '-' | otherlv_6= '=' | this_WS_7= RULE_WS )
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:333:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:334:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:334:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:335:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStep683);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:352:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:352:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:353:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:353:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:354:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStep710);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:371:6: this_WORD_4= RULE_WORD
            	            {
            	            this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStep727); 
            	             
            	                newLeafNode(this_WORD_4, grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:376:7: otherlv_5= '-'
            	            {
            	            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStep744); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3());
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:381:7: otherlv_6= '='
            	            {
            	            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStep762); 

            	                	newLeafNode(otherlv_6, grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4());
            	                

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:386:6: this_WS_7= RULE_WS
            	            {
            	            this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleStep779); 
            	             
            	                newLeafNode(this_WS_7, grammarAccess.getStepAccess().getWSTerminalRuleCall_2_0_5()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:390:2: (this_SEPARATORS_8= RULE_SEPARATORS )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_SEPARATORS) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:390:3: this_SEPARATORS_8= RULE_SEPARATORS
            	    	    {
            	    	    this_SEPARATORS_8=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStep791); 
            	    	     
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:394:5: (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:394:6: this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) )
                    {
                    this_SINGLE_NL_9=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep806); 
                     
                        newLeafNode(this_SINGLE_NL_9, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_0()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:398:1: (this_SINGLE_NL_10= RULE_SINGLE_NL )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_SINGLE_NL) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:398:2: this_SINGLE_NL_10= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_10=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep817); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_10, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:402:3: ( (lv_table_11_0= ruleTable ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:403:1: (lv_table_11_0= ruleTable )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:403:1: (lv_table_11_0= ruleTable )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:404:3: lv_table_11_0= ruleTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTable_in_ruleStep839);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:420:4: (this_SINGLE_NL_12= RULE_SINGLE_NL )+
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:420:5: this_SINGLE_NL_12= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_12=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep853); 
            	     
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:432:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:433:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:434:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam890);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam900); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:441:1: ruleStaticParam returns [EObject current=null] : ( (lv_name_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:444:28: ( ( (lv_name_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:445:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:445:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:446:1: (lv_name_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:446:1: (lv_name_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:447:3: lv_name_0_0= RULE_STATIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam941); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:471:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:473:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam981);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam991); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:480:1: ruleDynamicParam returns [EObject current=null] : ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:483:28: ( ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:484:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:484:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:485:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:485:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:486:3: lv_name_0_0= RULE_DYNAMIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1032); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:510:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:511:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:512:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1072);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1082); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:519:1: ruleComment returns [EObject current=null] : ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token this_SINGLE_NL_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_1 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:522:28: ( ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:523:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:523:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:523:2: ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:523:2: ( (lv_name_0_0= ruleTextPart ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:524:1: (lv_name_0_0= ruleTextPart )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:524:1: (lv_name_0_0= ruleTextPart )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:525:3: lv_name_0_0= ruleTextPart
            {
             
            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1128);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:541:2: ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_WORD && LA22_0<=RULE_DYNAMIC_PARAM)||LA22_0==12||LA22_0==14||LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:542:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:542:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:543:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:543:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	    case RULE_WS:
            	    case RULE_SEPARATORS:
            	    case RULE_STATIC_PARAM:
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:544:3: lv_name_1_1= ruleTextPart
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1151);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:559:8: lv_name_1_2= '-'
            	            {
            	            lv_name_1_2=(Token)match(input,14,FOLLOW_14_in_ruleComment1167); 

            	                    newLeafNode(lv_name_1_2, grammarAccess.getCommentAccess().getNameHyphenMinusKeyword_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:571:8: lv_name_1_3= '='
            	            {
            	            lv_name_1_3=(Token)match(input,12,FOLLOW_12_in_ruleComment1196); 

            	                    newLeafNode(lv_name_1_3, grammarAccess.getCommentAccess().getNameEqualsSignKeyword_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:583:8: lv_name_1_4= '|'
            	            {
            	            lv_name_1_4=(Token)match(input,16,FOLLOW_16_in_ruleComment1225); 

            	                    newLeafNode(lv_name_1_4, grammarAccess.getCommentAccess().getNameVerticalLineKeyword_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:598:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:598:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1254); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleTextPart"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:610:1: entryRuleTextPart returns [String current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final String entryRuleTextPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextPart = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:611:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:612:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1292);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1303); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:619:1: ruleTextPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleTextPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_SEPARATORS_1=null;
        Token this_STATIC_PARAM_2=null;
        Token this_DYNAMIC_PARAM_3=null;
        Token this_WS_4=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:622:28: ( (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:623:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:623:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            int alt24=5;
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
            case RULE_WS:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:623:6: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTextPart1343); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getTextPartAccess().getWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:631:10: this_SEPARATORS_1= RULE_SEPARATORS
                    {
                    this_SEPARATORS_1=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTextPart1369); 

                    		current.merge(this_SEPARATORS_1);
                        
                     
                        newLeafNode(this_SEPARATORS_1, grammarAccess.getTextPartAccess().getSEPARATORSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:639:10: this_STATIC_PARAM_2= RULE_STATIC_PARAM
                    {
                    this_STATIC_PARAM_2=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1395); 

                    		current.merge(this_STATIC_PARAM_2);
                        
                     
                        newLeafNode(this_STATIC_PARAM_2, grammarAccess.getTextPartAccess().getSTATIC_PARAMTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:647:10: this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM
                    {
                    this_DYNAMIC_PARAM_3=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1421); 

                    		current.merge(this_DYNAMIC_PARAM_3);
                        
                     
                        newLeafNode(this_DYNAMIC_PARAM_3, grammarAccess.getTextPartAccess().getDYNAMIC_PARAMTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:655:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTextPart1447); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:670:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:671:2: (iv_ruleTable= ruleTable EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:672:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable1492);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable1502); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:679:1: ruleTable returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:682:28: ( ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:683:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:683:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:683:2: (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:683:2: (this_WS_0= RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:683:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1539); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getTableAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:687:3: ( (lv_heading_1_0= ruleTableRow ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:688:1: (lv_heading_1_0= ruleTableRow )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:688:1: (lv_heading_1_0= ruleTableRow )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:689:3: lv_heading_1_0= ruleTableRow
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getHeadingTableRowParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTableRow_in_ruleTable1561);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:705:2: (this_WS_2= RULE_WS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_WS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:705:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1573); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTableAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:709:3: (otherlv_3= '|' (otherlv_4= '-' )+ )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:709:5: otherlv_3= '|' (otherlv_4= '-' )+
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTable1587); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0());
            	        
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:713:1: (otherlv_4= '-' )+
            	    int cnt27=0;
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==14) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:713:3: otherlv_4= '-'
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTable1600); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1());
            	    	        

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
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            this_TABLE_ROW_END_5=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1615); 
             
                newLeafNode(this_TABLE_ROW_END_5, grammarAccess.getTableAccess().getTABLE_ROW_ENDTerminalRuleCall_4()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:721:1: (this_WS_6= RULE_WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:721:2: this_WS_6= RULE_WS
            	    {
            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable1626); 
            	     
            	        newLeafNode(this_WS_6, grammarAccess.getTableAccess().getWSTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:725:3: ( (lv_rows_7_0= ruleTableRow ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:726:1: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:726:1: (lv_rows_7_0= ruleTableRow )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:727:3: lv_rows_7_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable1648);
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:751:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:752:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:753:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow1685);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow1695); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:760:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token this_TABLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:763:28: ( ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:764:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:764:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:764:2: ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:764:2: ( (lv_cells_0_0= ruleTableCell ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:765:1: (lv_cells_0_0= ruleTableCell )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:765:1: (lv_cells_0_0= ruleTableCell )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:766:3: lv_cells_0_0= ruleTableCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableCell_in_ruleTableRow1741);
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            this_TABLE_ROW_END_1=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow1753); 
             
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:794:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:795:2: (iv_ruleTableCell= ruleTableCell EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:796:2: iv_ruleTableCell= ruleTableCell EOF
            {
             newCompositeNode(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_ruleTableCell_in_entryRuleTableCell1788);
            iv_ruleTableCell=ruleTableCell();

            state._fsp--;

             current =iv_ruleTableCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableCell1798); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:803:1: ruleTableCell returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) ;
    public final EObject ruleTableCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:806:28: ( (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:807:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:807:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:807:3: otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTableCell1835); 

                	newLeafNode(otherlv_0, grammarAccess.getTableCellAccess().getVerticalLineKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:811:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_WORD && LA33_0<=RULE_SEPARATORS)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:812:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:812:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:813:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:813:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:814:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTableCell1854); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:829:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTableCell1874); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:844:8: lv_name_1_3= RULE_WS
            	            {
            	            lv_name_1_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTableCell1894); 

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
    // $ANTLR end "ruleTableCell"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\20\uffff\1\17";
    static final String DFA1_minS =
        "\1\5\1\uffff\5\4\2\uffff\1\14\5\4\1\uffff\1\4";
    static final String DFA1_maxS =
        "\1\17\1\uffff\5\20\2\uffff\1\16\5\20\1\uffff\1\17";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3\6\uffff\1\4\1\uffff";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\6\1\3\1\4\1\5\1\uffff\1\1\1\uffff\1\7\1\uffff\1\10",
            "",
            "\1\11\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\11\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\11\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\11\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\11\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "",
            "",
            "\1\1\1\uffff\1\7",
            "\1\20\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\20\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\20\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\20\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "\1\20\1\12\1\16\1\13\1\14\1\15\2\uffff\1\17\1\uffff\1\17\1\uffff\1\17",
            "",
            "\6\17\1\uffff\1\17\1\1\1\17\1\7\1\17"
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
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\1\uffff\2\5\10\uffff";
    static final String DFA19_minS =
        "\4\4\2\uffff\5\4";
    static final String DFA19_maxS =
        "\1\4\3\20\2\uffff\5\20";
    static final String DFA19_acceptS =
        "\4\uffff\1\1\1\2\5\uffff";
    static final String DFA19_specialS =
        "\13\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2\1\5\1\3\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\4",
            "\1\2\1\5\1\3\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\4",
            "\2\5\1\6\3\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\7",
            "",
            "",
            "\2\5\1\6\3\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\7",
            "\1\5\1\10\1\12\1\11\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "\1\5\1\10\1\12\1\11\2\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\7",
            "\1\5\1\10\1\12\1\11\2\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\7",
            "\1\5\1\10\1\12\1\11\2\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\7"
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
            return "394:5: (this_SINGLE_NL_9= RULE_SINGLE_NL (this_SINGLE_NL_10= RULE_SINGLE_NL )* ( (lv_table_11_0= ruleTable ) ) )?";
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
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario528 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario540 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario552 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario566 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStep660 = new BitSet(new long[]{0x0000000000005360L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStep683 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStep710 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStep727 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_14_in_ruleStep744 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_12_in_ruleStep762 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleStep779 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStep791 = new BitSet(new long[]{0x00000000000053F0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep806 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep817 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep853 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1128 = new BitSet(new long[]{0x0000000000015BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1151 = new BitSet(new long[]{0x0000000000015BF0L});
    public static final BitSet FOLLOW_14_in_ruleComment1167 = new BitSet(new long[]{0x0000000000015BF0L});
    public static final BitSet FOLLOW_12_in_ruleComment1196 = new BitSet(new long[]{0x0000000000015BF0L});
    public static final BitSet FOLLOW_16_in_ruleComment1225 = new BitSet(new long[]{0x0000000000015BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1254 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTextPart1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTextPart1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTextPart1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1539 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1561 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1573 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_ruleTable1587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTable1600 = new BitSet(new long[]{0x0000000000014400L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTable1615 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable1626 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable1648 = new BitSet(new long[]{0x0000000000010052L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_ruleTableRow1741 = new BitSet(new long[]{0x0000000000010450L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_entryRuleTableCell1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableCell1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTableCell1835 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTableCell1854 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTableCell1874 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTableCell1894 = new BitSet(new long[]{0x00000000000000E2L});

}