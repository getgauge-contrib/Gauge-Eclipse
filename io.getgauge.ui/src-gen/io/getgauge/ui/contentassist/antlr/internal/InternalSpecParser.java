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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'# '", "'## '", "'* '"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
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
    public String getGrammarFileName() { return "../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g"; }


     
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




    // $ANTLR start "entryRuleSpec"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:60:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:61:1: ( ruleSpec EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:62:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec61);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:69:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:73:2: ( ( ( rule__Spec__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:74:1: ( ( rule__Spec__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:74:1: ( ( rule__Spec__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:75:1: ( rule__Spec__Group__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:76:1: ( rule__Spec__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:76:2: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_rule__Spec__Group__0_in_ruleSpec94);
            rule__Spec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleScenario"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:88:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:89:1: ( ruleScenario EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:90:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario121);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:97:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:101:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:102:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:102:1: ( ( rule__Scenario__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:103:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:104:1: ( rule__Scenario__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:104:2: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0_in_ruleScenario154);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:116:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:117:1: ( ruleStep EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:118:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep181);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:125:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:129:2: ( ( ( rule__Step__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:130:1: ( ( rule__Step__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:130:1: ( ( rule__Step__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:131:1: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:132:1: ( rule__Step__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:132:2: rule__Step__Group__0
            {
            pushFollow(FOLLOW_rule__Step__Group__0_in_ruleStep214);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "rule__Spec__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:146:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:150:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:151:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0248);
            rule__Spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0251);
            rule__Spec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0"


    // $ANTLR start "rule__Spec__Group__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:158:1: rule__Spec__Group__0__Impl : ( '# ' ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:162:1: ( ( '# ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:163:1: ( '# ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:163:1: ( '# ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:164:1: '# '
            {
             before(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Spec__Group__0__Impl279); 
             after(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0__Impl"


    // $ANTLR start "rule__Spec__Group__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:177:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl rule__Spec__Group__2 ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:181:1: ( rule__Spec__Group__1__Impl rule__Spec__Group__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:182:2: rule__Spec__Group__1__Impl rule__Spec__Group__2
            {
            pushFollow(FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1310);
            rule__Spec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__2_in_rule__Spec__Group__1313);
            rule__Spec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1"


    // $ANTLR start "rule__Spec__Group__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:189:1: rule__Spec__Group__1__Impl : ( ( ( rule__Spec__TextAssignment_1 ) ) ( ( rule__Spec__TextAssignment_1 )* ) ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:193:1: ( ( ( ( rule__Spec__TextAssignment_1 ) ) ( ( rule__Spec__TextAssignment_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:194:1: ( ( ( rule__Spec__TextAssignment_1 ) ) ( ( rule__Spec__TextAssignment_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:194:1: ( ( ( rule__Spec__TextAssignment_1 ) ) ( ( rule__Spec__TextAssignment_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:195:1: ( ( rule__Spec__TextAssignment_1 ) ) ( ( rule__Spec__TextAssignment_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:195:1: ( ( rule__Spec__TextAssignment_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:196:1: ( rule__Spec__TextAssignment_1 )
            {
             before(grammarAccess.getSpecAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:197:1: ( rule__Spec__TextAssignment_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:197:2: rule__Spec__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Spec__TextAssignment_1_in_rule__Spec__Group__1__Impl342);
            rule__Spec__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getTextAssignment_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:200:1: ( ( rule__Spec__TextAssignment_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:201:1: ( rule__Spec__TextAssignment_1 )*
            {
             before(grammarAccess.getSpecAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:202:1: ( rule__Spec__TextAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:202:2: rule__Spec__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Spec__TextAssignment_1_in_rule__Spec__Group__1__Impl354);
            	    rule__Spec__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getTextAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1__Impl"


    // $ANTLR start "rule__Spec__Group__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:213:1: rule__Spec__Group__2 : rule__Spec__Group__2__Impl rule__Spec__Group__3 ;
    public final void rule__Spec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:217:1: ( rule__Spec__Group__2__Impl rule__Spec__Group__3 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:218:2: rule__Spec__Group__2__Impl rule__Spec__Group__3
            {
            pushFollow(FOLLOW_rule__Spec__Group__2__Impl_in_rule__Spec__Group__2387);
            rule__Spec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__3_in_rule__Spec__Group__2390);
            rule__Spec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__2"


    // $ANTLR start "rule__Spec__Group__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:225:1: rule__Spec__Group__2__Impl : ( ( rule__Spec__ScenariosAssignment_2 )* ) ;
    public final void rule__Spec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:229:1: ( ( ( rule__Spec__ScenariosAssignment_2 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:230:1: ( ( rule__Spec__ScenariosAssignment_2 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:230:1: ( ( rule__Spec__ScenariosAssignment_2 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:231:1: ( rule__Spec__ScenariosAssignment_2 )*
            {
             before(grammarAccess.getSpecAccess().getScenariosAssignment_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:232:1: ( rule__Spec__ScenariosAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:232:2: rule__Spec__ScenariosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Spec__ScenariosAssignment_2_in_rule__Spec__Group__2__Impl417);
            	    rule__Spec__ScenariosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getScenariosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__2__Impl"


    // $ANTLR start "rule__Spec__Group__3"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:242:1: rule__Spec__Group__3 : rule__Spec__Group__3__Impl ;
    public final void rule__Spec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:246:1: ( rule__Spec__Group__3__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:247:2: rule__Spec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group__3__Impl_in_rule__Spec__Group__3448);
            rule__Spec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__3"


    // $ANTLR start "rule__Spec__Group__3__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:253:1: rule__Spec__Group__3__Impl : ( ( rule__Spec__StepsAssignment_3 )* ) ;
    public final void rule__Spec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:257:1: ( ( ( rule__Spec__StepsAssignment_3 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:258:1: ( ( rule__Spec__StepsAssignment_3 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:258:1: ( ( rule__Spec__StepsAssignment_3 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:259:1: ( rule__Spec__StepsAssignment_3 )*
            {
             before(grammarAccess.getSpecAccess().getStepsAssignment_3()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:260:1: ( rule__Spec__StepsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:260:2: rule__Spec__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Spec__StepsAssignment_3_in_rule__Spec__Group__3__Impl475);
            	    rule__Spec__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getStepsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:278:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:282:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:283:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__0514);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__0517);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:290:1: rule__Scenario__Group__0__Impl : ( '## ' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:294:1: ( ( '## ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:295:1: ( '## ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:295:1: ( '## ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:296:1: '## '
            {
             before(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Scenario__Group__0__Impl545); 
             after(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:309:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:313:1: ( rule__Scenario__Group__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:314:2: rule__Scenario__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__1576);
            rule__Scenario__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:320:1: rule__Scenario__Group__1__Impl : ( ( ( rule__Scenario__TextAssignment_1 ) ) ( ( rule__Scenario__TextAssignment_1 )* ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:324:1: ( ( ( ( rule__Scenario__TextAssignment_1 ) ) ( ( rule__Scenario__TextAssignment_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:325:1: ( ( ( rule__Scenario__TextAssignment_1 ) ) ( ( rule__Scenario__TextAssignment_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:325:1: ( ( ( rule__Scenario__TextAssignment_1 ) ) ( ( rule__Scenario__TextAssignment_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:326:1: ( ( rule__Scenario__TextAssignment_1 ) ) ( ( rule__Scenario__TextAssignment_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:326:1: ( ( rule__Scenario__TextAssignment_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:327:1: ( rule__Scenario__TextAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:328:1: ( rule__Scenario__TextAssignment_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:328:2: rule__Scenario__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__TextAssignment_1_in_rule__Scenario__Group__1__Impl605);
            rule__Scenario__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTextAssignment_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:331:1: ( ( rule__Scenario__TextAssignment_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:332:1: ( rule__Scenario__TextAssignment_1 )*
            {
             before(grammarAccess.getScenarioAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:333:1: ( rule__Scenario__TextAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:333:2: rule__Scenario__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__TextAssignment_1_in_rule__Scenario__Group__1__Impl617);
            	    rule__Scenario__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTextAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:348:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:352:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:353:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__0654);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__0657);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:360:1: rule__Step__Group__0__Impl : ( '* ' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:364:1: ( ( '* ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:365:1: ( '* ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:365:1: ( '* ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:366:1: '* '
            {
             before(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Step__Group__0__Impl685); 
             after(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:379:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:383:1: ( rule__Step__Group__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:384:2: rule__Step__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__1716);
            rule__Step__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:390:1: rule__Step__Group__1__Impl : ( ( ( rule__Step__TextAssignment_1 ) ) ( ( rule__Step__TextAssignment_1 )* ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:394:1: ( ( ( ( rule__Step__TextAssignment_1 ) ) ( ( rule__Step__TextAssignment_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:395:1: ( ( ( rule__Step__TextAssignment_1 ) ) ( ( rule__Step__TextAssignment_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:395:1: ( ( ( rule__Step__TextAssignment_1 ) ) ( ( rule__Step__TextAssignment_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:396:1: ( ( rule__Step__TextAssignment_1 ) ) ( ( rule__Step__TextAssignment_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:396:1: ( ( rule__Step__TextAssignment_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:397:1: ( rule__Step__TextAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:398:1: ( rule__Step__TextAssignment_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:398:2: rule__Step__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__TextAssignment_1_in_rule__Step__Group__1__Impl745);
            rule__Step__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTextAssignment_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:401:1: ( ( rule__Step__TextAssignment_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:402:1: ( rule__Step__TextAssignment_1 )*
            {
             before(grammarAccess.getStepAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:403:1: ( rule__Step__TextAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:403:2: rule__Step__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Step__TextAssignment_1_in_rule__Step__Group__1__Impl757);
            	    rule__Step__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getTextAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Spec__TextAssignment_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:419:1: rule__Spec__TextAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spec__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:423:1: ( ( RULE_ID ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:424:1: ( RULE_ID )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:424:1: ( RULE_ID )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:425:1: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getTextIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spec__TextAssignment_1799); 
             after(grammarAccess.getSpecAccess().getTextIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__TextAssignment_1"


    // $ANTLR start "rule__Spec__ScenariosAssignment_2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:434:1: rule__Spec__ScenariosAssignment_2 : ( ruleScenario ) ;
    public final void rule__Spec__ScenariosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:438:1: ( ( ruleScenario ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:439:1: ( ruleScenario )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:439:1: ( ruleScenario )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:440:1: ruleScenario
            {
             before(grammarAccess.getSpecAccess().getScenariosScenarioParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleScenario_in_rule__Spec__ScenariosAssignment_2830);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getScenariosScenarioParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__ScenariosAssignment_2"


    // $ANTLR start "rule__Spec__StepsAssignment_3"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:449:1: rule__Spec__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Spec__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:453:1: ( ( ruleStep ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:454:1: ( ruleStep )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:454:1: ( ruleStep )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:455:1: ruleStep
            {
             before(grammarAccess.getSpecAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Spec__StepsAssignment_3861);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getStepsStepParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__StepsAssignment_3"


    // $ANTLR start "rule__Scenario__TextAssignment_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:464:1: rule__Scenario__TextAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:468:1: ( ( RULE_ID ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:469:1: ( RULE_ID )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:469:1: ( RULE_ID )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:470:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getTextIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Scenario__TextAssignment_1892); 
             after(grammarAccess.getScenarioAccess().getTextIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TextAssignment_1"


    // $ANTLR start "rule__Step__TextAssignment_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:479:1: rule__Step__TextAssignment_1 : ( RULE_ID ) ;
    public final void rule__Step__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:483:1: ( ( RULE_ID ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:484:1: ( RULE_ID )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:484:1: ( RULE_ID )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:485:1: RULE_ID
            {
             before(grammarAccess.getStepAccess().getTextIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Step__TextAssignment_1923); 
             after(grammarAccess.getStepAccess().getTextIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TextAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0_in_ruleSpec94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Spec__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1310 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Spec__Group__2_in_rule__Spec__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__TextAssignment_1_in_rule__Spec__Group__1__Impl342 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Spec__TextAssignment_1_in_rule__Spec__Group__1__Impl354 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Spec__Group__2__Impl_in_rule__Spec__Group__2387 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Spec__Group__3_in_rule__Spec__Group__2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__ScenariosAssignment_2_in_rule__Spec__Group__2__Impl417 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Spec__Group__3__Impl_in_rule__Spec__Group__3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__StepsAssignment_3_in_rule__Spec__Group__3__Impl475 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__0514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__0517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Scenario__Group__0__Impl545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TextAssignment_1_in_rule__Scenario__Group__1__Impl605 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Scenario__TextAssignment_1_in_rule__Scenario__Group__1__Impl617 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__0654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Step__Group__0__Impl685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__TextAssignment_1_in_rule__Step__Group__1__Impl745 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Step__TextAssignment_1_in_rule__Step__Group__1__Impl757 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spec__TextAssignment_1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__Spec__ScenariosAssignment_2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Spec__StepsAssignment_3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__TextAssignment_1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Step__TextAssignment_1923 = new BitSet(new long[]{0x0000000000000002L});

}