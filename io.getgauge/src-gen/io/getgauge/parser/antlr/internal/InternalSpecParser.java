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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:76:1: ruleModel returns [EObject current=null] : ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( (lv_definitions_2_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_SINGLE_NL_1=null;
        EObject lv_definitions_2_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:79:28: ( ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( (lv_definitions_2_0= ruleElement ) )* ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( (lv_definitions_2_0= ruleElement ) )* )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:1: ( () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( (lv_definitions_2_0= ruleElement ) )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:80:2: () (this_SINGLE_NL_1= RULE_SINGLE_NL )* ( (lv_definitions_2_0= ruleElement ) )*
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:90:3: ( (lv_definitions_2_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_DYNAMIC_PARAM)||LA2_0==11||LA2_0==13||(LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:91:1: (lv_definitions_2_0= ruleElement )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:91:1: (lv_definitions_2_0= ruleElement )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:92:3: lv_definitions_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel153);
            	    lv_definitions_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleElement"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:116:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:117:2: (iv_ruleElement= ruleElement EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:118:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement190);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement200); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:125:1: ruleElement returns [EObject current=null] : (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | this_Tags_4= ruleTags ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Spec_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_Step_2 = null;

        EObject this_Comment_3 = null;

        EObject this_Tags_4 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:128:28: ( (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | this_Tags_4= ruleTags ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:129:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | this_Tags_4= ruleTags )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:129:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | this_Tags_4= ruleTags )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:130:5: this_Spec_0= ruleSpec
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSpec_in_ruleElement247);
                    this_Spec_0=ruleSpec();

                    state._fsp--;

                     
                            current = this_Spec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:140:5: this_Scenario_1= ruleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getScenarioParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScenario_in_ruleElement274);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;

                     
                            current = this_Scenario_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:150:5: this_Step_2= ruleStep
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getStepParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStep_in_ruleElement301);
                    this_Step_2=ruleStep();

                    state._fsp--;

                     
                            current = this_Step_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:160:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleElement328);
                    this_Comment_3=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:170:5: this_Tags_4= ruleTags
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getTagsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTags_in_ruleElement355);
                    this_Tags_4=ruleTags();

                    state._fsp--;

                     
                            current = this_Tags_4; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleSpec"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:186:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:187:2: (iv_ruleSpec= ruleSpec EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:188:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec390);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec400); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:195:1: ruleSpec returns [EObject current=null] : ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:198:28: ( ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:199:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:199:1: ( (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:199:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:199:2: (otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:199:4: otherlv_0= '# ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSpec438); 

                        	newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:203:1: ( (lv_name_1_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:204:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:204:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:205:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec459);
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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:221:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:221:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec472); 
                    	     
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:226:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:226:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:226:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '=' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:226:7: ( (lv_name_3_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:227:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:227:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:228:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleSpec502);
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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec514); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:248:1: (otherlv_5= '=' )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:248:3: otherlv_5= '='
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSpec526); 

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:252:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:252:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleSpec540); 
                    	     
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:264:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:265:2: (iv_ruleScenario= ruleScenario EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:266:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario578);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario588); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:273:1: ruleScenario returns [EObject current=null] : ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:276:28: ( ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:277:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:277:1: ( (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) | ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ ) )
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:277:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:277:2: (otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:277:4: otherlv_0= '## ' ( (lv_name_1_0= ruleTextPart ) )+ (this_SINGLE_NL_2= RULE_SINGLE_NL )+
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScenario626); 

                        	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0());
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:281:1: ( (lv_name_1_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:282:1: (lv_name_1_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:282:1: (lv_name_1_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:283:3: lv_name_1_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario647);
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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:299:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:299:4: this_SINGLE_NL_2= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario660); 
                    	     
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
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:304:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:304:6: ( ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+ )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:304:7: ( (lv_name_3_0= ruleTextPart ) )+ this_SINGLE_NL_4= RULE_SINGLE_NL (otherlv_5= '-' )+ (this_SINGLE_NL_6= RULE_SINGLE_NL )+
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:304:7: ( (lv_name_3_0= ruleTextPart ) )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:305:1: (lv_name_3_0= ruleTextPart )
                    	    {
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:305:1: (lv_name_3_0= ruleTextPart )
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:306:3: lv_name_3_0= ruleTextPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getNameTextPartParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextPart_in_ruleScenario690);
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

                    this_SINGLE_NL_4=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario702); 
                     
                        newLeafNode(this_SINGLE_NL_4, grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
                        
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:326:1: (otherlv_5= '-' )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:326:3: otherlv_5= '-'
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario714); 

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

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:330:3: (this_SINGLE_NL_6= RULE_SINGLE_NL )+
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
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:330:4: this_SINGLE_NL_6= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_6=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleScenario728); 
                    	     
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:342:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:343:2: (iv_ruleStep= ruleStep EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:344:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep766);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep776); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:351:1: ruleStep returns [EObject current=null] : ( () ( (lv_definition_1_0= ruleStepDefinition ) ) this_SINGLE_NL_2= RULE_SINGLE_NL ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )? (this_SINGLE_NL_5= RULE_SINGLE_NL )* ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token this_SINGLE_NL_2=null;
        Token this_SINGLE_NL_3=null;
        Token this_SINGLE_NL_5=null;
        EObject lv_definition_1_0 = null;

        EObject lv_table_4_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:354:28: ( ( () ( (lv_definition_1_0= ruleStepDefinition ) ) this_SINGLE_NL_2= RULE_SINGLE_NL ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )? (this_SINGLE_NL_5= RULE_SINGLE_NL )* ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:355:1: ( () ( (lv_definition_1_0= ruleStepDefinition ) ) this_SINGLE_NL_2= RULE_SINGLE_NL ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )? (this_SINGLE_NL_5= RULE_SINGLE_NL )* )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:355:1: ( () ( (lv_definition_1_0= ruleStepDefinition ) ) this_SINGLE_NL_2= RULE_SINGLE_NL ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )? (this_SINGLE_NL_5= RULE_SINGLE_NL )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:355:2: () ( (lv_definition_1_0= ruleStepDefinition ) ) this_SINGLE_NL_2= RULE_SINGLE_NL ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )? (this_SINGLE_NL_5= RULE_SINGLE_NL )*
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:355:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:356:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepAccess().getStepAction_0(),
                        current);
                

            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:361:2: ( (lv_definition_1_0= ruleStepDefinition ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:362:1: (lv_definition_1_0= ruleStepDefinition )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:362:1: (lv_definition_1_0= ruleStepDefinition )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:363:3: lv_definition_1_0= ruleStepDefinition
            {
             
            	        newCompositeNode(grammarAccess.getStepAccess().getDefinitionStepDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStepDefinition_in_ruleStep831);
            lv_definition_1_0=ruleStepDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_1_0, 
                    		"StepDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep842); 
             
                newLeafNode(this_SINGLE_NL_2, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_2()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:383:1: ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:383:2: (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:383:2: (this_SINGLE_NL_3= RULE_SINGLE_NL )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_SINGLE_NL) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:383:3: this_SINGLE_NL_3= RULE_SINGLE_NL
                    	    {
                    	    this_SINGLE_NL_3=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep854); 
                    	     
                    	        newLeafNode(this_SINGLE_NL_3, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:387:3: ( (lv_table_4_0= ruleTable ) )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:388:1: (lv_table_4_0= ruleTable )
                    {
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:388:1: (lv_table_4_0= ruleTable )
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:389:3: lv_table_4_0= ruleTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTable_in_ruleStep876);
                    lv_table_4_0=ruleTable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStepRule());
                    	        }
                           		set(
                           			current, 
                           			"table",
                            		lv_table_4_0, 
                            		"Table");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:405:4: (this_SINGLE_NL_5= RULE_SINGLE_NL )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SINGLE_NL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:405:5: this_SINGLE_NL_5= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_5=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleStep890); 
            	     
            	        newLeafNode(this_SINGLE_NL_5, grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_4()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "entryRuleStepDefinition"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:417:1: entryRuleStepDefinition returns [EObject current=null] : iv_ruleStepDefinition= ruleStepDefinition EOF ;
    public final EObject entryRuleStepDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepDefinition = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:418:2: (iv_ruleStepDefinition= ruleStepDefinition EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:419:2: iv_ruleStepDefinition= ruleStepDefinition EOF
            {
             newCompositeNode(grammarAccess.getStepDefinitionRule()); 
            pushFollow(FOLLOW_ruleStepDefinition_in_entryRuleStepDefinition927);
            iv_ruleStepDefinition=ruleStepDefinition();

            state._fsp--;

             current =iv_ruleStepDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepDefinition937); 

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
    // $ANTLR end "entryRuleStepDefinition"


    // $ANTLR start "ruleStepDefinition"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:426:1: ruleStepDefinition returns [EObject current=null] : ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )* )+ ) ;
    public final EObject ruleStepDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_4_1=null;
        Token lv_text_4_2=null;
        Token lv_text_4_3=null;
        Token lv_text_4_4=null;
        Token lv_separators_5_0=null;
        EObject lv_staticParams_2_0 = null;

        EObject lv_dynamicParams_3_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:429:28: ( ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )* )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:430:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )* )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:430:1: ( () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )* )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:430:2: () otherlv_1= '* ' ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )* )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:430:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:431:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStepDefinitionAccess().getStepDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStepDefinition983); 

                	newLeafNode(otherlv_1, grammarAccess.getStepDefinitionAccess().getAsteriskSpaceKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:440:1: ( ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )* )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_WORD && LA22_0<=RULE_WS)||(LA22_0>=RULE_STATIC_PARAM && LA22_0<=RULE_DYNAMIC_PARAM)||LA22_0==12||LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:440:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) ) ( (lv_separators_5_0= RULE_SEPARATORS ) )*
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:440:2: ( ( (lv_staticParams_2_0= ruleStaticParam ) ) | ( (lv_dynamicParams_3_0= ruleDynamicParam ) ) | ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) ) )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_STATIC_PARAM:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case RULE_WORD:
            	    case RULE_WS:
            	    case 12:
            	    case 14:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:440:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:440:3: ( (lv_staticParams_2_0= ruleStaticParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:441:1: (lv_staticParams_2_0= ruleStaticParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:441:1: (lv_staticParams_2_0= ruleStaticParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:442:3: lv_staticParams_2_0= ruleStaticParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepDefinitionAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStaticParam_in_ruleStepDefinition1006);
            	            lv_staticParams_2_0=ruleStaticParam();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:459:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:459:6: ( (lv_dynamicParams_3_0= ruleDynamicParam ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:460:1: (lv_dynamicParams_3_0= ruleDynamicParam )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:461:3: lv_dynamicParams_3_0= ruleDynamicParam
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStepDefinitionAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDynamicParam_in_ruleStepDefinition1033);
            	            lv_dynamicParams_3_0=ruleDynamicParam();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:478:6: ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:478:6: ( ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:479:1: ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:479:1: ( (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS ) )
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:480:1: (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS )
            	            {
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:480:1: (lv_text_4_1= RULE_WORD | lv_text_4_2= '-' | lv_text_4_3= '=' | lv_text_4_4= RULE_WS )
            	            int alt19=4;
            	            switch ( input.LA(1) ) {
            	            case RULE_WORD:
            	                {
            	                alt19=1;
            	                }
            	                break;
            	            case 14:
            	                {
            	                alt19=2;
            	                }
            	                break;
            	            case 12:
            	                {
            	                alt19=3;
            	                }
            	                break;
            	            case RULE_WS:
            	                {
            	                alt19=4;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 19, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt19) {
            	                case 1 :
            	                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:481:3: lv_text_4_1= RULE_WORD
            	                    {
            	                    lv_text_4_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStepDefinition1058); 

            	                    			newLeafNode(lv_text_4_1, grammarAccess.getStepDefinitionAccess().getTextWORDTerminalRuleCall_2_0_2_0_0()); 
            	                    		

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getStepDefinitionRule());
            	                    	        }
            	                           		addWithLastConsumed(
            	                           			current, 
            	                           			"text",
            	                            		lv_text_4_1, 
            	                            		"WORD");
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:496:8: lv_text_4_2= '-'
            	                    {
            	                    lv_text_4_2=(Token)match(input,14,FOLLOW_14_in_ruleStepDefinition1079); 

            	                            newLeafNode(lv_text_4_2, grammarAccess.getStepDefinitionAccess().getTextHyphenMinusKeyword_2_0_2_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getStepDefinitionRule());
            	                    	        }
            	                           		addWithLastConsumed(current, "text", lv_text_4_2, null);
            	                    	    

            	                    }
            	                    break;
            	                case 3 :
            	                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:508:8: lv_text_4_3= '='
            	                    {
            	                    lv_text_4_3=(Token)match(input,12,FOLLOW_12_in_ruleStepDefinition1108); 

            	                            newLeafNode(lv_text_4_3, grammarAccess.getStepDefinitionAccess().getTextEqualsSignKeyword_2_0_2_0_2());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getStepDefinitionRule());
            	                    	        }
            	                           		addWithLastConsumed(current, "text", lv_text_4_3, null);
            	                    	    

            	                    }
            	                    break;
            	                case 4 :
            	                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:520:8: lv_text_4_4= RULE_WS
            	                    {
            	                    lv_text_4_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleStepDefinition1136); 

            	                    			newLeafNode(lv_text_4_4, grammarAccess.getStepDefinitionAccess().getTextWSTerminalRuleCall_2_0_2_0_3()); 
            	                    		

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getStepDefinitionRule());
            	                    	        }
            	                           		addWithLastConsumed(
            	                           			current, 
            	                           			"text",
            	                            		lv_text_4_4, 
            	                            		"WS");
            	                    	    

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:538:3: ( (lv_separators_5_0= RULE_SEPARATORS ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_SEPARATORS) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:539:1: (lv_separators_5_0= RULE_SEPARATORS )
            	    	    {
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:539:1: (lv_separators_5_0= RULE_SEPARATORS )
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:540:3: lv_separators_5_0= RULE_SEPARATORS
            	    	    {
            	    	    lv_separators_5_0=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleStepDefinition1162); 

            	    	    			newLeafNode(lv_separators_5_0, grammarAccess.getStepDefinitionAccess().getSeparatorsSEPARATORSTerminalRuleCall_2_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStepDefinitionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"separators",
            	    	            		lv_separators_5_0, 
            	    	            		"SEPARATORS");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleStepDefinition"


    // $ANTLR start "entryRuleStaticParam"
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:564:1: entryRuleStaticParam returns [EObject current=null] : iv_ruleStaticParam= ruleStaticParam EOF ;
    public final EObject entryRuleStaticParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:565:2: (iv_ruleStaticParam= ruleStaticParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:566:2: iv_ruleStaticParam= ruleStaticParam EOF
            {
             newCompositeNode(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam1206);
            iv_ruleStaticParam=ruleStaticParam();

            state._fsp--;

             current =iv_ruleStaticParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam1216); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:573:1: ruleStaticParam returns [EObject current=null] : ( (lv_name_0_0= RULE_STATIC_PARAM ) ) ;
    public final EObject ruleStaticParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:576:28: ( ( (lv_name_0_0= RULE_STATIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:577:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:577:1: ( (lv_name_0_0= RULE_STATIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:578:1: (lv_name_0_0= RULE_STATIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:578:1: (lv_name_0_0= RULE_STATIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:579:3: lv_name_0_0= RULE_STATIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam1257); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:603:1: entryRuleDynamicParam returns [EObject current=null] : iv_ruleDynamicParam= ruleDynamicParam EOF ;
    public final EObject entryRuleDynamicParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicParam = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:604:2: (iv_ruleDynamicParam= ruleDynamicParam EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:605:2: iv_ruleDynamicParam= ruleDynamicParam EOF
            {
             newCompositeNode(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1297);
            iv_ruleDynamicParam=ruleDynamicParam();

            state._fsp--;

             current =iv_ruleDynamicParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam1307); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:612:1: ruleDynamicParam returns [EObject current=null] : ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) ;
    public final EObject ruleDynamicParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:615:28: ( ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:616:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:616:1: ( (lv_name_0_0= RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:617:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:617:1: (lv_name_0_0= RULE_DYNAMIC_PARAM )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:618:3: lv_name_0_0= RULE_DYNAMIC_PARAM
            {
            lv_name_0_0=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1348); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:642:1: entryRuleTags returns [EObject current=null] : iv_ruleTags= ruleTags EOF ;
    public final EObject entryRuleTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTags = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:643:2: (iv_ruleTags= ruleTags EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:644:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_ruleTags_in_entryRuleTags1388);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTags1398); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:651:1: ruleTags returns [EObject current=null] : ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:654:28: ( ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:655:1: ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:655:1: ( () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:655:2: () otherlv_1= 'tags' (this_WS_2= RULE_WS )* otherlv_3= ':' (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+ (this_SINGLE_NL_7= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:655:2: ()
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:656:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTagsAccess().getTagsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTags1444); 

                	newLeafNode(otherlv_1, grammarAccess.getTagsAccess().getTagsKeyword_1());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:665:1: (this_WS_2= RULE_WS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:665:2: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1456); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTagsAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTags1469); 

                	newLeafNode(otherlv_3, grammarAccess.getTagsAccess().getColonKeyword_3());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:673:1: (this_WORD_4= RULE_WORD | this_WS_5= RULE_WS | otherlv_6= ',' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt24=2;
                    }
                    break;
                case 18:
                    {
                    alt24=3;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:673:2: this_WORD_4= RULE_WORD
            	    {
            	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTags1481); 
            	     
            	        newLeafNode(this_WORD_4, grammarAccess.getTagsAccess().getWORDTerminalRuleCall_4_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:678:6: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTags1497); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getTagsAccess().getWSTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:683:7: otherlv_6= ','
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleTags1514); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTagsAccess().getCommaKeyword_4_2());
            	        

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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:687:3: (this_SINGLE_NL_7= RULE_SINGLE_NL )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_SINGLE_NL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:687:4: this_SINGLE_NL_7= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_7=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleTags1528); 
            	     
            	        newLeafNode(this_SINGLE_NL_7, grammarAccess.getTagsAccess().getSINGLE_NLTerminalRuleCall_5()); 
            	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:699:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:700:2: (iv_ruleComment= ruleComment EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:701:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1565);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1575); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:708:1: ruleComment returns [EObject current=null] : ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:711:28: ( ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:712:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:712:1: ( ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:712:2: ( (lv_name_0_0= ruleTextPart ) ) ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )* (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:712:2: ( (lv_name_0_0= ruleTextPart ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:713:1: (lv_name_0_0= ruleTextPart )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:713:1: (lv_name_0_0= ruleTextPart )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:714:3: lv_name_0_0= ruleTextPart
            {
             
            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1621);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:730:2: ( ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_WORD && LA27_0<=RULE_DYNAMIC_PARAM)||LA27_0==12||LA27_0==14||(LA27_0>=17 && LA27_0<=19)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:731:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:731:1: ( (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:732:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:732:1: (lv_name_1_1= ruleTextPart | lv_name_1_2= '-' | lv_name_1_3= '=' | lv_name_1_4= '|' | lv_name_1_5= ',' | lv_name_1_6= ':' )
            	    int alt26=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	    case RULE_WS:
            	    case RULE_SEPARATORS:
            	    case RULE_STATIC_PARAM:
            	    case RULE_DYNAMIC_PARAM:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt26=5;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt26=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:733:3: lv_name_1_1= ruleTextPart
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getCommentAccess().getNameTextPartParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTextPart_in_ruleComment1644);
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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:748:8: lv_name_1_2= '-'
            	            {
            	            lv_name_1_2=(Token)match(input,14,FOLLOW_14_in_ruleComment1660); 

            	                    newLeafNode(lv_name_1_2, grammarAccess.getCommentAccess().getNameHyphenMinusKeyword_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:760:8: lv_name_1_3= '='
            	            {
            	            lv_name_1_3=(Token)match(input,12,FOLLOW_12_in_ruleComment1689); 

            	                    newLeafNode(lv_name_1_3, grammarAccess.getCommentAccess().getNameEqualsSignKeyword_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:772:8: lv_name_1_4= '|'
            	            {
            	            lv_name_1_4=(Token)match(input,19,FOLLOW_19_in_ruleComment1718); 

            	                    newLeafNode(lv_name_1_4, grammarAccess.getCommentAccess().getNameVerticalLineKeyword_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:784:8: lv_name_1_5= ','
            	            {
            	            lv_name_1_5=(Token)match(input,18,FOLLOW_18_in_ruleComment1747); 

            	                    newLeafNode(lv_name_1_5, grammarAccess.getCommentAccess().getNameCommaKeyword_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCommentRule());
            	            	        }
            	                   		addWithLastConsumed(current, "name", lv_name_1_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:796:8: lv_name_1_6= ':'
            	            {
            	            lv_name_1_6=(Token)match(input,17,FOLLOW_17_in_ruleComment1776); 

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
            	    break loop27;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:811:3: (this_SINGLE_NL_2= RULE_SINGLE_NL )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_SINGLE_NL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:811:4: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleComment1805); 
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:823:1: entryRuleTextPart returns [String current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final String entryRuleTextPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextPart = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:824:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:825:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1843);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1854); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:832:1: ruleTextPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleTextPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_SEPARATORS_1=null;
        Token this_STATIC_PARAM_2=null;
        Token this_DYNAMIC_PARAM_3=null;
        Token this_WS_4=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:835:28: ( (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:836:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:836:1: (this_WORD_0= RULE_WORD | this_SEPARATORS_1= RULE_SEPARATORS | this_STATIC_PARAM_2= RULE_STATIC_PARAM | this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM | this_WS_4= RULE_WS )
            int alt29=5;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt29=1;
                }
                break;
            case RULE_SEPARATORS:
                {
                alt29=2;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt29=3;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt29=4;
                }
                break;
            case RULE_WS:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:836:6: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTextPart1894); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getTextPartAccess().getWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:844:10: this_SEPARATORS_1= RULE_SEPARATORS
                    {
                    this_SEPARATORS_1=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTextPart1920); 

                    		current.merge(this_SEPARATORS_1);
                        
                     
                        newLeafNode(this_SEPARATORS_1, grammarAccess.getTextPartAccess().getSEPARATORSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:852:10: this_STATIC_PARAM_2= RULE_STATIC_PARAM
                    {
                    this_STATIC_PARAM_2=(Token)match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1946); 

                    		current.merge(this_STATIC_PARAM_2);
                        
                     
                        newLeafNode(this_STATIC_PARAM_2, grammarAccess.getTextPartAccess().getSTATIC_PARAMTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:860:10: this_DYNAMIC_PARAM_3= RULE_DYNAMIC_PARAM
                    {
                    this_DYNAMIC_PARAM_3=(Token)match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1972); 

                    		current.merge(this_DYNAMIC_PARAM_3);
                        
                     
                        newLeafNode(this_DYNAMIC_PARAM_3, grammarAccess.getTextPartAccess().getDYNAMIC_PARAMTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:868:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTextPart1998); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:883:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:884:2: (iv_ruleTable= ruleTable EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:885:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable2043);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable2053); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:892:1: ruleTable returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ ) ;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:895:28: ( ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:896:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:896:1: ( (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:896:2: (this_WS_0= RULE_WS )* ( (lv_heading_1_0= ruleTableRow ) ) (this_WS_2= RULE_WS )* (otherlv_3= '|' (otherlv_4= '-' )+ )+ this_TABLE_ROW_END_5= RULE_TABLE_ROW_END ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:896:2: (this_WS_0= RULE_WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:896:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable2090); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getTableAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:900:3: ( (lv_heading_1_0= ruleTableRow ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:901:1: (lv_heading_1_0= ruleTableRow )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:901:1: (lv_heading_1_0= ruleTableRow )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:902:3: lv_heading_1_0= ruleTableRow
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getHeadingTableRowParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTableRow_in_ruleTable2112);
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

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:918:2: (this_WS_2= RULE_WS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:918:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable2124); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTableAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:922:3: (otherlv_3= '|' (otherlv_4= '-' )+ )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:922:5: otherlv_3= '|' (otherlv_4= '-' )+
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTable2138); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getVerticalLineKeyword_3_0());
            	        
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:926:1: (otherlv_4= '-' )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==14) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:926:3: otherlv_4= '-'
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTable2151); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getHyphenMinusKeyword_3_1());
            	    	        

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

            this_TABLE_ROW_END_5=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTable2166); 
             
                newLeafNode(this_TABLE_ROW_END_5, grammarAccess.getTableAccess().getTABLE_ROW_ENDTerminalRuleCall_4()); 
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:934:1: ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:934:2: (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:934:2: (this_WS_6= RULE_WS )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==RULE_WS) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:934:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTable2178); 
            	    	     
            	    	        newLeafNode(this_WS_6, grammarAccess.getTableAccess().getWSTerminalRuleCall_5_0()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:938:3: ( (lv_rows_7_0= ruleTableRow ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:939:1: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:939:1: (lv_rows_7_0= ruleTableRow )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:940:3: lv_rows_7_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable2200);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:964:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:965:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:966:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow2238);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow2248); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:973:1: ruleTableRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token this_TABLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:976:28: ( ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:977:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:977:1: ( ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:977:2: ( (lv_cells_0_0= ruleTableCell ) )+ this_TABLE_ROW_END_1= RULE_TABLE_ROW_END
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:977:2: ( (lv_cells_0_0= ruleTableCell ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==19) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:978:1: (lv_cells_0_0= ruleTableCell )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:978:1: (lv_cells_0_0= ruleTableCell )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:979:3: lv_cells_0_0= ruleTableCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableCell_in_ruleTableRow2294);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            this_TABLE_ROW_END_1=(Token)match(input,RULE_TABLE_ROW_END,FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2306); 
             
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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1007:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1008:2: (iv_ruleTableCell= ruleTableCell EOF )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1009:2: iv_ruleTableCell= ruleTableCell EOF
            {
             newCompositeNode(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_ruleTableCell_in_entryRuleTableCell2341);
            iv_ruleTableCell=ruleTableCell();

            state._fsp--;

             current =iv_ruleTableCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableCell2351); 

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
    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1016:1: ruleTableCell returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) ;
    public final EObject ruleTableCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;

         enterRule(); 
            
        try {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1019:28: ( (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1020:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1020:1: (otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+ )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1020:3: otherlv_0= '|' ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTableCell2388); 

                	newLeafNode(otherlv_0, grammarAccess.getTableCellAccess().getVerticalLineKeyword_0());
                
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1024:1: ( ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_WORD && LA38_0<=RULE_SEPARATORS)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1025:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1025:1: ( (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS ) )
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1026:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    {
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1026:1: (lv_name_1_1= RULE_WORD | lv_name_1_2= RULE_SEPARATORS | lv_name_1_3= RULE_WS )
            	    int alt37=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case RULE_SEPARATORS:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1027:3: lv_name_1_1= RULE_WORD
            	            {
            	            lv_name_1_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTableCell2407); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1042:8: lv_name_1_2= RULE_SEPARATORS
            	            {
            	            lv_name_1_2=(Token)match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_ruleTableCell2427); 

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
            	            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1057:8: lv_name_1_3= RULE_WS
            	            {
            	            lv_name_1_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTableCell2447); 

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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA3_eotS =
        "\21\uffff";
    static final String DFA3_eofS =
        "\12\uffff\1\20\6\uffff";
    static final String DFA3_minS =
        "\1\5\1\uffff\5\4\3\uffff\6\4\1\uffff";
    static final String DFA3_maxS =
        "\1\20\1\uffff\5\23\3\uffff\1\20\5\23\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3\1\5\6\uffff\1\4";
    static final String DFA3_specialS =
        "\21\uffff}>";
    static final String[] DFA3_transitionS = {
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "129:1: (this_Spec_0= ruleSpec | this_Scenario_1= ruleScenario | this_Step_2= ruleStep | this_Comment_3= ruleComment | this_Tags_4= ruleTags )";
        }
    }
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\2\4\10\uffff";
    static final String DFA17_minS =
        "\3\4\2\uffff\5\4";
    static final String DFA17_maxS =
        "\3\23\2\uffff\5\23";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\1\2\5\uffff";
    static final String DFA17_specialS =
        "\12\uffff}>";
    static final String[] DFA17_transitionS = {
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "383:1: ( (this_SINGLE_NL_3= RULE_SINGLE_NL )* ( (lv_table_4_0= ruleTable ) ) )?";
        }
    }
    static final String DFA35_eotS =
        "\11\uffff";
    static final String DFA35_eofS =
        "\1\1\10\uffff";
    static final String DFA35_minS =
        "\1\4\1\uffff\1\4\1\uffff\5\4";
    static final String DFA35_maxS =
        "\1\23\1\uffff\1\23\1\uffff\5\23";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\5\uffff";
    static final String DFA35_specialS =
        "\11\uffff}>";
    static final String[] DFA35_transitionS = {
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()+ loopback of 934:1: ( (this_WS_6= RULE_WS )* ( (lv_rows_7_0= ruleTableRow ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleModel131 = new BitSet(new long[]{0x000000000001ABF2L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel153 = new BitSet(new long[]{0x000000000001ABE2L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_ruleElement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleElement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleElement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTags_in_ruleElement355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSpec438 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec459 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec472 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleSpec502 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpec526 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleSpec540 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScenario626 = new BitSet(new long[]{0x0000000000000BE0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario647 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario660 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleScenario690 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario702 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario714 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleScenario728 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepDefinition_in_ruleStep831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep842 = new BitSet(new long[]{0x0000000000080052L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep854 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep876 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleStep890 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStepDefinition_in_entryRuleStepDefinition927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepDefinition937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStepDefinition983 = new BitSet(new long[]{0x0000000000005360L});
    public static final BitSet FOLLOW_ruleStaticParam_in_ruleStepDefinition1006 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_ruleStepDefinition1033 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStepDefinition1058 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_14_in_ruleStepDefinition1079 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_12_in_ruleStepDefinition1108 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleStepDefinition1136 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleStepDefinition1162 = new BitSet(new long[]{0x00000000000053E2L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleStaticParam1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleDynamicParam1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTags_in_entryRuleTags1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTags1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTags1444 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1456 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleTags1469 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTags1481 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTags1497 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_18_in_ruleTags1514 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleTags1528 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1621 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleComment1644 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_14_in_ruleComment1660 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_12_in_ruleComment1689 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_19_in_ruleComment1718 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_18_in_ruleComment1747 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_17_in_ruleComment1776 = new BitSet(new long[]{0x00000000000E5BF0L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleComment1805 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTextPart1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTextPart1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_ruleTextPart1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_ruleTextPart1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTextPart1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable2090 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable2112 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable2124 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleTable2138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTable2151 = new BitSet(new long[]{0x0000000000084400L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTable2166 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTable2178 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable2200 = new BitSet(new long[]{0x0000000000080052L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_ruleTableRow2294 = new BitSet(new long[]{0x0000000000080450L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_END_in_ruleTableRow2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableCell_in_entryRuleTableCell2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableCell2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTableCell2388 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTableCell2407 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_ruleTableCell2427 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTableCell2447 = new BitSet(new long[]{0x00000000000000E2L});

}