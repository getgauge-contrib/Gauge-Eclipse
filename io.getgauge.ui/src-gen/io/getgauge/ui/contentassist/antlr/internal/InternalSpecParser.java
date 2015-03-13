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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_SEPARATORS", "RULE_STATIC_PARAM", "RULE_SINGLE_NL", "'# '", "'## '", "'* '"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SINGLE_NL=7;
    public static final int RULE_STATIC_PARAM=6;
    public static final int RULE_WORD=4;
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




    // $ANTLR start "entryRuleModel"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:61:1: ( ruleModel EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:69:1: ruleModel : ( ( rule__Model__DefinitionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:73:2: ( ( ( rule__Model__DefinitionsAssignment )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:74:1: ( ( rule__Model__DefinitionsAssignment )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:74:1: ( ( rule__Model__DefinitionsAssignment )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:75:1: ( rule__Model__DefinitionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:76:1: ( rule__Model__DefinitionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_STATIC_PARAM)||(LA1_0>=8 && LA1_0<=10)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:76:2: rule__Model__DefinitionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefinitionsAssignment_in_ruleModel94);
            	    rule__Model__DefinitionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefinitionsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractEntity"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:88:1: entryRuleAbstractEntity : ruleAbstractEntity EOF ;
    public final void entryRuleAbstractEntity() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:89:1: ( ruleAbstractEntity EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:90:1: ruleAbstractEntity EOF
            {
             before(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity122);
            ruleAbstractEntity();

            state._fsp--;

             after(grammarAccess.getAbstractEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntity129); 

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
    // $ANTLR end "entryRuleAbstractEntity"


    // $ANTLR start "ruleAbstractEntity"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:97:1: ruleAbstractEntity : ( ( rule__AbstractEntity__Alternatives ) ) ;
    public final void ruleAbstractEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:101:2: ( ( ( rule__AbstractEntity__Alternatives ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:102:1: ( ( rule__AbstractEntity__Alternatives ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:102:1: ( ( rule__AbstractEntity__Alternatives ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:103:1: ( rule__AbstractEntity__Alternatives )
            {
             before(grammarAccess.getAbstractEntityAccess().getAlternatives()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:104:1: ( rule__AbstractEntity__Alternatives )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:104:2: rule__AbstractEntity__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractEntity__Alternatives_in_ruleAbstractEntity155);
            rule__AbstractEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractEntityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractEntity"


    // $ANTLR start "entryRuleSpec"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:116:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:117:1: ( ruleSpec EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:118:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_ruleSpec_in_entryRuleSpec182);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpec189); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:125:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:129:2: ( ( ( rule__Spec__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:130:1: ( ( rule__Spec__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:130:1: ( ( rule__Spec__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:131:1: ( rule__Spec__Group__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:132:1: ( rule__Spec__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:132:2: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_rule__Spec__Group__0_in_ruleSpec215);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:144:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:145:1: ( ruleScenario EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:146:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario242);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario249); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:153:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:157:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:158:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:158:1: ( ( rule__Scenario__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:159:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:160:1: ( rule__Scenario__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:160:2: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0_in_ruleScenario275);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:172:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:173:1: ( ruleStep EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:174:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep302);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep309); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:181:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:185:2: ( ( ( rule__Step__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:186:1: ( ( rule__Step__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:186:1: ( ( rule__Step__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:187:1: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:188:1: ( rule__Step__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:188:2: rule__Step__Group__0
            {
            pushFollow(FOLLOW_rule__Step__Group__0_in_ruleStep335);
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


    // $ANTLR start "entryRuleComment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:200:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:201:1: ( ruleComment EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:202:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment362);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment369); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:209:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:213:2: ( ( ( rule__Comment__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:214:1: ( ( rule__Comment__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:214:1: ( ( rule__Comment__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:215:1: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:216:1: ( rule__Comment__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:216:2: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_rule__Comment__Group__0_in_ruleComment395);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleStaticParam"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:228:1: entryRuleStaticParam : ruleStaticParam EOF ;
    public final void entryRuleStaticParam() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:229:1: ( ruleStaticParam EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:230:1: ruleStaticParam EOF
            {
             before(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam422);
            ruleStaticParam();

            state._fsp--;

             after(grammarAccess.getStaticParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam429); 

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
    // $ANTLR end "entryRuleStaticParam"


    // $ANTLR start "ruleStaticParam"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:237:1: ruleStaticParam : ( ( rule__StaticParam__ValueAssignment ) ) ;
    public final void ruleStaticParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:241:2: ( ( ( rule__StaticParam__ValueAssignment ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:242:1: ( ( rule__StaticParam__ValueAssignment ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:242:1: ( ( rule__StaticParam__ValueAssignment ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:243:1: ( rule__StaticParam__ValueAssignment )
            {
             before(grammarAccess.getStaticParamAccess().getValueAssignment()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:244:1: ( rule__StaticParam__ValueAssignment )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:244:2: rule__StaticParam__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StaticParam__ValueAssignment_in_ruleStaticParam455);
            rule__StaticParam__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStaticParamAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStaticParam"


    // $ANTLR start "rule__AbstractEntity__Alternatives"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:256:1: rule__AbstractEntity__Alternatives : ( ( ( rule__AbstractEntity__Alternatives_0 ) ) | ( ruleComment ) );
    public final void rule__AbstractEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:260:1: ( ( ( rule__AbstractEntity__Alternatives_0 ) ) | ( ruleComment ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=8 && LA2_0<=10)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_STATIC_PARAM)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:261:1: ( ( rule__AbstractEntity__Alternatives_0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:261:1: ( ( rule__AbstractEntity__Alternatives_0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:262:1: ( rule__AbstractEntity__Alternatives_0 )
                    {
                     before(grammarAccess.getAbstractEntityAccess().getAlternatives_0()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:263:1: ( rule__AbstractEntity__Alternatives_0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:263:2: rule__AbstractEntity__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__AbstractEntity__Alternatives_0_in_rule__AbstractEntity__Alternatives491);
                    rule__AbstractEntity__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractEntityAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:267:6: ( ruleComment )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:267:6: ( ruleComment )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:268:1: ruleComment
                    {
                     before(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__AbstractEntity__Alternatives509);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AbstractEntity__Alternatives"


    // $ANTLR start "rule__AbstractEntity__Alternatives_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:278:1: rule__AbstractEntity__Alternatives_0 : ( ( ruleSpec ) | ( ruleScenario ) | ( ruleStep ) );
    public final void rule__AbstractEntity__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:282:1: ( ( ruleSpec ) | ( ruleScenario ) | ( ruleStep ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt3=1;
                }
                break;
            case 9:
                {
                alt3=2;
                }
                break;
            case 10:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:283:1: ( ruleSpec )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:283:1: ( ruleSpec )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:284:1: ruleSpec
                    {
                     before(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSpec_in_rule__AbstractEntity__Alternatives_0541);
                    ruleSpec();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:289:6: ( ruleScenario )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:289:6: ( ruleScenario )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:290:1: ruleScenario
                    {
                     before(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__AbstractEntity__Alternatives_0558);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:295:6: ( ruleStep )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:295:6: ( ruleStep )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:296:1: ruleStep
                    {
                     before(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleStep_in_rule__AbstractEntity__Alternatives_0575);
                    ruleStep();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AbstractEntity__Alternatives_0"


    // $ANTLR start "rule__Spec__NameAlternatives_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:306:1: rule__Spec__NameAlternatives_1_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) );
    public final void rule__Spec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:310:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) )
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
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:311:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:311:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:312:1: RULE_WORD
                    {
                     before(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Spec__NameAlternatives_1_0607); 
                     after(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:317:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:317:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:318:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Spec__NameAlternatives_1_0624); 
                     after(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Spec__NameAlternatives_1_0"


    // $ANTLR start "rule__Scenario__NameAlternatives_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:328:1: rule__Scenario__NameAlternatives_1_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) );
    public final void rule__Scenario__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:332:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WORD) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SEPARATORS) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:333:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:333:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:334:1: RULE_WORD
                    {
                     before(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Scenario__NameAlternatives_1_0656); 
                     after(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:339:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:339:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:340:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Scenario__NameAlternatives_1_0673); 
                     after(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Scenario__NameAlternatives_1_0"


    // $ANTLR start "rule__Step__Alternatives_2_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:350:1: rule__Step__Alternatives_2_0 : ( ( ( rule__Step__ParamsAssignment_2_0_0 ) ) | ( RULE_WORD ) );
    public final void rule__Step__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:354:1: ( ( ( rule__Step__ParamsAssignment_2_0_0 ) ) | ( RULE_WORD ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STATIC_PARAM) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_WORD) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:355:1: ( ( rule__Step__ParamsAssignment_2_0_0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:355:1: ( ( rule__Step__ParamsAssignment_2_0_0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:356:1: ( rule__Step__ParamsAssignment_2_0_0 )
                    {
                     before(grammarAccess.getStepAccess().getParamsAssignment_2_0_0()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:357:1: ( rule__Step__ParamsAssignment_2_0_0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:357:2: rule__Step__ParamsAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__Step__ParamsAssignment_2_0_0_in_rule__Step__Alternatives_2_0705);
                    rule__Step__ParamsAssignment_2_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getParamsAssignment_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:361:6: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:361:6: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:362:1: RULE_WORD
                    {
                     before(grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_1()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Step__Alternatives_2_0723); 
                     after(grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Step__Alternatives_2_0"


    // $ANTLR start "rule__Comment__TextAlternatives_0_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:372:1: rule__Comment__TextAlternatives_0_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) | ( RULE_STATIC_PARAM ) );
    public final void rule__Comment__TextAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:376:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) | ( RULE_STATIC_PARAM ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt7=1;
                }
                break;
            case RULE_SEPARATORS:
                {
                alt7=2;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:377:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:377:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:378:1: RULE_WORD
                    {
                     before(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Comment__TextAlternatives_0_0755); 
                     after(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:383:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:383:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:384:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_0_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Comment__TextAlternatives_0_0772); 
                     after(grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:389:6: ( RULE_STATIC_PARAM )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:389:6: ( RULE_STATIC_PARAM )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:390:1: RULE_STATIC_PARAM
                    {
                     before(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_2()); 
                    match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_rule__Comment__TextAlternatives_0_0789); 
                     after(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Comment__TextAlternatives_0_0"


    // $ANTLR start "rule__Spec__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:402:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:406:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:407:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0819);
            rule__Spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0822);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:414:1: rule__Spec__Group__0__Impl : ( '# ' ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:418:1: ( ( '# ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:419:1: ( '# ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:419:1: ( '# ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:420:1: '# '
            {
             before(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0()); 
            match(input,8,FOLLOW_8_in_rule__Spec__Group__0__Impl850); 
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:433:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl rule__Spec__Group__2 ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:437:1: ( rule__Spec__Group__1__Impl rule__Spec__Group__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:438:2: rule__Spec__Group__1__Impl rule__Spec__Group__2
            {
            pushFollow(FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1881);
            rule__Spec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group__2_in_rule__Spec__Group__1884);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:445:1: rule__Spec__Group__1__Impl : ( ( ( rule__Spec__NameAssignment_1 ) ) ( ( rule__Spec__NameAssignment_1 )* ) ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:449:1: ( ( ( ( rule__Spec__NameAssignment_1 ) ) ( ( rule__Spec__NameAssignment_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:450:1: ( ( ( rule__Spec__NameAssignment_1 ) ) ( ( rule__Spec__NameAssignment_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:450:1: ( ( ( rule__Spec__NameAssignment_1 ) ) ( ( rule__Spec__NameAssignment_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:451:1: ( ( rule__Spec__NameAssignment_1 ) ) ( ( rule__Spec__NameAssignment_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:451:1: ( ( rule__Spec__NameAssignment_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:452:1: ( rule__Spec__NameAssignment_1 )
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:453:1: ( rule__Spec__NameAssignment_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:453:2: rule__Spec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Spec__NameAssignment_1_in_rule__Spec__Group__1__Impl913);
            rule__Spec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAssignment_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:456:1: ( ( rule__Spec__NameAssignment_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:457:1: ( rule__Spec__NameAssignment_1 )*
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:458:1: ( rule__Spec__NameAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_WORD && LA8_0<=RULE_SEPARATORS)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:458:2: rule__Spec__NameAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Spec__NameAssignment_1_in_rule__Spec__Group__1__Impl925);
            	    rule__Spec__NameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getNameAssignment_1()); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:469:1: rule__Spec__Group__2 : rule__Spec__Group__2__Impl ;
    public final void rule__Spec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:473:1: ( rule__Spec__Group__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:474:2: rule__Spec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group__2__Impl_in_rule__Spec__Group__2958);
            rule__Spec__Group__2__Impl();

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:480:1: rule__Spec__Group__2__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Spec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:484:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:485:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:485:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:486:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:486:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:487:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:488:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:488:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group__2__Impl988); 

            }

             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:491:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:492:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:493:1: ( RULE_SINGLE_NL )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SINGLE_NL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:493:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group__2__Impl1001); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Spec__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:510:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:514:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:515:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01040);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01043);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:522:1: rule__Scenario__Group__0__Impl : ( '## ' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:526:1: ( ( '## ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:527:1: ( '## ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:527:1: ( '## ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:528:1: '## '
            {
             before(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0()); 
            match(input,9,FOLLOW_9_in_rule__Scenario__Group__0__Impl1071); 
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:541:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:545:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:546:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11102);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11105);
            rule__Scenario__Group__2();

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:553:1: rule__Scenario__Group__1__Impl : ( ( ( rule__Scenario__NameAssignment_1 ) ) ( ( rule__Scenario__NameAssignment_1 )* ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:557:1: ( ( ( ( rule__Scenario__NameAssignment_1 ) ) ( ( rule__Scenario__NameAssignment_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:558:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) ( ( rule__Scenario__NameAssignment_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:558:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) ( ( rule__Scenario__NameAssignment_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:559:1: ( ( rule__Scenario__NameAssignment_1 ) ) ( ( rule__Scenario__NameAssignment_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:559:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:560:1: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:561:1: ( rule__Scenario__NameAssignment_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:561:2: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1134);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:564:1: ( ( rule__Scenario__NameAssignment_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:565:1: ( rule__Scenario__NameAssignment_1 )*
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:566:1: ( rule__Scenario__NameAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_SEPARATORS)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:566:2: rule__Scenario__NameAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1146);
            	    rule__Scenario__NameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Scenario__Group__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:577:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:581:1: ( rule__Scenario__Group__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:582:2: rule__Scenario__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21179);
            rule__Scenario__Group__2__Impl();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:588:1: rule__Scenario__Group__2__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:592:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:593:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:593:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:594:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:594:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:595:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:596:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:596:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group__2__Impl1209); 

            }

             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:599:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:600:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:601:1: ( RULE_SINGLE_NL )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SINGLE_NL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:601:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group__2__Impl1222); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:618:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:622:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:623:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__01261);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__01264);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:630:1: rule__Step__Group__0__Impl : ( () ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:634:1: ( ( () ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:635:1: ( () )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:635:1: ( () )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:636:1: ()
            {
             before(grammarAccess.getStepAccess().getStepAction_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:637:1: ()
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:639:1: 
            {
            }

             after(grammarAccess.getStepAccess().getStepAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:649:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:653:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:654:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__11322);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__11325);
            rule__Step__Group__2();

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:661:1: rule__Step__Group__1__Impl : ( '* ' ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:665:1: ( ( '* ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:666:1: ( '* ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:666:1: ( '* ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:667:1: '* '
            {
             before(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__Step__Group__1__Impl1353); 
             after(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1()); 

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


    // $ANTLR start "rule__Step__Group__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:680:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:684:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:685:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__21384);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__3_in_rule__Step__Group__21387);
            rule__Step__Group__3();

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
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:692:1: rule__Step__Group__2__Impl : ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:696:1: ( ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:697:1: ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:697:1: ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:698:1: ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:698:1: ( ( rule__Step__Group_2__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:699:1: ( rule__Step__Group_2__0 )
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:700:1: ( rule__Step__Group_2__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:700:2: rule__Step__Group_2__0
            {
            pushFollow(FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl1416);
            rule__Step__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:703:1: ( ( rule__Step__Group_2__0 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:704:1: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:705:1: ( rule__Step__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WORD||LA12_0==RULE_STATIC_PARAM) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:705:2: rule__Step__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl1428);
            	    rule__Step__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:716:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:720:1: ( rule__Step__Group__3__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:721:2: rule__Step__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__31461);
            rule__Step__Group__3__Impl();

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
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:727:1: rule__Step__Group__3__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:731:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:732:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:732:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:733:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:733:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:734:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:735:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:735:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl1491); 

            }

             after(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:738:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:739:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:740:1: ( RULE_SINGLE_NL )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SINGLE_NL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:740:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl1504); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Step__Group_2__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:759:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:763:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:764:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_rule__Step__Group_2__0__Impl_in_rule__Step__Group_2__01545);
            rule__Step__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_2__1_in_rule__Step__Group_2__01548);
            rule__Step__Group_2__1();

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
    // $ANTLR end "rule__Step__Group_2__0"


    // $ANTLR start "rule__Step__Group_2__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:771:1: rule__Step__Group_2__0__Impl : ( ( rule__Step__Alternatives_2_0 ) ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:775:1: ( ( ( rule__Step__Alternatives_2_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:776:1: ( ( rule__Step__Alternatives_2_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:776:1: ( ( rule__Step__Alternatives_2_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:777:1: ( rule__Step__Alternatives_2_0 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_2_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:778:1: ( rule__Step__Alternatives_2_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:778:2: rule__Step__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_2_0_in_rule__Step__Group_2__0__Impl1575);
            rule__Step__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives_2_0()); 

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
    // $ANTLR end "rule__Step__Group_2__0__Impl"


    // $ANTLR start "rule__Step__Group_2__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:788:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:792:1: ( rule__Step__Group_2__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:793:2: rule__Step__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_2__1__Impl_in_rule__Step__Group_2__11605);
            rule__Step__Group_2__1__Impl();

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
    // $ANTLR end "rule__Step__Group_2__1"


    // $ANTLR start "rule__Step__Group_2__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:799:1: rule__Step__Group_2__1__Impl : ( ( RULE_SEPARATORS )? ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:803:1: ( ( ( RULE_SEPARATORS )? ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:804:1: ( ( RULE_SEPARATORS )? )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:804:1: ( ( RULE_SEPARATORS )? )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:805:1: ( RULE_SEPARATORS )?
            {
             before(grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:806:1: ( RULE_SEPARATORS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SEPARATORS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:806:3: RULE_SEPARATORS
                    {
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Step__Group_2__1__Impl1633); 

                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Step__Group_2__1__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:820:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:824:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:825:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_rule__Comment__Group__0__Impl_in_rule__Comment__Group__01668);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comment__Group__1_in_rule__Comment__Group__01671);
            rule__Comment__Group__1();

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
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:832:1: rule__Comment__Group__0__Impl : ( ( ( rule__Comment__TextAssignment_0 ) ) ( ( rule__Comment__TextAssignment_0 )* ) ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:836:1: ( ( ( ( rule__Comment__TextAssignment_0 ) ) ( ( rule__Comment__TextAssignment_0 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:837:1: ( ( ( rule__Comment__TextAssignment_0 ) ) ( ( rule__Comment__TextAssignment_0 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:837:1: ( ( ( rule__Comment__TextAssignment_0 ) ) ( ( rule__Comment__TextAssignment_0 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:838:1: ( ( rule__Comment__TextAssignment_0 ) ) ( ( rule__Comment__TextAssignment_0 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:838:1: ( ( rule__Comment__TextAssignment_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:839:1: ( rule__Comment__TextAssignment_0 )
            {
             before(grammarAccess.getCommentAccess().getTextAssignment_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:840:1: ( rule__Comment__TextAssignment_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:840:2: rule__Comment__TextAssignment_0
            {
            pushFollow(FOLLOW_rule__Comment__TextAssignment_0_in_rule__Comment__Group__0__Impl1700);
            rule__Comment__TextAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getTextAssignment_0()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:843:1: ( ( rule__Comment__TextAssignment_0 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:844:1: ( rule__Comment__TextAssignment_0 )*
            {
             before(grammarAccess.getCommentAccess().getTextAssignment_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:845:1: ( rule__Comment__TextAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_WORD && LA15_0<=RULE_STATIC_PARAM)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:845:2: rule__Comment__TextAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Comment__TextAssignment_0_in_rule__Comment__Group__0__Impl1712);
            	    rule__Comment__TextAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCommentAccess().getTextAssignment_0()); 

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
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:856:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:860:1: ( rule__Comment__Group__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:861:2: rule__Comment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comment__Group__1__Impl_in_rule__Comment__Group__11745);
            rule__Comment__Group__1__Impl();

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
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:867:1: rule__Comment__Group__1__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:871:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:872:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:872:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:873:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:873:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:874:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:875:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:875:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__1__Impl1775); 

            }

             after(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:878:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:879:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:880:1: ( RULE_SINGLE_NL )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SINGLE_NL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:880:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__1__Impl1788); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__Model__DefinitionsAssignment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:896:1: rule__Model__DefinitionsAssignment : ( ruleAbstractEntity ) ;
    public final void rule__Model__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:900:1: ( ( ruleAbstractEntity ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:901:1: ( ruleAbstractEntity )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:901:1: ( ruleAbstractEntity )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:902:1: ruleAbstractEntity
            {
             before(grammarAccess.getModelAccess().getDefinitionsAbstractEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_rule__Model__DefinitionsAssignment1830);
            ruleAbstractEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinitionsAbstractEntityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DefinitionsAssignment"


    // $ANTLR start "rule__Spec__NameAssignment_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:911:1: rule__Spec__NameAssignment_1 : ( ( rule__Spec__NameAlternatives_1_0 ) ) ;
    public final void rule__Spec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:915:1: ( ( ( rule__Spec__NameAlternatives_1_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:916:1: ( ( rule__Spec__NameAlternatives_1_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:916:1: ( ( rule__Spec__NameAlternatives_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:917:1: ( rule__Spec__NameAlternatives_1_0 )
            {
             before(grammarAccess.getSpecAccess().getNameAlternatives_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:918:1: ( rule__Spec__NameAlternatives_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:918:2: rule__Spec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Spec__NameAlternatives_1_0_in_rule__Spec__NameAssignment_11861);
            rule__Spec__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__Spec__NameAssignment_1"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:927:1: rule__Scenario__NameAssignment_1 : ( ( rule__Scenario__NameAlternatives_1_0 ) ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:931:1: ( ( ( rule__Scenario__NameAlternatives_1_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:932:1: ( ( rule__Scenario__NameAlternatives_1_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:932:1: ( ( rule__Scenario__NameAlternatives_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:933:1: ( rule__Scenario__NameAlternatives_1_0 )
            {
             before(grammarAccess.getScenarioAccess().getNameAlternatives_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:934:1: ( rule__Scenario__NameAlternatives_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:934:2: rule__Scenario__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Scenario__NameAlternatives_1_0_in_rule__Scenario__NameAssignment_11894);
            rule__Scenario__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Step__ParamsAssignment_2_0_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:943:1: rule__Step__ParamsAssignment_2_0_0 : ( ruleStaticParam ) ;
    public final void rule__Step__ParamsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:947:1: ( ( ruleStaticParam ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:948:1: ( ruleStaticParam )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:948:1: ( ruleStaticParam )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:949:1: ruleStaticParam
            {
             before(grammarAccess.getStepAccess().getParamsStaticParamParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleStaticParam_in_rule__Step__ParamsAssignment_2_0_01927);
            ruleStaticParam();

            state._fsp--;

             after(grammarAccess.getStepAccess().getParamsStaticParamParserRuleCall_2_0_0_0()); 

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
    // $ANTLR end "rule__Step__ParamsAssignment_2_0_0"


    // $ANTLR start "rule__Comment__TextAssignment_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:958:1: rule__Comment__TextAssignment_0 : ( ( rule__Comment__TextAlternatives_0_0 ) ) ;
    public final void rule__Comment__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:962:1: ( ( ( rule__Comment__TextAlternatives_0_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:963:1: ( ( rule__Comment__TextAlternatives_0_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:963:1: ( ( rule__Comment__TextAlternatives_0_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:964:1: ( rule__Comment__TextAlternatives_0_0 )
            {
             before(grammarAccess.getCommentAccess().getTextAlternatives_0_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:965:1: ( rule__Comment__TextAlternatives_0_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:965:2: rule__Comment__TextAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Comment__TextAlternatives_0_0_in_rule__Comment__TextAssignment_01958);
            rule__Comment__TextAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getTextAlternatives_0_0()); 

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
    // $ANTLR end "rule__Comment__TextAssignment_0"


    // $ANTLR start "rule__StaticParam__ValueAssignment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:974:1: rule__StaticParam__ValueAssignment : ( RULE_STATIC_PARAM ) ;
    public final void rule__StaticParam__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:978:1: ( ( RULE_STATIC_PARAM ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:979:1: ( RULE_STATIC_PARAM )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:979:1: ( RULE_STATIC_PARAM )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:980:1: RULE_STATIC_PARAM
            {
             before(grammarAccess.getStaticParamAccess().getValueSTATIC_PARAMTerminalRuleCall_0()); 
            match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_rule__StaticParam__ValueAssignment1991); 
             after(grammarAccess.getStaticParamAccess().getValueSTATIC_PARAMTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StaticParam__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefinitionsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000772L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractEntity__Alternatives_in_ruleAbstractEntity155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0_in_ruleSpec215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__0_in_ruleComment395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticParam__ValueAssignment_in_ruleStaticParam455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractEntity__Alternatives_0_in_rule__AbstractEntity__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__AbstractEntity__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_rule__AbstractEntity__Alternatives_0541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__AbstractEntity__Alternatives_0558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__AbstractEntity__Alternatives_0575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Spec__NameAlternatives_1_0607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Spec__NameAlternatives_1_0624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Scenario__NameAlternatives_1_0656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Scenario__NameAlternatives_1_0673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__ParamsAssignment_2_0_0_in_rule__Step__Alternatives_2_0705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Step__Alternatives_2_0723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Comment__TextAlternatives_0_0755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Comment__TextAlternatives_0_0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_rule__Comment__TextAlternatives_0_0789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__0__Impl_in_rule__Spec__Group__0819 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Spec__Group__1_in_rule__Spec__Group__0822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Spec__Group__0__Impl850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group__1__Impl_in_rule__Spec__Group__1881 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Spec__Group__2_in_rule__Spec__Group__1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__NameAssignment_1_in_rule__Spec__Group__1__Impl913 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Spec__NameAssignment_1_in_rule__Spec__Group__1__Impl925 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Spec__Group__2__Impl_in_rule__Spec__Group__2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group__2__Impl988 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group__2__Impl1001 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01040 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Scenario__Group__0__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11102 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1134 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1146 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group__2__Impl1209 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group__2__Impl1222 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__01261 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__01264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__11322 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Step__Group__1__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__21384 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Step__Group__3_in_rule__Step__Group__21387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl1416 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl1428 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__31461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl1491 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl1504 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Step__Group_2__0__Impl_in_rule__Step__Group_2__01545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Step__Group_2__1_in_rule__Step__Group_2__01548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_2_0_in_rule__Step__Group_2__0__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_2__1__Impl_in_rule__Step__Group_2__11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Step__Group_2__1__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__0__Impl_in_rule__Comment__Group__01668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Comment__Group__1_in_rule__Comment__Group__01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAssignment_0_in_rule__Comment__Group__0__Impl1700 = new BitSet(new long[]{0x0000000000000770L});
    public static final BitSet FOLLOW_rule__Comment__TextAssignment_0_in_rule__Comment__Group__0__Impl1712 = new BitSet(new long[]{0x0000000000000772L});
    public static final BitSet FOLLOW_rule__Comment__Group__1__Impl_in_rule__Comment__Group__11745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__1__Impl1775 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__1__Impl1788 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_rule__Model__DefinitionsAssignment1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__NameAlternatives_1_0_in_rule__Spec__NameAssignment_11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAlternatives_1_0_in_rule__Scenario__NameAssignment_11894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticParam_in_rule__Step__ParamsAssignment_2_0_01927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAlternatives_0_0_in_rule__Comment__TextAssignment_01958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_rule__StaticParam__ValueAssignment1991 = new BitSet(new long[]{0x0000000000000002L});

}