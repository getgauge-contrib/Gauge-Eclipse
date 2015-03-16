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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_SEPARATORS", "RULE_STATIC_PARAM", "RULE_DYNAMIC_PARAM", "RULE_SINGLE_NL", "'-'", "'='", "'# '", "'## '", "'* '"
    };
    public static final int T__9=9;
    public static final int RULE_SINGLE_NL=8;
    public static final int RULE_STATIC_PARAM=6;
    public static final int RULE_WORD=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=5;
    public static final int RULE_DYNAMIC_PARAM=7;
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

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_DYNAMIC_PARAM)||(LA1_0>=11 && LA1_0<=13)) ) {
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:125:1: ruleSpec : ( ( rule__Spec__Alternatives ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:129:2: ( ( ( rule__Spec__Alternatives ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:130:1: ( ( rule__Spec__Alternatives ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:130:1: ( ( rule__Spec__Alternatives ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:131:1: ( rule__Spec__Alternatives )
            {
             before(grammarAccess.getSpecAccess().getAlternatives()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:132:1: ( rule__Spec__Alternatives )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:132:2: rule__Spec__Alternatives
            {
            pushFollow(FOLLOW_rule__Spec__Alternatives_in_ruleSpec215);
            rule__Spec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getAlternatives()); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:153:1: ruleScenario : ( ( rule__Scenario__Alternatives ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:157:2: ( ( ( rule__Scenario__Alternatives ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:158:1: ( ( rule__Scenario__Alternatives ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:158:1: ( ( rule__Scenario__Alternatives ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:159:1: ( rule__Scenario__Alternatives )
            {
             before(grammarAccess.getScenarioAccess().getAlternatives()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:160:1: ( rule__Scenario__Alternatives )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:160:2: rule__Scenario__Alternatives
            {
            pushFollow(FOLLOW_rule__Scenario__Alternatives_in_ruleScenario275);
            rule__Scenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleStaticParam"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:200:1: entryRuleStaticParam : ruleStaticParam EOF ;
    public final void entryRuleStaticParam() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:201:1: ( ruleStaticParam EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:202:1: ruleStaticParam EOF
            {
             before(grammarAccess.getStaticParamRule()); 
            pushFollow(FOLLOW_ruleStaticParam_in_entryRuleStaticParam362);
            ruleStaticParam();

            state._fsp--;

             after(grammarAccess.getStaticParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticParam369); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:209:1: ruleStaticParam : ( ( rule__StaticParam__NameAssignment ) ) ;
    public final void ruleStaticParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:213:2: ( ( ( rule__StaticParam__NameAssignment ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:214:1: ( ( rule__StaticParam__NameAssignment ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:214:1: ( ( rule__StaticParam__NameAssignment ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:215:1: ( rule__StaticParam__NameAssignment )
            {
             before(grammarAccess.getStaticParamAccess().getNameAssignment()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:216:1: ( rule__StaticParam__NameAssignment )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:216:2: rule__StaticParam__NameAssignment
            {
            pushFollow(FOLLOW_rule__StaticParam__NameAssignment_in_ruleStaticParam395);
            rule__StaticParam__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStaticParamAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleDynamicParam"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:228:1: entryRuleDynamicParam : ruleDynamicParam EOF ;
    public final void entryRuleDynamicParam() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:229:1: ( ruleDynamicParam EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:230:1: ruleDynamicParam EOF
            {
             before(grammarAccess.getDynamicParamRule()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam422);
            ruleDynamicParam();

            state._fsp--;

             after(grammarAccess.getDynamicParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicParam429); 

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
    // $ANTLR end "entryRuleDynamicParam"


    // $ANTLR start "ruleDynamicParam"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:237:1: ruleDynamicParam : ( ( rule__DynamicParam__NameAssignment ) ) ;
    public final void ruleDynamicParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:241:2: ( ( ( rule__DynamicParam__NameAssignment ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:242:1: ( ( rule__DynamicParam__NameAssignment ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:242:1: ( ( rule__DynamicParam__NameAssignment ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:243:1: ( rule__DynamicParam__NameAssignment )
            {
             before(grammarAccess.getDynamicParamAccess().getNameAssignment()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:244:1: ( rule__DynamicParam__NameAssignment )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:244:2: rule__DynamicParam__NameAssignment
            {
            pushFollow(FOLLOW_rule__DynamicParam__NameAssignment_in_ruleDynamicParam455);
            rule__DynamicParam__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDynamicParamAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDynamicParam"


    // $ANTLR start "entryRuleComment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:256:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:257:1: ( ruleComment EOF )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:258:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment482);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment489); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:265:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:269:2: ( ( ( rule__Comment__Group__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:270:1: ( ( rule__Comment__Group__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:270:1: ( ( rule__Comment__Group__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:271:1: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:272:1: ( rule__Comment__Group__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:272:2: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_rule__Comment__Group__0_in_ruleComment515);
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


    // $ANTLR start "rule__AbstractEntity__Alternatives"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:284:1: rule__AbstractEntity__Alternatives : ( ( ruleSpec ) | ( ruleScenario ) | ( ruleStep ) | ( ruleComment ) );
    public final void rule__AbstractEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:288:1: ( ( ruleSpec ) | ( ruleScenario ) | ( ruleStep ) | ( ruleComment ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:289:1: ( ruleSpec )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:289:1: ( ruleSpec )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:290:1: ruleSpec
                    {
                     before(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSpec_in_rule__AbstractEntity__Alternatives551);
                    ruleSpec();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:295:6: ( ruleScenario )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:295:6: ( ruleScenario )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:296:1: ruleScenario
                    {
                     before(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__AbstractEntity__Alternatives568);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:301:6: ( ruleStep )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:301:6: ( ruleStep )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:302:1: ruleStep
                    {
                     before(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStep_in_rule__AbstractEntity__Alternatives585);
                    ruleStep();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:307:6: ( ruleComment )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:307:6: ( ruleComment )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:308:1: ruleComment
                    {
                     before(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__AbstractEntity__Alternatives602);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getCommentParserRuleCall_3()); 

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


    // $ANTLR start "rule__Spec__Alternatives"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:318:1: rule__Spec__Alternatives : ( ( ( rule__Spec__Group_0__0 ) ) | ( ( rule__Spec__Group_1__0 ) ) );
    public final void rule__Spec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:322:1: ( ( ( rule__Spec__Group_0__0 ) ) | ( ( rule__Spec__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_SEPARATORS)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:323:1: ( ( rule__Spec__Group_0__0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:323:1: ( ( rule__Spec__Group_0__0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:324:1: ( rule__Spec__Group_0__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_0()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:325:1: ( rule__Spec__Group_0__0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:325:2: rule__Spec__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Spec__Group_0__0_in_rule__Spec__Alternatives634);
                    rule__Spec__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:329:6: ( ( rule__Spec__Group_1__0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:329:6: ( ( rule__Spec__Group_1__0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:330:1: ( rule__Spec__Group_1__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_1()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:331:1: ( rule__Spec__Group_1__0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:331:2: rule__Spec__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Spec__Group_1__0_in_rule__Spec__Alternatives652);
                    rule__Spec__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Spec__Alternatives"


    // $ANTLR start "rule__Spec__NameAlternatives_0_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:340:1: rule__Spec__NameAlternatives_0_1_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) );
    public final void rule__Spec__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:344:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) )
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
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:345:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:345:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:346:1: RULE_WORD
                    {
                     before(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Spec__NameAlternatives_0_1_0685); 
                     after(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:351:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:351:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:352:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Spec__NameAlternatives_0_1_0702); 
                     after(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__Spec__NameAlternatives_0_1_0"


    // $ANTLR start "rule__Spec__NameAlternatives_1_0_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:362:1: rule__Spec__NameAlternatives_1_0_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) );
    public final void rule__Spec__NameAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:366:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) )
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
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:367:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:367:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:368:1: RULE_WORD
                    {
                     before(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Spec__NameAlternatives_1_0_0734); 
                     after(grammarAccess.getSpecAccess().getNameWORDTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:373:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:373:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:374:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Spec__NameAlternatives_1_0_0751); 
                     after(grammarAccess.getSpecAccess().getNameSEPARATORSTerminalRuleCall_1_0_0_1()); 

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
    // $ANTLR end "rule__Spec__NameAlternatives_1_0_0"


    // $ANTLR start "rule__Scenario__Alternatives"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:384:1: rule__Scenario__Alternatives : ( ( ( rule__Scenario__Group_0__0 ) ) | ( ( rule__Scenario__Group_1__0 ) ) );
    public final void rule__Scenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:388:1: ( ( ( rule__Scenario__Group_0__0 ) ) | ( ( rule__Scenario__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_WORD && LA6_0<=RULE_SEPARATORS)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:389:1: ( ( rule__Scenario__Group_0__0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:389:1: ( ( rule__Scenario__Group_0__0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:390:1: ( rule__Scenario__Group_0__0 )
                    {
                     before(grammarAccess.getScenarioAccess().getGroup_0()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:391:1: ( rule__Scenario__Group_0__0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:391:2: rule__Scenario__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Scenario__Group_0__0_in_rule__Scenario__Alternatives783);
                    rule__Scenario__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:395:6: ( ( rule__Scenario__Group_1__0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:395:6: ( ( rule__Scenario__Group_1__0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:396:1: ( rule__Scenario__Group_1__0 )
                    {
                     before(grammarAccess.getScenarioAccess().getGroup_1()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:397:1: ( rule__Scenario__Group_1__0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:397:2: rule__Scenario__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Scenario__Group_1__0_in_rule__Scenario__Alternatives801);
                    rule__Scenario__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Scenario__Alternatives"


    // $ANTLR start "rule__Scenario__NameAlternatives_0_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:406:1: rule__Scenario__NameAlternatives_0_1_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) );
    public final void rule__Scenario__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:410:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) )
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
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:411:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:411:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:412:1: RULE_WORD
                    {
                     before(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Scenario__NameAlternatives_0_1_0834); 
                     after(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:417:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:417:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:418:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Scenario__NameAlternatives_0_1_0851); 
                     after(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__Scenario__NameAlternatives_0_1_0"


    // $ANTLR start "rule__Scenario__NameAlternatives_1_0_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:428:1: rule__Scenario__NameAlternatives_1_0_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) );
    public final void rule__Scenario__NameAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:432:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_WORD) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SEPARATORS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:433:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:433:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:434:1: RULE_WORD
                    {
                     before(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Scenario__NameAlternatives_1_0_0883); 
                     after(grammarAccess.getScenarioAccess().getNameWORDTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:439:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:439:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:440:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Scenario__NameAlternatives_1_0_0900); 
                     after(grammarAccess.getScenarioAccess().getNameSEPARATORSTerminalRuleCall_1_0_0_1()); 

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
    // $ANTLR end "rule__Scenario__NameAlternatives_1_0_0"


    // $ANTLR start "rule__Step__Alternatives_2_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:450:1: rule__Step__Alternatives_2_0 : ( ( ( rule__Step__StaticParamsAssignment_2_0_0 ) ) | ( ( rule__Step__DynamicParamsAssignment_2_0_1 ) ) | ( RULE_WORD ) | ( '-' ) | ( '=' ) );
    public final void rule__Step__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:454:1: ( ( ( rule__Step__StaticParamsAssignment_2_0_0 ) ) | ( ( rule__Step__DynamicParamsAssignment_2_0_1 ) ) | ( RULE_WORD ) | ( '-' ) | ( '=' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_STATIC_PARAM:
                {
                alt9=1;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt9=2;
                }
                break;
            case RULE_WORD:
                {
                alt9=3;
                }
                break;
            case 9:
                {
                alt9=4;
                }
                break;
            case 10:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:455:1: ( ( rule__Step__StaticParamsAssignment_2_0_0 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:455:1: ( ( rule__Step__StaticParamsAssignment_2_0_0 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:456:1: ( rule__Step__StaticParamsAssignment_2_0_0 )
                    {
                     before(grammarAccess.getStepAccess().getStaticParamsAssignment_2_0_0()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:457:1: ( rule__Step__StaticParamsAssignment_2_0_0 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:457:2: rule__Step__StaticParamsAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__Step__StaticParamsAssignment_2_0_0_in_rule__Step__Alternatives_2_0932);
                    rule__Step__StaticParamsAssignment_2_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getStaticParamsAssignment_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:461:6: ( ( rule__Step__DynamicParamsAssignment_2_0_1 ) )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:461:6: ( ( rule__Step__DynamicParamsAssignment_2_0_1 ) )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:462:1: ( rule__Step__DynamicParamsAssignment_2_0_1 )
                    {
                     before(grammarAccess.getStepAccess().getDynamicParamsAssignment_2_0_1()); 
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:463:1: ( rule__Step__DynamicParamsAssignment_2_0_1 )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:463:2: rule__Step__DynamicParamsAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__Step__DynamicParamsAssignment_2_0_1_in_rule__Step__Alternatives_2_0950);
                    rule__Step__DynamicParamsAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getDynamicParamsAssignment_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:467:6: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:467:6: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:468:1: RULE_WORD
                    {
                     before(grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Step__Alternatives_2_0968); 
                     after(grammarAccess.getStepAccess().getWORDTerminalRuleCall_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:473:6: ( '-' )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:473:6: ( '-' )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:474:1: '-'
                    {
                     before(grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3()); 
                    match(input,9,FOLLOW_9_in_rule__Step__Alternatives_2_0986); 
                     after(grammarAccess.getStepAccess().getHyphenMinusKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:481:6: ( '=' )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:481:6: ( '=' )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:482:1: '='
                    {
                     before(grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4()); 
                    match(input,10,FOLLOW_10_in_rule__Step__Alternatives_2_01006); 
                     after(grammarAccess.getStepAccess().getEqualsSignKeyword_2_0_4()); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:494:1: rule__Comment__TextAlternatives_0_0 : ( ( RULE_WORD ) | ( RULE_STATIC_PARAM ) | ( RULE_DYNAMIC_PARAM ) );
    public final void rule__Comment__TextAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:498:1: ( ( RULE_WORD ) | ( RULE_STATIC_PARAM ) | ( RULE_DYNAMIC_PARAM ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt10=1;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt10=2;
                }
                break;
            case RULE_DYNAMIC_PARAM:
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
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:499:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:499:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:500:1: RULE_WORD
                    {
                     before(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Comment__TextAlternatives_0_01040); 
                     after(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:505:6: ( RULE_STATIC_PARAM )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:505:6: ( RULE_STATIC_PARAM )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:506:1: RULE_STATIC_PARAM
                    {
                     before(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_rule__Comment__TextAlternatives_0_01057); 
                     after(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:511:6: ( RULE_DYNAMIC_PARAM )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:511:6: ( RULE_DYNAMIC_PARAM )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:512:1: RULE_DYNAMIC_PARAM
                    {
                     before(grammarAccess.getCommentAccess().getTextDYNAMIC_PARAMTerminalRuleCall_0_0_2()); 
                    match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_rule__Comment__TextAlternatives_0_01074); 
                     after(grammarAccess.getCommentAccess().getTextDYNAMIC_PARAMTerminalRuleCall_0_0_2()); 

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


    // $ANTLR start "rule__Comment__TextAlternatives_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:522:1: rule__Comment__TextAlternatives_1_0 : ( ( RULE_WORD ) | ( RULE_SEPARATORS ) | ( RULE_STATIC_PARAM ) | ( RULE_DYNAMIC_PARAM ) | ( '-' ) | ( '=' ) );
    public final void rule__Comment__TextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:526:1: ( ( RULE_WORD ) | ( RULE_SEPARATORS ) | ( RULE_STATIC_PARAM ) | ( RULE_DYNAMIC_PARAM ) | ( '-' ) | ( '=' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt11=1;
                }
                break;
            case RULE_SEPARATORS:
                {
                alt11=2;
                }
                break;
            case RULE_STATIC_PARAM:
                {
                alt11=3;
                }
                break;
            case RULE_DYNAMIC_PARAM:
                {
                alt11=4;
                }
                break;
            case 9:
                {
                alt11=5;
                }
                break;
            case 10:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:527:1: ( RULE_WORD )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:527:1: ( RULE_WORD )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:528:1: RULE_WORD
                    {
                     before(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Comment__TextAlternatives_1_01106); 
                     after(grammarAccess.getCommentAccess().getTextWORDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:533:6: ( RULE_SEPARATORS )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:533:6: ( RULE_SEPARATORS )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:534:1: RULE_SEPARATORS
                    {
                     before(grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Comment__TextAlternatives_1_01123); 
                     after(grammarAccess.getCommentAccess().getTextSEPARATORSTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:539:6: ( RULE_STATIC_PARAM )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:539:6: ( RULE_STATIC_PARAM )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:540:1: RULE_STATIC_PARAM
                    {
                     before(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_1_0_2()); 
                    match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_rule__Comment__TextAlternatives_1_01140); 
                     after(grammarAccess.getCommentAccess().getTextSTATIC_PARAMTerminalRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:545:6: ( RULE_DYNAMIC_PARAM )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:545:6: ( RULE_DYNAMIC_PARAM )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:546:1: RULE_DYNAMIC_PARAM
                    {
                     before(grammarAccess.getCommentAccess().getTextDYNAMIC_PARAMTerminalRuleCall_1_0_3()); 
                    match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_rule__Comment__TextAlternatives_1_01157); 
                     after(grammarAccess.getCommentAccess().getTextDYNAMIC_PARAMTerminalRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:551:6: ( '-' )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:551:6: ( '-' )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:552:1: '-'
                    {
                     before(grammarAccess.getCommentAccess().getTextHyphenMinusKeyword_1_0_4()); 
                    match(input,9,FOLLOW_9_in_rule__Comment__TextAlternatives_1_01175); 
                     after(grammarAccess.getCommentAccess().getTextHyphenMinusKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:559:6: ( '=' )
                    {
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:559:6: ( '=' )
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:560:1: '='
                    {
                     before(grammarAccess.getCommentAccess().getTextEqualsSignKeyword_1_0_5()); 
                    match(input,10,FOLLOW_10_in_rule__Comment__TextAlternatives_1_01195); 
                     after(grammarAccess.getCommentAccess().getTextEqualsSignKeyword_1_0_5()); 

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
    // $ANTLR end "rule__Comment__TextAlternatives_1_0"


    // $ANTLR start "rule__Spec__Group_0__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:574:1: rule__Spec__Group_0__0 : rule__Spec__Group_0__0__Impl rule__Spec__Group_0__1 ;
    public final void rule__Spec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:578:1: ( rule__Spec__Group_0__0__Impl rule__Spec__Group_0__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:579:2: rule__Spec__Group_0__0__Impl rule__Spec__Group_0__1
            {
            pushFollow(FOLLOW_rule__Spec__Group_0__0__Impl_in_rule__Spec__Group_0__01227);
            rule__Spec__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group_0__1_in_rule__Spec__Group_0__01230);
            rule__Spec__Group_0__1();

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
    // $ANTLR end "rule__Spec__Group_0__0"


    // $ANTLR start "rule__Spec__Group_0__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:586:1: rule__Spec__Group_0__0__Impl : ( '# ' ) ;
    public final void rule__Spec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:590:1: ( ( '# ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:591:1: ( '# ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:591:1: ( '# ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:592:1: '# '
            {
             before(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Spec__Group_0__0__Impl1258); 
             after(grammarAccess.getSpecAccess().getNumberSignSpaceKeyword_0_0()); 

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
    // $ANTLR end "rule__Spec__Group_0__0__Impl"


    // $ANTLR start "rule__Spec__Group_0__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:605:1: rule__Spec__Group_0__1 : rule__Spec__Group_0__1__Impl rule__Spec__Group_0__2 ;
    public final void rule__Spec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:609:1: ( rule__Spec__Group_0__1__Impl rule__Spec__Group_0__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:610:2: rule__Spec__Group_0__1__Impl rule__Spec__Group_0__2
            {
            pushFollow(FOLLOW_rule__Spec__Group_0__1__Impl_in_rule__Spec__Group_0__11289);
            rule__Spec__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group_0__2_in_rule__Spec__Group_0__11292);
            rule__Spec__Group_0__2();

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
    // $ANTLR end "rule__Spec__Group_0__1"


    // $ANTLR start "rule__Spec__Group_0__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:617:1: rule__Spec__Group_0__1__Impl : ( ( ( rule__Spec__NameAssignment_0_1 ) ) ( ( rule__Spec__NameAssignment_0_1 )* ) ) ;
    public final void rule__Spec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:621:1: ( ( ( ( rule__Spec__NameAssignment_0_1 ) ) ( ( rule__Spec__NameAssignment_0_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:622:1: ( ( ( rule__Spec__NameAssignment_0_1 ) ) ( ( rule__Spec__NameAssignment_0_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:622:1: ( ( ( rule__Spec__NameAssignment_0_1 ) ) ( ( rule__Spec__NameAssignment_0_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:623:1: ( ( rule__Spec__NameAssignment_0_1 ) ) ( ( rule__Spec__NameAssignment_0_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:623:1: ( ( rule__Spec__NameAssignment_0_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:624:1: ( rule__Spec__NameAssignment_0_1 )
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_0_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:625:1: ( rule__Spec__NameAssignment_0_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:625:2: rule__Spec__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Spec__NameAssignment_0_1_in_rule__Spec__Group_0__1__Impl1321);
            rule__Spec__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAssignment_0_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:628:1: ( ( rule__Spec__NameAssignment_0_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:629:1: ( rule__Spec__NameAssignment_0_1 )*
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_0_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:630:1: ( rule__Spec__NameAssignment_0_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_WORD && LA12_0<=RULE_SEPARATORS)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:630:2: rule__Spec__NameAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Spec__NameAssignment_0_1_in_rule__Spec__Group_0__1__Impl1333);
            	    rule__Spec__NameAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Spec__Group_0__1__Impl"


    // $ANTLR start "rule__Spec__Group_0__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:641:1: rule__Spec__Group_0__2 : rule__Spec__Group_0__2__Impl ;
    public final void rule__Spec__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:645:1: ( rule__Spec__Group_0__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:646:2: rule__Spec__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group_0__2__Impl_in_rule__Spec__Group_0__21366);
            rule__Spec__Group_0__2__Impl();

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
    // $ANTLR end "rule__Spec__Group_0__2"


    // $ANTLR start "rule__Spec__Group_0__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:652:1: rule__Spec__Group_0__2__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Spec__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:656:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:657:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:657:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:658:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:658:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:659:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:660:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:660:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_0__2__Impl1396); 

            }

             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:663:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:664:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:665:1: ( RULE_SINGLE_NL )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SINGLE_NL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:665:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_0__2__Impl1409); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Spec__Group_0__2__Impl"


    // $ANTLR start "rule__Spec__Group_1__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:682:1: rule__Spec__Group_1__0 : rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1 ;
    public final void rule__Spec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:686:1: ( rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:687:2: rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1
            {
            pushFollow(FOLLOW_rule__Spec__Group_1__0__Impl_in_rule__Spec__Group_1__01448);
            rule__Spec__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group_1__1_in_rule__Spec__Group_1__01451);
            rule__Spec__Group_1__1();

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
    // $ANTLR end "rule__Spec__Group_1__0"


    // $ANTLR start "rule__Spec__Group_1__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:694:1: rule__Spec__Group_1__0__Impl : ( ( ( rule__Spec__NameAssignment_1_0 ) ) ( ( rule__Spec__NameAssignment_1_0 )* ) ) ;
    public final void rule__Spec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:698:1: ( ( ( ( rule__Spec__NameAssignment_1_0 ) ) ( ( rule__Spec__NameAssignment_1_0 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:699:1: ( ( ( rule__Spec__NameAssignment_1_0 ) ) ( ( rule__Spec__NameAssignment_1_0 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:699:1: ( ( ( rule__Spec__NameAssignment_1_0 ) ) ( ( rule__Spec__NameAssignment_1_0 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:700:1: ( ( rule__Spec__NameAssignment_1_0 ) ) ( ( rule__Spec__NameAssignment_1_0 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:700:1: ( ( rule__Spec__NameAssignment_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:701:1: ( rule__Spec__NameAssignment_1_0 )
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:702:1: ( rule__Spec__NameAssignment_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:702:2: rule__Spec__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Spec__NameAssignment_1_0_in_rule__Spec__Group_1__0__Impl1480);
            rule__Spec__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAssignment_1_0()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:705:1: ( ( rule__Spec__NameAssignment_1_0 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:706:1: ( rule__Spec__NameAssignment_1_0 )*
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:707:1: ( rule__Spec__NameAssignment_1_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_WORD && LA14_0<=RULE_SEPARATORS)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:707:2: rule__Spec__NameAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_rule__Spec__NameAssignment_1_0_in_rule__Spec__Group_1__0__Impl1492);
            	    rule__Spec__NameAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Spec__Group_1__0__Impl"


    // $ANTLR start "rule__Spec__Group_1__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:718:1: rule__Spec__Group_1__1 : rule__Spec__Group_1__1__Impl rule__Spec__Group_1__2 ;
    public final void rule__Spec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:722:1: ( rule__Spec__Group_1__1__Impl rule__Spec__Group_1__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:723:2: rule__Spec__Group_1__1__Impl rule__Spec__Group_1__2
            {
            pushFollow(FOLLOW_rule__Spec__Group_1__1__Impl_in_rule__Spec__Group_1__11525);
            rule__Spec__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group_1__2_in_rule__Spec__Group_1__11528);
            rule__Spec__Group_1__2();

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
    // $ANTLR end "rule__Spec__Group_1__1"


    // $ANTLR start "rule__Spec__Group_1__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:730:1: rule__Spec__Group_1__1__Impl : ( RULE_SINGLE_NL ) ;
    public final void rule__Spec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:734:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:735:1: ( RULE_SINGLE_NL )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:735:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:736:1: RULE_SINGLE_NL
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_1__1__Impl1555); 
             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Spec__Group_1__1__Impl"


    // $ANTLR start "rule__Spec__Group_1__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:747:1: rule__Spec__Group_1__2 : rule__Spec__Group_1__2__Impl ;
    public final void rule__Spec__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:751:1: ( rule__Spec__Group_1__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:752:2: rule__Spec__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group_1__2__Impl_in_rule__Spec__Group_1__21584);
            rule__Spec__Group_1__2__Impl();

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
    // $ANTLR end "rule__Spec__Group_1__2"


    // $ANTLR start "rule__Spec__Group_1__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:758:1: rule__Spec__Group_1__2__Impl : ( ( rule__Spec__Group_1_2__0 ) ) ;
    public final void rule__Spec__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:762:1: ( ( ( rule__Spec__Group_1_2__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:763:1: ( ( rule__Spec__Group_1_2__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:763:1: ( ( rule__Spec__Group_1_2__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:764:1: ( rule__Spec__Group_1_2__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup_1_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:765:1: ( rule__Spec__Group_1_2__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:765:2: rule__Spec__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__Spec__Group_1_2__0_in_rule__Spec__Group_1__2__Impl1611);
            rule__Spec__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Spec__Group_1__2__Impl"


    // $ANTLR start "rule__Spec__Group_1_2__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:781:1: rule__Spec__Group_1_2__0 : rule__Spec__Group_1_2__0__Impl rule__Spec__Group_1_2__1 ;
    public final void rule__Spec__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:785:1: ( rule__Spec__Group_1_2__0__Impl rule__Spec__Group_1_2__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:786:2: rule__Spec__Group_1_2__0__Impl rule__Spec__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Spec__Group_1_2__0__Impl_in_rule__Spec__Group_1_2__01647);
            rule__Spec__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spec__Group_1_2__1_in_rule__Spec__Group_1_2__01650);
            rule__Spec__Group_1_2__1();

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
    // $ANTLR end "rule__Spec__Group_1_2__0"


    // $ANTLR start "rule__Spec__Group_1_2__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:793:1: rule__Spec__Group_1_2__0__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__Spec__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:797:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:798:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:798:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:799:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:799:1: ( ( '=' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:800:1: ( '=' )
            {
             before(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:801:1: ( '=' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:802:2: '='
            {
            match(input,10,FOLLOW_10_in_rule__Spec__Group_1_2__0__Impl1681); 

            }

             after(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2_0()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:806:1: ( ( '=' )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:807:1: ( '=' )*
            {
             before(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:808:1: ( '=' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==10) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:809:2: '='
            	    {
            	    match(input,10,FOLLOW_10_in_rule__Spec__Group_1_2__0__Impl1697); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Spec__Group_1_2__0__Impl"


    // $ANTLR start "rule__Spec__Group_1_2__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:821:1: rule__Spec__Group_1_2__1 : rule__Spec__Group_1_2__1__Impl ;
    public final void rule__Spec__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:825:1: ( rule__Spec__Group_1_2__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:826:2: rule__Spec__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Spec__Group_1_2__1__Impl_in_rule__Spec__Group_1_2__11732);
            rule__Spec__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Spec__Group_1_2__1"


    // $ANTLR start "rule__Spec__Group_1_2__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:832:1: rule__Spec__Group_1_2__1__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Spec__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:836:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:837:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:837:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:838:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:838:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:839:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:840:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:840:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_1_2__1__Impl1762); 

            }

             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:843:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:844:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:845:1: ( RULE_SINGLE_NL )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SINGLE_NL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:845:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_1_2__1__Impl1775); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 

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
    // $ANTLR end "rule__Spec__Group_1_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group_0__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:860:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:864:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:865:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group_0__0__Impl_in_rule__Scenario__Group_0__01812);
            rule__Scenario__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group_0__1_in_rule__Scenario__Group_0__01815);
            rule__Scenario__Group_0__1();

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
    // $ANTLR end "rule__Scenario__Group_0__0"


    // $ANTLR start "rule__Scenario__Group_0__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:872:1: rule__Scenario__Group_0__0__Impl : ( '## ' ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:876:1: ( ( '## ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:877:1: ( '## ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:877:1: ( '## ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:878:1: '## '
            {
             before(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0()); 
            match(input,12,FOLLOW_12_in_rule__Scenario__Group_0__0__Impl1843); 
             after(grammarAccess.getScenarioAccess().getNumberSignNumberSignSpaceKeyword_0_0()); 

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
    // $ANTLR end "rule__Scenario__Group_0__0__Impl"


    // $ANTLR start "rule__Scenario__Group_0__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:891:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl rule__Scenario__Group_0__2 ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:895:1: ( rule__Scenario__Group_0__1__Impl rule__Scenario__Group_0__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:896:2: rule__Scenario__Group_0__1__Impl rule__Scenario__Group_0__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group_0__1__Impl_in_rule__Scenario__Group_0__11874);
            rule__Scenario__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group_0__2_in_rule__Scenario__Group_0__11877);
            rule__Scenario__Group_0__2();

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
    // $ANTLR end "rule__Scenario__Group_0__1"


    // $ANTLR start "rule__Scenario__Group_0__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:903:1: rule__Scenario__Group_0__1__Impl : ( ( ( rule__Scenario__NameAssignment_0_1 ) ) ( ( rule__Scenario__NameAssignment_0_1 )* ) ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:907:1: ( ( ( ( rule__Scenario__NameAssignment_0_1 ) ) ( ( rule__Scenario__NameAssignment_0_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:908:1: ( ( ( rule__Scenario__NameAssignment_0_1 ) ) ( ( rule__Scenario__NameAssignment_0_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:908:1: ( ( ( rule__Scenario__NameAssignment_0_1 ) ) ( ( rule__Scenario__NameAssignment_0_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:909:1: ( ( rule__Scenario__NameAssignment_0_1 ) ) ( ( rule__Scenario__NameAssignment_0_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:909:1: ( ( rule__Scenario__NameAssignment_0_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:910:1: ( rule__Scenario__NameAssignment_0_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_0_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:911:1: ( rule__Scenario__NameAssignment_0_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:911:2: rule__Scenario__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_0_1_in_rule__Scenario__Group_0__1__Impl1906);
            rule__Scenario__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_0_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:914:1: ( ( rule__Scenario__NameAssignment_0_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:915:1: ( rule__Scenario__NameAssignment_0_1 )*
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_0_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:916:1: ( rule__Scenario__NameAssignment_0_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_SEPARATORS)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:916:2: rule__Scenario__NameAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__NameAssignment_0_1_in_rule__Scenario__Group_0__1__Impl1918);
            	    rule__Scenario__NameAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Scenario__Group_0__1__Impl"


    // $ANTLR start "rule__Scenario__Group_0__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:927:1: rule__Scenario__Group_0__2 : rule__Scenario__Group_0__2__Impl ;
    public final void rule__Scenario__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:931:1: ( rule__Scenario__Group_0__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:932:2: rule__Scenario__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group_0__2__Impl_in_rule__Scenario__Group_0__21951);
            rule__Scenario__Group_0__2__Impl();

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
    // $ANTLR end "rule__Scenario__Group_0__2"


    // $ANTLR start "rule__Scenario__Group_0__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:938:1: rule__Scenario__Group_0__2__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Scenario__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:942:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:943:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:943:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:944:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:944:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:945:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:946:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:946:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_0__2__Impl1981); 

            }

             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:949:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:950:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:951:1: ( RULE_SINGLE_NL )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SINGLE_NL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:951:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_0__2__Impl1994); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Scenario__Group_0__2__Impl"


    // $ANTLR start "rule__Scenario__Group_1__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:968:1: rule__Scenario__Group_1__0 : rule__Scenario__Group_1__0__Impl rule__Scenario__Group_1__1 ;
    public final void rule__Scenario__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:972:1: ( rule__Scenario__Group_1__0__Impl rule__Scenario__Group_1__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:973:2: rule__Scenario__Group_1__0__Impl rule__Scenario__Group_1__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group_1__0__Impl_in_rule__Scenario__Group_1__02033);
            rule__Scenario__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group_1__1_in_rule__Scenario__Group_1__02036);
            rule__Scenario__Group_1__1();

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
    // $ANTLR end "rule__Scenario__Group_1__0"


    // $ANTLR start "rule__Scenario__Group_1__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:980:1: rule__Scenario__Group_1__0__Impl : ( ( ( rule__Scenario__NameAssignment_1_0 ) ) ( ( rule__Scenario__NameAssignment_1_0 )* ) ) ;
    public final void rule__Scenario__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:984:1: ( ( ( ( rule__Scenario__NameAssignment_1_0 ) ) ( ( rule__Scenario__NameAssignment_1_0 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:985:1: ( ( ( rule__Scenario__NameAssignment_1_0 ) ) ( ( rule__Scenario__NameAssignment_1_0 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:985:1: ( ( ( rule__Scenario__NameAssignment_1_0 ) ) ( ( rule__Scenario__NameAssignment_1_0 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:986:1: ( ( rule__Scenario__NameAssignment_1_0 ) ) ( ( rule__Scenario__NameAssignment_1_0 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:986:1: ( ( rule__Scenario__NameAssignment_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:987:1: ( rule__Scenario__NameAssignment_1_0 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:988:1: ( rule__Scenario__NameAssignment_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:988:2: rule__Scenario__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_0_in_rule__Scenario__Group_1__0__Impl2065);
            rule__Scenario__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1_0()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:991:1: ( ( rule__Scenario__NameAssignment_1_0 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:992:1: ( rule__Scenario__NameAssignment_1_0 )*
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:993:1: ( rule__Scenario__NameAssignment_1_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_WORD && LA19_0<=RULE_SEPARATORS)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:993:2: rule__Scenario__NameAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_0_in_rule__Scenario__Group_1__0__Impl2077);
            	    rule__Scenario__NameAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Scenario__Group_1__0__Impl"


    // $ANTLR start "rule__Scenario__Group_1__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1004:1: rule__Scenario__Group_1__1 : rule__Scenario__Group_1__1__Impl rule__Scenario__Group_1__2 ;
    public final void rule__Scenario__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1008:1: ( rule__Scenario__Group_1__1__Impl rule__Scenario__Group_1__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1009:2: rule__Scenario__Group_1__1__Impl rule__Scenario__Group_1__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group_1__1__Impl_in_rule__Scenario__Group_1__12110);
            rule__Scenario__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group_1__2_in_rule__Scenario__Group_1__12113);
            rule__Scenario__Group_1__2();

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
    // $ANTLR end "rule__Scenario__Group_1__1"


    // $ANTLR start "rule__Scenario__Group_1__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1016:1: rule__Scenario__Group_1__1__Impl : ( RULE_SINGLE_NL ) ;
    public final void rule__Scenario__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1020:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1021:1: ( RULE_SINGLE_NL )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1021:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1022:1: RULE_SINGLE_NL
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_1__1__Impl2140); 
             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Scenario__Group_1__1__Impl"


    // $ANTLR start "rule__Scenario__Group_1__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1033:1: rule__Scenario__Group_1__2 : rule__Scenario__Group_1__2__Impl ;
    public final void rule__Scenario__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1037:1: ( rule__Scenario__Group_1__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1038:2: rule__Scenario__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group_1__2__Impl_in_rule__Scenario__Group_1__22169);
            rule__Scenario__Group_1__2__Impl();

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
    // $ANTLR end "rule__Scenario__Group_1__2"


    // $ANTLR start "rule__Scenario__Group_1__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1044:1: rule__Scenario__Group_1__2__Impl : ( ( rule__Scenario__Group_1_2__0 ) ) ;
    public final void rule__Scenario__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1048:1: ( ( ( rule__Scenario__Group_1_2__0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1049:1: ( ( rule__Scenario__Group_1_2__0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1049:1: ( ( rule__Scenario__Group_1_2__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1050:1: ( rule__Scenario__Group_1_2__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup_1_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1051:1: ( rule__Scenario__Group_1_2__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1051:2: rule__Scenario__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group_1_2__0_in_rule__Scenario__Group_1__2__Impl2196);
            rule__Scenario__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Scenario__Group_1__2__Impl"


    // $ANTLR start "rule__Scenario__Group_1_2__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1067:1: rule__Scenario__Group_1_2__0 : rule__Scenario__Group_1_2__0__Impl rule__Scenario__Group_1_2__1 ;
    public final void rule__Scenario__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1071:1: ( rule__Scenario__Group_1_2__0__Impl rule__Scenario__Group_1_2__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1072:2: rule__Scenario__Group_1_2__0__Impl rule__Scenario__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group_1_2__0__Impl_in_rule__Scenario__Group_1_2__02232);
            rule__Scenario__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group_1_2__1_in_rule__Scenario__Group_1_2__02235);
            rule__Scenario__Group_1_2__1();

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
    // $ANTLR end "rule__Scenario__Group_1_2__0"


    // $ANTLR start "rule__Scenario__Group_1_2__0__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1079:1: rule__Scenario__Group_1_2__0__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__Scenario__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1083:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1084:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1084:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1085:1: ( ( '-' ) ) ( ( '-' )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1085:1: ( ( '-' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1086:1: ( '-' )
            {
             before(grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1087:1: ( '-' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1088:2: '-'
            {
            match(input,9,FOLLOW_9_in_rule__Scenario__Group_1_2__0__Impl2266); 

            }

             after(grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2_0()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1092:1: ( ( '-' )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1093:1: ( '-' )*
            {
             before(grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1094:1: ( '-' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==9) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1095:2: '-'
            	    {
            	    match(input,9,FOLLOW_9_in_rule__Scenario__Group_1_2__0__Impl2282); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getHyphenMinusKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Scenario__Group_1_2__0__Impl"


    // $ANTLR start "rule__Scenario__Group_1_2__1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1107:1: rule__Scenario__Group_1_2__1 : rule__Scenario__Group_1_2__1__Impl ;
    public final void rule__Scenario__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1111:1: ( rule__Scenario__Group_1_2__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1112:2: rule__Scenario__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group_1_2__1__Impl_in_rule__Scenario__Group_1_2__12317);
            rule__Scenario__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Scenario__Group_1_2__1"


    // $ANTLR start "rule__Scenario__Group_1_2__1__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1118:1: rule__Scenario__Group_1_2__1__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Scenario__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1122:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1123:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1123:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1124:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1124:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1125:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1126:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1126:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_1_2__1__Impl2347); 

            }

             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1129:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1130:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1131:1: ( RULE_SINGLE_NL )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_SINGLE_NL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1131:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_1_2__1__Impl2360); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getSINGLE_NLTerminalRuleCall_1_2_1()); 

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
    // $ANTLR end "rule__Scenario__Group_1_2__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1146:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1150:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1151:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__02397);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__02400);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1158:1: rule__Step__Group__0__Impl : ( () ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1162:1: ( ( () ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1163:1: ( () )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1163:1: ( () )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1164:1: ()
            {
             before(grammarAccess.getStepAccess().getStepAction_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1165:1: ()
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1167:1: 
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1177:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1181:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1182:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__12458);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__12461);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1189:1: rule__Step__Group__1__Impl : ( '* ' ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1193:1: ( ( '* ' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1194:1: ( '* ' )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1194:1: ( '* ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1195:1: '* '
            {
             before(grammarAccess.getStepAccess().getAsteriskSpaceKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Step__Group__1__Impl2489); 
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1208:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1212:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1213:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__22520);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__3_in_rule__Step__Group__22523);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1220:1: rule__Step__Group__2__Impl : ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1224:1: ( ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1225:1: ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1225:1: ( ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1226:1: ( ( rule__Step__Group_2__0 ) ) ( ( rule__Step__Group_2__0 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1226:1: ( ( rule__Step__Group_2__0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1227:1: ( rule__Step__Group_2__0 )
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1228:1: ( rule__Step__Group_2__0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1228:2: rule__Step__Group_2__0
            {
            pushFollow(FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl2552);
            rule__Step__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1231:1: ( ( rule__Step__Group_2__0 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1232:1: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1233:1: ( rule__Step__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WORD||(LA22_0>=RULE_STATIC_PARAM && LA22_0<=RULE_DYNAMIC_PARAM)||(LA22_0>=9 && LA22_0<=10)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1233:2: rule__Step__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl2564);
            	    rule__Step__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1244:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1248:1: ( rule__Step__Group__3__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1249:2: rule__Step__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__32597);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1255:1: rule__Step__Group__3__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1259:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1260:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1260:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1261:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1261:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1262:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1263:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1263:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl2627); 

            }

             after(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1266:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1267:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getStepAccess().getSINGLE_NLTerminalRuleCall_3()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1268:1: ( RULE_SINGLE_NL )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SINGLE_NL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1268:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl2640); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1287:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1291:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1292:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_rule__Step__Group_2__0__Impl_in_rule__Step__Group_2__02681);
            rule__Step__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_2__1_in_rule__Step__Group_2__02684);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1299:1: rule__Step__Group_2__0__Impl : ( ( rule__Step__Alternatives_2_0 ) ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1303:1: ( ( ( rule__Step__Alternatives_2_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1304:1: ( ( rule__Step__Alternatives_2_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1304:1: ( ( rule__Step__Alternatives_2_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1305:1: ( rule__Step__Alternatives_2_0 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_2_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1306:1: ( rule__Step__Alternatives_2_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1306:2: rule__Step__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_2_0_in_rule__Step__Group_2__0__Impl2711);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1316:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1320:1: ( rule__Step__Group_2__1__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1321:2: rule__Step__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_2__1__Impl_in_rule__Step__Group_2__12741);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1327:1: rule__Step__Group_2__1__Impl : ( ( RULE_SEPARATORS )* ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1331:1: ( ( ( RULE_SEPARATORS )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1332:1: ( ( RULE_SEPARATORS )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1332:1: ( ( RULE_SEPARATORS )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1333:1: ( RULE_SEPARATORS )*
            {
             before(grammarAccess.getStepAccess().getSEPARATORSTerminalRuleCall_2_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1334:1: ( RULE_SEPARATORS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_SEPARATORS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1334:3: RULE_SEPARATORS
            	    {
            	    match(input,RULE_SEPARATORS,FOLLOW_RULE_SEPARATORS_in_rule__Step__Group_2__1__Impl2769); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1348:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1352:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1353:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_rule__Comment__Group__0__Impl_in_rule__Comment__Group__02804);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comment__Group__1_in_rule__Comment__Group__02807);
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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1360:1: rule__Comment__Group__0__Impl : ( ( rule__Comment__TextAssignment_0 ) ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1364:1: ( ( ( rule__Comment__TextAssignment_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1365:1: ( ( rule__Comment__TextAssignment_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1365:1: ( ( rule__Comment__TextAssignment_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1366:1: ( rule__Comment__TextAssignment_0 )
            {
             before(grammarAccess.getCommentAccess().getTextAssignment_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1367:1: ( rule__Comment__TextAssignment_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1367:2: rule__Comment__TextAssignment_0
            {
            pushFollow(FOLLOW_rule__Comment__TextAssignment_0_in_rule__Comment__Group__0__Impl2834);
            rule__Comment__TextAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getTextAssignment_0()); 

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1377:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl rule__Comment__Group__2 ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1381:1: ( rule__Comment__Group__1__Impl rule__Comment__Group__2 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1382:2: rule__Comment__Group__1__Impl rule__Comment__Group__2
            {
            pushFollow(FOLLOW_rule__Comment__Group__1__Impl_in_rule__Comment__Group__12864);
            rule__Comment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comment__Group__2_in_rule__Comment__Group__12867);
            rule__Comment__Group__2();

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
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1389:1: rule__Comment__Group__1__Impl : ( ( ( rule__Comment__TextAssignment_1 ) ) ( ( rule__Comment__TextAssignment_1 )* ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1393:1: ( ( ( ( rule__Comment__TextAssignment_1 ) ) ( ( rule__Comment__TextAssignment_1 )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1394:1: ( ( ( rule__Comment__TextAssignment_1 ) ) ( ( rule__Comment__TextAssignment_1 )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1394:1: ( ( ( rule__Comment__TextAssignment_1 ) ) ( ( rule__Comment__TextAssignment_1 )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1395:1: ( ( rule__Comment__TextAssignment_1 ) ) ( ( rule__Comment__TextAssignment_1 )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1395:1: ( ( rule__Comment__TextAssignment_1 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1396:1: ( rule__Comment__TextAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1397:1: ( rule__Comment__TextAssignment_1 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1397:2: rule__Comment__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Comment__TextAssignment_1_in_rule__Comment__Group__1__Impl2896);
            rule__Comment__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getTextAssignment_1()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1400:1: ( ( rule__Comment__TextAssignment_1 )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1401:1: ( rule__Comment__TextAssignment_1 )*
            {
             before(grammarAccess.getCommentAccess().getTextAssignment_1()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1402:1: ( rule__Comment__TextAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_DYNAMIC_PARAM)||(LA25_0>=9 && LA25_0<=10)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1402:2: rule__Comment__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Comment__TextAssignment_1_in_rule__Comment__Group__1__Impl2908);
            	    rule__Comment__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCommentAccess().getTextAssignment_1()); 

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


    // $ANTLR start "rule__Comment__Group__2"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1413:1: rule__Comment__Group__2 : rule__Comment__Group__2__Impl ;
    public final void rule__Comment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1417:1: ( rule__Comment__Group__2__Impl )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1418:2: rule__Comment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Comment__Group__2__Impl_in_rule__Comment__Group__22941);
            rule__Comment__Group__2__Impl();

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
    // $ANTLR end "rule__Comment__Group__2"


    // $ANTLR start "rule__Comment__Group__2__Impl"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1424:1: rule__Comment__Group__2__Impl : ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) ;
    public final void rule__Comment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1428:1: ( ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1429:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1429:1: ( ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1430:1: ( ( RULE_SINGLE_NL ) ) ( ( RULE_SINGLE_NL )* )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1430:1: ( ( RULE_SINGLE_NL ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1431:1: ( RULE_SINGLE_NL )
            {
             before(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1432:1: ( RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1432:3: RULE_SINGLE_NL
            {
            match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__2__Impl2971); 

            }

             after(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 

            }

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1435:1: ( ( RULE_SINGLE_NL )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1436:1: ( RULE_SINGLE_NL )*
            {
             before(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1437:1: ( RULE_SINGLE_NL )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SINGLE_NL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1437:3: RULE_SINGLE_NL
            	    {
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__2__Impl2984); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCommentAccess().getSINGLE_NLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Comment__Group__2__Impl"


    // $ANTLR start "rule__Model__DefinitionsAssignment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1455:1: rule__Model__DefinitionsAssignment : ( ruleAbstractEntity ) ;
    public final void rule__Model__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1459:1: ( ( ruleAbstractEntity ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1460:1: ( ruleAbstractEntity )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1460:1: ( ruleAbstractEntity )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1461:1: ruleAbstractEntity
            {
             before(grammarAccess.getModelAccess().getDefinitionsAbstractEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_rule__Model__DefinitionsAssignment3028);
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


    // $ANTLR start "rule__Spec__NameAssignment_0_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1470:1: rule__Spec__NameAssignment_0_1 : ( ( rule__Spec__NameAlternatives_0_1_0 ) ) ;
    public final void rule__Spec__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1474:1: ( ( ( rule__Spec__NameAlternatives_0_1_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1475:1: ( ( rule__Spec__NameAlternatives_0_1_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1475:1: ( ( rule__Spec__NameAlternatives_0_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1476:1: ( rule__Spec__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getSpecAccess().getNameAlternatives_0_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1477:1: ( rule__Spec__NameAlternatives_0_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1477:2: rule__Spec__NameAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Spec__NameAlternatives_0_1_0_in_rule__Spec__NameAssignment_0_13059);
            rule__Spec__NameAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__Spec__NameAssignment_0_1"


    // $ANTLR start "rule__Spec__NameAssignment_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1486:1: rule__Spec__NameAssignment_1_0 : ( ( rule__Spec__NameAlternatives_1_0_0 ) ) ;
    public final void rule__Spec__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1490:1: ( ( ( rule__Spec__NameAlternatives_1_0_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1491:1: ( ( rule__Spec__NameAlternatives_1_0_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1491:1: ( ( rule__Spec__NameAlternatives_1_0_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1492:1: ( rule__Spec__NameAlternatives_1_0_0 )
            {
             before(grammarAccess.getSpecAccess().getNameAlternatives_1_0_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1493:1: ( rule__Spec__NameAlternatives_1_0_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1493:2: rule__Spec__NameAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Spec__NameAlternatives_1_0_0_in_rule__Spec__NameAssignment_1_03092);
            rule__Spec__NameAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__Spec__NameAssignment_1_0"


    // $ANTLR start "rule__Scenario__NameAssignment_0_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1502:1: rule__Scenario__NameAssignment_0_1 : ( ( rule__Scenario__NameAlternatives_0_1_0 ) ) ;
    public final void rule__Scenario__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1506:1: ( ( ( rule__Scenario__NameAlternatives_0_1_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1507:1: ( ( rule__Scenario__NameAlternatives_0_1_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1507:1: ( ( rule__Scenario__NameAlternatives_0_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1508:1: ( rule__Scenario__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getScenarioAccess().getNameAlternatives_0_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1509:1: ( rule__Scenario__NameAlternatives_0_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1509:2: rule__Scenario__NameAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Scenario__NameAlternatives_0_1_0_in_rule__Scenario__NameAssignment_0_13125);
            rule__Scenario__NameAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_0_1"


    // $ANTLR start "rule__Scenario__NameAssignment_1_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1518:1: rule__Scenario__NameAssignment_1_0 : ( ( rule__Scenario__NameAlternatives_1_0_0 ) ) ;
    public final void rule__Scenario__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1522:1: ( ( ( rule__Scenario__NameAlternatives_1_0_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1523:1: ( ( rule__Scenario__NameAlternatives_1_0_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1523:1: ( ( rule__Scenario__NameAlternatives_1_0_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1524:1: ( rule__Scenario__NameAlternatives_1_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getNameAlternatives_1_0_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1525:1: ( rule__Scenario__NameAlternatives_1_0_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1525:2: rule__Scenario__NameAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Scenario__NameAlternatives_1_0_0_in_rule__Scenario__NameAssignment_1_03158);
            rule__Scenario__NameAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1_0"


    // $ANTLR start "rule__Step__StaticParamsAssignment_2_0_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1534:1: rule__Step__StaticParamsAssignment_2_0_0 : ( ruleStaticParam ) ;
    public final void rule__Step__StaticParamsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1538:1: ( ( ruleStaticParam ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1539:1: ( ruleStaticParam )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1539:1: ( ruleStaticParam )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1540:1: ruleStaticParam
            {
             before(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleStaticParam_in_rule__Step__StaticParamsAssignment_2_0_03191);
            ruleStaticParam();

            state._fsp--;

             after(grammarAccess.getStepAccess().getStaticParamsStaticParamParserRuleCall_2_0_0_0()); 

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
    // $ANTLR end "rule__Step__StaticParamsAssignment_2_0_0"


    // $ANTLR start "rule__Step__DynamicParamsAssignment_2_0_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1549:1: rule__Step__DynamicParamsAssignment_2_0_1 : ( ruleDynamicParam ) ;
    public final void rule__Step__DynamicParamsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1553:1: ( ( ruleDynamicParam ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1554:1: ( ruleDynamicParam )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1554:1: ( ruleDynamicParam )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1555:1: ruleDynamicParam
            {
             before(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleDynamicParam_in_rule__Step__DynamicParamsAssignment_2_0_13222);
            ruleDynamicParam();

            state._fsp--;

             after(grammarAccess.getStepAccess().getDynamicParamsDynamicParamParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Step__DynamicParamsAssignment_2_0_1"


    // $ANTLR start "rule__StaticParam__NameAssignment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1564:1: rule__StaticParam__NameAssignment : ( RULE_STATIC_PARAM ) ;
    public final void rule__StaticParam__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1568:1: ( ( RULE_STATIC_PARAM ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1569:1: ( RULE_STATIC_PARAM )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1569:1: ( RULE_STATIC_PARAM )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1570:1: RULE_STATIC_PARAM
            {
             before(grammarAccess.getStaticParamAccess().getNameSTATIC_PARAMTerminalRuleCall_0()); 
            match(input,RULE_STATIC_PARAM,FOLLOW_RULE_STATIC_PARAM_in_rule__StaticParam__NameAssignment3253); 
             after(grammarAccess.getStaticParamAccess().getNameSTATIC_PARAMTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StaticParam__NameAssignment"


    // $ANTLR start "rule__DynamicParam__NameAssignment"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1579:1: rule__DynamicParam__NameAssignment : ( RULE_DYNAMIC_PARAM ) ;
    public final void rule__DynamicParam__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1583:1: ( ( RULE_DYNAMIC_PARAM ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1584:1: ( RULE_DYNAMIC_PARAM )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1584:1: ( RULE_DYNAMIC_PARAM )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1585:1: RULE_DYNAMIC_PARAM
            {
             before(grammarAccess.getDynamicParamAccess().getNameDYNAMIC_PARAMTerminalRuleCall_0()); 
            match(input,RULE_DYNAMIC_PARAM,FOLLOW_RULE_DYNAMIC_PARAM_in_rule__DynamicParam__NameAssignment3284); 
             after(grammarAccess.getDynamicParamAccess().getNameDYNAMIC_PARAMTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DynamicParam__NameAssignment"


    // $ANTLR start "rule__Comment__TextAssignment_0"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1594:1: rule__Comment__TextAssignment_0 : ( ( rule__Comment__TextAlternatives_0_0 ) ) ;
    public final void rule__Comment__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1598:1: ( ( ( rule__Comment__TextAlternatives_0_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1599:1: ( ( rule__Comment__TextAlternatives_0_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1599:1: ( ( rule__Comment__TextAlternatives_0_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1600:1: ( rule__Comment__TextAlternatives_0_0 )
            {
             before(grammarAccess.getCommentAccess().getTextAlternatives_0_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1601:1: ( rule__Comment__TextAlternatives_0_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1601:2: rule__Comment__TextAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Comment__TextAlternatives_0_0_in_rule__Comment__TextAssignment_03315);
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


    // $ANTLR start "rule__Comment__TextAssignment_1"
    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1610:1: rule__Comment__TextAssignment_1 : ( ( rule__Comment__TextAlternatives_1_0 ) ) ;
    public final void rule__Comment__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1614:1: ( ( ( rule__Comment__TextAlternatives_1_0 ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1615:1: ( ( rule__Comment__TextAlternatives_1_0 ) )
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1615:1: ( ( rule__Comment__TextAlternatives_1_0 ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1616:1: ( rule__Comment__TextAlternatives_1_0 )
            {
             before(grammarAccess.getCommentAccess().getTextAlternatives_1_0()); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1617:1: ( rule__Comment__TextAlternatives_1_0 )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1617:2: rule__Comment__TextAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Comment__TextAlternatives_1_0_in_rule__Comment__TextAssignment_13348);
            rule__Comment__TextAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getTextAlternatives_1_0()); 

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
    // $ANTLR end "rule__Comment__TextAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\14\uffff\1\6\2\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\2\4\3\uffff\2\4\1\11\5\4";
    static final String DFA2_maxS =
        "\1\15\1\uffff\1\12\1\10\3\uffff\3\12\2\10\1\15\2\12";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\4\10\uffff";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\2\6\3\uffff\1\1\1\4\1\5",
            "",
            "\1\7\1\10\2\6\1\11\2\6",
            "\1\12\1\13\2\uffff\1\11",
            "",
            "",
            "",
            "\1\15\1\16\2\6\1\14\2\6",
            "\1\15\1\16\2\6\1\14\2\6",
            "\1\4\1\1",
            "\1\12\1\13\2\uffff\1\11",
            "\1\12\1\13\2\uffff\1\11",
            "\5\6\1\4\1\1\3\6",
            "\1\15\1\16\2\6\1\14\2\6",
            "\1\15\1\16\2\6\1\14\2\6"
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
            return "284:1: rule__AbstractEntity__Alternatives : ( ( ruleSpec ) | ( ruleScenario ) | ( ruleStep ) | ( ruleComment ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefinitionsAssignment_in_ruleModel94 = new BitSet(new long[]{0x00000000000038F2L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractEntity__Alternatives_in_ruleAbstractEntity155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_entryRuleSpec182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpec189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Alternatives_in_ruleSpec215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Alternatives_in_ruleScenario275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticParam_in_entryRuleStaticParam362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticParam369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticParam__NameAssignment_in_ruleStaticParam395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_entryRuleDynamicParam422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicParam429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicParam__NameAssignment_in_ruleDynamicParam455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__0_in_ruleComment515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpec_in_rule__AbstractEntity__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__AbstractEntity__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__AbstractEntity__Alternatives585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__AbstractEntity__Alternatives602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_0__0_in_rule__Spec__Alternatives634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__0_in_rule__Spec__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Spec__NameAlternatives_0_1_0685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Spec__NameAlternatives_0_1_0702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Spec__NameAlternatives_1_0_0734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Spec__NameAlternatives_1_0_0751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group_0__0_in_rule__Scenario__Alternatives783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1__0_in_rule__Scenario__Alternatives801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Scenario__NameAlternatives_0_1_0834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Scenario__NameAlternatives_0_1_0851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Scenario__NameAlternatives_1_0_0883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Scenario__NameAlternatives_1_0_0900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__StaticParamsAssignment_2_0_0_in_rule__Step__Alternatives_2_0932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__DynamicParamsAssignment_2_0_1_in_rule__Step__Alternatives_2_0950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Step__Alternatives_2_0968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Step__Alternatives_2_0986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Step__Alternatives_2_01006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Comment__TextAlternatives_0_01040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_rule__Comment__TextAlternatives_0_01057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_rule__Comment__TextAlternatives_0_01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Comment__TextAlternatives_1_01106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Comment__TextAlternatives_1_01123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_rule__Comment__TextAlternatives_1_01140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_rule__Comment__TextAlternatives_1_01157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Comment__TextAlternatives_1_01175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Comment__TextAlternatives_1_01195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_0__0__Impl_in_rule__Spec__Group_0__01227 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Spec__Group_0__1_in_rule__Spec__Group_0__01230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Spec__Group_0__0__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_0__1__Impl_in_rule__Spec__Group_0__11289 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Spec__Group_0__2_in_rule__Spec__Group_0__11292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__NameAssignment_0_1_in_rule__Spec__Group_0__1__Impl1321 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Spec__NameAssignment_0_1_in_rule__Spec__Group_0__1__Impl1333 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Spec__Group_0__2__Impl_in_rule__Spec__Group_0__21366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_0__2__Impl1396 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_0__2__Impl1409 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__0__Impl_in_rule__Spec__Group_1__01448 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__1_in_rule__Spec__Group_1__01451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__NameAssignment_1_0_in_rule__Spec__Group_1__0__Impl1480 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_rule__Spec__NameAssignment_1_0_in_rule__Spec__Group_1__0__Impl1492 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__1__Impl_in_rule__Spec__Group_1__11525 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__2_in_rule__Spec__Group_1__11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_1__1__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1__2__Impl_in_rule__Spec__Group_1__21584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1_2__0_in_rule__Spec__Group_1__2__Impl1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__Group_1_2__0__Impl_in_rule__Spec__Group_1_2__01647 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Spec__Group_1_2__1_in_rule__Spec__Group_1_2__01650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Spec__Group_1_2__0__Impl1681 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_rule__Spec__Group_1_2__0__Impl1697 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Spec__Group_1_2__1__Impl_in_rule__Spec__Group_1_2__11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_1_2__1__Impl1762 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Spec__Group_1_2__1__Impl1775 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Scenario__Group_0__0__Impl_in_rule__Scenario__Group_0__01812 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Scenario__Group_0__1_in_rule__Scenario__Group_0__01815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Scenario__Group_0__0__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group_0__1__Impl_in_rule__Scenario__Group_0__11874 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Scenario__Group_0__2_in_rule__Scenario__Group_0__11877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_0_1_in_rule__Scenario__Group_0__1__Impl1906 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_0_1_in_rule__Scenario__Group_0__1__Impl1918 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Scenario__Group_0__2__Impl_in_rule__Scenario__Group_0__21951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_0__2__Impl1981 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_0__2__Impl1994 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1__0__Impl_in_rule__Scenario__Group_1__02033 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1__1_in_rule__Scenario__Group_1__02036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_0_in_rule__Scenario__Group_1__0__Impl2065 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_0_in_rule__Scenario__Group_1__0__Impl2077 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1__1__Impl_in_rule__Scenario__Group_1__12110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1__2_in_rule__Scenario__Group_1__12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_1__1__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1__2__Impl_in_rule__Scenario__Group_1__22169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1_2__0_in_rule__Scenario__Group_1__2__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1_2__0__Impl_in_rule__Scenario__Group_1_2__02232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1_2__1_in_rule__Scenario__Group_1_2__02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Scenario__Group_1_2__0__Impl2266 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_rule__Scenario__Group_1_2__0__Impl2282 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Scenario__Group_1_2__1__Impl_in_rule__Scenario__Group_1_2__12317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_1_2__1__Impl2347 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Scenario__Group_1_2__1__Impl2360 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__02397 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__02400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__12458 = new BitSet(new long[]{0x00000000000006D0L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Step__Group__1__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__22520 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Step__Group__3_in_rule__Step__Group__22523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl2552 = new BitSet(new long[]{0x00000000000006D2L});
    public static final BitSet FOLLOW_rule__Step__Group_2__0_in_rule__Step__Group__2__Impl2564 = new BitSet(new long[]{0x00000000000006D2L});
    public static final BitSet FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__32597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl2627 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Step__Group__3__Impl2640 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Step__Group_2__0__Impl_in_rule__Step__Group_2__02681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Step__Group_2__1_in_rule__Step__Group_2__02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_2_0_in_rule__Step__Group_2__0__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_2__1__Impl_in_rule__Step__Group_2__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEPARATORS_in_rule__Step__Group_2__1__Impl2769 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Comment__Group__0__Impl_in_rule__Comment__Group__02804 = new BitSet(new long[]{0x00000000000006F0L});
    public static final BitSet FOLLOW_rule__Comment__Group__1_in_rule__Comment__Group__02807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAssignment_0_in_rule__Comment__Group__0__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__1__Impl_in_rule__Comment__Group__12864 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Comment__Group__2_in_rule__Comment__Group__12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAssignment_1_in_rule__Comment__Group__1__Impl2896 = new BitSet(new long[]{0x00000000000006F2L});
    public static final BitSet FOLLOW_rule__Comment__TextAssignment_1_in_rule__Comment__Group__1__Impl2908 = new BitSet(new long[]{0x00000000000006F2L});
    public static final BitSet FOLLOW_rule__Comment__Group__2__Impl_in_rule__Comment__Group__22941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__2__Impl2971 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Comment__Group__2__Impl2984 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_rule__Model__DefinitionsAssignment3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__NameAlternatives_0_1_0_in_rule__Spec__NameAssignment_0_13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spec__NameAlternatives_1_0_0_in_rule__Spec__NameAssignment_1_03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAlternatives_0_1_0_in_rule__Scenario__NameAssignment_0_13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAlternatives_1_0_0_in_rule__Scenario__NameAssignment_1_03158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticParam_in_rule__Step__StaticParamsAssignment_2_0_03191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicParam_in_rule__Step__DynamicParamsAssignment_2_0_13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_PARAM_in_rule__StaticParam__NameAssignment3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DYNAMIC_PARAM_in_rule__DynamicParam__NameAssignment3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAlternatives_0_0_in_rule__Comment__TextAssignment_03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAlternatives_1_0_in_rule__Comment__TextAssignment_13348 = new BitSet(new long[]{0x0000000000000002L});

}