package fr.n7.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.xtext.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'debut'", "'fin'", "'intermediaire'", "'jeu'", "'Connaissances'", "'{'", "'}'", "'Objets'", "'PNJs'", "'Actions'", "'Conditions'", "'Lieux'", "'Chemins'", "'Joueur'", "'visible'", "'si'", "','", "'('", "'taille'", "')'", "'*'", "'est'", "'joueur'", "'possede'", "'objet:'", "'connaissance:'", "'situe'", "'en'", "'et'", "'dialogue'", "'contient ('", "'PNJs:'", "';'", "'objets:'", "'connaissances:'", "'propose'", "'implique'", "'consomme'", "'donne'", "'depuis'", "'jusqu\\'\\u00E0'", "'ouvert'", "'inventaire'", "'commence'", "'avec'", "'connaissances'", "'pas'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }


    	private GameGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJeu"
    // InternalGame.g:53:1: entryRuleJeu : ruleJeu EOF ;
    public final void entryRuleJeu() throws RecognitionException {
        try {
            // InternalGame.g:54:1: ( ruleJeu EOF )
            // InternalGame.g:55:1: ruleJeu EOF
            {
             before(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleJeu();

            state._fsp--;

             after(grammarAccess.getJeuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalGame.g:62:1: ruleJeu : ( ( rule__Jeu__Group__0 ) ) ;
    public final void ruleJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:66:2: ( ( ( rule__Jeu__Group__0 ) ) )
            // InternalGame.g:67:2: ( ( rule__Jeu__Group__0 ) )
            {
            // InternalGame.g:67:2: ( ( rule__Jeu__Group__0 ) )
            // InternalGame.g:68:3: ( rule__Jeu__Group__0 )
            {
             before(grammarAccess.getJeuAccess().getGroup()); 
            // InternalGame.g:69:3: ( rule__Jeu__Group__0 )
            // InternalGame.g:69:4: rule__Jeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getGroup()); 

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
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:78:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( ruleConnaissance EOF )
            // InternalGame.g:80:1: ruleConnaissance EOF
            {
             before(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGame.g:87:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGame.g:92:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGame.g:92:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGame.g:93:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGame.g:94:3: ( rule__Connaissance__Group__0 )
            // InternalGame.g:94:4: rule__Connaissance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getGroup()); 

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
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:103:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleObjet EOF )
            // InternalGame.g:105:1: ruleObjet EOF
            {
             before(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getObjetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGame.g:112:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__Objet__Group__0 ) )
            // InternalGame.g:118:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGame.g:119:3: ( rule__Objet__Group__0 )
            // InternalGame.g:119:4: rule__Objet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getGroup()); 

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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleObjetTenu"
    // InternalGame.g:128:1: entryRuleObjetTenu : ruleObjetTenu EOF ;
    public final void entryRuleObjetTenu() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleObjetTenu EOF )
            // InternalGame.g:130:1: ruleObjetTenu EOF
            {
             before(grammarAccess.getObjetTenuRule()); 
            pushFollow(FOLLOW_1);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getObjetTenuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjetTenu"


    // $ANTLR start "ruleObjetTenu"
    // InternalGame.g:137:1: ruleObjetTenu : ( ( rule__ObjetTenu__Group__0 ) ) ;
    public final void ruleObjetTenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__ObjetTenu__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__ObjetTenu__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__ObjetTenu__Group__0 ) )
            // InternalGame.g:143:3: ( rule__ObjetTenu__Group__0 )
            {
             before(grammarAccess.getObjetTenuAccess().getGroup()); 
            // InternalGame.g:144:3: ( rule__ObjetTenu__Group__0 )
            // InternalGame.g:144:4: rule__ObjetTenu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetTenuAccess().getGroup()); 

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
    // $ANTLR end "ruleObjetTenu"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleCondition EOF )
            // InternalGame.g:155:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:162:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Condition__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__Condition__Group__0 )
            // InternalGame.g:169:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePNJ"
    // InternalGame.g:178:1: entryRulePNJ : rulePNJ EOF ;
    public final void entryRulePNJ() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( rulePNJ EOF )
            // InternalGame.g:180:1: rulePNJ EOF
            {
             before(grammarAccess.getPNJRule()); 
            pushFollow(FOLLOW_1);
            rulePNJ();

            state._fsp--;

             after(grammarAccess.getPNJRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePNJ"


    // $ANTLR start "rulePNJ"
    // InternalGame.g:187:1: rulePNJ : ( ( rule__PNJ__Group__0 ) ) ;
    public final void rulePNJ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__PNJ__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__PNJ__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__PNJ__Group__0 ) )
            // InternalGame.g:193:3: ( rule__PNJ__Group__0 )
            {
             before(grammarAccess.getPNJAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__PNJ__Group__0 )
            // InternalGame.g:194:4: rule__PNJ__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPNJAccess().getGroup()); 

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
    // $ANTLR end "rulePNJ"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:203:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( ruleLieu EOF )
            // InternalGame.g:205:1: ruleLieu EOF
            {
             before(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getLieuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGame.g:212:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Lieu__Group__0 )
            // InternalGame.g:219:4: rule__Lieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getGroup()); 

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
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleDialogue"
    // InternalGame.g:228:1: entryRuleDialogue : ruleDialogue EOF ;
    public final void entryRuleDialogue() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( ruleDialogue EOF )
            // InternalGame.g:230:1: ruleDialogue EOF
            {
             before(grammarAccess.getDialogueRule()); 
            pushFollow(FOLLOW_1);
            ruleDialogue();

            state._fsp--;

             after(grammarAccess.getDialogueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDialogue"


    // $ANTLR start "ruleDialogue"
    // InternalGame.g:237:1: ruleDialogue : ( ( rule__Dialogue__Group__0 ) ) ;
    public final void ruleDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Dialogue__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Dialogue__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Dialogue__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Dialogue__Group__0 )
            {
             before(grammarAccess.getDialogueAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Dialogue__Group__0 )
            // InternalGame.g:244:4: rule__Dialogue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDialogueAccess().getGroup()); 

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
    // $ANTLR end "ruleDialogue"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:253:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( ruleChoix EOF )
            // InternalGame.g:255:1: ruleChoix EOF
            {
             before(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getChoixRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGame.g:262:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Choix__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Choix__Group__0 )
            // InternalGame.g:269:4: rule__Choix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getGroup()); 

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
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:278:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalGame.g:279:1: ( ruleAction EOF )
            // InternalGame.g:280:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGame.g:287:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:291:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalGame.g:292:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalGame.g:292:2: ( ( rule__Action__Group__0 ) )
            // InternalGame.g:293:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalGame.g:294:3: ( rule__Action__Group__0 )
            // InternalGame.g:294:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:303:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalGame.g:304:1: ( ruleChemin EOF )
            // InternalGame.g:305:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGame.g:312:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:316:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalGame.g:317:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalGame.g:317:2: ( ( rule__Chemin__Group__0 ) )
            // InternalGame.g:318:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalGame.g:319:3: ( rule__Chemin__Group__0 )
            // InternalGame.g:319:4: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

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
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleConditionnel"
    // InternalGame.g:328:1: entryRuleConditionnel : ruleConditionnel EOF ;
    public final void entryRuleConditionnel() throws RecognitionException {
        try {
            // InternalGame.g:329:1: ( ruleConditionnel EOF )
            // InternalGame.g:330:1: ruleConditionnel EOF
            {
             before(grammarAccess.getConditionnelRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionnel();

            state._fsp--;

             after(grammarAccess.getConditionnelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionnel"


    // $ANTLR start "ruleConditionnel"
    // InternalGame.g:337:1: ruleConditionnel : ( ( rule__Conditionnel__Alternatives ) ) ;
    public final void ruleConditionnel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:2: ( ( ( rule__Conditionnel__Alternatives ) ) )
            // InternalGame.g:342:2: ( ( rule__Conditionnel__Alternatives ) )
            {
            // InternalGame.g:342:2: ( ( rule__Conditionnel__Alternatives ) )
            // InternalGame.g:343:3: ( rule__Conditionnel__Alternatives )
            {
             before(grammarAccess.getConditionnelAccess().getAlternatives()); 
            // InternalGame.g:344:3: ( rule__Conditionnel__Alternatives )
            // InternalGame.g:344:4: rule__Conditionnel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Conditionnel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionnelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConditionnel"


    // $ANTLR start "entryRuleJoueur"
    // InternalGame.g:353:1: entryRuleJoueur : ruleJoueur EOF ;
    public final void entryRuleJoueur() throws RecognitionException {
        try {
            // InternalGame.g:354:1: ( ruleJoueur EOF )
            // InternalGame.g:355:1: ruleJoueur EOF
            {
             before(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getJoueurRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalGame.g:362:1: ruleJoueur : ( ( rule__Joueur__Group__0 ) ) ;
    public final void ruleJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:2: ( ( ( rule__Joueur__Group__0 ) ) )
            // InternalGame.g:367:2: ( ( rule__Joueur__Group__0 ) )
            {
            // InternalGame.g:367:2: ( ( rule__Joueur__Group__0 ) )
            // InternalGame.g:368:3: ( rule__Joueur__Group__0 )
            {
             before(grammarAccess.getJoueurAccess().getGroup()); 
            // InternalGame.g:369:3: ( rule__Joueur__Group__0 )
            // InternalGame.g:369:4: rule__Joueur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getGroup()); 

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
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "ruletypePlace"
    // InternalGame.g:378:1: ruletypePlace : ( ( rule__TypePlace__Alternatives ) ) ;
    public final void ruletypePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:382:1: ( ( ( rule__TypePlace__Alternatives ) ) )
            // InternalGame.g:383:2: ( ( rule__TypePlace__Alternatives ) )
            {
            // InternalGame.g:383:2: ( ( rule__TypePlace__Alternatives ) )
            // InternalGame.g:384:3: ( rule__TypePlace__Alternatives )
            {
             before(grammarAccess.getTypePlaceAccess().getAlternatives()); 
            // InternalGame.g:385:3: ( rule__TypePlace__Alternatives )
            // InternalGame.g:385:4: rule__TypePlace__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypePlace__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypePlaceAccess().getAlternatives()); 

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
    // $ANTLR end "ruletypePlace"


    // $ANTLR start "rule__Condition__Alternatives_5"
    // InternalGame.g:393:1: rule__Condition__Alternatives_5 : ( ( ( rule__Condition__Group_5_0__0 ) ) | ( ( rule__Condition__Group_5_1__0 ) ) );
    public final void rule__Condition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:397:1: ( ( ( rule__Condition__Group_5_0__0 ) ) | ( ( rule__Condition__Group_5_1__0 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==35) ) {
                    alt1=1;
                }
                else if ( (LA1_1==36) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGame.g:398:2: ( ( rule__Condition__Group_5_0__0 ) )
                    {
                    // InternalGame.g:398:2: ( ( rule__Condition__Group_5_0__0 ) )
                    // InternalGame.g:399:3: ( rule__Condition__Group_5_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_5_0()); 
                    // InternalGame.g:400:3: ( rule__Condition__Group_5_0__0 )
                    // InternalGame.g:400:4: rule__Condition__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:404:2: ( ( rule__Condition__Group_5_1__0 ) )
                    {
                    // InternalGame.g:404:2: ( ( rule__Condition__Group_5_1__0 ) )
                    // InternalGame.g:405:3: ( rule__Condition__Group_5_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_5_1()); 
                    // InternalGame.g:406:3: ( rule__Condition__Group_5_1__0 )
                    // InternalGame.g:406:4: rule__Condition__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives_5"


    // $ANTLR start "rule__Conditionnel__Alternatives"
    // InternalGame.g:414:1: rule__Conditionnel__Alternatives : ( ( rulePNJ ) | ( ruleConnaissance ) | ( ruleObjetTenu ) | ( ruleChemin ) | ( ruleDialogue ) | ( ruleChoix ) );
    public final void rule__Conditionnel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:418:1: ( ( rulePNJ ) | ( ruleConnaissance ) | ( ruleObjetTenu ) | ( ruleChemin ) | ( ruleDialogue ) | ( ruleChoix ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                case 37:
                    {
                    alt2=1;
                    }
                    break;
                case 31:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 50:
                {
                alt2=4;
                }
                break;
            case RULE_STRING:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==EOF||LA2_3==25||LA2_3==47) ) {
                    alt2=6;
                }
                else if ( (LA2_3==46) ) {
                    alt2=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:419:2: ( rulePNJ )
                    {
                    // InternalGame.g:419:2: ( rulePNJ )
                    // InternalGame.g:420:3: rulePNJ
                    {
                     before(grammarAccess.getConditionnelAccess().getPNJParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePNJ();

                    state._fsp--;

                     after(grammarAccess.getConditionnelAccess().getPNJParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:425:2: ( ruleConnaissance )
                    {
                    // InternalGame.g:425:2: ( ruleConnaissance )
                    // InternalGame.g:426:3: ruleConnaissance
                    {
                     before(grammarAccess.getConditionnelAccess().getConnaissanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnaissance();

                    state._fsp--;

                     after(grammarAccess.getConditionnelAccess().getConnaissanceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:431:2: ( ruleObjetTenu )
                    {
                    // InternalGame.g:431:2: ( ruleObjetTenu )
                    // InternalGame.g:432:3: ruleObjetTenu
                    {
                     before(grammarAccess.getConditionnelAccess().getObjetTenuParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObjetTenu();

                    state._fsp--;

                     after(grammarAccess.getConditionnelAccess().getObjetTenuParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:437:2: ( ruleChemin )
                    {
                    // InternalGame.g:437:2: ( ruleChemin )
                    // InternalGame.g:438:3: ruleChemin
                    {
                     before(grammarAccess.getConditionnelAccess().getCheminParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleChemin();

                    state._fsp--;

                     after(grammarAccess.getConditionnelAccess().getCheminParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGame.g:443:2: ( ruleDialogue )
                    {
                    // InternalGame.g:443:2: ( ruleDialogue )
                    // InternalGame.g:444:3: ruleDialogue
                    {
                     before(grammarAccess.getConditionnelAccess().getDialogueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDialogue();

                    state._fsp--;

                     after(grammarAccess.getConditionnelAccess().getDialogueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGame.g:449:2: ( ruleChoix )
                    {
                    // InternalGame.g:449:2: ( ruleChoix )
                    // InternalGame.g:450:3: ruleChoix
                    {
                     before(grammarAccess.getConditionnelAccess().getChoixParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleChoix();

                    state._fsp--;

                     after(grammarAccess.getConditionnelAccess().getChoixParserRuleCall_5()); 

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
    // $ANTLR end "rule__Conditionnel__Alternatives"


    // $ANTLR start "rule__TypePlace__Alternatives"
    // InternalGame.g:459:1: rule__TypePlace__Alternatives : ( ( ( 'debut' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) );
    public final void rule__TypePlace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:463:1: ( ( ( 'debut' ) ) | ( ( 'fin' ) ) | ( ( 'intermediaire' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
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
                    // InternalGame.g:464:2: ( ( 'debut' ) )
                    {
                    // InternalGame.g:464:2: ( ( 'debut' ) )
                    // InternalGame.g:465:3: ( 'debut' )
                    {
                     before(grammarAccess.getTypePlaceAccess().getDebutEnumLiteralDeclaration_0()); 
                    // InternalGame.g:466:3: ( 'debut' )
                    // InternalGame.g:466:4: 'debut'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypePlaceAccess().getDebutEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:470:2: ( ( 'fin' ) )
                    {
                    // InternalGame.g:470:2: ( ( 'fin' ) )
                    // InternalGame.g:471:3: ( 'fin' )
                    {
                     before(grammarAccess.getTypePlaceAccess().getFinEnumLiteralDeclaration_1()); 
                    // InternalGame.g:472:3: ( 'fin' )
                    // InternalGame.g:472:4: 'fin'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypePlaceAccess().getFinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:476:2: ( ( 'intermediaire' ) )
                    {
                    // InternalGame.g:476:2: ( ( 'intermediaire' ) )
                    // InternalGame.g:477:3: ( 'intermediaire' )
                    {
                     before(grammarAccess.getTypePlaceAccess().getIntermediaireEnumLiteralDeclaration_2()); 
                    // InternalGame.g:478:3: ( 'intermediaire' )
                    // InternalGame.g:478:4: 'intermediaire'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypePlaceAccess().getIntermediaireEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TypePlace__Alternatives"


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalGame.g:486:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:490:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGame.g:491:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__1();

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
    // $ANTLR end "rule__Jeu__Group__0"


    // $ANTLR start "rule__Jeu__Group__0__Impl"
    // InternalGame.g:498:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:502:1: ( ( 'jeu' ) )
            // InternalGame.g:503:1: ( 'jeu' )
            {
            // InternalGame.g:503:1: ( 'jeu' )
            // InternalGame.g:504:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJeuKeyword_0()); 

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
    // $ANTLR end "rule__Jeu__Group__0__Impl"


    // $ANTLR start "rule__Jeu__Group__1"
    // InternalGame.g:513:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:517:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGame.g:518:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Jeu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__2();

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
    // $ANTLR end "rule__Jeu__Group__1"


    // $ANTLR start "rule__Jeu__Group__1__Impl"
    // InternalGame.g:525:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:529:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalGame.g:530:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalGame.g:530:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalGame.g:531:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalGame.g:532:2: ( rule__Jeu__NameAssignment_1 )
            // InternalGame.g:532:3: rule__Jeu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Jeu__Group__1__Impl"


    // $ANTLR start "rule__Jeu__Group__2"
    // InternalGame.g:540:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:544:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGame.g:545:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__3();

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
    // $ANTLR end "rule__Jeu__Group__2"


    // $ANTLR start "rule__Jeu__Group__2__Impl"
    // InternalGame.g:552:1: rule__Jeu__Group__2__Impl : ( 'Connaissances' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:556:1: ( ( 'Connaissances' ) )
            // InternalGame.g:557:1: ( 'Connaissances' )
            {
            // InternalGame.g:557:1: ( 'Connaissances' )
            // InternalGame.g:558:2: 'Connaissances'
            {
             before(grammarAccess.getJeuAccess().getConnaissancesKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getConnaissancesKeyword_2()); 

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
    // $ANTLR end "rule__Jeu__Group__2__Impl"


    // $ANTLR start "rule__Jeu__Group__3"
    // InternalGame.g:567:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:571:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGame.g:572:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4();

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
    // $ANTLR end "rule__Jeu__Group__3"


    // $ANTLR start "rule__Jeu__Group__3__Impl"
    // InternalGame.g:579:1: rule__Jeu__Group__3__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:583:1: ( ( '{' ) )
            // InternalGame.g:584:1: ( '{' )
            {
            // InternalGame.g:584:1: ( '{' )
            // InternalGame.g:585:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Jeu__Group__3__Impl"


    // $ANTLR start "rule__Jeu__Group__4"
    // InternalGame.g:594:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:598:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGame.g:599:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__5();

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
    // $ANTLR end "rule__Jeu__Group__4"


    // $ANTLR start "rule__Jeu__Group__4__Impl"
    // InternalGame.g:606:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__JeuElementsAssignment_4 )* ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:610:1: ( ( ( rule__Jeu__JeuElementsAssignment_4 )* ) )
            // InternalGame.g:611:1: ( ( rule__Jeu__JeuElementsAssignment_4 )* )
            {
            // InternalGame.g:611:1: ( ( rule__Jeu__JeuElementsAssignment_4 )* )
            // InternalGame.g:612:2: ( rule__Jeu__JeuElementsAssignment_4 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_4()); 
            // InternalGame.g:613:2: ( rule__Jeu__JeuElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:613:3: rule__Jeu__JeuElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Jeu__JeuElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_4()); 

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
    // $ANTLR end "rule__Jeu__Group__4__Impl"


    // $ANTLR start "rule__Jeu__Group__5"
    // InternalGame.g:621:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:625:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGame.g:626:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__6();

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
    // $ANTLR end "rule__Jeu__Group__5"


    // $ANTLR start "rule__Jeu__Group__5__Impl"
    // InternalGame.g:633:1: rule__Jeu__Group__5__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:637:1: ( ( '}' ) )
            // InternalGame.g:638:1: ( '}' )
            {
            // InternalGame.g:638:1: ( '}' )
            // InternalGame.g:639:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Jeu__Group__5__Impl"


    // $ANTLR start "rule__Jeu__Group__6"
    // InternalGame.g:648:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl rule__Jeu__Group__7 ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:652:1: ( rule__Jeu__Group__6__Impl rule__Jeu__Group__7 )
            // InternalGame.g:653:2: rule__Jeu__Group__6__Impl rule__Jeu__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__7();

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
    // $ANTLR end "rule__Jeu__Group__6"


    // $ANTLR start "rule__Jeu__Group__6__Impl"
    // InternalGame.g:660:1: rule__Jeu__Group__6__Impl : ( 'Objets' ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:664:1: ( ( 'Objets' ) )
            // InternalGame.g:665:1: ( 'Objets' )
            {
            // InternalGame.g:665:1: ( 'Objets' )
            // InternalGame.g:666:2: 'Objets'
            {
             before(grammarAccess.getJeuAccess().getObjetsKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getObjetsKeyword_6()); 

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
    // $ANTLR end "rule__Jeu__Group__6__Impl"


    // $ANTLR start "rule__Jeu__Group__7"
    // InternalGame.g:675:1: rule__Jeu__Group__7 : rule__Jeu__Group__7__Impl rule__Jeu__Group__8 ;
    public final void rule__Jeu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:679:1: ( rule__Jeu__Group__7__Impl rule__Jeu__Group__8 )
            // InternalGame.g:680:2: rule__Jeu__Group__7__Impl rule__Jeu__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Jeu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__8();

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
    // $ANTLR end "rule__Jeu__Group__7"


    // $ANTLR start "rule__Jeu__Group__7__Impl"
    // InternalGame.g:687:1: rule__Jeu__Group__7__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:691:1: ( ( '{' ) )
            // InternalGame.g:692:1: ( '{' )
            {
            // InternalGame.g:692:1: ( '{' )
            // InternalGame.g:693:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Jeu__Group__7__Impl"


    // $ANTLR start "rule__Jeu__Group__8"
    // InternalGame.g:702:1: rule__Jeu__Group__8 : rule__Jeu__Group__8__Impl rule__Jeu__Group__9 ;
    public final void rule__Jeu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:706:1: ( rule__Jeu__Group__8__Impl rule__Jeu__Group__9 )
            // InternalGame.g:707:2: rule__Jeu__Group__8__Impl rule__Jeu__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Jeu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__9();

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
    // $ANTLR end "rule__Jeu__Group__8"


    // $ANTLR start "rule__Jeu__Group__8__Impl"
    // InternalGame.g:714:1: rule__Jeu__Group__8__Impl : ( ( rule__Jeu__JeuElementsAssignment_8 )* ) ;
    public final void rule__Jeu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:718:1: ( ( ( rule__Jeu__JeuElementsAssignment_8 )* ) )
            // InternalGame.g:719:1: ( ( rule__Jeu__JeuElementsAssignment_8 )* )
            {
            // InternalGame.g:719:1: ( ( rule__Jeu__JeuElementsAssignment_8 )* )
            // InternalGame.g:720:2: ( rule__Jeu__JeuElementsAssignment_8 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_8()); 
            // InternalGame.g:721:2: ( rule__Jeu__JeuElementsAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:721:3: rule__Jeu__JeuElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Jeu__JeuElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_8()); 

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
    // $ANTLR end "rule__Jeu__Group__8__Impl"


    // $ANTLR start "rule__Jeu__Group__9"
    // InternalGame.g:729:1: rule__Jeu__Group__9 : rule__Jeu__Group__9__Impl rule__Jeu__Group__10 ;
    public final void rule__Jeu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:733:1: ( rule__Jeu__Group__9__Impl rule__Jeu__Group__10 )
            // InternalGame.g:734:2: rule__Jeu__Group__9__Impl rule__Jeu__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Jeu__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__10();

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
    // $ANTLR end "rule__Jeu__Group__9"


    // $ANTLR start "rule__Jeu__Group__9__Impl"
    // InternalGame.g:741:1: rule__Jeu__Group__9__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:745:1: ( ( '}' ) )
            // InternalGame.g:746:1: ( '}' )
            {
            // InternalGame.g:746:1: ( '}' )
            // InternalGame.g:747:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Jeu__Group__9__Impl"


    // $ANTLR start "rule__Jeu__Group__10"
    // InternalGame.g:756:1: rule__Jeu__Group__10 : rule__Jeu__Group__10__Impl rule__Jeu__Group__11 ;
    public final void rule__Jeu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:760:1: ( rule__Jeu__Group__10__Impl rule__Jeu__Group__11 )
            // InternalGame.g:761:2: rule__Jeu__Group__10__Impl rule__Jeu__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__11();

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
    // $ANTLR end "rule__Jeu__Group__10"


    // $ANTLR start "rule__Jeu__Group__10__Impl"
    // InternalGame.g:768:1: rule__Jeu__Group__10__Impl : ( 'PNJs' ) ;
    public final void rule__Jeu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:772:1: ( ( 'PNJs' ) )
            // InternalGame.g:773:1: ( 'PNJs' )
            {
            // InternalGame.g:773:1: ( 'PNJs' )
            // InternalGame.g:774:2: 'PNJs'
            {
             before(grammarAccess.getJeuAccess().getPNJsKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getPNJsKeyword_10()); 

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
    // $ANTLR end "rule__Jeu__Group__10__Impl"


    // $ANTLR start "rule__Jeu__Group__11"
    // InternalGame.g:783:1: rule__Jeu__Group__11 : rule__Jeu__Group__11__Impl rule__Jeu__Group__12 ;
    public final void rule__Jeu__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:787:1: ( rule__Jeu__Group__11__Impl rule__Jeu__Group__12 )
            // InternalGame.g:788:2: rule__Jeu__Group__11__Impl rule__Jeu__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__12();

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
    // $ANTLR end "rule__Jeu__Group__11"


    // $ANTLR start "rule__Jeu__Group__11__Impl"
    // InternalGame.g:795:1: rule__Jeu__Group__11__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:799:1: ( ( '{' ) )
            // InternalGame.g:800:1: ( '{' )
            {
            // InternalGame.g:800:1: ( '{' )
            // InternalGame.g:801:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Jeu__Group__11__Impl"


    // $ANTLR start "rule__Jeu__Group__12"
    // InternalGame.g:810:1: rule__Jeu__Group__12 : rule__Jeu__Group__12__Impl rule__Jeu__Group__13 ;
    public final void rule__Jeu__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:814:1: ( rule__Jeu__Group__12__Impl rule__Jeu__Group__13 )
            // InternalGame.g:815:2: rule__Jeu__Group__12__Impl rule__Jeu__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__13();

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
    // $ANTLR end "rule__Jeu__Group__12"


    // $ANTLR start "rule__Jeu__Group__12__Impl"
    // InternalGame.g:822:1: rule__Jeu__Group__12__Impl : ( ( rule__Jeu__JeuElementsAssignment_12 )* ) ;
    public final void rule__Jeu__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:826:1: ( ( ( rule__Jeu__JeuElementsAssignment_12 )* ) )
            // InternalGame.g:827:1: ( ( rule__Jeu__JeuElementsAssignment_12 )* )
            {
            // InternalGame.g:827:1: ( ( rule__Jeu__JeuElementsAssignment_12 )* )
            // InternalGame.g:828:2: ( rule__Jeu__JeuElementsAssignment_12 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_12()); 
            // InternalGame.g:829:2: ( rule__Jeu__JeuElementsAssignment_12 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:829:3: rule__Jeu__JeuElementsAssignment_12
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Jeu__JeuElementsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_12()); 

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
    // $ANTLR end "rule__Jeu__Group__12__Impl"


    // $ANTLR start "rule__Jeu__Group__13"
    // InternalGame.g:837:1: rule__Jeu__Group__13 : rule__Jeu__Group__13__Impl rule__Jeu__Group__14 ;
    public final void rule__Jeu__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:841:1: ( rule__Jeu__Group__13__Impl rule__Jeu__Group__14 )
            // InternalGame.g:842:2: rule__Jeu__Group__13__Impl rule__Jeu__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Jeu__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__14();

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
    // $ANTLR end "rule__Jeu__Group__13"


    // $ANTLR start "rule__Jeu__Group__13__Impl"
    // InternalGame.g:849:1: rule__Jeu__Group__13__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:853:1: ( ( '}' ) )
            // InternalGame.g:854:1: ( '}' )
            {
            // InternalGame.g:854:1: ( '}' )
            // InternalGame.g:855:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Jeu__Group__13__Impl"


    // $ANTLR start "rule__Jeu__Group__14"
    // InternalGame.g:864:1: rule__Jeu__Group__14 : rule__Jeu__Group__14__Impl rule__Jeu__Group__15 ;
    public final void rule__Jeu__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:868:1: ( rule__Jeu__Group__14__Impl rule__Jeu__Group__15 )
            // InternalGame.g:869:2: rule__Jeu__Group__14__Impl rule__Jeu__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__15();

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
    // $ANTLR end "rule__Jeu__Group__14"


    // $ANTLR start "rule__Jeu__Group__14__Impl"
    // InternalGame.g:876:1: rule__Jeu__Group__14__Impl : ( 'Actions' ) ;
    public final void rule__Jeu__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:880:1: ( ( 'Actions' ) )
            // InternalGame.g:881:1: ( 'Actions' )
            {
            // InternalGame.g:881:1: ( 'Actions' )
            // InternalGame.g:882:2: 'Actions'
            {
             before(grammarAccess.getJeuAccess().getActionsKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getActionsKeyword_14()); 

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
    // $ANTLR end "rule__Jeu__Group__14__Impl"


    // $ANTLR start "rule__Jeu__Group__15"
    // InternalGame.g:891:1: rule__Jeu__Group__15 : rule__Jeu__Group__15__Impl rule__Jeu__Group__16 ;
    public final void rule__Jeu__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:895:1: ( rule__Jeu__Group__15__Impl rule__Jeu__Group__16 )
            // InternalGame.g:896:2: rule__Jeu__Group__15__Impl rule__Jeu__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__16();

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
    // $ANTLR end "rule__Jeu__Group__15"


    // $ANTLR start "rule__Jeu__Group__15__Impl"
    // InternalGame.g:903:1: rule__Jeu__Group__15__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:907:1: ( ( '{' ) )
            // InternalGame.g:908:1: ( '{' )
            {
            // InternalGame.g:908:1: ( '{' )
            // InternalGame.g:909:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Jeu__Group__15__Impl"


    // $ANTLR start "rule__Jeu__Group__16"
    // InternalGame.g:918:1: rule__Jeu__Group__16 : rule__Jeu__Group__16__Impl rule__Jeu__Group__17 ;
    public final void rule__Jeu__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:922:1: ( rule__Jeu__Group__16__Impl rule__Jeu__Group__17 )
            // InternalGame.g:923:2: rule__Jeu__Group__16__Impl rule__Jeu__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__17();

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
    // $ANTLR end "rule__Jeu__Group__16"


    // $ANTLR start "rule__Jeu__Group__16__Impl"
    // InternalGame.g:930:1: rule__Jeu__Group__16__Impl : ( ( rule__Jeu__JeuElementsAssignment_16 )* ) ;
    public final void rule__Jeu__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:934:1: ( ( ( rule__Jeu__JeuElementsAssignment_16 )* ) )
            // InternalGame.g:935:1: ( ( rule__Jeu__JeuElementsAssignment_16 )* )
            {
            // InternalGame.g:935:1: ( ( rule__Jeu__JeuElementsAssignment_16 )* )
            // InternalGame.g:936:2: ( rule__Jeu__JeuElementsAssignment_16 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_16()); 
            // InternalGame.g:937:2: ( rule__Jeu__JeuElementsAssignment_16 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:937:3: rule__Jeu__JeuElementsAssignment_16
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Jeu__JeuElementsAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_16()); 

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
    // $ANTLR end "rule__Jeu__Group__16__Impl"


    // $ANTLR start "rule__Jeu__Group__17"
    // InternalGame.g:945:1: rule__Jeu__Group__17 : rule__Jeu__Group__17__Impl rule__Jeu__Group__18 ;
    public final void rule__Jeu__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:949:1: ( rule__Jeu__Group__17__Impl rule__Jeu__Group__18 )
            // InternalGame.g:950:2: rule__Jeu__Group__17__Impl rule__Jeu__Group__18
            {
            pushFollow(FOLLOW_13);
            rule__Jeu__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__18();

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
    // $ANTLR end "rule__Jeu__Group__17"


    // $ANTLR start "rule__Jeu__Group__17__Impl"
    // InternalGame.g:957:1: rule__Jeu__Group__17__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:961:1: ( ( '}' ) )
            // InternalGame.g:962:1: ( '}' )
            {
            // InternalGame.g:962:1: ( '}' )
            // InternalGame.g:963:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_17()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__Jeu__Group__17__Impl"


    // $ANTLR start "rule__Jeu__Group__18"
    // InternalGame.g:972:1: rule__Jeu__Group__18 : rule__Jeu__Group__18__Impl rule__Jeu__Group__19 ;
    public final void rule__Jeu__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:976:1: ( rule__Jeu__Group__18__Impl rule__Jeu__Group__19 )
            // InternalGame.g:977:2: rule__Jeu__Group__18__Impl rule__Jeu__Group__19
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__19();

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
    // $ANTLR end "rule__Jeu__Group__18"


    // $ANTLR start "rule__Jeu__Group__18__Impl"
    // InternalGame.g:984:1: rule__Jeu__Group__18__Impl : ( 'Conditions' ) ;
    public final void rule__Jeu__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:988:1: ( ( 'Conditions' ) )
            // InternalGame.g:989:1: ( 'Conditions' )
            {
            // InternalGame.g:989:1: ( 'Conditions' )
            // InternalGame.g:990:2: 'Conditions'
            {
             before(grammarAccess.getJeuAccess().getConditionsKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getConditionsKeyword_18()); 

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
    // $ANTLR end "rule__Jeu__Group__18__Impl"


    // $ANTLR start "rule__Jeu__Group__19"
    // InternalGame.g:999:1: rule__Jeu__Group__19 : rule__Jeu__Group__19__Impl rule__Jeu__Group__20 ;
    public final void rule__Jeu__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1003:1: ( rule__Jeu__Group__19__Impl rule__Jeu__Group__20 )
            // InternalGame.g:1004:2: rule__Jeu__Group__19__Impl rule__Jeu__Group__20
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__20();

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
    // $ANTLR end "rule__Jeu__Group__19"


    // $ANTLR start "rule__Jeu__Group__19__Impl"
    // InternalGame.g:1011:1: rule__Jeu__Group__19__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1015:1: ( ( '{' ) )
            // InternalGame.g:1016:1: ( '{' )
            {
            // InternalGame.g:1016:1: ( '{' )
            // InternalGame.g:1017:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__Jeu__Group__19__Impl"


    // $ANTLR start "rule__Jeu__Group__20"
    // InternalGame.g:1026:1: rule__Jeu__Group__20 : rule__Jeu__Group__20__Impl rule__Jeu__Group__21 ;
    public final void rule__Jeu__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1030:1: ( rule__Jeu__Group__20__Impl rule__Jeu__Group__21 )
            // InternalGame.g:1031:2: rule__Jeu__Group__20__Impl rule__Jeu__Group__21
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__21();

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
    // $ANTLR end "rule__Jeu__Group__20"


    // $ANTLR start "rule__Jeu__Group__20__Impl"
    // InternalGame.g:1038:1: rule__Jeu__Group__20__Impl : ( ( rule__Jeu__JeuElementsAssignment_20 )* ) ;
    public final void rule__Jeu__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1042:1: ( ( ( rule__Jeu__JeuElementsAssignment_20 )* ) )
            // InternalGame.g:1043:1: ( ( rule__Jeu__JeuElementsAssignment_20 )* )
            {
            // InternalGame.g:1043:1: ( ( rule__Jeu__JeuElementsAssignment_20 )* )
            // InternalGame.g:1044:2: ( rule__Jeu__JeuElementsAssignment_20 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_20()); 
            // InternalGame.g:1045:2: ( rule__Jeu__JeuElementsAssignment_20 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1045:3: rule__Jeu__JeuElementsAssignment_20
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Jeu__JeuElementsAssignment_20();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_20()); 

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
    // $ANTLR end "rule__Jeu__Group__20__Impl"


    // $ANTLR start "rule__Jeu__Group__21"
    // InternalGame.g:1053:1: rule__Jeu__Group__21 : rule__Jeu__Group__21__Impl rule__Jeu__Group__22 ;
    public final void rule__Jeu__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1057:1: ( rule__Jeu__Group__21__Impl rule__Jeu__Group__22 )
            // InternalGame.g:1058:2: rule__Jeu__Group__21__Impl rule__Jeu__Group__22
            {
            pushFollow(FOLLOW_14);
            rule__Jeu__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__22();

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
    // $ANTLR end "rule__Jeu__Group__21"


    // $ANTLR start "rule__Jeu__Group__21__Impl"
    // InternalGame.g:1065:1: rule__Jeu__Group__21__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1069:1: ( ( '}' ) )
            // InternalGame.g:1070:1: ( '}' )
            {
            // InternalGame.g:1070:1: ( '}' )
            // InternalGame.g:1071:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_21()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_21()); 

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
    // $ANTLR end "rule__Jeu__Group__21__Impl"


    // $ANTLR start "rule__Jeu__Group__22"
    // InternalGame.g:1080:1: rule__Jeu__Group__22 : rule__Jeu__Group__22__Impl rule__Jeu__Group__23 ;
    public final void rule__Jeu__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1084:1: ( rule__Jeu__Group__22__Impl rule__Jeu__Group__23 )
            // InternalGame.g:1085:2: rule__Jeu__Group__22__Impl rule__Jeu__Group__23
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__23();

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
    // $ANTLR end "rule__Jeu__Group__22"


    // $ANTLR start "rule__Jeu__Group__22__Impl"
    // InternalGame.g:1092:1: rule__Jeu__Group__22__Impl : ( 'Lieux' ) ;
    public final void rule__Jeu__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1096:1: ( ( 'Lieux' ) )
            // InternalGame.g:1097:1: ( 'Lieux' )
            {
            // InternalGame.g:1097:1: ( 'Lieux' )
            // InternalGame.g:1098:2: 'Lieux'
            {
             before(grammarAccess.getJeuAccess().getLieuxKeyword_22()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLieuxKeyword_22()); 

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
    // $ANTLR end "rule__Jeu__Group__22__Impl"


    // $ANTLR start "rule__Jeu__Group__23"
    // InternalGame.g:1107:1: rule__Jeu__Group__23 : rule__Jeu__Group__23__Impl rule__Jeu__Group__24 ;
    public final void rule__Jeu__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1111:1: ( rule__Jeu__Group__23__Impl rule__Jeu__Group__24 )
            // InternalGame.g:1112:2: rule__Jeu__Group__23__Impl rule__Jeu__Group__24
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__24();

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
    // $ANTLR end "rule__Jeu__Group__23"


    // $ANTLR start "rule__Jeu__Group__23__Impl"
    // InternalGame.g:1119:1: rule__Jeu__Group__23__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1123:1: ( ( '{' ) )
            // InternalGame.g:1124:1: ( '{' )
            {
            // InternalGame.g:1124:1: ( '{' )
            // InternalGame.g:1125:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_23()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_23()); 

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
    // $ANTLR end "rule__Jeu__Group__23__Impl"


    // $ANTLR start "rule__Jeu__Group__24"
    // InternalGame.g:1134:1: rule__Jeu__Group__24 : rule__Jeu__Group__24__Impl rule__Jeu__Group__25 ;
    public final void rule__Jeu__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1138:1: ( rule__Jeu__Group__24__Impl rule__Jeu__Group__25 )
            // InternalGame.g:1139:2: rule__Jeu__Group__24__Impl rule__Jeu__Group__25
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__25();

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
    // $ANTLR end "rule__Jeu__Group__24"


    // $ANTLR start "rule__Jeu__Group__24__Impl"
    // InternalGame.g:1146:1: rule__Jeu__Group__24__Impl : ( ( rule__Jeu__JeuElementsAssignment_24 )* ) ;
    public final void rule__Jeu__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1150:1: ( ( ( rule__Jeu__JeuElementsAssignment_24 )* ) )
            // InternalGame.g:1151:1: ( ( rule__Jeu__JeuElementsAssignment_24 )* )
            {
            // InternalGame.g:1151:1: ( ( rule__Jeu__JeuElementsAssignment_24 )* )
            // InternalGame.g:1152:2: ( rule__Jeu__JeuElementsAssignment_24 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_24()); 
            // InternalGame.g:1153:2: ( rule__Jeu__JeuElementsAssignment_24 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:1153:3: rule__Jeu__JeuElementsAssignment_24
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Jeu__JeuElementsAssignment_24();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_24()); 

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
    // $ANTLR end "rule__Jeu__Group__24__Impl"


    // $ANTLR start "rule__Jeu__Group__25"
    // InternalGame.g:1161:1: rule__Jeu__Group__25 : rule__Jeu__Group__25__Impl rule__Jeu__Group__26 ;
    public final void rule__Jeu__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1165:1: ( rule__Jeu__Group__25__Impl rule__Jeu__Group__26 )
            // InternalGame.g:1166:2: rule__Jeu__Group__25__Impl rule__Jeu__Group__26
            {
            pushFollow(FOLLOW_15);
            rule__Jeu__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__26();

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
    // $ANTLR end "rule__Jeu__Group__25"


    // $ANTLR start "rule__Jeu__Group__25__Impl"
    // InternalGame.g:1173:1: rule__Jeu__Group__25__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1177:1: ( ( '}' ) )
            // InternalGame.g:1178:1: ( '}' )
            {
            // InternalGame.g:1178:1: ( '}' )
            // InternalGame.g:1179:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_25()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_25()); 

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
    // $ANTLR end "rule__Jeu__Group__25__Impl"


    // $ANTLR start "rule__Jeu__Group__26"
    // InternalGame.g:1188:1: rule__Jeu__Group__26 : rule__Jeu__Group__26__Impl rule__Jeu__Group__27 ;
    public final void rule__Jeu__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1192:1: ( rule__Jeu__Group__26__Impl rule__Jeu__Group__27 )
            // InternalGame.g:1193:2: rule__Jeu__Group__26__Impl rule__Jeu__Group__27
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__27();

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
    // $ANTLR end "rule__Jeu__Group__26"


    // $ANTLR start "rule__Jeu__Group__26__Impl"
    // InternalGame.g:1200:1: rule__Jeu__Group__26__Impl : ( 'Chemins' ) ;
    public final void rule__Jeu__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1204:1: ( ( 'Chemins' ) )
            // InternalGame.g:1205:1: ( 'Chemins' )
            {
            // InternalGame.g:1205:1: ( 'Chemins' )
            // InternalGame.g:1206:2: 'Chemins'
            {
             before(grammarAccess.getJeuAccess().getCheminsKeyword_26()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getCheminsKeyword_26()); 

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
    // $ANTLR end "rule__Jeu__Group__26__Impl"


    // $ANTLR start "rule__Jeu__Group__27"
    // InternalGame.g:1215:1: rule__Jeu__Group__27 : rule__Jeu__Group__27__Impl rule__Jeu__Group__28 ;
    public final void rule__Jeu__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1219:1: ( rule__Jeu__Group__27__Impl rule__Jeu__Group__28 )
            // InternalGame.g:1220:2: rule__Jeu__Group__27__Impl rule__Jeu__Group__28
            {
            pushFollow(FOLLOW_16);
            rule__Jeu__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__28();

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
    // $ANTLR end "rule__Jeu__Group__27"


    // $ANTLR start "rule__Jeu__Group__27__Impl"
    // InternalGame.g:1227:1: rule__Jeu__Group__27__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1231:1: ( ( '{' ) )
            // InternalGame.g:1232:1: ( '{' )
            {
            // InternalGame.g:1232:1: ( '{' )
            // InternalGame.g:1233:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_27()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_27()); 

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
    // $ANTLR end "rule__Jeu__Group__27__Impl"


    // $ANTLR start "rule__Jeu__Group__28"
    // InternalGame.g:1242:1: rule__Jeu__Group__28 : rule__Jeu__Group__28__Impl rule__Jeu__Group__29 ;
    public final void rule__Jeu__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1246:1: ( rule__Jeu__Group__28__Impl rule__Jeu__Group__29 )
            // InternalGame.g:1247:2: rule__Jeu__Group__28__Impl rule__Jeu__Group__29
            {
            pushFollow(FOLLOW_16);
            rule__Jeu__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__29();

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
    // $ANTLR end "rule__Jeu__Group__28"


    // $ANTLR start "rule__Jeu__Group__28__Impl"
    // InternalGame.g:1254:1: rule__Jeu__Group__28__Impl : ( ( rule__Jeu__JeuElementsAssignment_28 )* ) ;
    public final void rule__Jeu__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1258:1: ( ( ( rule__Jeu__JeuElementsAssignment_28 )* ) )
            // InternalGame.g:1259:1: ( ( rule__Jeu__JeuElementsAssignment_28 )* )
            {
            // InternalGame.g:1259:1: ( ( rule__Jeu__JeuElementsAssignment_28 )* )
            // InternalGame.g:1260:2: ( rule__Jeu__JeuElementsAssignment_28 )*
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_28()); 
            // InternalGame.g:1261:2: ( rule__Jeu__JeuElementsAssignment_28 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGame.g:1261:3: rule__Jeu__JeuElementsAssignment_28
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Jeu__JeuElementsAssignment_28();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_28()); 

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
    // $ANTLR end "rule__Jeu__Group__28__Impl"


    // $ANTLR start "rule__Jeu__Group__29"
    // InternalGame.g:1269:1: rule__Jeu__Group__29 : rule__Jeu__Group__29__Impl rule__Jeu__Group__30 ;
    public final void rule__Jeu__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1273:1: ( rule__Jeu__Group__29__Impl rule__Jeu__Group__30 )
            // InternalGame.g:1274:2: rule__Jeu__Group__29__Impl rule__Jeu__Group__30
            {
            pushFollow(FOLLOW_18);
            rule__Jeu__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__30();

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
    // $ANTLR end "rule__Jeu__Group__29"


    // $ANTLR start "rule__Jeu__Group__29__Impl"
    // InternalGame.g:1281:1: rule__Jeu__Group__29__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1285:1: ( ( '}' ) )
            // InternalGame.g:1286:1: ( '}' )
            {
            // InternalGame.g:1286:1: ( '}' )
            // InternalGame.g:1287:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_29()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_29()); 

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
    // $ANTLR end "rule__Jeu__Group__29__Impl"


    // $ANTLR start "rule__Jeu__Group__30"
    // InternalGame.g:1296:1: rule__Jeu__Group__30 : rule__Jeu__Group__30__Impl rule__Jeu__Group__31 ;
    public final void rule__Jeu__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1300:1: ( rule__Jeu__Group__30__Impl rule__Jeu__Group__31 )
            // InternalGame.g:1301:2: rule__Jeu__Group__30__Impl rule__Jeu__Group__31
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__31();

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
    // $ANTLR end "rule__Jeu__Group__30"


    // $ANTLR start "rule__Jeu__Group__30__Impl"
    // InternalGame.g:1308:1: rule__Jeu__Group__30__Impl : ( 'Joueur' ) ;
    public final void rule__Jeu__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1312:1: ( ( 'Joueur' ) )
            // InternalGame.g:1313:1: ( 'Joueur' )
            {
            // InternalGame.g:1313:1: ( 'Joueur' )
            // InternalGame.g:1314:2: 'Joueur'
            {
             before(grammarAccess.getJeuAccess().getJoueurKeyword_30()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJoueurKeyword_30()); 

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
    // $ANTLR end "rule__Jeu__Group__30__Impl"


    // $ANTLR start "rule__Jeu__Group__31"
    // InternalGame.g:1323:1: rule__Jeu__Group__31 : rule__Jeu__Group__31__Impl rule__Jeu__Group__32 ;
    public final void rule__Jeu__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1327:1: ( rule__Jeu__Group__31__Impl rule__Jeu__Group__32 )
            // InternalGame.g:1328:2: rule__Jeu__Group__31__Impl rule__Jeu__Group__32
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__32();

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
    // $ANTLR end "rule__Jeu__Group__31"


    // $ANTLR start "rule__Jeu__Group__31__Impl"
    // InternalGame.g:1335:1: rule__Jeu__Group__31__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1339:1: ( ( '{' ) )
            // InternalGame.g:1340:1: ( '{' )
            {
            // InternalGame.g:1340:1: ( '{' )
            // InternalGame.g:1341:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_31()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_31()); 

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
    // $ANTLR end "rule__Jeu__Group__31__Impl"


    // $ANTLR start "rule__Jeu__Group__32"
    // InternalGame.g:1350:1: rule__Jeu__Group__32 : rule__Jeu__Group__32__Impl rule__Jeu__Group__33 ;
    public final void rule__Jeu__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1354:1: ( rule__Jeu__Group__32__Impl rule__Jeu__Group__33 )
            // InternalGame.g:1355:2: rule__Jeu__Group__32__Impl rule__Jeu__Group__33
            {
            pushFollow(FOLLOW_19);
            rule__Jeu__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__33();

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
    // $ANTLR end "rule__Jeu__Group__32"


    // $ANTLR start "rule__Jeu__Group__32__Impl"
    // InternalGame.g:1362:1: rule__Jeu__Group__32__Impl : ( ( rule__Jeu__JeuElementsAssignment_32 ) ) ;
    public final void rule__Jeu__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1366:1: ( ( ( rule__Jeu__JeuElementsAssignment_32 ) ) )
            // InternalGame.g:1367:1: ( ( rule__Jeu__JeuElementsAssignment_32 ) )
            {
            // InternalGame.g:1367:1: ( ( rule__Jeu__JeuElementsAssignment_32 ) )
            // InternalGame.g:1368:2: ( rule__Jeu__JeuElementsAssignment_32 )
            {
             before(grammarAccess.getJeuAccess().getJeuElementsAssignment_32()); 
            // InternalGame.g:1369:2: ( rule__Jeu__JeuElementsAssignment_32 )
            // InternalGame.g:1369:3: rule__Jeu__JeuElementsAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__JeuElementsAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getJeuElementsAssignment_32()); 

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
    // $ANTLR end "rule__Jeu__Group__32__Impl"


    // $ANTLR start "rule__Jeu__Group__33"
    // InternalGame.g:1377:1: rule__Jeu__Group__33 : rule__Jeu__Group__33__Impl ;
    public final void rule__Jeu__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1381:1: ( rule__Jeu__Group__33__Impl )
            // InternalGame.g:1382:2: rule__Jeu__Group__33__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__33__Impl();

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
    // $ANTLR end "rule__Jeu__Group__33"


    // $ANTLR start "rule__Jeu__Group__33__Impl"
    // InternalGame.g:1388:1: rule__Jeu__Group__33__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1392:1: ( ( '}' ) )
            // InternalGame.g:1393:1: ( '}' )
            {
            // InternalGame.g:1393:1: ( '}' )
            // InternalGame.g:1394:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_33()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_33()); 

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
    // $ANTLR end "rule__Jeu__Group__33__Impl"


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGame.g:1404:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1408:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGame.g:1409:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Connaissance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1();

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
    // $ANTLR end "rule__Connaissance__Group__0"


    // $ANTLR start "rule__Connaissance__Group__0__Impl"
    // InternalGame.g:1416:1: rule__Connaissance__Group__0__Impl : ( ( rule__Connaissance__NameAssignment_0 ) ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1420:1: ( ( ( rule__Connaissance__NameAssignment_0 ) ) )
            // InternalGame.g:1421:1: ( ( rule__Connaissance__NameAssignment_0 ) )
            {
            // InternalGame.g:1421:1: ( ( rule__Connaissance__NameAssignment_0 ) )
            // InternalGame.g:1422:2: ( rule__Connaissance__NameAssignment_0 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_0()); 
            // InternalGame.g:1423:2: ( rule__Connaissance__NameAssignment_0 )
            // InternalGame.g:1423:3: rule__Connaissance__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Connaissance__Group__0__Impl"


    // $ANTLR start "rule__Connaissance__Group__1"
    // InternalGame.g:1431:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1435:1: ( rule__Connaissance__Group__1__Impl )
            // InternalGame.g:1436:2: rule__Connaissance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1__Impl();

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
    // $ANTLR end "rule__Connaissance__Group__1"


    // $ANTLR start "rule__Connaissance__Group__1__Impl"
    // InternalGame.g:1442:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__Group_1__0 )? ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1446:1: ( ( ( rule__Connaissance__Group_1__0 )? ) )
            // InternalGame.g:1447:1: ( ( rule__Connaissance__Group_1__0 )? )
            {
            // InternalGame.g:1447:1: ( ( rule__Connaissance__Group_1__0 )? )
            // InternalGame.g:1448:2: ( rule__Connaissance__Group_1__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_1()); 
            // InternalGame.g:1449:2: ( rule__Connaissance__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:1449:3: rule__Connaissance__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Connaissance__Group__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__0"
    // InternalGame.g:1458:1: rule__Connaissance__Group_1__0 : rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1 ;
    public final void rule__Connaissance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1462:1: ( rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1 )
            // InternalGame.g:1463:2: rule__Connaissance__Group_1__0__Impl rule__Connaissance__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Connaissance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__1();

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
    // $ANTLR end "rule__Connaissance__Group_1__0"


    // $ANTLR start "rule__Connaissance__Group_1__0__Impl"
    // InternalGame.g:1470:1: rule__Connaissance__Group_1__0__Impl : ( 'visible' ) ;
    public final void rule__Connaissance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1474:1: ( ( 'visible' ) )
            // InternalGame.g:1475:1: ( 'visible' )
            {
            // InternalGame.g:1475:1: ( 'visible' )
            // InternalGame.g:1476:2: 'visible'
            {
             before(grammarAccess.getConnaissanceAccess().getVisibleKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__Connaissance__Group_1__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__1"
    // InternalGame.g:1485:1: rule__Connaissance__Group_1__1 : rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2 ;
    public final void rule__Connaissance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1489:1: ( rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2 )
            // InternalGame.g:1490:2: rule__Connaissance__Group_1__1__Impl rule__Connaissance__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Connaissance__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__2();

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
    // $ANTLR end "rule__Connaissance__Group_1__1"


    // $ANTLR start "rule__Connaissance__Group_1__1__Impl"
    // InternalGame.g:1497:1: rule__Connaissance__Group_1__1__Impl : ( 'si' ) ;
    public final void rule__Connaissance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1501:1: ( ( 'si' ) )
            // InternalGame.g:1502:1: ( 'si' )
            {
            // InternalGame.g:1502:1: ( 'si' )
            // InternalGame.g:1503:2: 'si'
            {
             before(grammarAccess.getConnaissanceAccess().getSiKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getSiKeyword_1_1()); 

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
    // $ANTLR end "rule__Connaissance__Group_1__1__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__2"
    // InternalGame.g:1512:1: rule__Connaissance__Group_1__2 : rule__Connaissance__Group_1__2__Impl rule__Connaissance__Group_1__3 ;
    public final void rule__Connaissance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1516:1: ( rule__Connaissance__Group_1__2__Impl rule__Connaissance__Group_1__3 )
            // InternalGame.g:1517:2: rule__Connaissance__Group_1__2__Impl rule__Connaissance__Group_1__3
            {
            pushFollow(FOLLOW_22);
            rule__Connaissance__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__3();

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
    // $ANTLR end "rule__Connaissance__Group_1__2"


    // $ANTLR start "rule__Connaissance__Group_1__2__Impl"
    // InternalGame.g:1524:1: rule__Connaissance__Group_1__2__Impl : ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_2 ) ) ;
    public final void rule__Connaissance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1528:1: ( ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_2 ) ) )
            // InternalGame.g:1529:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_2 ) )
            {
            // InternalGame.g:1529:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_2 ) )
            // InternalGame.g:1530:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_1_2 )
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_1_2()); 
            // InternalGame.g:1531:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_1_2 )
            // InternalGame.g:1531:3: rule__Connaissance__ConditionsVisibiliteAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ConditionsVisibiliteAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_1_2()); 

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
    // $ANTLR end "rule__Connaissance__Group_1__2__Impl"


    // $ANTLR start "rule__Connaissance__Group_1__3"
    // InternalGame.g:1539:1: rule__Connaissance__Group_1__3 : rule__Connaissance__Group_1__3__Impl ;
    public final void rule__Connaissance__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1543:1: ( rule__Connaissance__Group_1__3__Impl )
            // InternalGame.g:1544:2: rule__Connaissance__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1__3__Impl();

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
    // $ANTLR end "rule__Connaissance__Group_1__3"


    // $ANTLR start "rule__Connaissance__Group_1__3__Impl"
    // InternalGame.g:1550:1: rule__Connaissance__Group_1__3__Impl : ( ( rule__Connaissance__Group_1_3__0 )* ) ;
    public final void rule__Connaissance__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1554:1: ( ( ( rule__Connaissance__Group_1_3__0 )* ) )
            // InternalGame.g:1555:1: ( ( rule__Connaissance__Group_1_3__0 )* )
            {
            // InternalGame.g:1555:1: ( ( rule__Connaissance__Group_1_3__0 )* )
            // InternalGame.g:1556:2: ( rule__Connaissance__Group_1_3__0 )*
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_1_3()); 
            // InternalGame.g:1557:2: ( rule__Connaissance__Group_1_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:1557:3: rule__Connaissance__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Connaissance__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getConnaissanceAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__Connaissance__Group_1__3__Impl"


    // $ANTLR start "rule__Connaissance__Group_1_3__0"
    // InternalGame.g:1566:1: rule__Connaissance__Group_1_3__0 : rule__Connaissance__Group_1_3__0__Impl rule__Connaissance__Group_1_3__1 ;
    public final void rule__Connaissance__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1570:1: ( rule__Connaissance__Group_1_3__0__Impl rule__Connaissance__Group_1_3__1 )
            // InternalGame.g:1571:2: rule__Connaissance__Group_1_3__0__Impl rule__Connaissance__Group_1_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Connaissance__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1_3__1();

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
    // $ANTLR end "rule__Connaissance__Group_1_3__0"


    // $ANTLR start "rule__Connaissance__Group_1_3__0__Impl"
    // InternalGame.g:1578:1: rule__Connaissance__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Connaissance__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1582:1: ( ( ',' ) )
            // InternalGame.g:1583:1: ( ',' )
            {
            // InternalGame.g:1583:1: ( ',' )
            // InternalGame.g:1584:2: ','
            {
             before(grammarAccess.getConnaissanceAccess().getCommaKeyword_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getCommaKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Connaissance__Group_1_3__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_1_3__1"
    // InternalGame.g:1593:1: rule__Connaissance__Group_1_3__1 : rule__Connaissance__Group_1_3__1__Impl ;
    public final void rule__Connaissance__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1597:1: ( rule__Connaissance__Group_1_3__1__Impl )
            // InternalGame.g:1598:2: rule__Connaissance__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Connaissance__Group_1_3__1"


    // $ANTLR start "rule__Connaissance__Group_1_3__1__Impl"
    // InternalGame.g:1604:1: rule__Connaissance__Group_1_3__1__Impl : ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 ) ) ;
    public final void rule__Connaissance__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1608:1: ( ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 ) ) )
            // InternalGame.g:1609:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 ) )
            {
            // InternalGame.g:1609:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 ) )
            // InternalGame.g:1610:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_1_3_1()); 
            // InternalGame.g:1611:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 )
            // InternalGame.g:1611:3: rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Connaissance__Group_1_3__1__Impl"


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGame.g:1620:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1624:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGame.g:1625:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Objet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__1();

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
    // $ANTLR end "rule__Objet__Group__0"


    // $ANTLR start "rule__Objet__Group__0__Impl"
    // InternalGame.g:1632:1: rule__Objet__Group__0__Impl : ( '(' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1636:1: ( ( '(' ) )
            // InternalGame.g:1637:1: ( '(' )
            {
            // InternalGame.g:1637:1: ( '(' )
            // InternalGame.g:1638:2: '('
            {
             before(grammarAccess.getObjetAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Objet__Group__0__Impl"


    // $ANTLR start "rule__Objet__Group__1"
    // InternalGame.g:1647:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1651:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGame.g:1652:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Objet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__2();

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
    // $ANTLR end "rule__Objet__Group__1"


    // $ANTLR start "rule__Objet__Group__1__Impl"
    // InternalGame.g:1659:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1663:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGame.g:1664:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGame.g:1664:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGame.g:1665:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGame.g:1666:2: ( rule__Objet__NameAssignment_1 )
            // InternalGame.g:1666:3: rule__Objet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Objet__Group__1__Impl"


    // $ANTLR start "rule__Objet__Group__2"
    // InternalGame.g:1674:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1678:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGame.g:1679:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Objet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__3();

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
    // $ANTLR end "rule__Objet__Group__2"


    // $ANTLR start "rule__Objet__Group__2__Impl"
    // InternalGame.g:1686:1: rule__Objet__Group__2__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1690:1: ( ( 'taille' ) )
            // InternalGame.g:1691:1: ( 'taille' )
            {
            // InternalGame.g:1691:1: ( 'taille' )
            // InternalGame.g:1692:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_2()); 

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
    // $ANTLR end "rule__Objet__Group__2__Impl"


    // $ANTLR start "rule__Objet__Group__3"
    // InternalGame.g:1701:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1705:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGame.g:1706:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Objet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__4();

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
    // $ANTLR end "rule__Objet__Group__3"


    // $ANTLR start "rule__Objet__Group__3__Impl"
    // InternalGame.g:1713:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__TailleAssignment_3 ) ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1717:1: ( ( ( rule__Objet__TailleAssignment_3 ) ) )
            // InternalGame.g:1718:1: ( ( rule__Objet__TailleAssignment_3 ) )
            {
            // InternalGame.g:1718:1: ( ( rule__Objet__TailleAssignment_3 ) )
            // InternalGame.g:1719:2: ( rule__Objet__TailleAssignment_3 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_3()); 
            // InternalGame.g:1720:2: ( rule__Objet__TailleAssignment_3 )
            // InternalGame.g:1720:3: rule__Objet__TailleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_3()); 

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
    // $ANTLR end "rule__Objet__Group__3__Impl"


    // $ANTLR start "rule__Objet__Group__4"
    // InternalGame.g:1728:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1732:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGame.g:1733:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Objet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__5();

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
    // $ANTLR end "rule__Objet__Group__4"


    // $ANTLR start "rule__Objet__Group__4__Impl"
    // InternalGame.g:1740:1: rule__Objet__Group__4__Impl : ( ')' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1744:1: ( ( ')' ) )
            // InternalGame.g:1745:1: ( ')' )
            {
            // InternalGame.g:1745:1: ( ')' )
            // InternalGame.g:1746:2: ')'
            {
             before(grammarAccess.getObjetAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Objet__Group__4__Impl"


    // $ANTLR start "rule__Objet__Group__5"
    // InternalGame.g:1755:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1759:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGame.g:1760:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Objet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__6();

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
    // $ANTLR end "rule__Objet__Group__5"


    // $ANTLR start "rule__Objet__Group__5__Impl"
    // InternalGame.g:1767:1: rule__Objet__Group__5__Impl : ( '*' ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1771:1: ( ( '*' ) )
            // InternalGame.g:1772:1: ( '*' )
            {
            // InternalGame.g:1772:1: ( '*' )
            // InternalGame.g:1773:2: '*'
            {
             before(grammarAccess.getObjetAccess().getAsteriskKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getAsteriskKeyword_5()); 

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
    // $ANTLR end "rule__Objet__Group__5__Impl"


    // $ANTLR start "rule__Objet__Group__6"
    // InternalGame.g:1782:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1786:1: ( rule__Objet__Group__6__Impl )
            // InternalGame.g:1787:2: rule__Objet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__6__Impl();

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
    // $ANTLR end "rule__Objet__Group__6"


    // $ANTLR start "rule__Objet__Group__6__Impl"
    // InternalGame.g:1793:1: rule__Objet__Group__6__Impl : ( ( rule__Objet__QuantiteAssignment_6 ) ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1797:1: ( ( ( rule__Objet__QuantiteAssignment_6 ) ) )
            // InternalGame.g:1798:1: ( ( rule__Objet__QuantiteAssignment_6 ) )
            {
            // InternalGame.g:1798:1: ( ( rule__Objet__QuantiteAssignment_6 ) )
            // InternalGame.g:1799:2: ( rule__Objet__QuantiteAssignment_6 )
            {
             before(grammarAccess.getObjetAccess().getQuantiteAssignment_6()); 
            // InternalGame.g:1800:2: ( rule__Objet__QuantiteAssignment_6 )
            // InternalGame.g:1800:3: rule__Objet__QuantiteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Objet__QuantiteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getQuantiteAssignment_6()); 

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
    // $ANTLR end "rule__Objet__Group__6__Impl"


    // $ANTLR start "rule__ObjetTenu__Group__0"
    // InternalGame.g:1809:1: rule__ObjetTenu__Group__0 : rule__ObjetTenu__Group__0__Impl rule__ObjetTenu__Group__1 ;
    public final void rule__ObjetTenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1813:1: ( rule__ObjetTenu__Group__0__Impl rule__ObjetTenu__Group__1 )
            // InternalGame.g:1814:2: rule__ObjetTenu__Group__0__Impl rule__ObjetTenu__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ObjetTenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group__1();

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
    // $ANTLR end "rule__ObjetTenu__Group__0"


    // $ANTLR start "rule__ObjetTenu__Group__0__Impl"
    // InternalGame.g:1821:1: rule__ObjetTenu__Group__0__Impl : ( ( rule__ObjetTenu__ObjetAssignment_0 ) ) ;
    public final void rule__ObjetTenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1825:1: ( ( ( rule__ObjetTenu__ObjetAssignment_0 ) ) )
            // InternalGame.g:1826:1: ( ( rule__ObjetTenu__ObjetAssignment_0 ) )
            {
            // InternalGame.g:1826:1: ( ( rule__ObjetTenu__ObjetAssignment_0 ) )
            // InternalGame.g:1827:2: ( rule__ObjetTenu__ObjetAssignment_0 )
            {
             before(grammarAccess.getObjetTenuAccess().getObjetAssignment_0()); 
            // InternalGame.g:1828:2: ( rule__ObjetTenu__ObjetAssignment_0 )
            // InternalGame.g:1828:3: rule__ObjetTenu__ObjetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__ObjetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjetTenuAccess().getObjetAssignment_0()); 

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
    // $ANTLR end "rule__ObjetTenu__Group__0__Impl"


    // $ANTLR start "rule__ObjetTenu__Group__1"
    // InternalGame.g:1836:1: rule__ObjetTenu__Group__1 : rule__ObjetTenu__Group__1__Impl rule__ObjetTenu__Group__2 ;
    public final void rule__ObjetTenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1840:1: ( rule__ObjetTenu__Group__1__Impl rule__ObjetTenu__Group__2 )
            // InternalGame.g:1841:2: rule__ObjetTenu__Group__1__Impl rule__ObjetTenu__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ObjetTenu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group__2();

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
    // $ANTLR end "rule__ObjetTenu__Group__1"


    // $ANTLR start "rule__ObjetTenu__Group__1__Impl"
    // InternalGame.g:1848:1: rule__ObjetTenu__Group__1__Impl : ( '*' ) ;
    public final void rule__ObjetTenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1852:1: ( ( '*' ) )
            // InternalGame.g:1853:1: ( '*' )
            {
            // InternalGame.g:1853:1: ( '*' )
            // InternalGame.g:1854:2: '*'
            {
             before(grammarAccess.getObjetTenuAccess().getAsteriskKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__ObjetTenu__Group__1__Impl"


    // $ANTLR start "rule__ObjetTenu__Group__2"
    // InternalGame.g:1863:1: rule__ObjetTenu__Group__2 : rule__ObjetTenu__Group__2__Impl rule__ObjetTenu__Group__3 ;
    public final void rule__ObjetTenu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1867:1: ( rule__ObjetTenu__Group__2__Impl rule__ObjetTenu__Group__3 )
            // InternalGame.g:1868:2: rule__ObjetTenu__Group__2__Impl rule__ObjetTenu__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ObjetTenu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group__3();

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
    // $ANTLR end "rule__ObjetTenu__Group__2"


    // $ANTLR start "rule__ObjetTenu__Group__2__Impl"
    // InternalGame.g:1875:1: rule__ObjetTenu__Group__2__Impl : ( ( rule__ObjetTenu__QuantiteAssignment_2 ) ) ;
    public final void rule__ObjetTenu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1879:1: ( ( ( rule__ObjetTenu__QuantiteAssignment_2 ) ) )
            // InternalGame.g:1880:1: ( ( rule__ObjetTenu__QuantiteAssignment_2 ) )
            {
            // InternalGame.g:1880:1: ( ( rule__ObjetTenu__QuantiteAssignment_2 ) )
            // InternalGame.g:1881:2: ( rule__ObjetTenu__QuantiteAssignment_2 )
            {
             before(grammarAccess.getObjetTenuAccess().getQuantiteAssignment_2()); 
            // InternalGame.g:1882:2: ( rule__ObjetTenu__QuantiteAssignment_2 )
            // InternalGame.g:1882:3: rule__ObjetTenu__QuantiteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__QuantiteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjetTenuAccess().getQuantiteAssignment_2()); 

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
    // $ANTLR end "rule__ObjetTenu__Group__2__Impl"


    // $ANTLR start "rule__ObjetTenu__Group__3"
    // InternalGame.g:1890:1: rule__ObjetTenu__Group__3 : rule__ObjetTenu__Group__3__Impl ;
    public final void rule__ObjetTenu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1894:1: ( rule__ObjetTenu__Group__3__Impl )
            // InternalGame.g:1895:2: rule__ObjetTenu__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group__3__Impl();

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
    // $ANTLR end "rule__ObjetTenu__Group__3"


    // $ANTLR start "rule__ObjetTenu__Group__3__Impl"
    // InternalGame.g:1901:1: rule__ObjetTenu__Group__3__Impl : ( ( rule__ObjetTenu__Group_3__0 )? ) ;
    public final void rule__ObjetTenu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1905:1: ( ( ( rule__ObjetTenu__Group_3__0 )? ) )
            // InternalGame.g:1906:1: ( ( rule__ObjetTenu__Group_3__0 )? )
            {
            // InternalGame.g:1906:1: ( ( rule__ObjetTenu__Group_3__0 )? )
            // InternalGame.g:1907:2: ( rule__ObjetTenu__Group_3__0 )?
            {
             before(grammarAccess.getObjetTenuAccess().getGroup_3()); 
            // InternalGame.g:1908:2: ( rule__ObjetTenu__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:1908:3: rule__ObjetTenu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjetTenu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetTenuAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ObjetTenu__Group__3__Impl"


    // $ANTLR start "rule__ObjetTenu__Group_3__0"
    // InternalGame.g:1917:1: rule__ObjetTenu__Group_3__0 : rule__ObjetTenu__Group_3__0__Impl rule__ObjetTenu__Group_3__1 ;
    public final void rule__ObjetTenu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1921:1: ( rule__ObjetTenu__Group_3__0__Impl rule__ObjetTenu__Group_3__1 )
            // InternalGame.g:1922:2: rule__ObjetTenu__Group_3__0__Impl rule__ObjetTenu__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__ObjetTenu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group_3__1();

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
    // $ANTLR end "rule__ObjetTenu__Group_3__0"


    // $ANTLR start "rule__ObjetTenu__Group_3__0__Impl"
    // InternalGame.g:1929:1: rule__ObjetTenu__Group_3__0__Impl : ( 'visible' ) ;
    public final void rule__ObjetTenu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1933:1: ( ( 'visible' ) )
            // InternalGame.g:1934:1: ( 'visible' )
            {
            // InternalGame.g:1934:1: ( 'visible' )
            // InternalGame.g:1935:2: 'visible'
            {
             before(grammarAccess.getObjetTenuAccess().getVisibleKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getVisibleKeyword_3_0()); 

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
    // $ANTLR end "rule__ObjetTenu__Group_3__0__Impl"


    // $ANTLR start "rule__ObjetTenu__Group_3__1"
    // InternalGame.g:1944:1: rule__ObjetTenu__Group_3__1 : rule__ObjetTenu__Group_3__1__Impl rule__ObjetTenu__Group_3__2 ;
    public final void rule__ObjetTenu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1948:1: ( rule__ObjetTenu__Group_3__1__Impl rule__ObjetTenu__Group_3__2 )
            // InternalGame.g:1949:2: rule__ObjetTenu__Group_3__1__Impl rule__ObjetTenu__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__ObjetTenu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group_3__2();

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
    // $ANTLR end "rule__ObjetTenu__Group_3__1"


    // $ANTLR start "rule__ObjetTenu__Group_3__1__Impl"
    // InternalGame.g:1956:1: rule__ObjetTenu__Group_3__1__Impl : ( 'si' ) ;
    public final void rule__ObjetTenu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1960:1: ( ( 'si' ) )
            // InternalGame.g:1961:1: ( 'si' )
            {
            // InternalGame.g:1961:1: ( 'si' )
            // InternalGame.g:1962:2: 'si'
            {
             before(grammarAccess.getObjetTenuAccess().getSiKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getSiKeyword_3_1()); 

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
    // $ANTLR end "rule__ObjetTenu__Group_3__1__Impl"


    // $ANTLR start "rule__ObjetTenu__Group_3__2"
    // InternalGame.g:1971:1: rule__ObjetTenu__Group_3__2 : rule__ObjetTenu__Group_3__2__Impl rule__ObjetTenu__Group_3__3 ;
    public final void rule__ObjetTenu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1975:1: ( rule__ObjetTenu__Group_3__2__Impl rule__ObjetTenu__Group_3__3 )
            // InternalGame.g:1976:2: rule__ObjetTenu__Group_3__2__Impl rule__ObjetTenu__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__ObjetTenu__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group_3__3();

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
    // $ANTLR end "rule__ObjetTenu__Group_3__2"


    // $ANTLR start "rule__ObjetTenu__Group_3__2__Impl"
    // InternalGame.g:1983:1: rule__ObjetTenu__Group_3__2__Impl : ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 ) ) ;
    public final void rule__ObjetTenu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1987:1: ( ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 ) ) )
            // InternalGame.g:1988:1: ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 ) )
            {
            // InternalGame.g:1988:1: ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 ) )
            // InternalGame.g:1989:2: ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 )
            {
             before(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteAssignment_3_2()); 
            // InternalGame.g:1990:2: ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 )
            // InternalGame.g:1990:3: rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteAssignment_3_2()); 

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
    // $ANTLR end "rule__ObjetTenu__Group_3__2__Impl"


    // $ANTLR start "rule__ObjetTenu__Group_3__3"
    // InternalGame.g:1998:1: rule__ObjetTenu__Group_3__3 : rule__ObjetTenu__Group_3__3__Impl ;
    public final void rule__ObjetTenu__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2002:1: ( rule__ObjetTenu__Group_3__3__Impl )
            // InternalGame.g:2003:2: rule__ObjetTenu__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group_3__3__Impl();

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
    // $ANTLR end "rule__ObjetTenu__Group_3__3"


    // $ANTLR start "rule__ObjetTenu__Group_3__3__Impl"
    // InternalGame.g:2009:1: rule__ObjetTenu__Group_3__3__Impl : ( ( rule__ObjetTenu__Group_3_3__0 )* ) ;
    public final void rule__ObjetTenu__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2013:1: ( ( ( rule__ObjetTenu__Group_3_3__0 )* ) )
            // InternalGame.g:2014:1: ( ( rule__ObjetTenu__Group_3_3__0 )* )
            {
            // InternalGame.g:2014:1: ( ( rule__ObjetTenu__Group_3_3__0 )* )
            // InternalGame.g:2015:2: ( rule__ObjetTenu__Group_3_3__0 )*
            {
             before(grammarAccess.getObjetTenuAccess().getGroup_3_3()); 
            // InternalGame.g:2016:2: ( rule__ObjetTenu__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) ) {
                        int LA14_3 = input.LA(3);

                        if ( (LA14_3==EOF||LA14_3==RULE_ID||LA14_3==17||LA14_3==27||LA14_3==30||LA14_3==43||LA14_3==45||LA14_3==49||LA14_3==56) ) {
                            alt14=1;
                        }


                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:2016:3: rule__ObjetTenu__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ObjetTenu__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getObjetTenuAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__ObjetTenu__Group_3__3__Impl"


    // $ANTLR start "rule__ObjetTenu__Group_3_3__0"
    // InternalGame.g:2025:1: rule__ObjetTenu__Group_3_3__0 : rule__ObjetTenu__Group_3_3__0__Impl rule__ObjetTenu__Group_3_3__1 ;
    public final void rule__ObjetTenu__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2029:1: ( rule__ObjetTenu__Group_3_3__0__Impl rule__ObjetTenu__Group_3_3__1 )
            // InternalGame.g:2030:2: rule__ObjetTenu__Group_3_3__0__Impl rule__ObjetTenu__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjetTenu__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group_3_3__1();

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
    // $ANTLR end "rule__ObjetTenu__Group_3_3__0"


    // $ANTLR start "rule__ObjetTenu__Group_3_3__0__Impl"
    // InternalGame.g:2037:1: rule__ObjetTenu__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ObjetTenu__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2041:1: ( ( ',' ) )
            // InternalGame.g:2042:1: ( ',' )
            {
            // InternalGame.g:2042:1: ( ',' )
            // InternalGame.g:2043:2: ','
            {
             before(grammarAccess.getObjetTenuAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__ObjetTenu__Group_3_3__0__Impl"


    // $ANTLR start "rule__ObjetTenu__Group_3_3__1"
    // InternalGame.g:2052:1: rule__ObjetTenu__Group_3_3__1 : rule__ObjetTenu__Group_3_3__1__Impl ;
    public final void rule__ObjetTenu__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2056:1: ( rule__ObjetTenu__Group_3_3__1__Impl )
            // InternalGame.g:2057:2: rule__ObjetTenu__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__ObjetTenu__Group_3_3__1"


    // $ANTLR start "rule__ObjetTenu__Group_3_3__1__Impl"
    // InternalGame.g:2063:1: rule__ObjetTenu__Group_3_3__1__Impl : ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 ) ) ;
    public final void rule__ObjetTenu__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2067:1: ( ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 ) ) )
            // InternalGame.g:2068:1: ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 ) )
            {
            // InternalGame.g:2068:1: ( ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 ) )
            // InternalGame.g:2069:2: ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 )
            {
             before(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteAssignment_3_3_1()); 
            // InternalGame.g:2070:2: ( rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 )
            // InternalGame.g:2070:3: rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteAssignment_3_3_1()); 

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
    // $ANTLR end "rule__ObjetTenu__Group_3_3__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGame.g:2079:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2083:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGame.g:2084:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGame.g:2091:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__NameAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2095:1: ( ( ( rule__Condition__NameAssignment_0 ) ) )
            // InternalGame.g:2096:1: ( ( rule__Condition__NameAssignment_0 ) )
            {
            // InternalGame.g:2096:1: ( ( rule__Condition__NameAssignment_0 ) )
            // InternalGame.g:2097:2: ( rule__Condition__NameAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_0()); 
            // InternalGame.g:2098:2: ( rule__Condition__NameAssignment_0 )
            // InternalGame.g:2098:3: rule__Condition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGame.g:2106:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2110:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGame.g:2111:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGame.g:2118:1: rule__Condition__Group__1__Impl : ( 'est' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2122:1: ( ( 'est' ) )
            // InternalGame.g:2123:1: ( 'est' )
            {
            // InternalGame.g:2123:1: ( 'est' )
            // InternalGame.g:2124:2: 'est'
            {
             before(grammarAccess.getConditionAccess().getEstKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getEstKeyword_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGame.g:2133:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2137:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalGame.g:2138:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGame.g:2145:1: rule__Condition__Group__2__Impl : ( 'joueur' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2149:1: ( ( 'joueur' ) )
            // InternalGame.g:2150:1: ( 'joueur' )
            {
            // InternalGame.g:2150:1: ( 'joueur' )
            // InternalGame.g:2151:2: 'joueur'
            {
             before(grammarAccess.getConditionAccess().getJoueurKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getJoueurKeyword_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalGame.g:2160:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2164:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalGame.g:2165:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalGame.g:2172:1: rule__Condition__Group__3__Impl : ( 'possede' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2176:1: ( ( 'possede' ) )
            // InternalGame.g:2177:1: ( 'possede' )
            {
            // InternalGame.g:2177:1: ( 'possede' )
            // InternalGame.g:2178:2: 'possede'
            {
             before(grammarAccess.getConditionAccess().getPossedeKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getPossedeKeyword_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalGame.g:2187:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2191:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalGame.g:2192:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalGame.g:2199:1: rule__Condition__Group__4__Impl : ( '(' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2203:1: ( ( '(' ) )
            // InternalGame.g:2204:1: ( '(' )
            {
            // InternalGame.g:2204:1: ( '(' )
            // InternalGame.g:2205:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalGame.g:2214:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2218:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalGame.g:2219:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Condition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__6();

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
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalGame.g:2226:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__Alternatives_5 ) ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2230:1: ( ( ( rule__Condition__Alternatives_5 ) ) )
            // InternalGame.g:2231:1: ( ( rule__Condition__Alternatives_5 ) )
            {
            // InternalGame.g:2231:1: ( ( rule__Condition__Alternatives_5 ) )
            // InternalGame.g:2232:2: ( rule__Condition__Alternatives_5 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_5()); 
            // InternalGame.g:2233:2: ( rule__Condition__Alternatives_5 )
            // InternalGame.g:2233:3: rule__Condition__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__6"
    // InternalGame.g:2241:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2245:1: ( rule__Condition__Group__6__Impl )
            // InternalGame.g:2246:2: rule__Condition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__6__Impl();

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
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // InternalGame.g:2252:1: rule__Condition__Group__6__Impl : ( ')' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2256:1: ( ( ')' ) )
            // InternalGame.g:2257:1: ( ')' )
            {
            // InternalGame.g:2257:1: ( ')' )
            // InternalGame.g:2258:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__Condition__Group_5_0__0"
    // InternalGame.g:2268:1: rule__Condition__Group_5_0__0 : rule__Condition__Group_5_0__0__Impl rule__Condition__Group_5_0__1 ;
    public final void rule__Condition__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2272:1: ( rule__Condition__Group_5_0__0__Impl rule__Condition__Group_5_0__1 )
            // InternalGame.g:2273:2: rule__Condition__Group_5_0__0__Impl rule__Condition__Group_5_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Condition__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5_0__1();

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
    // $ANTLR end "rule__Condition__Group_5_0__0"


    // $ANTLR start "rule__Condition__Group_5_0__0__Impl"
    // InternalGame.g:2280:1: rule__Condition__Group_5_0__0__Impl : ( ( rule__Condition__NegationAssignment_5_0_0 )? ) ;
    public final void rule__Condition__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2284:1: ( ( ( rule__Condition__NegationAssignment_5_0_0 )? ) )
            // InternalGame.g:2285:1: ( ( rule__Condition__NegationAssignment_5_0_0 )? )
            {
            // InternalGame.g:2285:1: ( ( rule__Condition__NegationAssignment_5_0_0 )? )
            // InternalGame.g:2286:2: ( rule__Condition__NegationAssignment_5_0_0 )?
            {
             before(grammarAccess.getConditionAccess().getNegationAssignment_5_0_0()); 
            // InternalGame.g:2287:2: ( rule__Condition__NegationAssignment_5_0_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==57) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:2287:3: rule__Condition__NegationAssignment_5_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__NegationAssignment_5_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getNegationAssignment_5_0_0()); 

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
    // $ANTLR end "rule__Condition__Group_5_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_5_0__1"
    // InternalGame.g:2295:1: rule__Condition__Group_5_0__1 : rule__Condition__Group_5_0__1__Impl rule__Condition__Group_5_0__2 ;
    public final void rule__Condition__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2299:1: ( rule__Condition__Group_5_0__1__Impl rule__Condition__Group_5_0__2 )
            // InternalGame.g:2300:2: rule__Condition__Group_5_0__1__Impl rule__Condition__Group_5_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5_0__2();

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
    // $ANTLR end "rule__Condition__Group_5_0__1"


    // $ANTLR start "rule__Condition__Group_5_0__1__Impl"
    // InternalGame.g:2307:1: rule__Condition__Group_5_0__1__Impl : ( 'objet:' ) ;
    public final void rule__Condition__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2311:1: ( ( 'objet:' ) )
            // InternalGame.g:2312:1: ( 'objet:' )
            {
            // InternalGame.g:2312:1: ( 'objet:' )
            // InternalGame.g:2313:2: 'objet:'
            {
             before(grammarAccess.getConditionAccess().getObjetKeyword_5_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetKeyword_5_0_1()); 

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
    // $ANTLR end "rule__Condition__Group_5_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_5_0__2"
    // InternalGame.g:2322:1: rule__Condition__Group_5_0__2 : rule__Condition__Group_5_0__2__Impl ;
    public final void rule__Condition__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2326:1: ( rule__Condition__Group_5_0__2__Impl )
            // InternalGame.g:2327:2: rule__Condition__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_5_0__2__Impl();

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
    // $ANTLR end "rule__Condition__Group_5_0__2"


    // $ANTLR start "rule__Condition__Group_5_0__2__Impl"
    // InternalGame.g:2333:1: rule__Condition__Group_5_0__2__Impl : ( ( rule__Condition__ObjetAssignment_5_0_2 ) ) ;
    public final void rule__Condition__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2337:1: ( ( ( rule__Condition__ObjetAssignment_5_0_2 ) ) )
            // InternalGame.g:2338:1: ( ( rule__Condition__ObjetAssignment_5_0_2 ) )
            {
            // InternalGame.g:2338:1: ( ( rule__Condition__ObjetAssignment_5_0_2 ) )
            // InternalGame.g:2339:2: ( rule__Condition__ObjetAssignment_5_0_2 )
            {
             before(grammarAccess.getConditionAccess().getObjetAssignment_5_0_2()); 
            // InternalGame.g:2340:2: ( rule__Condition__ObjetAssignment_5_0_2 )
            // InternalGame.g:2340:3: rule__Condition__ObjetAssignment_5_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ObjetAssignment_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getObjetAssignment_5_0_2()); 

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
    // $ANTLR end "rule__Condition__Group_5_0__2__Impl"


    // $ANTLR start "rule__Condition__Group_5_1__0"
    // InternalGame.g:2349:1: rule__Condition__Group_5_1__0 : rule__Condition__Group_5_1__0__Impl rule__Condition__Group_5_1__1 ;
    public final void rule__Condition__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2353:1: ( rule__Condition__Group_5_1__0__Impl rule__Condition__Group_5_1__1 )
            // InternalGame.g:2354:2: rule__Condition__Group_5_1__0__Impl rule__Condition__Group_5_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Condition__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5_1__1();

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
    // $ANTLR end "rule__Condition__Group_5_1__0"


    // $ANTLR start "rule__Condition__Group_5_1__0__Impl"
    // InternalGame.g:2361:1: rule__Condition__Group_5_1__0__Impl : ( ( rule__Condition__NegationAssignment_5_1_0 )? ) ;
    public final void rule__Condition__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2365:1: ( ( ( rule__Condition__NegationAssignment_5_1_0 )? ) )
            // InternalGame.g:2366:1: ( ( rule__Condition__NegationAssignment_5_1_0 )? )
            {
            // InternalGame.g:2366:1: ( ( rule__Condition__NegationAssignment_5_1_0 )? )
            // InternalGame.g:2367:2: ( rule__Condition__NegationAssignment_5_1_0 )?
            {
             before(grammarAccess.getConditionAccess().getNegationAssignment_5_1_0()); 
            // InternalGame.g:2368:2: ( rule__Condition__NegationAssignment_5_1_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==57) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGame.g:2368:3: rule__Condition__NegationAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__NegationAssignment_5_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getNegationAssignment_5_1_0()); 

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
    // $ANTLR end "rule__Condition__Group_5_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_5_1__1"
    // InternalGame.g:2376:1: rule__Condition__Group_5_1__1 : rule__Condition__Group_5_1__1__Impl rule__Condition__Group_5_1__2 ;
    public final void rule__Condition__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2380:1: ( rule__Condition__Group_5_1__1__Impl rule__Condition__Group_5_1__2 )
            // InternalGame.g:2381:2: rule__Condition__Group_5_1__1__Impl rule__Condition__Group_5_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5_1__2();

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
    // $ANTLR end "rule__Condition__Group_5_1__1"


    // $ANTLR start "rule__Condition__Group_5_1__1__Impl"
    // InternalGame.g:2388:1: rule__Condition__Group_5_1__1__Impl : ( 'connaissance:' ) ;
    public final void rule__Condition__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2392:1: ( ( 'connaissance:' ) )
            // InternalGame.g:2393:1: ( 'connaissance:' )
            {
            // InternalGame.g:2393:1: ( 'connaissance:' )
            // InternalGame.g:2394:2: 'connaissance:'
            {
             before(grammarAccess.getConditionAccess().getConnaissanceKeyword_5_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissanceKeyword_5_1_1()); 

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
    // $ANTLR end "rule__Condition__Group_5_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_5_1__2"
    // InternalGame.g:2403:1: rule__Condition__Group_5_1__2 : rule__Condition__Group_5_1__2__Impl ;
    public final void rule__Condition__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2407:1: ( rule__Condition__Group_5_1__2__Impl )
            // InternalGame.g:2408:2: rule__Condition__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_5_1__2__Impl();

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
    // $ANTLR end "rule__Condition__Group_5_1__2"


    // $ANTLR start "rule__Condition__Group_5_1__2__Impl"
    // InternalGame.g:2414:1: rule__Condition__Group_5_1__2__Impl : ( ( rule__Condition__ConnaissanceAssignment_5_1_2 ) ) ;
    public final void rule__Condition__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2418:1: ( ( ( rule__Condition__ConnaissanceAssignment_5_1_2 ) ) )
            // InternalGame.g:2419:1: ( ( rule__Condition__ConnaissanceAssignment_5_1_2 ) )
            {
            // InternalGame.g:2419:1: ( ( rule__Condition__ConnaissanceAssignment_5_1_2 ) )
            // InternalGame.g:2420:2: ( rule__Condition__ConnaissanceAssignment_5_1_2 )
            {
             before(grammarAccess.getConditionAccess().getConnaissanceAssignment_5_1_2()); 
            // InternalGame.g:2421:2: ( rule__Condition__ConnaissanceAssignment_5_1_2 )
            // InternalGame.g:2421:3: rule__Condition__ConnaissanceAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConnaissanceAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConnaissanceAssignment_5_1_2()); 

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
    // $ANTLR end "rule__Condition__Group_5_1__2__Impl"


    // $ANTLR start "rule__PNJ__Group__0"
    // InternalGame.g:2430:1: rule__PNJ__Group__0 : rule__PNJ__Group__0__Impl rule__PNJ__Group__1 ;
    public final void rule__PNJ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2434:1: ( rule__PNJ__Group__0__Impl rule__PNJ__Group__1 )
            // InternalGame.g:2435:2: rule__PNJ__Group__0__Impl rule__PNJ__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__PNJ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__1();

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
    // $ANTLR end "rule__PNJ__Group__0"


    // $ANTLR start "rule__PNJ__Group__0__Impl"
    // InternalGame.g:2442:1: rule__PNJ__Group__0__Impl : ( ( rule__PNJ__NameAssignment_0 ) ) ;
    public final void rule__PNJ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2446:1: ( ( ( rule__PNJ__NameAssignment_0 ) ) )
            // InternalGame.g:2447:1: ( ( rule__PNJ__NameAssignment_0 ) )
            {
            // InternalGame.g:2447:1: ( ( rule__PNJ__NameAssignment_0 ) )
            // InternalGame.g:2448:2: ( rule__PNJ__NameAssignment_0 )
            {
             before(grammarAccess.getPNJAccess().getNameAssignment_0()); 
            // InternalGame.g:2449:2: ( rule__PNJ__NameAssignment_0 )
            // InternalGame.g:2449:3: rule__PNJ__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPNJAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__PNJ__Group__0__Impl"


    // $ANTLR start "rule__PNJ__Group__1"
    // InternalGame.g:2457:1: rule__PNJ__Group__1 : rule__PNJ__Group__1__Impl rule__PNJ__Group__2 ;
    public final void rule__PNJ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2461:1: ( rule__PNJ__Group__1__Impl rule__PNJ__Group__2 )
            // InternalGame.g:2462:2: rule__PNJ__Group__1__Impl rule__PNJ__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__PNJ__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__2();

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
    // $ANTLR end "rule__PNJ__Group__1"


    // $ANTLR start "rule__PNJ__Group__1__Impl"
    // InternalGame.g:2469:1: rule__PNJ__Group__1__Impl : ( 'situe' ) ;
    public final void rule__PNJ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2473:1: ( ( 'situe' ) )
            // InternalGame.g:2474:1: ( 'situe' )
            {
            // InternalGame.g:2474:1: ( 'situe' )
            // InternalGame.g:2475:2: 'situe'
            {
             before(grammarAccess.getPNJAccess().getSitueKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getSitueKeyword_1()); 

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
    // $ANTLR end "rule__PNJ__Group__1__Impl"


    // $ANTLR start "rule__PNJ__Group__2"
    // InternalGame.g:2484:1: rule__PNJ__Group__2 : rule__PNJ__Group__2__Impl rule__PNJ__Group__3 ;
    public final void rule__PNJ__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2488:1: ( rule__PNJ__Group__2__Impl rule__PNJ__Group__3 )
            // InternalGame.g:2489:2: rule__PNJ__Group__2__Impl rule__PNJ__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__PNJ__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__3();

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
    // $ANTLR end "rule__PNJ__Group__2"


    // $ANTLR start "rule__PNJ__Group__2__Impl"
    // InternalGame.g:2496:1: rule__PNJ__Group__2__Impl : ( 'en' ) ;
    public final void rule__PNJ__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2500:1: ( ( 'en' ) )
            // InternalGame.g:2501:1: ( 'en' )
            {
            // InternalGame.g:2501:1: ( 'en' )
            // InternalGame.g:2502:2: 'en'
            {
             before(grammarAccess.getPNJAccess().getEnKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getEnKeyword_2()); 

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
    // $ANTLR end "rule__PNJ__Group__2__Impl"


    // $ANTLR start "rule__PNJ__Group__3"
    // InternalGame.g:2511:1: rule__PNJ__Group__3 : rule__PNJ__Group__3__Impl rule__PNJ__Group__4 ;
    public final void rule__PNJ__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2515:1: ( rule__PNJ__Group__3__Impl rule__PNJ__Group__4 )
            // InternalGame.g:2516:2: rule__PNJ__Group__3__Impl rule__PNJ__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__PNJ__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__4();

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
    // $ANTLR end "rule__PNJ__Group__3"


    // $ANTLR start "rule__PNJ__Group__3__Impl"
    // InternalGame.g:2523:1: rule__PNJ__Group__3__Impl : ( ( rule__PNJ__LieuAssignment_3 ) ) ;
    public final void rule__PNJ__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2527:1: ( ( ( rule__PNJ__LieuAssignment_3 ) ) )
            // InternalGame.g:2528:1: ( ( rule__PNJ__LieuAssignment_3 ) )
            {
            // InternalGame.g:2528:1: ( ( rule__PNJ__LieuAssignment_3 ) )
            // InternalGame.g:2529:2: ( rule__PNJ__LieuAssignment_3 )
            {
             before(grammarAccess.getPNJAccess().getLieuAssignment_3()); 
            // InternalGame.g:2530:2: ( rule__PNJ__LieuAssignment_3 )
            // InternalGame.g:2530:3: rule__PNJ__LieuAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__LieuAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPNJAccess().getLieuAssignment_3()); 

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
    // $ANTLR end "rule__PNJ__Group__3__Impl"


    // $ANTLR start "rule__PNJ__Group__4"
    // InternalGame.g:2538:1: rule__PNJ__Group__4 : rule__PNJ__Group__4__Impl rule__PNJ__Group__5 ;
    public final void rule__PNJ__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2542:1: ( rule__PNJ__Group__4__Impl rule__PNJ__Group__5 )
            // InternalGame.g:2543:2: rule__PNJ__Group__4__Impl rule__PNJ__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__PNJ__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__5();

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
    // $ANTLR end "rule__PNJ__Group__4"


    // $ANTLR start "rule__PNJ__Group__4__Impl"
    // InternalGame.g:2550:1: rule__PNJ__Group__4__Impl : ( 'et' ) ;
    public final void rule__PNJ__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2554:1: ( ( 'et' ) )
            // InternalGame.g:2555:1: ( 'et' )
            {
            // InternalGame.g:2555:1: ( 'et' )
            // InternalGame.g:2556:2: 'et'
            {
             before(grammarAccess.getPNJAccess().getEtKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getEtKeyword_4()); 

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
    // $ANTLR end "rule__PNJ__Group__4__Impl"


    // $ANTLR start "rule__PNJ__Group__5"
    // InternalGame.g:2565:1: rule__PNJ__Group__5 : rule__PNJ__Group__5__Impl rule__PNJ__Group__6 ;
    public final void rule__PNJ__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2569:1: ( rule__PNJ__Group__5__Impl rule__PNJ__Group__6 )
            // InternalGame.g:2570:2: rule__PNJ__Group__5__Impl rule__PNJ__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__PNJ__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__6();

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
    // $ANTLR end "rule__PNJ__Group__5"


    // $ANTLR start "rule__PNJ__Group__5__Impl"
    // InternalGame.g:2577:1: rule__PNJ__Group__5__Impl : ( 'dialogue' ) ;
    public final void rule__PNJ__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2581:1: ( ( 'dialogue' ) )
            // InternalGame.g:2582:1: ( 'dialogue' )
            {
            // InternalGame.g:2582:1: ( 'dialogue' )
            // InternalGame.g:2583:2: 'dialogue'
            {
             before(grammarAccess.getPNJAccess().getDialogueKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getDialogueKeyword_5()); 

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
    // $ANTLR end "rule__PNJ__Group__5__Impl"


    // $ANTLR start "rule__PNJ__Group__6"
    // InternalGame.g:2592:1: rule__PNJ__Group__6 : rule__PNJ__Group__6__Impl rule__PNJ__Group__7 ;
    public final void rule__PNJ__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2596:1: ( rule__PNJ__Group__6__Impl rule__PNJ__Group__7 )
            // InternalGame.g:2597:2: rule__PNJ__Group__6__Impl rule__PNJ__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__PNJ__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__7();

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
    // $ANTLR end "rule__PNJ__Group__6"


    // $ANTLR start "rule__PNJ__Group__6__Impl"
    // InternalGame.g:2604:1: rule__PNJ__Group__6__Impl : ( '{' ) ;
    public final void rule__PNJ__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2608:1: ( ( '{' ) )
            // InternalGame.g:2609:1: ( '{' )
            {
            // InternalGame.g:2609:1: ( '{' )
            // InternalGame.g:2610:2: '{'
            {
             before(grammarAccess.getPNJAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__PNJ__Group__6__Impl"


    // $ANTLR start "rule__PNJ__Group__7"
    // InternalGame.g:2619:1: rule__PNJ__Group__7 : rule__PNJ__Group__7__Impl rule__PNJ__Group__8 ;
    public final void rule__PNJ__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2623:1: ( rule__PNJ__Group__7__Impl rule__PNJ__Group__8 )
            // InternalGame.g:2624:2: rule__PNJ__Group__7__Impl rule__PNJ__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__PNJ__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__8();

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
    // $ANTLR end "rule__PNJ__Group__7"


    // $ANTLR start "rule__PNJ__Group__7__Impl"
    // InternalGame.g:2631:1: rule__PNJ__Group__7__Impl : ( ( rule__PNJ__DialogueAssignment_7 )* ) ;
    public final void rule__PNJ__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2635:1: ( ( ( rule__PNJ__DialogueAssignment_7 )* ) )
            // InternalGame.g:2636:1: ( ( rule__PNJ__DialogueAssignment_7 )* )
            {
            // InternalGame.g:2636:1: ( ( rule__PNJ__DialogueAssignment_7 )* )
            // InternalGame.g:2637:2: ( rule__PNJ__DialogueAssignment_7 )*
            {
             before(grammarAccess.getPNJAccess().getDialogueAssignment_7()); 
            // InternalGame.g:2638:2: ( rule__PNJ__DialogueAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:2638:3: rule__PNJ__DialogueAssignment_7
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__PNJ__DialogueAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPNJAccess().getDialogueAssignment_7()); 

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
    // $ANTLR end "rule__PNJ__Group__7__Impl"


    // $ANTLR start "rule__PNJ__Group__8"
    // InternalGame.g:2646:1: rule__PNJ__Group__8 : rule__PNJ__Group__8__Impl rule__PNJ__Group__9 ;
    public final void rule__PNJ__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2650:1: ( rule__PNJ__Group__8__Impl rule__PNJ__Group__9 )
            // InternalGame.g:2651:2: rule__PNJ__Group__8__Impl rule__PNJ__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__PNJ__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group__9();

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
    // $ANTLR end "rule__PNJ__Group__8"


    // $ANTLR start "rule__PNJ__Group__8__Impl"
    // InternalGame.g:2658:1: rule__PNJ__Group__8__Impl : ( '}' ) ;
    public final void rule__PNJ__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2662:1: ( ( '}' ) )
            // InternalGame.g:2663:1: ( '}' )
            {
            // InternalGame.g:2663:1: ( '}' )
            // InternalGame.g:2664:2: '}'
            {
             before(grammarAccess.getPNJAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__PNJ__Group__8__Impl"


    // $ANTLR start "rule__PNJ__Group__9"
    // InternalGame.g:2673:1: rule__PNJ__Group__9 : rule__PNJ__Group__9__Impl ;
    public final void rule__PNJ__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2677:1: ( rule__PNJ__Group__9__Impl )
            // InternalGame.g:2678:2: rule__PNJ__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__Group__9__Impl();

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
    // $ANTLR end "rule__PNJ__Group__9"


    // $ANTLR start "rule__PNJ__Group__9__Impl"
    // InternalGame.g:2684:1: rule__PNJ__Group__9__Impl : ( ( rule__PNJ__Group_9__0 )? ) ;
    public final void rule__PNJ__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2688:1: ( ( ( rule__PNJ__Group_9__0 )? ) )
            // InternalGame.g:2689:1: ( ( rule__PNJ__Group_9__0 )? )
            {
            // InternalGame.g:2689:1: ( ( rule__PNJ__Group_9__0 )? )
            // InternalGame.g:2690:2: ( rule__PNJ__Group_9__0 )?
            {
             before(grammarAccess.getPNJAccess().getGroup_9()); 
            // InternalGame.g:2691:2: ( rule__PNJ__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:2691:3: rule__PNJ__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PNJ__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPNJAccess().getGroup_9()); 

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
    // $ANTLR end "rule__PNJ__Group__9__Impl"


    // $ANTLR start "rule__PNJ__Group_9__0"
    // InternalGame.g:2700:1: rule__PNJ__Group_9__0 : rule__PNJ__Group_9__0__Impl rule__PNJ__Group_9__1 ;
    public final void rule__PNJ__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2704:1: ( rule__PNJ__Group_9__0__Impl rule__PNJ__Group_9__1 )
            // InternalGame.g:2705:2: rule__PNJ__Group_9__0__Impl rule__PNJ__Group_9__1
            {
            pushFollow(FOLLOW_21);
            rule__PNJ__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group_9__1();

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
    // $ANTLR end "rule__PNJ__Group_9__0"


    // $ANTLR start "rule__PNJ__Group_9__0__Impl"
    // InternalGame.g:2712:1: rule__PNJ__Group_9__0__Impl : ( 'visible' ) ;
    public final void rule__PNJ__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2716:1: ( ( 'visible' ) )
            // InternalGame.g:2717:1: ( 'visible' )
            {
            // InternalGame.g:2717:1: ( 'visible' )
            // InternalGame.g:2718:2: 'visible'
            {
             before(grammarAccess.getPNJAccess().getVisibleKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getVisibleKeyword_9_0()); 

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
    // $ANTLR end "rule__PNJ__Group_9__0__Impl"


    // $ANTLR start "rule__PNJ__Group_9__1"
    // InternalGame.g:2727:1: rule__PNJ__Group_9__1 : rule__PNJ__Group_9__1__Impl rule__PNJ__Group_9__2 ;
    public final void rule__PNJ__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2731:1: ( rule__PNJ__Group_9__1__Impl rule__PNJ__Group_9__2 )
            // InternalGame.g:2732:2: rule__PNJ__Group_9__1__Impl rule__PNJ__Group_9__2
            {
            pushFollow(FOLLOW_3);
            rule__PNJ__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group_9__2();

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
    // $ANTLR end "rule__PNJ__Group_9__1"


    // $ANTLR start "rule__PNJ__Group_9__1__Impl"
    // InternalGame.g:2739:1: rule__PNJ__Group_9__1__Impl : ( 'si' ) ;
    public final void rule__PNJ__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2743:1: ( ( 'si' ) )
            // InternalGame.g:2744:1: ( 'si' )
            {
            // InternalGame.g:2744:1: ( 'si' )
            // InternalGame.g:2745:2: 'si'
            {
             before(grammarAccess.getPNJAccess().getSiKeyword_9_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getSiKeyword_9_1()); 

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
    // $ANTLR end "rule__PNJ__Group_9__1__Impl"


    // $ANTLR start "rule__PNJ__Group_9__2"
    // InternalGame.g:2754:1: rule__PNJ__Group_9__2 : rule__PNJ__Group_9__2__Impl rule__PNJ__Group_9__3 ;
    public final void rule__PNJ__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2758:1: ( rule__PNJ__Group_9__2__Impl rule__PNJ__Group_9__3 )
            // InternalGame.g:2759:2: rule__PNJ__Group_9__2__Impl rule__PNJ__Group_9__3
            {
            pushFollow(FOLLOW_22);
            rule__PNJ__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group_9__3();

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
    // $ANTLR end "rule__PNJ__Group_9__2"


    // $ANTLR start "rule__PNJ__Group_9__2__Impl"
    // InternalGame.g:2766:1: rule__PNJ__Group_9__2__Impl : ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_2 ) ) ;
    public final void rule__PNJ__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2770:1: ( ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_2 ) ) )
            // InternalGame.g:2771:1: ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_2 ) )
            {
            // InternalGame.g:2771:1: ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_2 ) )
            // InternalGame.g:2772:2: ( rule__PNJ__ConditionsVisibiliteAssignment_9_2 )
            {
             before(grammarAccess.getPNJAccess().getConditionsVisibiliteAssignment_9_2()); 
            // InternalGame.g:2773:2: ( rule__PNJ__ConditionsVisibiliteAssignment_9_2 )
            // InternalGame.g:2773:3: rule__PNJ__ConditionsVisibiliteAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__ConditionsVisibiliteAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getPNJAccess().getConditionsVisibiliteAssignment_9_2()); 

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
    // $ANTLR end "rule__PNJ__Group_9__2__Impl"


    // $ANTLR start "rule__PNJ__Group_9__3"
    // InternalGame.g:2781:1: rule__PNJ__Group_9__3 : rule__PNJ__Group_9__3__Impl ;
    public final void rule__PNJ__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2785:1: ( rule__PNJ__Group_9__3__Impl )
            // InternalGame.g:2786:2: rule__PNJ__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__Group_9__3__Impl();

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
    // $ANTLR end "rule__PNJ__Group_9__3"


    // $ANTLR start "rule__PNJ__Group_9__3__Impl"
    // InternalGame.g:2792:1: rule__PNJ__Group_9__3__Impl : ( ( rule__PNJ__Group_9_3__0 )* ) ;
    public final void rule__PNJ__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2796:1: ( ( ( rule__PNJ__Group_9_3__0 )* ) )
            // InternalGame.g:2797:1: ( ( rule__PNJ__Group_9_3__0 )* )
            {
            // InternalGame.g:2797:1: ( ( rule__PNJ__Group_9_3__0 )* )
            // InternalGame.g:2798:2: ( rule__PNJ__Group_9_3__0 )*
            {
             before(grammarAccess.getPNJAccess().getGroup_9_3()); 
            // InternalGame.g:2799:2: ( rule__PNJ__Group_9_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_ID) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==EOF||LA19_3==RULE_ID||LA19_3==17||LA19_3==27||LA19_3==43) ) {
                            alt19=1;
                        }


                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalGame.g:2799:3: rule__PNJ__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PNJ__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPNJAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__PNJ__Group_9__3__Impl"


    // $ANTLR start "rule__PNJ__Group_9_3__0"
    // InternalGame.g:2808:1: rule__PNJ__Group_9_3__0 : rule__PNJ__Group_9_3__0__Impl rule__PNJ__Group_9_3__1 ;
    public final void rule__PNJ__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2812:1: ( rule__PNJ__Group_9_3__0__Impl rule__PNJ__Group_9_3__1 )
            // InternalGame.g:2813:2: rule__PNJ__Group_9_3__0__Impl rule__PNJ__Group_9_3__1
            {
            pushFollow(FOLLOW_3);
            rule__PNJ__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PNJ__Group_9_3__1();

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
    // $ANTLR end "rule__PNJ__Group_9_3__0"


    // $ANTLR start "rule__PNJ__Group_9_3__0__Impl"
    // InternalGame.g:2820:1: rule__PNJ__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__PNJ__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2824:1: ( ( ',' ) )
            // InternalGame.g:2825:1: ( ',' )
            {
            // InternalGame.g:2825:1: ( ',' )
            // InternalGame.g:2826:2: ','
            {
             before(grammarAccess.getPNJAccess().getCommaKeyword_9_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__PNJ__Group_9_3__0__Impl"


    // $ANTLR start "rule__PNJ__Group_9_3__1"
    // InternalGame.g:2835:1: rule__PNJ__Group_9_3__1 : rule__PNJ__Group_9_3__1__Impl ;
    public final void rule__PNJ__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2839:1: ( rule__PNJ__Group_9_3__1__Impl )
            // InternalGame.g:2840:2: rule__PNJ__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__PNJ__Group_9_3__1"


    // $ANTLR start "rule__PNJ__Group_9_3__1__Impl"
    // InternalGame.g:2846:1: rule__PNJ__Group_9_3__1__Impl : ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 ) ) ;
    public final void rule__PNJ__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2850:1: ( ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 ) ) )
            // InternalGame.g:2851:1: ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 ) )
            {
            // InternalGame.g:2851:1: ( ( rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 ) )
            // InternalGame.g:2852:2: ( rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 )
            {
             before(grammarAccess.getPNJAccess().getConditionsVisibiliteAssignment_9_3_1()); 
            // InternalGame.g:2853:2: ( rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 )
            // InternalGame.g:2853:3: rule__PNJ__ConditionsVisibiliteAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PNJ__ConditionsVisibiliteAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPNJAccess().getConditionsVisibiliteAssignment_9_3_1()); 

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
    // $ANTLR end "rule__PNJ__Group_9_3__1__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGame.g:2862:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2866:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGame.g:2867:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Lieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__1();

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
    // $ANTLR end "rule__Lieu__Group__0"


    // $ANTLR start "rule__Lieu__Group__0__Impl"
    // InternalGame.g:2874:1: rule__Lieu__Group__0__Impl : ( ( rule__Lieu__NameAssignment_0 ) ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2878:1: ( ( ( rule__Lieu__NameAssignment_0 ) ) )
            // InternalGame.g:2879:1: ( ( rule__Lieu__NameAssignment_0 ) )
            {
            // InternalGame.g:2879:1: ( ( rule__Lieu__NameAssignment_0 ) )
            // InternalGame.g:2880:2: ( rule__Lieu__NameAssignment_0 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_0()); 
            // InternalGame.g:2881:2: ( rule__Lieu__NameAssignment_0 )
            // InternalGame.g:2881:3: rule__Lieu__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Lieu__Group__0__Impl"


    // $ANTLR start "rule__Lieu__Group__1"
    // InternalGame.g:2889:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2893:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGame.g:2894:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Lieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__2();

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
    // $ANTLR end "rule__Lieu__Group__1"


    // $ANTLR start "rule__Lieu__Group__1__Impl"
    // InternalGame.g:2901:1: rule__Lieu__Group__1__Impl : ( 'est' ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2905:1: ( ( 'est' ) )
            // InternalGame.g:2906:1: ( 'est' )
            {
            // InternalGame.g:2906:1: ( 'est' )
            // InternalGame.g:2907:2: 'est'
            {
             before(grammarAccess.getLieuAccess().getEstKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getEstKeyword_1()); 

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
    // $ANTLR end "rule__Lieu__Group__1__Impl"


    // $ANTLR start "rule__Lieu__Group__2"
    // InternalGame.g:2916:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2920:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGame.g:2921:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Lieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3();

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
    // $ANTLR end "rule__Lieu__Group__2"


    // $ANTLR start "rule__Lieu__Group__2__Impl"
    // InternalGame.g:2928:1: rule__Lieu__Group__2__Impl : ( ( rule__Lieu__TypeAssignment_2 ) ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2932:1: ( ( ( rule__Lieu__TypeAssignment_2 ) ) )
            // InternalGame.g:2933:1: ( ( rule__Lieu__TypeAssignment_2 ) )
            {
            // InternalGame.g:2933:1: ( ( rule__Lieu__TypeAssignment_2 ) )
            // InternalGame.g:2934:2: ( rule__Lieu__TypeAssignment_2 )
            {
             before(grammarAccess.getLieuAccess().getTypeAssignment_2()); 
            // InternalGame.g:2935:2: ( rule__Lieu__TypeAssignment_2 )
            // InternalGame.g:2935:3: rule__Lieu__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Lieu__Group__2__Impl"


    // $ANTLR start "rule__Lieu__Group__3"
    // InternalGame.g:2943:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2947:1: ( rule__Lieu__Group__3__Impl )
            // InternalGame.g:2948:2: rule__Lieu__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3__Impl();

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
    // $ANTLR end "rule__Lieu__Group__3"


    // $ANTLR start "rule__Lieu__Group__3__Impl"
    // InternalGame.g:2954:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__Group_3__0 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2958:1: ( ( ( rule__Lieu__Group_3__0 )? ) )
            // InternalGame.g:2959:1: ( ( rule__Lieu__Group_3__0 )? )
            {
            // InternalGame.g:2959:1: ( ( rule__Lieu__Group_3__0 )? )
            // InternalGame.g:2960:2: ( rule__Lieu__Group_3__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3()); 
            // InternalGame.g:2961:2: ( rule__Lieu__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:2961:3: rule__Lieu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Lieu__Group__3__Impl"


    // $ANTLR start "rule__Lieu__Group_3__0"
    // InternalGame.g:2970:1: rule__Lieu__Group_3__0 : rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 ;
    public final void rule__Lieu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2974:1: ( rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 )
            // InternalGame.g:2975:2: rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__Lieu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__1();

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
    // $ANTLR end "rule__Lieu__Group_3__0"


    // $ANTLR start "rule__Lieu__Group_3__0__Impl"
    // InternalGame.g:2982:1: rule__Lieu__Group_3__0__Impl : ( 'contient (' ) ;
    public final void rule__Lieu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2986:1: ( ( 'contient (' ) )
            // InternalGame.g:2987:1: ( 'contient (' )
            {
            // InternalGame.g:2987:1: ( 'contient (' )
            // InternalGame.g:2988:2: 'contient ('
            {
             before(grammarAccess.getLieuAccess().getContientKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getContientKeyword_3_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3__1"
    // InternalGame.g:2997:1: rule__Lieu__Group_3__1 : rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 ;
    public final void rule__Lieu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3001:1: ( rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 )
            // InternalGame.g:3002:2: rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2
            {
            pushFollow(FOLLOW_42);
            rule__Lieu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__2();

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
    // $ANTLR end "rule__Lieu__Group_3__1"


    // $ANTLR start "rule__Lieu__Group_3__1__Impl"
    // InternalGame.g:3009:1: rule__Lieu__Group_3__1__Impl : ( ( rule__Lieu__Group_3_1__0 )? ) ;
    public final void rule__Lieu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3013:1: ( ( ( rule__Lieu__Group_3_1__0 )? ) )
            // InternalGame.g:3014:1: ( ( rule__Lieu__Group_3_1__0 )? )
            {
            // InternalGame.g:3014:1: ( ( rule__Lieu__Group_3_1__0 )? )
            // InternalGame.g:3015:2: ( rule__Lieu__Group_3_1__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3_1()); 
            // InternalGame.g:3016:2: ( rule__Lieu__Group_3_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:3016:3: rule__Lieu__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3__2"
    // InternalGame.g:3024:1: rule__Lieu__Group_3__2 : rule__Lieu__Group_3__2__Impl rule__Lieu__Group_3__3 ;
    public final void rule__Lieu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3028:1: ( rule__Lieu__Group_3__2__Impl rule__Lieu__Group_3__3 )
            // InternalGame.g:3029:2: rule__Lieu__Group_3__2__Impl rule__Lieu__Group_3__3
            {
            pushFollow(FOLLOW_42);
            rule__Lieu__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__3();

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
    // $ANTLR end "rule__Lieu__Group_3__2"


    // $ANTLR start "rule__Lieu__Group_3__2__Impl"
    // InternalGame.g:3036:1: rule__Lieu__Group_3__2__Impl : ( ( rule__Lieu__Group_3_2__0 )? ) ;
    public final void rule__Lieu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3040:1: ( ( ( rule__Lieu__Group_3_2__0 )? ) )
            // InternalGame.g:3041:1: ( ( rule__Lieu__Group_3_2__0 )? )
            {
            // InternalGame.g:3041:1: ( ( rule__Lieu__Group_3_2__0 )? )
            // InternalGame.g:3042:2: ( rule__Lieu__Group_3_2__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3_2()); 
            // InternalGame.g:3043:2: ( rule__Lieu__Group_3_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGame.g:3043:3: rule__Lieu__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Lieu__Group_3__2__Impl"


    // $ANTLR start "rule__Lieu__Group_3__3"
    // InternalGame.g:3051:1: rule__Lieu__Group_3__3 : rule__Lieu__Group_3__3__Impl rule__Lieu__Group_3__4 ;
    public final void rule__Lieu__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3055:1: ( rule__Lieu__Group_3__3__Impl rule__Lieu__Group_3__4 )
            // InternalGame.g:3056:2: rule__Lieu__Group_3__3__Impl rule__Lieu__Group_3__4
            {
            pushFollow(FOLLOW_42);
            rule__Lieu__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__4();

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
    // $ANTLR end "rule__Lieu__Group_3__3"


    // $ANTLR start "rule__Lieu__Group_3__3__Impl"
    // InternalGame.g:3063:1: rule__Lieu__Group_3__3__Impl : ( ( rule__Lieu__Group_3_3__0 )? ) ;
    public final void rule__Lieu__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3067:1: ( ( ( rule__Lieu__Group_3_3__0 )? ) )
            // InternalGame.g:3068:1: ( ( rule__Lieu__Group_3_3__0 )? )
            {
            // InternalGame.g:3068:1: ( ( rule__Lieu__Group_3_3__0 )? )
            // InternalGame.g:3069:2: ( rule__Lieu__Group_3_3__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3_3()); 
            // InternalGame.g:3070:2: ( rule__Lieu__Group_3_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:3070:3: rule__Lieu__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Lieu__Group_3__3__Impl"


    // $ANTLR start "rule__Lieu__Group_3__4"
    // InternalGame.g:3078:1: rule__Lieu__Group_3__4 : rule__Lieu__Group_3__4__Impl ;
    public final void rule__Lieu__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3082:1: ( rule__Lieu__Group_3__4__Impl )
            // InternalGame.g:3083:2: rule__Lieu__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__4__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3__4"


    // $ANTLR start "rule__Lieu__Group_3__4__Impl"
    // InternalGame.g:3089:1: rule__Lieu__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Lieu__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3093:1: ( ( ')' ) )
            // InternalGame.g:3094:1: ( ')' )
            {
            // InternalGame.g:3094:1: ( ')' )
            // InternalGame.g:3095:2: ')'
            {
             before(grammarAccess.getLieuAccess().getRightParenthesisKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightParenthesisKeyword_3_4()); 

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
    // $ANTLR end "rule__Lieu__Group_3__4__Impl"


    // $ANTLR start "rule__Lieu__Group_3_1__0"
    // InternalGame.g:3105:1: rule__Lieu__Group_3_1__0 : rule__Lieu__Group_3_1__0__Impl rule__Lieu__Group_3_1__1 ;
    public final void rule__Lieu__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3109:1: ( rule__Lieu__Group_3_1__0__Impl rule__Lieu__Group_3_1__1 )
            // InternalGame.g:3110:2: rule__Lieu__Group_3_1__0__Impl rule__Lieu__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_1__1();

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
    // $ANTLR end "rule__Lieu__Group_3_1__0"


    // $ANTLR start "rule__Lieu__Group_3_1__0__Impl"
    // InternalGame.g:3117:1: rule__Lieu__Group_3_1__0__Impl : ( 'PNJs:' ) ;
    public final void rule__Lieu__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3121:1: ( ( 'PNJs:' ) )
            // InternalGame.g:3122:1: ( 'PNJs:' )
            {
            // InternalGame.g:3122:1: ( 'PNJs:' )
            // InternalGame.g:3123:2: 'PNJs:'
            {
             before(grammarAccess.getLieuAccess().getPNJsKeyword_3_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPNJsKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3_1__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3_1__1"
    // InternalGame.g:3132:1: rule__Lieu__Group_3_1__1 : rule__Lieu__Group_3_1__1__Impl rule__Lieu__Group_3_1__2 ;
    public final void rule__Lieu__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3136:1: ( rule__Lieu__Group_3_1__1__Impl rule__Lieu__Group_3_1__2 )
            // InternalGame.g:3137:2: rule__Lieu__Group_3_1__1__Impl rule__Lieu__Group_3_1__2
            {
            pushFollow(FOLLOW_43);
            rule__Lieu__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_1__2();

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
    // $ANTLR end "rule__Lieu__Group_3_1__1"


    // $ANTLR start "rule__Lieu__Group_3_1__1__Impl"
    // InternalGame.g:3144:1: rule__Lieu__Group_3_1__1__Impl : ( ( rule__Lieu__PnjsAssignment_3_1_1 ) ) ;
    public final void rule__Lieu__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3148:1: ( ( ( rule__Lieu__PnjsAssignment_3_1_1 ) ) )
            // InternalGame.g:3149:1: ( ( rule__Lieu__PnjsAssignment_3_1_1 ) )
            {
            // InternalGame.g:3149:1: ( ( rule__Lieu__PnjsAssignment_3_1_1 ) )
            // InternalGame.g:3150:2: ( rule__Lieu__PnjsAssignment_3_1_1 )
            {
             before(grammarAccess.getLieuAccess().getPnjsAssignment_3_1_1()); 
            // InternalGame.g:3151:2: ( rule__Lieu__PnjsAssignment_3_1_1 )
            // InternalGame.g:3151:3: rule__Lieu__PnjsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PnjsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPnjsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3_1__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3_1__2"
    // InternalGame.g:3159:1: rule__Lieu__Group_3_1__2 : rule__Lieu__Group_3_1__2__Impl rule__Lieu__Group_3_1__3 ;
    public final void rule__Lieu__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3163:1: ( rule__Lieu__Group_3_1__2__Impl rule__Lieu__Group_3_1__3 )
            // InternalGame.g:3164:2: rule__Lieu__Group_3_1__2__Impl rule__Lieu__Group_3_1__3
            {
            pushFollow(FOLLOW_43);
            rule__Lieu__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_1__3();

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
    // $ANTLR end "rule__Lieu__Group_3_1__2"


    // $ANTLR start "rule__Lieu__Group_3_1__2__Impl"
    // InternalGame.g:3171:1: rule__Lieu__Group_3_1__2__Impl : ( ( rule__Lieu__Group_3_1_2__0 )* ) ;
    public final void rule__Lieu__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3175:1: ( ( ( rule__Lieu__Group_3_1_2__0 )* ) )
            // InternalGame.g:3176:1: ( ( rule__Lieu__Group_3_1_2__0 )* )
            {
            // InternalGame.g:3176:1: ( ( rule__Lieu__Group_3_1_2__0 )* )
            // InternalGame.g:3177:2: ( rule__Lieu__Group_3_1_2__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_3_1_2()); 
            // InternalGame.g:3178:2: ( rule__Lieu__Group_3_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGame.g:3178:3: rule__Lieu__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Lieu__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_3_1_2()); 

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
    // $ANTLR end "rule__Lieu__Group_3_1__2__Impl"


    // $ANTLR start "rule__Lieu__Group_3_1__3"
    // InternalGame.g:3186:1: rule__Lieu__Group_3_1__3 : rule__Lieu__Group_3_1__3__Impl ;
    public final void rule__Lieu__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3190:1: ( rule__Lieu__Group_3_1__3__Impl )
            // InternalGame.g:3191:2: rule__Lieu__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3_1__3"


    // $ANTLR start "rule__Lieu__Group_3_1__3__Impl"
    // InternalGame.g:3197:1: rule__Lieu__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__Lieu__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3201:1: ( ( ';' ) )
            // InternalGame.g:3202:1: ( ';' )
            {
            // InternalGame.g:3202:1: ( ';' )
            // InternalGame.g:3203:2: ';'
            {
             before(grammarAccess.getLieuAccess().getSemicolonKeyword_3_1_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getSemicolonKeyword_3_1_3()); 

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
    // $ANTLR end "rule__Lieu__Group_3_1__3__Impl"


    // $ANTLR start "rule__Lieu__Group_3_1_2__0"
    // InternalGame.g:3213:1: rule__Lieu__Group_3_1_2__0 : rule__Lieu__Group_3_1_2__0__Impl rule__Lieu__Group_3_1_2__1 ;
    public final void rule__Lieu__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3217:1: ( rule__Lieu__Group_3_1_2__0__Impl rule__Lieu__Group_3_1_2__1 )
            // InternalGame.g:3218:2: rule__Lieu__Group_3_1_2__0__Impl rule__Lieu__Group_3_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_1_2__1();

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
    // $ANTLR end "rule__Lieu__Group_3_1_2__0"


    // $ANTLR start "rule__Lieu__Group_3_1_2__0__Impl"
    // InternalGame.g:3225:1: rule__Lieu__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__Lieu__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3229:1: ( ( ',' ) )
            // InternalGame.g:3230:1: ( ',' )
            {
            // InternalGame.g:3230:1: ( ',' )
            // InternalGame.g:3231:2: ','
            {
             before(grammarAccess.getLieuAccess().getCommaKeyword_3_1_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getCommaKeyword_3_1_2_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3_1_2__1"
    // InternalGame.g:3240:1: rule__Lieu__Group_3_1_2__1 : rule__Lieu__Group_3_1_2__1__Impl ;
    public final void rule__Lieu__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3244:1: ( rule__Lieu__Group_3_1_2__1__Impl )
            // InternalGame.g:3245:2: rule__Lieu__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_1_2__1__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3_1_2__1"


    // $ANTLR start "rule__Lieu__Group_3_1_2__1__Impl"
    // InternalGame.g:3251:1: rule__Lieu__Group_3_1_2__1__Impl : ( ( rule__Lieu__PnjsAssignment_3_1_2_1 ) ) ;
    public final void rule__Lieu__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3255:1: ( ( ( rule__Lieu__PnjsAssignment_3_1_2_1 ) ) )
            // InternalGame.g:3256:1: ( ( rule__Lieu__PnjsAssignment_3_1_2_1 ) )
            {
            // InternalGame.g:3256:1: ( ( rule__Lieu__PnjsAssignment_3_1_2_1 ) )
            // InternalGame.g:3257:2: ( rule__Lieu__PnjsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getLieuAccess().getPnjsAssignment_3_1_2_1()); 
            // InternalGame.g:3258:2: ( rule__Lieu__PnjsAssignment_3_1_2_1 )
            // InternalGame.g:3258:3: rule__Lieu__PnjsAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PnjsAssignment_3_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPnjsAssignment_3_1_2_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3_2__0"
    // InternalGame.g:3267:1: rule__Lieu__Group_3_2__0 : rule__Lieu__Group_3_2__0__Impl rule__Lieu__Group_3_2__1 ;
    public final void rule__Lieu__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3271:1: ( rule__Lieu__Group_3_2__0__Impl rule__Lieu__Group_3_2__1 )
            // InternalGame.g:3272:2: rule__Lieu__Group_3_2__0__Impl rule__Lieu__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_2__1();

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
    // $ANTLR end "rule__Lieu__Group_3_2__0"


    // $ANTLR start "rule__Lieu__Group_3_2__0__Impl"
    // InternalGame.g:3279:1: rule__Lieu__Group_3_2__0__Impl : ( 'objets:' ) ;
    public final void rule__Lieu__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3283:1: ( ( 'objets:' ) )
            // InternalGame.g:3284:1: ( 'objets:' )
            {
            // InternalGame.g:3284:1: ( 'objets:' )
            // InternalGame.g:3285:2: 'objets:'
            {
             before(grammarAccess.getLieuAccess().getObjetsKeyword_3_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getObjetsKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3_2__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3_2__1"
    // InternalGame.g:3294:1: rule__Lieu__Group_3_2__1 : rule__Lieu__Group_3_2__1__Impl rule__Lieu__Group_3_2__2 ;
    public final void rule__Lieu__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3298:1: ( rule__Lieu__Group_3_2__1__Impl rule__Lieu__Group_3_2__2 )
            // InternalGame.g:3299:2: rule__Lieu__Group_3_2__1__Impl rule__Lieu__Group_3_2__2
            {
            pushFollow(FOLLOW_43);
            rule__Lieu__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_2__2();

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
    // $ANTLR end "rule__Lieu__Group_3_2__1"


    // $ANTLR start "rule__Lieu__Group_3_2__1__Impl"
    // InternalGame.g:3306:1: rule__Lieu__Group_3_2__1__Impl : ( ( rule__Lieu__ObjetsAssignment_3_2_1 ) ) ;
    public final void rule__Lieu__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3310:1: ( ( ( rule__Lieu__ObjetsAssignment_3_2_1 ) ) )
            // InternalGame.g:3311:1: ( ( rule__Lieu__ObjetsAssignment_3_2_1 ) )
            {
            // InternalGame.g:3311:1: ( ( rule__Lieu__ObjetsAssignment_3_2_1 ) )
            // InternalGame.g:3312:2: ( rule__Lieu__ObjetsAssignment_3_2_1 )
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_3_2_1()); 
            // InternalGame.g:3313:2: ( rule__Lieu__ObjetsAssignment_3_2_1 )
            // InternalGame.g:3313:3: rule__Lieu__ObjetsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ObjetsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getObjetsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3_2__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3_2__2"
    // InternalGame.g:3321:1: rule__Lieu__Group_3_2__2 : rule__Lieu__Group_3_2__2__Impl rule__Lieu__Group_3_2__3 ;
    public final void rule__Lieu__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3325:1: ( rule__Lieu__Group_3_2__2__Impl rule__Lieu__Group_3_2__3 )
            // InternalGame.g:3326:2: rule__Lieu__Group_3_2__2__Impl rule__Lieu__Group_3_2__3
            {
            pushFollow(FOLLOW_43);
            rule__Lieu__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_2__3();

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
    // $ANTLR end "rule__Lieu__Group_3_2__2"


    // $ANTLR start "rule__Lieu__Group_3_2__2__Impl"
    // InternalGame.g:3333:1: rule__Lieu__Group_3_2__2__Impl : ( ( rule__Lieu__Group_3_2_2__0 )* ) ;
    public final void rule__Lieu__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3337:1: ( ( ( rule__Lieu__Group_3_2_2__0 )* ) )
            // InternalGame.g:3338:1: ( ( rule__Lieu__Group_3_2_2__0 )* )
            {
            // InternalGame.g:3338:1: ( ( rule__Lieu__Group_3_2_2__0 )* )
            // InternalGame.g:3339:2: ( rule__Lieu__Group_3_2_2__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_3_2_2()); 
            // InternalGame.g:3340:2: ( rule__Lieu__Group_3_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGame.g:3340:3: rule__Lieu__Group_3_2_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Lieu__Group_3_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_3_2_2()); 

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
    // $ANTLR end "rule__Lieu__Group_3_2__2__Impl"


    // $ANTLR start "rule__Lieu__Group_3_2__3"
    // InternalGame.g:3348:1: rule__Lieu__Group_3_2__3 : rule__Lieu__Group_3_2__3__Impl ;
    public final void rule__Lieu__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3352:1: ( rule__Lieu__Group_3_2__3__Impl )
            // InternalGame.g:3353:2: rule__Lieu__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_2__3__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3_2__3"


    // $ANTLR start "rule__Lieu__Group_3_2__3__Impl"
    // InternalGame.g:3359:1: rule__Lieu__Group_3_2__3__Impl : ( ';' ) ;
    public final void rule__Lieu__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3363:1: ( ( ';' ) )
            // InternalGame.g:3364:1: ( ';' )
            {
            // InternalGame.g:3364:1: ( ';' )
            // InternalGame.g:3365:2: ';'
            {
             before(grammarAccess.getLieuAccess().getSemicolonKeyword_3_2_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getSemicolonKeyword_3_2_3()); 

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
    // $ANTLR end "rule__Lieu__Group_3_2__3__Impl"


    // $ANTLR start "rule__Lieu__Group_3_2_2__0"
    // InternalGame.g:3375:1: rule__Lieu__Group_3_2_2__0 : rule__Lieu__Group_3_2_2__0__Impl rule__Lieu__Group_3_2_2__1 ;
    public final void rule__Lieu__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3379:1: ( rule__Lieu__Group_3_2_2__0__Impl rule__Lieu__Group_3_2_2__1 )
            // InternalGame.g:3380:2: rule__Lieu__Group_3_2_2__0__Impl rule__Lieu__Group_3_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_2_2__1();

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
    // $ANTLR end "rule__Lieu__Group_3_2_2__0"


    // $ANTLR start "rule__Lieu__Group_3_2_2__0__Impl"
    // InternalGame.g:3387:1: rule__Lieu__Group_3_2_2__0__Impl : ( ',' ) ;
    public final void rule__Lieu__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3391:1: ( ( ',' ) )
            // InternalGame.g:3392:1: ( ',' )
            {
            // InternalGame.g:3392:1: ( ',' )
            // InternalGame.g:3393:2: ','
            {
             before(grammarAccess.getLieuAccess().getCommaKeyword_3_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getCommaKeyword_3_2_2_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3_2_2__1"
    // InternalGame.g:3402:1: rule__Lieu__Group_3_2_2__1 : rule__Lieu__Group_3_2_2__1__Impl ;
    public final void rule__Lieu__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3406:1: ( rule__Lieu__Group_3_2_2__1__Impl )
            // InternalGame.g:3407:2: rule__Lieu__Group_3_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_2_2__1__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3_2_2__1"


    // $ANTLR start "rule__Lieu__Group_3_2_2__1__Impl"
    // InternalGame.g:3413:1: rule__Lieu__Group_3_2_2__1__Impl : ( ( rule__Lieu__ObjetsAssignment_3_2_2_1 ) ) ;
    public final void rule__Lieu__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3417:1: ( ( ( rule__Lieu__ObjetsAssignment_3_2_2_1 ) ) )
            // InternalGame.g:3418:1: ( ( rule__Lieu__ObjetsAssignment_3_2_2_1 ) )
            {
            // InternalGame.g:3418:1: ( ( rule__Lieu__ObjetsAssignment_3_2_2_1 ) )
            // InternalGame.g:3419:2: ( rule__Lieu__ObjetsAssignment_3_2_2_1 )
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_3_2_2_1()); 
            // InternalGame.g:3420:2: ( rule__Lieu__ObjetsAssignment_3_2_2_1 )
            // InternalGame.g:3420:3: rule__Lieu__ObjetsAssignment_3_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ObjetsAssignment_3_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getObjetsAssignment_3_2_2_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3_3__0"
    // InternalGame.g:3429:1: rule__Lieu__Group_3_3__0 : rule__Lieu__Group_3_3__0__Impl rule__Lieu__Group_3_3__1 ;
    public final void rule__Lieu__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3433:1: ( rule__Lieu__Group_3_3__0__Impl rule__Lieu__Group_3_3__1 )
            // InternalGame.g:3434:2: rule__Lieu__Group_3_3__0__Impl rule__Lieu__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_3__1();

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
    // $ANTLR end "rule__Lieu__Group_3_3__0"


    // $ANTLR start "rule__Lieu__Group_3_3__0__Impl"
    // InternalGame.g:3441:1: rule__Lieu__Group_3_3__0__Impl : ( 'connaissances:' ) ;
    public final void rule__Lieu__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3445:1: ( ( 'connaissances:' ) )
            // InternalGame.g:3446:1: ( 'connaissances:' )
            {
            // InternalGame.g:3446:1: ( 'connaissances:' )
            // InternalGame.g:3447:2: 'connaissances:'
            {
             before(grammarAccess.getLieuAccess().getConnaissancesKeyword_3_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3_3__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3_3__1"
    // InternalGame.g:3456:1: rule__Lieu__Group_3_3__1 : rule__Lieu__Group_3_3__1__Impl rule__Lieu__Group_3_3__2 ;
    public final void rule__Lieu__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3460:1: ( rule__Lieu__Group_3_3__1__Impl rule__Lieu__Group_3_3__2 )
            // InternalGame.g:3461:2: rule__Lieu__Group_3_3__1__Impl rule__Lieu__Group_3_3__2
            {
            pushFollow(FOLLOW_43);
            rule__Lieu__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_3__2();

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
    // $ANTLR end "rule__Lieu__Group_3_3__1"


    // $ANTLR start "rule__Lieu__Group_3_3__1__Impl"
    // InternalGame.g:3468:1: rule__Lieu__Group_3_3__1__Impl : ( ( rule__Lieu__ConnaissancesAssignment_3_3_1 ) ) ;
    public final void rule__Lieu__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3472:1: ( ( ( rule__Lieu__ConnaissancesAssignment_3_3_1 ) ) )
            // InternalGame.g:3473:1: ( ( rule__Lieu__ConnaissancesAssignment_3_3_1 ) )
            {
            // InternalGame.g:3473:1: ( ( rule__Lieu__ConnaissancesAssignment_3_3_1 ) )
            // InternalGame.g:3474:2: ( rule__Lieu__ConnaissancesAssignment_3_3_1 )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_3_3_1()); 
            // InternalGame.g:3475:2: ( rule__Lieu__ConnaissancesAssignment_3_3_1 )
            // InternalGame.g:3475:3: rule__Lieu__ConnaissancesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ConnaissancesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getConnaissancesAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3_3__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3_3__2"
    // InternalGame.g:3483:1: rule__Lieu__Group_3_3__2 : rule__Lieu__Group_3_3__2__Impl rule__Lieu__Group_3_3__3 ;
    public final void rule__Lieu__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3487:1: ( rule__Lieu__Group_3_3__2__Impl rule__Lieu__Group_3_3__3 )
            // InternalGame.g:3488:2: rule__Lieu__Group_3_3__2__Impl rule__Lieu__Group_3_3__3
            {
            pushFollow(FOLLOW_43);
            rule__Lieu__Group_3_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_3__3();

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
    // $ANTLR end "rule__Lieu__Group_3_3__2"


    // $ANTLR start "rule__Lieu__Group_3_3__2__Impl"
    // InternalGame.g:3495:1: rule__Lieu__Group_3_3__2__Impl : ( ( rule__Lieu__Group_3_3_2__0 )* ) ;
    public final void rule__Lieu__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3499:1: ( ( ( rule__Lieu__Group_3_3_2__0 )* ) )
            // InternalGame.g:3500:1: ( ( rule__Lieu__Group_3_3_2__0 )* )
            {
            // InternalGame.g:3500:1: ( ( rule__Lieu__Group_3_3_2__0 )* )
            // InternalGame.g:3501:2: ( rule__Lieu__Group_3_3_2__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_3_3_2()); 
            // InternalGame.g:3502:2: ( rule__Lieu__Group_3_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==27) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGame.g:3502:3: rule__Lieu__Group_3_3_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Lieu__Group_3_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_3_3_2()); 

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
    // $ANTLR end "rule__Lieu__Group_3_3__2__Impl"


    // $ANTLR start "rule__Lieu__Group_3_3__3"
    // InternalGame.g:3510:1: rule__Lieu__Group_3_3__3 : rule__Lieu__Group_3_3__3__Impl ;
    public final void rule__Lieu__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3514:1: ( rule__Lieu__Group_3_3__3__Impl )
            // InternalGame.g:3515:2: rule__Lieu__Group_3_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_3__3__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3_3__3"


    // $ANTLR start "rule__Lieu__Group_3_3__3__Impl"
    // InternalGame.g:3521:1: rule__Lieu__Group_3_3__3__Impl : ( ';' ) ;
    public final void rule__Lieu__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3525:1: ( ( ';' ) )
            // InternalGame.g:3526:1: ( ';' )
            {
            // InternalGame.g:3526:1: ( ';' )
            // InternalGame.g:3527:2: ';'
            {
             before(grammarAccess.getLieuAccess().getSemicolonKeyword_3_3_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getSemicolonKeyword_3_3_3()); 

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
    // $ANTLR end "rule__Lieu__Group_3_3__3__Impl"


    // $ANTLR start "rule__Lieu__Group_3_3_2__0"
    // InternalGame.g:3537:1: rule__Lieu__Group_3_3_2__0 : rule__Lieu__Group_3_3_2__0__Impl rule__Lieu__Group_3_3_2__1 ;
    public final void rule__Lieu__Group_3_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3541:1: ( rule__Lieu__Group_3_3_2__0__Impl rule__Lieu__Group_3_3_2__1 )
            // InternalGame.g:3542:2: rule__Lieu__Group_3_3_2__0__Impl rule__Lieu__Group_3_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_3_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_3_2__1();

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
    // $ANTLR end "rule__Lieu__Group_3_3_2__0"


    // $ANTLR start "rule__Lieu__Group_3_3_2__0__Impl"
    // InternalGame.g:3549:1: rule__Lieu__Group_3_3_2__0__Impl : ( ',' ) ;
    public final void rule__Lieu__Group_3_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3553:1: ( ( ',' ) )
            // InternalGame.g:3554:1: ( ',' )
            {
            // InternalGame.g:3554:1: ( ',' )
            // InternalGame.g:3555:2: ','
            {
             before(grammarAccess.getLieuAccess().getCommaKeyword_3_3_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getCommaKeyword_3_3_2_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3_3_2__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3_3_2__1"
    // InternalGame.g:3564:1: rule__Lieu__Group_3_3_2__1 : rule__Lieu__Group_3_3_2__1__Impl ;
    public final void rule__Lieu__Group_3_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3568:1: ( rule__Lieu__Group_3_3_2__1__Impl )
            // InternalGame.g:3569:2: rule__Lieu__Group_3_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3_3_2__1__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3_3_2__1"


    // $ANTLR start "rule__Lieu__Group_3_3_2__1__Impl"
    // InternalGame.g:3575:1: rule__Lieu__Group_3_3_2__1__Impl : ( ( rule__Lieu__ConnaissancesAssignment_3_3_2_1 ) ) ;
    public final void rule__Lieu__Group_3_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3579:1: ( ( ( rule__Lieu__ConnaissancesAssignment_3_3_2_1 ) ) )
            // InternalGame.g:3580:1: ( ( rule__Lieu__ConnaissancesAssignment_3_3_2_1 ) )
            {
            // InternalGame.g:3580:1: ( ( rule__Lieu__ConnaissancesAssignment_3_3_2_1 ) )
            // InternalGame.g:3581:2: ( rule__Lieu__ConnaissancesAssignment_3_3_2_1 )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_3_3_2_1()); 
            // InternalGame.g:3582:2: ( rule__Lieu__ConnaissancesAssignment_3_3_2_1 )
            // InternalGame.g:3582:3: rule__Lieu__ConnaissancesAssignment_3_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ConnaissancesAssignment_3_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getConnaissancesAssignment_3_3_2_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3_3_2__1__Impl"


    // $ANTLR start "rule__Dialogue__Group__0"
    // InternalGame.g:3591:1: rule__Dialogue__Group__0 : rule__Dialogue__Group__0__Impl rule__Dialogue__Group__1 ;
    public final void rule__Dialogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3595:1: ( rule__Dialogue__Group__0__Impl rule__Dialogue__Group__1 )
            // InternalGame.g:3596:2: rule__Dialogue__Group__0__Impl rule__Dialogue__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Dialogue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__1();

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
    // $ANTLR end "rule__Dialogue__Group__0"


    // $ANTLR start "rule__Dialogue__Group__0__Impl"
    // InternalGame.g:3603:1: rule__Dialogue__Group__0__Impl : ( ( rule__Dialogue__TexteAssignment_0 ) ) ;
    public final void rule__Dialogue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3607:1: ( ( ( rule__Dialogue__TexteAssignment_0 ) ) )
            // InternalGame.g:3608:1: ( ( rule__Dialogue__TexteAssignment_0 ) )
            {
            // InternalGame.g:3608:1: ( ( rule__Dialogue__TexteAssignment_0 ) )
            // InternalGame.g:3609:2: ( rule__Dialogue__TexteAssignment_0 )
            {
             before(grammarAccess.getDialogueAccess().getTexteAssignment_0()); 
            // InternalGame.g:3610:2: ( rule__Dialogue__TexteAssignment_0 )
            // InternalGame.g:3610:3: rule__Dialogue__TexteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__TexteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDialogueAccess().getTexteAssignment_0()); 

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
    // $ANTLR end "rule__Dialogue__Group__0__Impl"


    // $ANTLR start "rule__Dialogue__Group__1"
    // InternalGame.g:3618:1: rule__Dialogue__Group__1 : rule__Dialogue__Group__1__Impl rule__Dialogue__Group__2 ;
    public final void rule__Dialogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3622:1: ( rule__Dialogue__Group__1__Impl rule__Dialogue__Group__2 )
            // InternalGame.g:3623:2: rule__Dialogue__Group__1__Impl rule__Dialogue__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Dialogue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__2();

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
    // $ANTLR end "rule__Dialogue__Group__1"


    // $ANTLR start "rule__Dialogue__Group__1__Impl"
    // InternalGame.g:3630:1: rule__Dialogue__Group__1__Impl : ( 'propose' ) ;
    public final void rule__Dialogue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3634:1: ( ( 'propose' ) )
            // InternalGame.g:3635:1: ( 'propose' )
            {
            // InternalGame.g:3635:1: ( 'propose' )
            // InternalGame.g:3636:2: 'propose'
            {
             before(grammarAccess.getDialogueAccess().getProposeKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getProposeKeyword_1()); 

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
    // $ANTLR end "rule__Dialogue__Group__1__Impl"


    // $ANTLR start "rule__Dialogue__Group__2"
    // InternalGame.g:3645:1: rule__Dialogue__Group__2 : rule__Dialogue__Group__2__Impl rule__Dialogue__Group__3 ;
    public final void rule__Dialogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3649:1: ( rule__Dialogue__Group__2__Impl rule__Dialogue__Group__3 )
            // InternalGame.g:3650:2: rule__Dialogue__Group__2__Impl rule__Dialogue__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Dialogue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__3();

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
    // $ANTLR end "rule__Dialogue__Group__2"


    // $ANTLR start "rule__Dialogue__Group__2__Impl"
    // InternalGame.g:3657:1: rule__Dialogue__Group__2__Impl : ( '{' ) ;
    public final void rule__Dialogue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3661:1: ( ( '{' ) )
            // InternalGame.g:3662:1: ( '{' )
            {
            // InternalGame.g:3662:1: ( '{' )
            // InternalGame.g:3663:2: '{'
            {
             before(grammarAccess.getDialogueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Dialogue__Group__2__Impl"


    // $ANTLR start "rule__Dialogue__Group__3"
    // InternalGame.g:3672:1: rule__Dialogue__Group__3 : rule__Dialogue__Group__3__Impl rule__Dialogue__Group__4 ;
    public final void rule__Dialogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3676:1: ( rule__Dialogue__Group__3__Impl rule__Dialogue__Group__4 )
            // InternalGame.g:3677:2: rule__Dialogue__Group__3__Impl rule__Dialogue__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Dialogue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__4();

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
    // $ANTLR end "rule__Dialogue__Group__3"


    // $ANTLR start "rule__Dialogue__Group__3__Impl"
    // InternalGame.g:3684:1: rule__Dialogue__Group__3__Impl : ( ( rule__Dialogue__ReponsesAssignment_3 )* ) ;
    public final void rule__Dialogue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3688:1: ( ( ( rule__Dialogue__ReponsesAssignment_3 )* ) )
            // InternalGame.g:3689:1: ( ( rule__Dialogue__ReponsesAssignment_3 )* )
            {
            // InternalGame.g:3689:1: ( ( rule__Dialogue__ReponsesAssignment_3 )* )
            // InternalGame.g:3690:2: ( rule__Dialogue__ReponsesAssignment_3 )*
            {
             before(grammarAccess.getDialogueAccess().getReponsesAssignment_3()); 
            // InternalGame.g:3691:2: ( rule__Dialogue__ReponsesAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGame.g:3691:3: rule__Dialogue__ReponsesAssignment_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Dialogue__ReponsesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDialogueAccess().getReponsesAssignment_3()); 

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
    // $ANTLR end "rule__Dialogue__Group__3__Impl"


    // $ANTLR start "rule__Dialogue__Group__4"
    // InternalGame.g:3699:1: rule__Dialogue__Group__4 : rule__Dialogue__Group__4__Impl rule__Dialogue__Group__5 ;
    public final void rule__Dialogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3703:1: ( rule__Dialogue__Group__4__Impl rule__Dialogue__Group__5 )
            // InternalGame.g:3704:2: rule__Dialogue__Group__4__Impl rule__Dialogue__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Dialogue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__5();

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
    // $ANTLR end "rule__Dialogue__Group__4"


    // $ANTLR start "rule__Dialogue__Group__4__Impl"
    // InternalGame.g:3711:1: rule__Dialogue__Group__4__Impl : ( '}' ) ;
    public final void rule__Dialogue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3715:1: ( ( '}' ) )
            // InternalGame.g:3716:1: ( '}' )
            {
            // InternalGame.g:3716:1: ( '}' )
            // InternalGame.g:3717:2: '}'
            {
             before(grammarAccess.getDialogueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Dialogue__Group__4__Impl"


    // $ANTLR start "rule__Dialogue__Group__5"
    // InternalGame.g:3726:1: rule__Dialogue__Group__5 : rule__Dialogue__Group__5__Impl ;
    public final void rule__Dialogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3730:1: ( rule__Dialogue__Group__5__Impl )
            // InternalGame.g:3731:2: rule__Dialogue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__Group__5__Impl();

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
    // $ANTLR end "rule__Dialogue__Group__5"


    // $ANTLR start "rule__Dialogue__Group__5__Impl"
    // InternalGame.g:3737:1: rule__Dialogue__Group__5__Impl : ( ( rule__Dialogue__Group_5__0 )? ) ;
    public final void rule__Dialogue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3741:1: ( ( ( rule__Dialogue__Group_5__0 )? ) )
            // InternalGame.g:3742:1: ( ( rule__Dialogue__Group_5__0 )? )
            {
            // InternalGame.g:3742:1: ( ( rule__Dialogue__Group_5__0 )? )
            // InternalGame.g:3743:2: ( rule__Dialogue__Group_5__0 )?
            {
             before(grammarAccess.getDialogueAccess().getGroup_5()); 
            // InternalGame.g:3744:2: ( rule__Dialogue__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:3744:3: rule__Dialogue__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dialogue__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Dialogue__Group__5__Impl"


    // $ANTLR start "rule__Dialogue__Group_5__0"
    // InternalGame.g:3753:1: rule__Dialogue__Group_5__0 : rule__Dialogue__Group_5__0__Impl rule__Dialogue__Group_5__1 ;
    public final void rule__Dialogue__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3757:1: ( rule__Dialogue__Group_5__0__Impl rule__Dialogue__Group_5__1 )
            // InternalGame.g:3758:2: rule__Dialogue__Group_5__0__Impl rule__Dialogue__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__Dialogue__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group_5__1();

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
    // $ANTLR end "rule__Dialogue__Group_5__0"


    // $ANTLR start "rule__Dialogue__Group_5__0__Impl"
    // InternalGame.g:3765:1: rule__Dialogue__Group_5__0__Impl : ( 'visible' ) ;
    public final void rule__Dialogue__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3769:1: ( ( 'visible' ) )
            // InternalGame.g:3770:1: ( 'visible' )
            {
            // InternalGame.g:3770:1: ( 'visible' )
            // InternalGame.g:3771:2: 'visible'
            {
             before(grammarAccess.getDialogueAccess().getVisibleKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getVisibleKeyword_5_0()); 

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
    // $ANTLR end "rule__Dialogue__Group_5__0__Impl"


    // $ANTLR start "rule__Dialogue__Group_5__1"
    // InternalGame.g:3780:1: rule__Dialogue__Group_5__1 : rule__Dialogue__Group_5__1__Impl rule__Dialogue__Group_5__2 ;
    public final void rule__Dialogue__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3784:1: ( rule__Dialogue__Group_5__1__Impl rule__Dialogue__Group_5__2 )
            // InternalGame.g:3785:2: rule__Dialogue__Group_5__1__Impl rule__Dialogue__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Dialogue__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group_5__2();

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
    // $ANTLR end "rule__Dialogue__Group_5__1"


    // $ANTLR start "rule__Dialogue__Group_5__1__Impl"
    // InternalGame.g:3792:1: rule__Dialogue__Group_5__1__Impl : ( 'si' ) ;
    public final void rule__Dialogue__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3796:1: ( ( 'si' ) )
            // InternalGame.g:3797:1: ( 'si' )
            {
            // InternalGame.g:3797:1: ( 'si' )
            // InternalGame.g:3798:2: 'si'
            {
             before(grammarAccess.getDialogueAccess().getSiKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getSiKeyword_5_1()); 

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
    // $ANTLR end "rule__Dialogue__Group_5__1__Impl"


    // $ANTLR start "rule__Dialogue__Group_5__2"
    // InternalGame.g:3807:1: rule__Dialogue__Group_5__2 : rule__Dialogue__Group_5__2__Impl rule__Dialogue__Group_5__3 ;
    public final void rule__Dialogue__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3811:1: ( rule__Dialogue__Group_5__2__Impl rule__Dialogue__Group_5__3 )
            // InternalGame.g:3812:2: rule__Dialogue__Group_5__2__Impl rule__Dialogue__Group_5__3
            {
            pushFollow(FOLLOW_22);
            rule__Dialogue__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group_5__3();

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
    // $ANTLR end "rule__Dialogue__Group_5__2"


    // $ANTLR start "rule__Dialogue__Group_5__2__Impl"
    // InternalGame.g:3819:1: rule__Dialogue__Group_5__2__Impl : ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_2 ) ) ;
    public final void rule__Dialogue__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3823:1: ( ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_2 ) ) )
            // InternalGame.g:3824:1: ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_2 ) )
            {
            // InternalGame.g:3824:1: ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_2 ) )
            // InternalGame.g:3825:2: ( rule__Dialogue__ConditionsVisibiliteAssignment_5_2 )
            {
             before(grammarAccess.getDialogueAccess().getConditionsVisibiliteAssignment_5_2()); 
            // InternalGame.g:3826:2: ( rule__Dialogue__ConditionsVisibiliteAssignment_5_2 )
            // InternalGame.g:3826:3: rule__Dialogue__ConditionsVisibiliteAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__ConditionsVisibiliteAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDialogueAccess().getConditionsVisibiliteAssignment_5_2()); 

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
    // $ANTLR end "rule__Dialogue__Group_5__2__Impl"


    // $ANTLR start "rule__Dialogue__Group_5__3"
    // InternalGame.g:3834:1: rule__Dialogue__Group_5__3 : rule__Dialogue__Group_5__3__Impl ;
    public final void rule__Dialogue__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3838:1: ( rule__Dialogue__Group_5__3__Impl )
            // InternalGame.g:3839:2: rule__Dialogue__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__Group_5__3__Impl();

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
    // $ANTLR end "rule__Dialogue__Group_5__3"


    // $ANTLR start "rule__Dialogue__Group_5__3__Impl"
    // InternalGame.g:3845:1: rule__Dialogue__Group_5__3__Impl : ( ( rule__Dialogue__Group_5_3__0 )* ) ;
    public final void rule__Dialogue__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3849:1: ( ( ( rule__Dialogue__Group_5_3__0 )* ) )
            // InternalGame.g:3850:1: ( ( rule__Dialogue__Group_5_3__0 )* )
            {
            // InternalGame.g:3850:1: ( ( rule__Dialogue__Group_5_3__0 )* )
            // InternalGame.g:3851:2: ( rule__Dialogue__Group_5_3__0 )*
            {
             before(grammarAccess.getDialogueAccess().getGroup_5_3()); 
            // InternalGame.g:3852:2: ( rule__Dialogue__Group_5_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGame.g:3852:3: rule__Dialogue__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Dialogue__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDialogueAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Dialogue__Group_5__3__Impl"


    // $ANTLR start "rule__Dialogue__Group_5_3__0"
    // InternalGame.g:3861:1: rule__Dialogue__Group_5_3__0 : rule__Dialogue__Group_5_3__0__Impl rule__Dialogue__Group_5_3__1 ;
    public final void rule__Dialogue__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3865:1: ( rule__Dialogue__Group_5_3__0__Impl rule__Dialogue__Group_5_3__1 )
            // InternalGame.g:3866:2: rule__Dialogue__Group_5_3__0__Impl rule__Dialogue__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Dialogue__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dialogue__Group_5_3__1();

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
    // $ANTLR end "rule__Dialogue__Group_5_3__0"


    // $ANTLR start "rule__Dialogue__Group_5_3__0__Impl"
    // InternalGame.g:3873:1: rule__Dialogue__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Dialogue__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3877:1: ( ( ',' ) )
            // InternalGame.g:3878:1: ( ',' )
            {
            // InternalGame.g:3878:1: ( ',' )
            // InternalGame.g:3879:2: ','
            {
             before(grammarAccess.getDialogueAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Dialogue__Group_5_3__0__Impl"


    // $ANTLR start "rule__Dialogue__Group_5_3__1"
    // InternalGame.g:3888:1: rule__Dialogue__Group_5_3__1 : rule__Dialogue__Group_5_3__1__Impl ;
    public final void rule__Dialogue__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3892:1: ( rule__Dialogue__Group_5_3__1__Impl )
            // InternalGame.g:3893:2: rule__Dialogue__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Dialogue__Group_5_3__1"


    // $ANTLR start "rule__Dialogue__Group_5_3__1__Impl"
    // InternalGame.g:3899:1: rule__Dialogue__Group_5_3__1__Impl : ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 ) ) ;
    public final void rule__Dialogue__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3903:1: ( ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 ) ) )
            // InternalGame.g:3904:1: ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 ) )
            {
            // InternalGame.g:3904:1: ( ( rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 ) )
            // InternalGame.g:3905:2: ( rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 )
            {
             before(grammarAccess.getDialogueAccess().getConditionsVisibiliteAssignment_5_3_1()); 
            // InternalGame.g:3906:2: ( rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 )
            // InternalGame.g:3906:3: rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDialogueAccess().getConditionsVisibiliteAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Dialogue__Group_5_3__1__Impl"


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGame.g:3915:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3919:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGame.g:3920:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Choix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__1();

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
    // $ANTLR end "rule__Choix__Group__0"


    // $ANTLR start "rule__Choix__Group__0__Impl"
    // InternalGame.g:3927:1: rule__Choix__Group__0__Impl : ( ( rule__Choix__TexteAssignment_0 ) ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3931:1: ( ( ( rule__Choix__TexteAssignment_0 ) ) )
            // InternalGame.g:3932:1: ( ( rule__Choix__TexteAssignment_0 ) )
            {
            // InternalGame.g:3932:1: ( ( rule__Choix__TexteAssignment_0 ) )
            // InternalGame.g:3933:2: ( rule__Choix__TexteAssignment_0 )
            {
             before(grammarAccess.getChoixAccess().getTexteAssignment_0()); 
            // InternalGame.g:3934:2: ( rule__Choix__TexteAssignment_0 )
            // InternalGame.g:3934:3: rule__Choix__TexteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__TexteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getTexteAssignment_0()); 

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
    // $ANTLR end "rule__Choix__Group__0__Impl"


    // $ANTLR start "rule__Choix__Group__1"
    // InternalGame.g:3942:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3946:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGame.g:3947:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Choix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__2();

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
    // $ANTLR end "rule__Choix__Group__1"


    // $ANTLR start "rule__Choix__Group__1__Impl"
    // InternalGame.g:3954:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__Group_1__0 )? ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3958:1: ( ( ( rule__Choix__Group_1__0 )? ) )
            // InternalGame.g:3959:1: ( ( rule__Choix__Group_1__0 )? )
            {
            // InternalGame.g:3959:1: ( ( rule__Choix__Group_1__0 )? )
            // InternalGame.g:3960:2: ( rule__Choix__Group_1__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_1()); 
            // InternalGame.g:3961:2: ( rule__Choix__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGame.g:3961:3: rule__Choix__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Choix__Group__1__Impl"


    // $ANTLR start "rule__Choix__Group__2"
    // InternalGame.g:3969:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3973:1: ( rule__Choix__Group__2__Impl )
            // InternalGame.g:3974:2: rule__Choix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__2__Impl();

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
    // $ANTLR end "rule__Choix__Group__2"


    // $ANTLR start "rule__Choix__Group__2__Impl"
    // InternalGame.g:3980:1: rule__Choix__Group__2__Impl : ( ( rule__Choix__Group_2__0 )? ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3984:1: ( ( ( rule__Choix__Group_2__0 )? ) )
            // InternalGame.g:3985:1: ( ( rule__Choix__Group_2__0 )? )
            {
            // InternalGame.g:3985:1: ( ( rule__Choix__Group_2__0 )? )
            // InternalGame.g:3986:2: ( rule__Choix__Group_2__0 )?
            {
             before(grammarAccess.getChoixAccess().getGroup_2()); 
            // InternalGame.g:3987:2: ( rule__Choix__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:3987:3: rule__Choix__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choix__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoixAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Choix__Group__2__Impl"


    // $ANTLR start "rule__Choix__Group_1__0"
    // InternalGame.g:3996:1: rule__Choix__Group_1__0 : rule__Choix__Group_1__0__Impl rule__Choix__Group_1__1 ;
    public final void rule__Choix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4000:1: ( rule__Choix__Group_1__0__Impl rule__Choix__Group_1__1 )
            // InternalGame.g:4001:2: rule__Choix__Group_1__0__Impl rule__Choix__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_1__1();

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
    // $ANTLR end "rule__Choix__Group_1__0"


    // $ANTLR start "rule__Choix__Group_1__0__Impl"
    // InternalGame.g:4008:1: rule__Choix__Group_1__0__Impl : ( 'implique' ) ;
    public final void rule__Choix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4012:1: ( ( 'implique' ) )
            // InternalGame.g:4013:1: ( 'implique' )
            {
            // InternalGame.g:4013:1: ( 'implique' )
            // InternalGame.g:4014:2: 'implique'
            {
             before(grammarAccess.getChoixAccess().getImpliqueKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getImpliqueKeyword_1_0()); 

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
    // $ANTLR end "rule__Choix__Group_1__0__Impl"


    // $ANTLR start "rule__Choix__Group_1__1"
    // InternalGame.g:4023:1: rule__Choix__Group_1__1 : rule__Choix__Group_1__1__Impl rule__Choix__Group_1__2 ;
    public final void rule__Choix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4027:1: ( rule__Choix__Group_1__1__Impl rule__Choix__Group_1__2 )
            // InternalGame.g:4028:2: rule__Choix__Group_1__1__Impl rule__Choix__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Choix__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_1__2();

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
    // $ANTLR end "rule__Choix__Group_1__1"


    // $ANTLR start "rule__Choix__Group_1__1__Impl"
    // InternalGame.g:4035:1: rule__Choix__Group_1__1__Impl : ( ( rule__Choix__ActionsAssignment_1_1 ) ) ;
    public final void rule__Choix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4039:1: ( ( ( rule__Choix__ActionsAssignment_1_1 ) ) )
            // InternalGame.g:4040:1: ( ( rule__Choix__ActionsAssignment_1_1 ) )
            {
            // InternalGame.g:4040:1: ( ( rule__Choix__ActionsAssignment_1_1 ) )
            // InternalGame.g:4041:2: ( rule__Choix__ActionsAssignment_1_1 )
            {
             before(grammarAccess.getChoixAccess().getActionsAssignment_1_1()); 
            // InternalGame.g:4042:2: ( rule__Choix__ActionsAssignment_1_1 )
            // InternalGame.g:4042:3: rule__Choix__ActionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ActionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getActionsAssignment_1_1()); 

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
    // $ANTLR end "rule__Choix__Group_1__1__Impl"


    // $ANTLR start "rule__Choix__Group_1__2"
    // InternalGame.g:4050:1: rule__Choix__Group_1__2 : rule__Choix__Group_1__2__Impl ;
    public final void rule__Choix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4054:1: ( rule__Choix__Group_1__2__Impl )
            // InternalGame.g:4055:2: rule__Choix__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_1__2__Impl();

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
    // $ANTLR end "rule__Choix__Group_1__2"


    // $ANTLR start "rule__Choix__Group_1__2__Impl"
    // InternalGame.g:4061:1: rule__Choix__Group_1__2__Impl : ( ( rule__Choix__Group_1_2__0 )* ) ;
    public final void rule__Choix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4065:1: ( ( ( rule__Choix__Group_1_2__0 )* ) )
            // InternalGame.g:4066:1: ( ( rule__Choix__Group_1_2__0 )* )
            {
            // InternalGame.g:4066:1: ( ( rule__Choix__Group_1_2__0 )* )
            // InternalGame.g:4067:2: ( rule__Choix__Group_1_2__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_1_2()); 
            // InternalGame.g:4068:2: ( rule__Choix__Group_1_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGame.g:4068:3: rule__Choix__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Choix__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Choix__Group_1__2__Impl"


    // $ANTLR start "rule__Choix__Group_1_2__0"
    // InternalGame.g:4077:1: rule__Choix__Group_1_2__0 : rule__Choix__Group_1_2__0__Impl rule__Choix__Group_1_2__1 ;
    public final void rule__Choix__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4081:1: ( rule__Choix__Group_1_2__0__Impl rule__Choix__Group_1_2__1 )
            // InternalGame.g:4082:2: rule__Choix__Group_1_2__0__Impl rule__Choix__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_1_2__1();

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
    // $ANTLR end "rule__Choix__Group_1_2__0"


    // $ANTLR start "rule__Choix__Group_1_2__0__Impl"
    // InternalGame.g:4089:1: rule__Choix__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Choix__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4093:1: ( ( ',' ) )
            // InternalGame.g:4094:1: ( ',' )
            {
            // InternalGame.g:4094:1: ( ',' )
            // InternalGame.g:4095:2: ','
            {
             before(grammarAccess.getChoixAccess().getCommaKeyword_1_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Choix__Group_1_2__0__Impl"


    // $ANTLR start "rule__Choix__Group_1_2__1"
    // InternalGame.g:4104:1: rule__Choix__Group_1_2__1 : rule__Choix__Group_1_2__1__Impl ;
    public final void rule__Choix__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4108:1: ( rule__Choix__Group_1_2__1__Impl )
            // InternalGame.g:4109:2: rule__Choix__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_1_2__1"


    // $ANTLR start "rule__Choix__Group_1_2__1__Impl"
    // InternalGame.g:4115:1: rule__Choix__Group_1_2__1__Impl : ( ( rule__Choix__ActionsAssignment_1_2_1 ) ) ;
    public final void rule__Choix__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4119:1: ( ( ( rule__Choix__ActionsAssignment_1_2_1 ) ) )
            // InternalGame.g:4120:1: ( ( rule__Choix__ActionsAssignment_1_2_1 ) )
            {
            // InternalGame.g:4120:1: ( ( rule__Choix__ActionsAssignment_1_2_1 ) )
            // InternalGame.g:4121:2: ( rule__Choix__ActionsAssignment_1_2_1 )
            {
             before(grammarAccess.getChoixAccess().getActionsAssignment_1_2_1()); 
            // InternalGame.g:4122:2: ( rule__Choix__ActionsAssignment_1_2_1 )
            // InternalGame.g:4122:3: rule__Choix__ActionsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ActionsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getActionsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Choix__Group_1_2__1__Impl"


    // $ANTLR start "rule__Choix__Group_2__0"
    // InternalGame.g:4131:1: rule__Choix__Group_2__0 : rule__Choix__Group_2__0__Impl rule__Choix__Group_2__1 ;
    public final void rule__Choix__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4135:1: ( rule__Choix__Group_2__0__Impl rule__Choix__Group_2__1 )
            // InternalGame.g:4136:2: rule__Choix__Group_2__0__Impl rule__Choix__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Choix__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_2__1();

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
    // $ANTLR end "rule__Choix__Group_2__0"


    // $ANTLR start "rule__Choix__Group_2__0__Impl"
    // InternalGame.g:4143:1: rule__Choix__Group_2__0__Impl : ( 'visible' ) ;
    public final void rule__Choix__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4147:1: ( ( 'visible' ) )
            // InternalGame.g:4148:1: ( 'visible' )
            {
            // InternalGame.g:4148:1: ( 'visible' )
            // InternalGame.g:4149:2: 'visible'
            {
             before(grammarAccess.getChoixAccess().getVisibleKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getVisibleKeyword_2_0()); 

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
    // $ANTLR end "rule__Choix__Group_2__0__Impl"


    // $ANTLR start "rule__Choix__Group_2__1"
    // InternalGame.g:4158:1: rule__Choix__Group_2__1 : rule__Choix__Group_2__1__Impl rule__Choix__Group_2__2 ;
    public final void rule__Choix__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4162:1: ( rule__Choix__Group_2__1__Impl rule__Choix__Group_2__2 )
            // InternalGame.g:4163:2: rule__Choix__Group_2__1__Impl rule__Choix__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_2__2();

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
    // $ANTLR end "rule__Choix__Group_2__1"


    // $ANTLR start "rule__Choix__Group_2__1__Impl"
    // InternalGame.g:4170:1: rule__Choix__Group_2__1__Impl : ( 'si' ) ;
    public final void rule__Choix__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4174:1: ( ( 'si' ) )
            // InternalGame.g:4175:1: ( 'si' )
            {
            // InternalGame.g:4175:1: ( 'si' )
            // InternalGame.g:4176:2: 'si'
            {
             before(grammarAccess.getChoixAccess().getSiKeyword_2_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getSiKeyword_2_1()); 

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
    // $ANTLR end "rule__Choix__Group_2__1__Impl"


    // $ANTLR start "rule__Choix__Group_2__2"
    // InternalGame.g:4185:1: rule__Choix__Group_2__2 : rule__Choix__Group_2__2__Impl rule__Choix__Group_2__3 ;
    public final void rule__Choix__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4189:1: ( rule__Choix__Group_2__2__Impl rule__Choix__Group_2__3 )
            // InternalGame.g:4190:2: rule__Choix__Group_2__2__Impl rule__Choix__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__Choix__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_2__3();

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
    // $ANTLR end "rule__Choix__Group_2__2"


    // $ANTLR start "rule__Choix__Group_2__2__Impl"
    // InternalGame.g:4197:1: rule__Choix__Group_2__2__Impl : ( ( rule__Choix__ConditionsVisibiliteAssignment_2_2 ) ) ;
    public final void rule__Choix__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4201:1: ( ( ( rule__Choix__ConditionsVisibiliteAssignment_2_2 ) ) )
            // InternalGame.g:4202:1: ( ( rule__Choix__ConditionsVisibiliteAssignment_2_2 ) )
            {
            // InternalGame.g:4202:1: ( ( rule__Choix__ConditionsVisibiliteAssignment_2_2 ) )
            // InternalGame.g:4203:2: ( rule__Choix__ConditionsVisibiliteAssignment_2_2 )
            {
             before(grammarAccess.getChoixAccess().getConditionsVisibiliteAssignment_2_2()); 
            // InternalGame.g:4204:2: ( rule__Choix__ConditionsVisibiliteAssignment_2_2 )
            // InternalGame.g:4204:3: rule__Choix__ConditionsVisibiliteAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConditionsVisibiliteAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConditionsVisibiliteAssignment_2_2()); 

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
    // $ANTLR end "rule__Choix__Group_2__2__Impl"


    // $ANTLR start "rule__Choix__Group_2__3"
    // InternalGame.g:4212:1: rule__Choix__Group_2__3 : rule__Choix__Group_2__3__Impl ;
    public final void rule__Choix__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4216:1: ( rule__Choix__Group_2__3__Impl )
            // InternalGame.g:4217:2: rule__Choix__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_2__3__Impl();

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
    // $ANTLR end "rule__Choix__Group_2__3"


    // $ANTLR start "rule__Choix__Group_2__3__Impl"
    // InternalGame.g:4223:1: rule__Choix__Group_2__3__Impl : ( ( rule__Choix__Group_2_3__0 )* ) ;
    public final void rule__Choix__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4227:1: ( ( ( rule__Choix__Group_2_3__0 )* ) )
            // InternalGame.g:4228:1: ( ( rule__Choix__Group_2_3__0 )* )
            {
            // InternalGame.g:4228:1: ( ( rule__Choix__Group_2_3__0 )* )
            // InternalGame.g:4229:2: ( rule__Choix__Group_2_3__0 )*
            {
             before(grammarAccess.getChoixAccess().getGroup_2_3()); 
            // InternalGame.g:4230:2: ( rule__Choix__Group_2_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGame.g:4230:3: rule__Choix__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Choix__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Choix__Group_2__3__Impl"


    // $ANTLR start "rule__Choix__Group_2_3__0"
    // InternalGame.g:4239:1: rule__Choix__Group_2_3__0 : rule__Choix__Group_2_3__0__Impl rule__Choix__Group_2_3__1 ;
    public final void rule__Choix__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4243:1: ( rule__Choix__Group_2_3__0__Impl rule__Choix__Group_2_3__1 )
            // InternalGame.g:4244:2: rule__Choix__Group_2_3__0__Impl rule__Choix__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group_2_3__1();

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
    // $ANTLR end "rule__Choix__Group_2_3__0"


    // $ANTLR start "rule__Choix__Group_2_3__0__Impl"
    // InternalGame.g:4251:1: rule__Choix__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Choix__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4255:1: ( ( ',' ) )
            // InternalGame.g:4256:1: ( ',' )
            {
            // InternalGame.g:4256:1: ( ',' )
            // InternalGame.g:4257:2: ','
            {
             before(grammarAccess.getChoixAccess().getCommaKeyword_2_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getCommaKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Choix__Group_2_3__0__Impl"


    // $ANTLR start "rule__Choix__Group_2_3__1"
    // InternalGame.g:4266:1: rule__Choix__Group_2_3__1 : rule__Choix__Group_2_3__1__Impl ;
    public final void rule__Choix__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4270:1: ( rule__Choix__Group_2_3__1__Impl )
            // InternalGame.g:4271:2: rule__Choix__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Choix__Group_2_3__1"


    // $ANTLR start "rule__Choix__Group_2_3__1__Impl"
    // InternalGame.g:4277:1: rule__Choix__Group_2_3__1__Impl : ( ( rule__Choix__ConditionsVisibiliteAssignment_2_3_1 ) ) ;
    public final void rule__Choix__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4281:1: ( ( ( rule__Choix__ConditionsVisibiliteAssignment_2_3_1 ) ) )
            // InternalGame.g:4282:1: ( ( rule__Choix__ConditionsVisibiliteAssignment_2_3_1 ) )
            {
            // InternalGame.g:4282:1: ( ( rule__Choix__ConditionsVisibiliteAssignment_2_3_1 ) )
            // InternalGame.g:4283:2: ( rule__Choix__ConditionsVisibiliteAssignment_2_3_1 )
            {
             before(grammarAccess.getChoixAccess().getConditionsVisibiliteAssignment_2_3_1()); 
            // InternalGame.g:4284:2: ( rule__Choix__ConditionsVisibiliteAssignment_2_3_1 )
            // InternalGame.g:4284:3: rule__Choix__ConditionsVisibiliteAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__ConditionsVisibiliteAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getConditionsVisibiliteAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Choix__Group_2_3__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalGame.g:4293:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4297:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGame.g:4298:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalGame.g:4305:1: rule__Action__Group__0__Impl : ( ( rule__Action__NameAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4309:1: ( ( ( rule__Action__NameAssignment_0 ) ) )
            // InternalGame.g:4310:1: ( ( rule__Action__NameAssignment_0 ) )
            {
            // InternalGame.g:4310:1: ( ( rule__Action__NameAssignment_0 ) )
            // InternalGame.g:4311:2: ( rule__Action__NameAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            // InternalGame.g:4312:2: ( rule__Action__NameAssignment_0 )
            // InternalGame.g:4312:3: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalGame.g:4320:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4324:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalGame.g:4325:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalGame.g:4332:1: rule__Action__Group__1__Impl : ( ( rule__Action__Group_1__0 )? ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4336:1: ( ( ( rule__Action__Group_1__0 )? ) )
            // InternalGame.g:4337:1: ( ( rule__Action__Group_1__0 )? )
            {
            // InternalGame.g:4337:1: ( ( rule__Action__Group_1__0 )? )
            // InternalGame.g:4338:2: ( rule__Action__Group_1__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_1()); 
            // InternalGame.g:4339:2: ( rule__Action__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGame.g:4339:3: rule__Action__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalGame.g:4347:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4351:1: ( rule__Action__Group__2__Impl )
            // InternalGame.g:4352:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalGame.g:4358:1: rule__Action__Group__2__Impl : ( ( rule__Action__Group_2__0 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4362:1: ( ( ( rule__Action__Group_2__0 )? ) )
            // InternalGame.g:4363:1: ( ( rule__Action__Group_2__0 )? )
            {
            // InternalGame.g:4363:1: ( ( rule__Action__Group_2__0 )? )
            // InternalGame.g:4364:2: ( rule__Action__Group_2__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2()); 
            // InternalGame.g:4365:2: ( rule__Action__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:4365:3: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // InternalGame.g:4374:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4378:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalGame.g:4379:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__1();

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
    // $ANTLR end "rule__Action__Group_1__0"


    // $ANTLR start "rule__Action__Group_1__0__Impl"
    // InternalGame.g:4386:1: rule__Action__Group_1__0__Impl : ( 'consomme' ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4390:1: ( ( 'consomme' ) )
            // InternalGame.g:4391:1: ( 'consomme' )
            {
            // InternalGame.g:4391:1: ( 'consomme' )
            // InternalGame.g:4392:2: 'consomme'
            {
             before(grammarAccess.getActionAccess().getConsommeKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConsommeKeyword_1_0()); 

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
    // $ANTLR end "rule__Action__Group_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1__1"
    // InternalGame.g:4401:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl rule__Action__Group_1__2 ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4405:1: ( rule__Action__Group_1__1__Impl rule__Action__Group_1__2 )
            // InternalGame.g:4406:2: rule__Action__Group_1__1__Impl rule__Action__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Action__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__2();

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
    // $ANTLR end "rule__Action__Group_1__1"


    // $ANTLR start "rule__Action__Group_1__1__Impl"
    // InternalGame.g:4413:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__ObjetsConsommesAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4417:1: ( ( ( rule__Action__ObjetsConsommesAssignment_1_1 ) ) )
            // InternalGame.g:4418:1: ( ( rule__Action__ObjetsConsommesAssignment_1_1 ) )
            {
            // InternalGame.g:4418:1: ( ( rule__Action__ObjetsConsommesAssignment_1_1 ) )
            // InternalGame.g:4419:2: ( rule__Action__ObjetsConsommesAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getObjetsConsommesAssignment_1_1()); 
            // InternalGame.g:4420:2: ( rule__Action__ObjetsConsommesAssignment_1_1 )
            // InternalGame.g:4420:3: rule__Action__ObjetsConsommesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ObjetsConsommesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getObjetsConsommesAssignment_1_1()); 

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
    // $ANTLR end "rule__Action__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_1__2"
    // InternalGame.g:4428:1: rule__Action__Group_1__2 : rule__Action__Group_1__2__Impl ;
    public final void rule__Action__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4432:1: ( rule__Action__Group_1__2__Impl )
            // InternalGame.g:4433:2: rule__Action__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_1__2__Impl();

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
    // $ANTLR end "rule__Action__Group_1__2"


    // $ANTLR start "rule__Action__Group_1__2__Impl"
    // InternalGame.g:4439:1: rule__Action__Group_1__2__Impl : ( ( rule__Action__Group_1_2__0 )* ) ;
    public final void rule__Action__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4443:1: ( ( ( rule__Action__Group_1_2__0 )* ) )
            // InternalGame.g:4444:1: ( ( rule__Action__Group_1_2__0 )* )
            {
            // InternalGame.g:4444:1: ( ( rule__Action__Group_1_2__0 )* )
            // InternalGame.g:4445:2: ( rule__Action__Group_1_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_1_2()); 
            // InternalGame.g:4446:2: ( rule__Action__Group_1_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGame.g:4446:3: rule__Action__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Action__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Action__Group_1__2__Impl"


    // $ANTLR start "rule__Action__Group_1_2__0"
    // InternalGame.g:4455:1: rule__Action__Group_1_2__0 : rule__Action__Group_1_2__0__Impl rule__Action__Group_1_2__1 ;
    public final void rule__Action__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4459:1: ( rule__Action__Group_1_2__0__Impl rule__Action__Group_1_2__1 )
            // InternalGame.g:4460:2: rule__Action__Group_1_2__0__Impl rule__Action__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1_2__1();

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
    // $ANTLR end "rule__Action__Group_1_2__0"


    // $ANTLR start "rule__Action__Group_1_2__0__Impl"
    // InternalGame.g:4467:1: rule__Action__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4471:1: ( ( ',' ) )
            // InternalGame.g:4472:1: ( ',' )
            {
            // InternalGame.g:4472:1: ( ',' )
            // InternalGame.g:4473:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_1_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Action__Group_1_2__0__Impl"


    // $ANTLR start "rule__Action__Group_1_2__1"
    // InternalGame.g:4482:1: rule__Action__Group_1_2__1 : rule__Action__Group_1_2__1__Impl ;
    public final void rule__Action__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4486:1: ( rule__Action__Group_1_2__1__Impl )
            // InternalGame.g:4487:2: rule__Action__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Action__Group_1_2__1"


    // $ANTLR start "rule__Action__Group_1_2__1__Impl"
    // InternalGame.g:4493:1: rule__Action__Group_1_2__1__Impl : ( ( rule__Action__ObjetsConsommesAssignment_1_2_1 ) ) ;
    public final void rule__Action__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4497:1: ( ( ( rule__Action__ObjetsConsommesAssignment_1_2_1 ) ) )
            // InternalGame.g:4498:1: ( ( rule__Action__ObjetsConsommesAssignment_1_2_1 ) )
            {
            // InternalGame.g:4498:1: ( ( rule__Action__ObjetsConsommesAssignment_1_2_1 ) )
            // InternalGame.g:4499:2: ( rule__Action__ObjetsConsommesAssignment_1_2_1 )
            {
             before(grammarAccess.getActionAccess().getObjetsConsommesAssignment_1_2_1()); 
            // InternalGame.g:4500:2: ( rule__Action__ObjetsConsommesAssignment_1_2_1 )
            // InternalGame.g:4500:3: rule__Action__ObjetsConsommesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ObjetsConsommesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getObjetsConsommesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Action__Group_1_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalGame.g:4509:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4513:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalGame.g:4514:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1();

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
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalGame.g:4521:1: rule__Action__Group_2__0__Impl : ( 'donne' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4525:1: ( ( 'donne' ) )
            // InternalGame.g:4526:1: ( 'donne' )
            {
            // InternalGame.g:4526:1: ( 'donne' )
            // InternalGame.g:4527:2: 'donne'
            {
             before(grammarAccess.getActionAccess().getDonneKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDonneKeyword_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalGame.g:4536:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4540:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // InternalGame.g:4541:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FOLLOW_47);
            rule__Action__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__2();

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
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalGame.g:4548:1: rule__Action__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4552:1: ( ( '(' ) )
            // InternalGame.g:4553:1: ( '(' )
            {
            // InternalGame.g:4553:1: ( '(' )
            // InternalGame.g:4554:2: '('
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // InternalGame.g:4563:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl rule__Action__Group_2__3 ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4567:1: ( rule__Action__Group_2__2__Impl rule__Action__Group_2__3 )
            // InternalGame.g:4568:2: rule__Action__Group_2__2__Impl rule__Action__Group_2__3
            {
            pushFollow(FOLLOW_47);
            rule__Action__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__3();

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
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // InternalGame.g:4575:1: rule__Action__Group_2__2__Impl : ( ( rule__Action__Group_2_2__0 )? ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4579:1: ( ( ( rule__Action__Group_2_2__0 )? ) )
            // InternalGame.g:4580:1: ( ( rule__Action__Group_2_2__0 )? )
            {
            // InternalGame.g:4580:1: ( ( rule__Action__Group_2_2__0 )? )
            // InternalGame.g:4581:2: ( rule__Action__Group_2_2__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2_2()); 
            // InternalGame.g:4582:2: ( rule__Action__Group_2_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGame.g:4582:3: rule__Action__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2__3"
    // InternalGame.g:4590:1: rule__Action__Group_2__3 : rule__Action__Group_2__3__Impl rule__Action__Group_2__4 ;
    public final void rule__Action__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4594:1: ( rule__Action__Group_2__3__Impl rule__Action__Group_2__4 )
            // InternalGame.g:4595:2: rule__Action__Group_2__3__Impl rule__Action__Group_2__4
            {
            pushFollow(FOLLOW_47);
            rule__Action__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__4();

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
    // $ANTLR end "rule__Action__Group_2__3"


    // $ANTLR start "rule__Action__Group_2__3__Impl"
    // InternalGame.g:4602:1: rule__Action__Group_2__3__Impl : ( ( rule__Action__Group_2_3__0 )? ) ;
    public final void rule__Action__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4606:1: ( ( ( rule__Action__Group_2_3__0 )? ) )
            // InternalGame.g:4607:1: ( ( rule__Action__Group_2_3__0 )? )
            {
            // InternalGame.g:4607:1: ( ( rule__Action__Group_2_3__0 )? )
            // InternalGame.g:4608:2: ( rule__Action__Group_2_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2_3()); 
            // InternalGame.g:4609:2: ( rule__Action__Group_2_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:4609:3: rule__Action__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Action__Group_2__3__Impl"


    // $ANTLR start "rule__Action__Group_2__4"
    // InternalGame.g:4617:1: rule__Action__Group_2__4 : rule__Action__Group_2__4__Impl ;
    public final void rule__Action__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4621:1: ( rule__Action__Group_2__4__Impl )
            // InternalGame.g:4622:2: rule__Action__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2__4__Impl();

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
    // $ANTLR end "rule__Action__Group_2__4"


    // $ANTLR start "rule__Action__Group_2__4__Impl"
    // InternalGame.g:4628:1: rule__Action__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Action__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4632:1: ( ( ')' ) )
            // InternalGame.g:4633:1: ( ')' )
            {
            // InternalGame.g:4633:1: ( ')' )
            // InternalGame.g:4634:2: ')'
            {
             before(grammarAccess.getActionAccess().getRightParenthesisKeyword_2_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightParenthesisKeyword_2_4()); 

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
    // $ANTLR end "rule__Action__Group_2__4__Impl"


    // $ANTLR start "rule__Action__Group_2_2__0"
    // InternalGame.g:4644:1: rule__Action__Group_2_2__0 : rule__Action__Group_2_2__0__Impl rule__Action__Group_2_2__1 ;
    public final void rule__Action__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4648:1: ( rule__Action__Group_2_2__0__Impl rule__Action__Group_2_2__1 )
            // InternalGame.g:4649:2: rule__Action__Group_2_2__0__Impl rule__Action__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2__1();

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
    // $ANTLR end "rule__Action__Group_2_2__0"


    // $ANTLR start "rule__Action__Group_2_2__0__Impl"
    // InternalGame.g:4656:1: rule__Action__Group_2_2__0__Impl : ( 'objets:' ) ;
    public final void rule__Action__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4660:1: ( ( 'objets:' ) )
            // InternalGame.g:4661:1: ( 'objets:' )
            {
            // InternalGame.g:4661:1: ( 'objets:' )
            // InternalGame.g:4662:2: 'objets:'
            {
             before(grammarAccess.getActionAccess().getObjetsKeyword_2_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getObjetsKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2_2__1"
    // InternalGame.g:4671:1: rule__Action__Group_2_2__1 : rule__Action__Group_2_2__1__Impl rule__Action__Group_2_2__2 ;
    public final void rule__Action__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4675:1: ( rule__Action__Group_2_2__1__Impl rule__Action__Group_2_2__2 )
            // InternalGame.g:4676:2: rule__Action__Group_2_2__1__Impl rule__Action__Group_2_2__2
            {
            pushFollow(FOLLOW_22);
            rule__Action__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2__2();

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
    // $ANTLR end "rule__Action__Group_2_2__1"


    // $ANTLR start "rule__Action__Group_2_2__1__Impl"
    // InternalGame.g:4683:1: rule__Action__Group_2_2__1__Impl : ( ( rule__Action__ObjetDonnesAssignment_2_2_1 ) ) ;
    public final void rule__Action__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4687:1: ( ( ( rule__Action__ObjetDonnesAssignment_2_2_1 ) ) )
            // InternalGame.g:4688:1: ( ( rule__Action__ObjetDonnesAssignment_2_2_1 ) )
            {
            // InternalGame.g:4688:1: ( ( rule__Action__ObjetDonnesAssignment_2_2_1 ) )
            // InternalGame.g:4689:2: ( rule__Action__ObjetDonnesAssignment_2_2_1 )
            {
             before(grammarAccess.getActionAccess().getObjetDonnesAssignment_2_2_1()); 
            // InternalGame.g:4690:2: ( rule__Action__ObjetDonnesAssignment_2_2_1 )
            // InternalGame.g:4690:3: rule__Action__ObjetDonnesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ObjetDonnesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getObjetDonnesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2_2__2"
    // InternalGame.g:4698:1: rule__Action__Group_2_2__2 : rule__Action__Group_2_2__2__Impl ;
    public final void rule__Action__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4702:1: ( rule__Action__Group_2_2__2__Impl )
            // InternalGame.g:4703:2: rule__Action__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2__2__Impl();

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
    // $ANTLR end "rule__Action__Group_2_2__2"


    // $ANTLR start "rule__Action__Group_2_2__2__Impl"
    // InternalGame.g:4709:1: rule__Action__Group_2_2__2__Impl : ( ( rule__Action__Group_2_2_2__0 )* ) ;
    public final void rule__Action__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4713:1: ( ( ( rule__Action__Group_2_2_2__0 )* ) )
            // InternalGame.g:4714:1: ( ( rule__Action__Group_2_2_2__0 )* )
            {
            // InternalGame.g:4714:1: ( ( rule__Action__Group_2_2_2__0 )* )
            // InternalGame.g:4715:2: ( rule__Action__Group_2_2_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_2_2_2()); 
            // InternalGame.g:4716:2: ( rule__Action__Group_2_2_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGame.g:4716:3: rule__Action__Group_2_2_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Action__Group_2_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_2_2_2()); 

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
    // $ANTLR end "rule__Action__Group_2_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2_2_2__0"
    // InternalGame.g:4725:1: rule__Action__Group_2_2_2__0 : rule__Action__Group_2_2_2__0__Impl rule__Action__Group_2_2_2__1 ;
    public final void rule__Action__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4729:1: ( rule__Action__Group_2_2_2__0__Impl rule__Action__Group_2_2_2__1 )
            // InternalGame.g:4730:2: rule__Action__Group_2_2_2__0__Impl rule__Action__Group_2_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2_2__1();

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
    // $ANTLR end "rule__Action__Group_2_2_2__0"


    // $ANTLR start "rule__Action__Group_2_2_2__0__Impl"
    // InternalGame.g:4737:1: rule__Action__Group_2_2_2__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4741:1: ( ( ',' ) )
            // InternalGame.g:4742:1: ( ',' )
            {
            // InternalGame.g:4742:1: ( ',' )
            // InternalGame.g:4743:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_2_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommaKeyword_2_2_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2_2_2__1"
    // InternalGame.g:4752:1: rule__Action__Group_2_2_2__1 : rule__Action__Group_2_2_2__1__Impl ;
    public final void rule__Action__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4756:1: ( rule__Action__Group_2_2_2__1__Impl )
            // InternalGame.g:4757:2: rule__Action__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2_2__1__Impl();

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
    // $ANTLR end "rule__Action__Group_2_2_2__1"


    // $ANTLR start "rule__Action__Group_2_2_2__1__Impl"
    // InternalGame.g:4763:1: rule__Action__Group_2_2_2__1__Impl : ( ( rule__Action__ObjetsDonnesAssignment_2_2_2_1 ) ) ;
    public final void rule__Action__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4767:1: ( ( ( rule__Action__ObjetsDonnesAssignment_2_2_2_1 ) ) )
            // InternalGame.g:4768:1: ( ( rule__Action__ObjetsDonnesAssignment_2_2_2_1 ) )
            {
            // InternalGame.g:4768:1: ( ( rule__Action__ObjetsDonnesAssignment_2_2_2_1 ) )
            // InternalGame.g:4769:2: ( rule__Action__ObjetsDonnesAssignment_2_2_2_1 )
            {
             before(grammarAccess.getActionAccess().getObjetsDonnesAssignment_2_2_2_1()); 
            // InternalGame.g:4770:2: ( rule__Action__ObjetsDonnesAssignment_2_2_2_1 )
            // InternalGame.g:4770:3: rule__Action__ObjetsDonnesAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ObjetsDonnesAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getObjetsDonnesAssignment_2_2_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2_3__0"
    // InternalGame.g:4779:1: rule__Action__Group_2_3__0 : rule__Action__Group_2_3__0__Impl rule__Action__Group_2_3__1 ;
    public final void rule__Action__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4783:1: ( rule__Action__Group_2_3__0__Impl rule__Action__Group_2_3__1 )
            // InternalGame.g:4784:2: rule__Action__Group_2_3__0__Impl rule__Action__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_3__1();

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
    // $ANTLR end "rule__Action__Group_2_3__0"


    // $ANTLR start "rule__Action__Group_2_3__0__Impl"
    // InternalGame.g:4791:1: rule__Action__Group_2_3__0__Impl : ( 'connaissances:' ) ;
    public final void rule__Action__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4795:1: ( ( 'connaissances:' ) )
            // InternalGame.g:4796:1: ( 'connaissances:' )
            {
            // InternalGame.g:4796:1: ( 'connaissances:' )
            // InternalGame.g:4797:2: 'connaissances:'
            {
             before(grammarAccess.getActionAccess().getConnaissancesKeyword_2_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConnaissancesKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Action__Group_2_3__0__Impl"


    // $ANTLR start "rule__Action__Group_2_3__1"
    // InternalGame.g:4806:1: rule__Action__Group_2_3__1 : rule__Action__Group_2_3__1__Impl rule__Action__Group_2_3__2 ;
    public final void rule__Action__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4810:1: ( rule__Action__Group_2_3__1__Impl rule__Action__Group_2_3__2 )
            // InternalGame.g:4811:2: rule__Action__Group_2_3__1__Impl rule__Action__Group_2_3__2
            {
            pushFollow(FOLLOW_22);
            rule__Action__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_3__2();

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
    // $ANTLR end "rule__Action__Group_2_3__1"


    // $ANTLR start "rule__Action__Group_2_3__1__Impl"
    // InternalGame.g:4818:1: rule__Action__Group_2_3__1__Impl : ( ( rule__Action__ConnaissancesAssignment_2_3_1 ) ) ;
    public final void rule__Action__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4822:1: ( ( ( rule__Action__ConnaissancesAssignment_2_3_1 ) ) )
            // InternalGame.g:4823:1: ( ( rule__Action__ConnaissancesAssignment_2_3_1 ) )
            {
            // InternalGame.g:4823:1: ( ( rule__Action__ConnaissancesAssignment_2_3_1 ) )
            // InternalGame.g:4824:2: ( rule__Action__ConnaissancesAssignment_2_3_1 )
            {
             before(grammarAccess.getActionAccess().getConnaissancesAssignment_2_3_1()); 
            // InternalGame.g:4825:2: ( rule__Action__ConnaissancesAssignment_2_3_1 )
            // InternalGame.g:4825:3: rule__Action__ConnaissancesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ConnaissancesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getConnaissancesAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Action__Group_2_3__1__Impl"


    // $ANTLR start "rule__Action__Group_2_3__2"
    // InternalGame.g:4833:1: rule__Action__Group_2_3__2 : rule__Action__Group_2_3__2__Impl ;
    public final void rule__Action__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4837:1: ( rule__Action__Group_2_3__2__Impl )
            // InternalGame.g:4838:2: rule__Action__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2_3__2__Impl();

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
    // $ANTLR end "rule__Action__Group_2_3__2"


    // $ANTLR start "rule__Action__Group_2_3__2__Impl"
    // InternalGame.g:4844:1: rule__Action__Group_2_3__2__Impl : ( ( rule__Action__Group_2_3_2__0 )* ) ;
    public final void rule__Action__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4848:1: ( ( ( rule__Action__Group_2_3_2__0 )* ) )
            // InternalGame.g:4849:1: ( ( rule__Action__Group_2_3_2__0 )* )
            {
            // InternalGame.g:4849:1: ( ( rule__Action__Group_2_3_2__0 )* )
            // InternalGame.g:4850:2: ( rule__Action__Group_2_3_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_2_3_2()); 
            // InternalGame.g:4851:2: ( rule__Action__Group_2_3_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGame.g:4851:3: rule__Action__Group_2_3_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Action__Group_2_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_2_3_2()); 

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
    // $ANTLR end "rule__Action__Group_2_3__2__Impl"


    // $ANTLR start "rule__Action__Group_2_3_2__0"
    // InternalGame.g:4860:1: rule__Action__Group_2_3_2__0 : rule__Action__Group_2_3_2__0__Impl rule__Action__Group_2_3_2__1 ;
    public final void rule__Action__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4864:1: ( rule__Action__Group_2_3_2__0__Impl rule__Action__Group_2_3_2__1 )
            // InternalGame.g:4865:2: rule__Action__Group_2_3_2__0__Impl rule__Action__Group_2_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_3_2__1();

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
    // $ANTLR end "rule__Action__Group_2_3_2__0"


    // $ANTLR start "rule__Action__Group_2_3_2__0__Impl"
    // InternalGame.g:4872:1: rule__Action__Group_2_3_2__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4876:1: ( ( ',' ) )
            // InternalGame.g:4877:1: ( ',' )
            {
            // InternalGame.g:4877:1: ( ',' )
            // InternalGame.g:4878:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_2_3_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommaKeyword_2_3_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2_3_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2_3_2__1"
    // InternalGame.g:4887:1: rule__Action__Group_2_3_2__1 : rule__Action__Group_2_3_2__1__Impl ;
    public final void rule__Action__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4891:1: ( rule__Action__Group_2_3_2__1__Impl )
            // InternalGame.g:4892:2: rule__Action__Group_2_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2_3_2__1__Impl();

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
    // $ANTLR end "rule__Action__Group_2_3_2__1"


    // $ANTLR start "rule__Action__Group_2_3_2__1__Impl"
    // InternalGame.g:4898:1: rule__Action__Group_2_3_2__1__Impl : ( ( rule__Action__ConnaissancesAssignment_2_3_2_1 ) ) ;
    public final void rule__Action__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4902:1: ( ( ( rule__Action__ConnaissancesAssignment_2_3_2_1 ) ) )
            // InternalGame.g:4903:1: ( ( rule__Action__ConnaissancesAssignment_2_3_2_1 ) )
            {
            // InternalGame.g:4903:1: ( ( rule__Action__ConnaissancesAssignment_2_3_2_1 ) )
            // InternalGame.g:4904:2: ( rule__Action__ConnaissancesAssignment_2_3_2_1 )
            {
             before(grammarAccess.getActionAccess().getConnaissancesAssignment_2_3_2_1()); 
            // InternalGame.g:4905:2: ( rule__Action__ConnaissancesAssignment_2_3_2_1 )
            // InternalGame.g:4905:3: rule__Action__ConnaissancesAssignment_2_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ConnaissancesAssignment_2_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getConnaissancesAssignment_2_3_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2_3_2__1__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGame.g:4914:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4918:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGame.g:4919:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

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
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalGame.g:4926:1: rule__Chemin__Group__0__Impl : ( 'depuis' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4930:1: ( ( 'depuis' ) )
            // InternalGame.g:4931:1: ( 'depuis' )
            {
            // InternalGame.g:4931:1: ( 'depuis' )
            // InternalGame.g:4932:2: 'depuis'
            {
             before(grammarAccess.getCheminAccess().getDepuisKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDepuisKeyword_0()); 

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
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalGame.g:4941:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4945:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGame.g:4946:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

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
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalGame.g:4953:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__Lieu1Assignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4957:1: ( ( ( rule__Chemin__Lieu1Assignment_1 ) ) )
            // InternalGame.g:4958:1: ( ( rule__Chemin__Lieu1Assignment_1 ) )
            {
            // InternalGame.g:4958:1: ( ( rule__Chemin__Lieu1Assignment_1 ) )
            // InternalGame.g:4959:2: ( rule__Chemin__Lieu1Assignment_1 )
            {
             before(grammarAccess.getCheminAccess().getLieu1Assignment_1()); 
            // InternalGame.g:4960:2: ( rule__Chemin__Lieu1Assignment_1 )
            // InternalGame.g:4960:3: rule__Chemin__Lieu1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Lieu1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getLieu1Assignment_1()); 

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
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalGame.g:4968:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4972:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGame.g:4973:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__3();

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
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalGame.g:4980:1: rule__Chemin__Group__2__Impl : ( 'jusqu\\'\\u00E0' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4984:1: ( ( 'jusqu\\'\\u00E0' ) )
            // InternalGame.g:4985:1: ( 'jusqu\\'\\u00E0' )
            {
            // InternalGame.g:4985:1: ( 'jusqu\\'\\u00E0' )
            // InternalGame.g:4986:2: 'jusqu\\'\\u00E0'
            {
             before(grammarAccess.getCheminAccess().getJusquKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getJusquKeyword_2()); 

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
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group__3"
    // InternalGame.g:4995:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4999:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGame.g:5000:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Chemin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__4();

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
    // $ANTLR end "rule__Chemin__Group__3"


    // $ANTLR start "rule__Chemin__Group__3__Impl"
    // InternalGame.g:5007:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__Lieu2Assignment_3 ) ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5011:1: ( ( ( rule__Chemin__Lieu2Assignment_3 ) ) )
            // InternalGame.g:5012:1: ( ( rule__Chemin__Lieu2Assignment_3 ) )
            {
            // InternalGame.g:5012:1: ( ( rule__Chemin__Lieu2Assignment_3 ) )
            // InternalGame.g:5013:2: ( rule__Chemin__Lieu2Assignment_3 )
            {
             before(grammarAccess.getCheminAccess().getLieu2Assignment_3()); 
            // InternalGame.g:5014:2: ( rule__Chemin__Lieu2Assignment_3 )
            // InternalGame.g:5014:3: rule__Chemin__Lieu2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Lieu2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getLieu2Assignment_3()); 

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
    // $ANTLR end "rule__Chemin__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__4"
    // InternalGame.g:5022:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5026:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGame.g:5027:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__Chemin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__5();

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
    // $ANTLR end "rule__Chemin__Group__4"


    // $ANTLR start "rule__Chemin__Group__4__Impl"
    // InternalGame.g:5034:1: rule__Chemin__Group__4__Impl : ( ( rule__Chemin__Group_4__0 )? ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5038:1: ( ( ( rule__Chemin__Group_4__0 )? ) )
            // InternalGame.g:5039:1: ( ( rule__Chemin__Group_4__0 )? )
            {
            // InternalGame.g:5039:1: ( ( rule__Chemin__Group_4__0 )? )
            // InternalGame.g:5040:2: ( rule__Chemin__Group_4__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_4()); 
            // InternalGame.g:5041:2: ( rule__Chemin__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGame.g:5041:3: rule__Chemin__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Chemin__Group__4__Impl"


    // $ANTLR start "rule__Chemin__Group__5"
    // InternalGame.g:5049:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5053:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGame.g:5054:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_49);
            rule__Chemin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__6();

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
    // $ANTLR end "rule__Chemin__Group__5"


    // $ANTLR start "rule__Chemin__Group__5__Impl"
    // InternalGame.g:5061:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__Group_5__0 )? ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5065:1: ( ( ( rule__Chemin__Group_5__0 )? ) )
            // InternalGame.g:5066:1: ( ( rule__Chemin__Group_5__0 )? )
            {
            // InternalGame.g:5066:1: ( ( rule__Chemin__Group_5__0 )? )
            // InternalGame.g:5067:2: ( rule__Chemin__Group_5__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_5()); 
            // InternalGame.g:5068:2: ( rule__Chemin__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGame.g:5068:3: rule__Chemin__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Chemin__Group__5__Impl"


    // $ANTLR start "rule__Chemin__Group__6"
    // InternalGame.g:5076:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5080:1: ( rule__Chemin__Group__6__Impl )
            // InternalGame.g:5081:2: rule__Chemin__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__6__Impl();

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
    // $ANTLR end "rule__Chemin__Group__6"


    // $ANTLR start "rule__Chemin__Group__6__Impl"
    // InternalGame.g:5087:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__Group_6__0 )? ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5091:1: ( ( ( rule__Chemin__Group_6__0 )? ) )
            // InternalGame.g:5092:1: ( ( rule__Chemin__Group_6__0 )? )
            {
            // InternalGame.g:5092:1: ( ( rule__Chemin__Group_6__0 )? )
            // InternalGame.g:5093:2: ( rule__Chemin__Group_6__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_6()); 
            // InternalGame.g:5094:2: ( rule__Chemin__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGame.g:5094:3: rule__Chemin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Chemin__Group__6__Impl"


    // $ANTLR start "rule__Chemin__Group_4__0"
    // InternalGame.g:5103:1: rule__Chemin__Group_4__0 : rule__Chemin__Group_4__0__Impl rule__Chemin__Group_4__1 ;
    public final void rule__Chemin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5107:1: ( rule__Chemin__Group_4__0__Impl rule__Chemin__Group_4__1 )
            // InternalGame.g:5108:2: rule__Chemin__Group_4__0__Impl rule__Chemin__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_4__1();

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
    // $ANTLR end "rule__Chemin__Group_4__0"


    // $ANTLR start "rule__Chemin__Group_4__0__Impl"
    // InternalGame.g:5115:1: rule__Chemin__Group_4__0__Impl : ( 'implique' ) ;
    public final void rule__Chemin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5119:1: ( ( 'implique' ) )
            // InternalGame.g:5120:1: ( 'implique' )
            {
            // InternalGame.g:5120:1: ( 'implique' )
            // InternalGame.g:5121:2: 'implique'
            {
             before(grammarAccess.getCheminAccess().getImpliqueKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getImpliqueKeyword_4_0()); 

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
    // $ANTLR end "rule__Chemin__Group_4__0__Impl"


    // $ANTLR start "rule__Chemin__Group_4__1"
    // InternalGame.g:5130:1: rule__Chemin__Group_4__1 : rule__Chemin__Group_4__1__Impl rule__Chemin__Group_4__2 ;
    public final void rule__Chemin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5134:1: ( rule__Chemin__Group_4__1__Impl rule__Chemin__Group_4__2 )
            // InternalGame.g:5135:2: rule__Chemin__Group_4__1__Impl rule__Chemin__Group_4__2
            {
            pushFollow(FOLLOW_22);
            rule__Chemin__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_4__2();

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
    // $ANTLR end "rule__Chemin__Group_4__1"


    // $ANTLR start "rule__Chemin__Group_4__1__Impl"
    // InternalGame.g:5142:1: rule__Chemin__Group_4__1__Impl : ( ( rule__Chemin__ActionsAssignment_4_1 ) ) ;
    public final void rule__Chemin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5146:1: ( ( ( rule__Chemin__ActionsAssignment_4_1 ) ) )
            // InternalGame.g:5147:1: ( ( rule__Chemin__ActionsAssignment_4_1 ) )
            {
            // InternalGame.g:5147:1: ( ( rule__Chemin__ActionsAssignment_4_1 ) )
            // InternalGame.g:5148:2: ( rule__Chemin__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getCheminAccess().getActionsAssignment_4_1()); 
            // InternalGame.g:5149:2: ( rule__Chemin__ActionsAssignment_4_1 )
            // InternalGame.g:5149:3: rule__Chemin__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getActionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Chemin__Group_4__1__Impl"


    // $ANTLR start "rule__Chemin__Group_4__2"
    // InternalGame.g:5157:1: rule__Chemin__Group_4__2 : rule__Chemin__Group_4__2__Impl ;
    public final void rule__Chemin__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5161:1: ( rule__Chemin__Group_4__2__Impl )
            // InternalGame.g:5162:2: rule__Chemin__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_4__2__Impl();

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
    // $ANTLR end "rule__Chemin__Group_4__2"


    // $ANTLR start "rule__Chemin__Group_4__2__Impl"
    // InternalGame.g:5168:1: rule__Chemin__Group_4__2__Impl : ( ( rule__Chemin__Group_4_2__0 )* ) ;
    public final void rule__Chemin__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5172:1: ( ( ( rule__Chemin__Group_4_2__0 )* ) )
            // InternalGame.g:5173:1: ( ( rule__Chemin__Group_4_2__0 )* )
            {
            // InternalGame.g:5173:1: ( ( rule__Chemin__Group_4_2__0 )* )
            // InternalGame.g:5174:2: ( rule__Chemin__Group_4_2__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_4_2()); 
            // InternalGame.g:5175:2: ( rule__Chemin__Group_4_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==27) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGame.g:5175:3: rule__Chemin__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Chemin__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Chemin__Group_4__2__Impl"


    // $ANTLR start "rule__Chemin__Group_4_2__0"
    // InternalGame.g:5184:1: rule__Chemin__Group_4_2__0 : rule__Chemin__Group_4_2__0__Impl rule__Chemin__Group_4_2__1 ;
    public final void rule__Chemin__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5188:1: ( rule__Chemin__Group_4_2__0__Impl rule__Chemin__Group_4_2__1 )
            // InternalGame.g:5189:2: rule__Chemin__Group_4_2__0__Impl rule__Chemin__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_4_2__1();

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
    // $ANTLR end "rule__Chemin__Group_4_2__0"


    // $ANTLR start "rule__Chemin__Group_4_2__0__Impl"
    // InternalGame.g:5196:1: rule__Chemin__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Chemin__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5200:1: ( ( ',' ) )
            // InternalGame.g:5201:1: ( ',' )
            {
            // InternalGame.g:5201:1: ( ',' )
            // InternalGame.g:5202:2: ','
            {
             before(grammarAccess.getCheminAccess().getCommaKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Chemin__Group_4_2__0__Impl"


    // $ANTLR start "rule__Chemin__Group_4_2__1"
    // InternalGame.g:5211:1: rule__Chemin__Group_4_2__1 : rule__Chemin__Group_4_2__1__Impl ;
    public final void rule__Chemin__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5215:1: ( rule__Chemin__Group_4_2__1__Impl )
            // InternalGame.g:5216:2: rule__Chemin__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Chemin__Group_4_2__1"


    // $ANTLR start "rule__Chemin__Group_4_2__1__Impl"
    // InternalGame.g:5222:1: rule__Chemin__Group_4_2__1__Impl : ( ( rule__Chemin__ActionsAssignment_4_2_1 ) ) ;
    public final void rule__Chemin__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5226:1: ( ( ( rule__Chemin__ActionsAssignment_4_2_1 ) ) )
            // InternalGame.g:5227:1: ( ( rule__Chemin__ActionsAssignment_4_2_1 ) )
            {
            // InternalGame.g:5227:1: ( ( rule__Chemin__ActionsAssignment_4_2_1 ) )
            // InternalGame.g:5228:2: ( rule__Chemin__ActionsAssignment_4_2_1 )
            {
             before(grammarAccess.getCheminAccess().getActionsAssignment_4_2_1()); 
            // InternalGame.g:5229:2: ( rule__Chemin__ActionsAssignment_4_2_1 )
            // InternalGame.g:5229:3: rule__Chemin__ActionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ActionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getActionsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Chemin__Group_4_2__1__Impl"


    // $ANTLR start "rule__Chemin__Group_5__0"
    // InternalGame.g:5238:1: rule__Chemin__Group_5__0 : rule__Chemin__Group_5__0__Impl rule__Chemin__Group_5__1 ;
    public final void rule__Chemin__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5242:1: ( rule__Chemin__Group_5__0__Impl rule__Chemin__Group_5__1 )
            // InternalGame.g:5243:2: rule__Chemin__Group_5__0__Impl rule__Chemin__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__Chemin__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_5__1();

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
    // $ANTLR end "rule__Chemin__Group_5__0"


    // $ANTLR start "rule__Chemin__Group_5__0__Impl"
    // InternalGame.g:5250:1: rule__Chemin__Group_5__0__Impl : ( 'ouvert' ) ;
    public final void rule__Chemin__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5254:1: ( ( 'ouvert' ) )
            // InternalGame.g:5255:1: ( 'ouvert' )
            {
            // InternalGame.g:5255:1: ( 'ouvert' )
            // InternalGame.g:5256:2: 'ouvert'
            {
             before(grammarAccess.getCheminAccess().getOuvertKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getOuvertKeyword_5_0()); 

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
    // $ANTLR end "rule__Chemin__Group_5__0__Impl"


    // $ANTLR start "rule__Chemin__Group_5__1"
    // InternalGame.g:5265:1: rule__Chemin__Group_5__1 : rule__Chemin__Group_5__1__Impl rule__Chemin__Group_5__2 ;
    public final void rule__Chemin__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5269:1: ( rule__Chemin__Group_5__1__Impl rule__Chemin__Group_5__2 )
            // InternalGame.g:5270:2: rule__Chemin__Group_5__1__Impl rule__Chemin__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_5__2();

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
    // $ANTLR end "rule__Chemin__Group_5__1"


    // $ANTLR start "rule__Chemin__Group_5__1__Impl"
    // InternalGame.g:5277:1: rule__Chemin__Group_5__1__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5281:1: ( ( 'si' ) )
            // InternalGame.g:5282:1: ( 'si' )
            {
            // InternalGame.g:5282:1: ( 'si' )
            // InternalGame.g:5283:2: 'si'
            {
             before(grammarAccess.getCheminAccess().getSiKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSiKeyword_5_1()); 

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
    // $ANTLR end "rule__Chemin__Group_5__1__Impl"


    // $ANTLR start "rule__Chemin__Group_5__2"
    // InternalGame.g:5292:1: rule__Chemin__Group_5__2 : rule__Chemin__Group_5__2__Impl rule__Chemin__Group_5__3 ;
    public final void rule__Chemin__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5296:1: ( rule__Chemin__Group_5__2__Impl rule__Chemin__Group_5__3 )
            // InternalGame.g:5297:2: rule__Chemin__Group_5__2__Impl rule__Chemin__Group_5__3
            {
            pushFollow(FOLLOW_22);
            rule__Chemin__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_5__3();

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
    // $ANTLR end "rule__Chemin__Group_5__2"


    // $ANTLR start "rule__Chemin__Group_5__2__Impl"
    // InternalGame.g:5304:1: rule__Chemin__Group_5__2__Impl : ( ( rule__Chemin__ConditionsOuvertureAssignment_5_2 ) ) ;
    public final void rule__Chemin__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5308:1: ( ( ( rule__Chemin__ConditionsOuvertureAssignment_5_2 ) ) )
            // InternalGame.g:5309:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_5_2 ) )
            {
            // InternalGame.g:5309:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_5_2 ) )
            // InternalGame.g:5310:2: ( rule__Chemin__ConditionsOuvertureAssignment_5_2 )
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_5_2()); 
            // InternalGame.g:5311:2: ( rule__Chemin__ConditionsOuvertureAssignment_5_2 )
            // InternalGame.g:5311:3: rule__Chemin__ConditionsOuvertureAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsOuvertureAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_5_2()); 

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
    // $ANTLR end "rule__Chemin__Group_5__2__Impl"


    // $ANTLR start "rule__Chemin__Group_5__3"
    // InternalGame.g:5319:1: rule__Chemin__Group_5__3 : rule__Chemin__Group_5__3__Impl ;
    public final void rule__Chemin__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5323:1: ( rule__Chemin__Group_5__3__Impl )
            // InternalGame.g:5324:2: rule__Chemin__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_5__3__Impl();

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
    // $ANTLR end "rule__Chemin__Group_5__3"


    // $ANTLR start "rule__Chemin__Group_5__3__Impl"
    // InternalGame.g:5330:1: rule__Chemin__Group_5__3__Impl : ( ( rule__Chemin__Group_5_3__0 )* ) ;
    public final void rule__Chemin__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5334:1: ( ( ( rule__Chemin__Group_5_3__0 )* ) )
            // InternalGame.g:5335:1: ( ( rule__Chemin__Group_5_3__0 )* )
            {
            // InternalGame.g:5335:1: ( ( rule__Chemin__Group_5_3__0 )* )
            // InternalGame.g:5336:2: ( rule__Chemin__Group_5_3__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_5_3()); 
            // InternalGame.g:5337:2: ( rule__Chemin__Group_5_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGame.g:5337:3: rule__Chemin__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Chemin__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Chemin__Group_5__3__Impl"


    // $ANTLR start "rule__Chemin__Group_5_3__0"
    // InternalGame.g:5346:1: rule__Chemin__Group_5_3__0 : rule__Chemin__Group_5_3__0__Impl rule__Chemin__Group_5_3__1 ;
    public final void rule__Chemin__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5350:1: ( rule__Chemin__Group_5_3__0__Impl rule__Chemin__Group_5_3__1 )
            // InternalGame.g:5351:2: rule__Chemin__Group_5_3__0__Impl rule__Chemin__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_5_3__1();

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
    // $ANTLR end "rule__Chemin__Group_5_3__0"


    // $ANTLR start "rule__Chemin__Group_5_3__0__Impl"
    // InternalGame.g:5358:1: rule__Chemin__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Chemin__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5362:1: ( ( ',' ) )
            // InternalGame.g:5363:1: ( ',' )
            {
            // InternalGame.g:5363:1: ( ',' )
            // InternalGame.g:5364:2: ','
            {
             before(grammarAccess.getCheminAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Chemin__Group_5_3__0__Impl"


    // $ANTLR start "rule__Chemin__Group_5_3__1"
    // InternalGame.g:5373:1: rule__Chemin__Group_5_3__1 : rule__Chemin__Group_5_3__1__Impl ;
    public final void rule__Chemin__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5377:1: ( rule__Chemin__Group_5_3__1__Impl )
            // InternalGame.g:5378:2: rule__Chemin__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Chemin__Group_5_3__1"


    // $ANTLR start "rule__Chemin__Group_5_3__1__Impl"
    // InternalGame.g:5384:1: rule__Chemin__Group_5_3__1__Impl : ( ( rule__Chemin__ConditionsOuvertureAssignment_5_3_1 ) ) ;
    public final void rule__Chemin__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5388:1: ( ( ( rule__Chemin__ConditionsOuvertureAssignment_5_3_1 ) ) )
            // InternalGame.g:5389:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_5_3_1 ) )
            {
            // InternalGame.g:5389:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_5_3_1 ) )
            // InternalGame.g:5390:2: ( rule__Chemin__ConditionsOuvertureAssignment_5_3_1 )
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_5_3_1()); 
            // InternalGame.g:5391:2: ( rule__Chemin__ConditionsOuvertureAssignment_5_3_1 )
            // InternalGame.g:5391:3: rule__Chemin__ConditionsOuvertureAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsOuvertureAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Chemin__Group_5_3__1__Impl"


    // $ANTLR start "rule__Chemin__Group_6__0"
    // InternalGame.g:5400:1: rule__Chemin__Group_6__0 : rule__Chemin__Group_6__0__Impl rule__Chemin__Group_6__1 ;
    public final void rule__Chemin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5404:1: ( rule__Chemin__Group_6__0__Impl rule__Chemin__Group_6__1 )
            // InternalGame.g:5405:2: rule__Chemin__Group_6__0__Impl rule__Chemin__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__Chemin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6__1();

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
    // $ANTLR end "rule__Chemin__Group_6__0"


    // $ANTLR start "rule__Chemin__Group_6__0__Impl"
    // InternalGame.g:5412:1: rule__Chemin__Group_6__0__Impl : ( 'visible' ) ;
    public final void rule__Chemin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5416:1: ( ( 'visible' ) )
            // InternalGame.g:5417:1: ( 'visible' )
            {
            // InternalGame.g:5417:1: ( 'visible' )
            // InternalGame.g:5418:2: 'visible'
            {
             before(grammarAccess.getCheminAccess().getVisibleKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVisibleKeyword_6_0()); 

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
    // $ANTLR end "rule__Chemin__Group_6__0__Impl"


    // $ANTLR start "rule__Chemin__Group_6__1"
    // InternalGame.g:5427:1: rule__Chemin__Group_6__1 : rule__Chemin__Group_6__1__Impl rule__Chemin__Group_6__2 ;
    public final void rule__Chemin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5431:1: ( rule__Chemin__Group_6__1__Impl rule__Chemin__Group_6__2 )
            // InternalGame.g:5432:2: rule__Chemin__Group_6__1__Impl rule__Chemin__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6__2();

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
    // $ANTLR end "rule__Chemin__Group_6__1"


    // $ANTLR start "rule__Chemin__Group_6__1__Impl"
    // InternalGame.g:5439:1: rule__Chemin__Group_6__1__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5443:1: ( ( 'si' ) )
            // InternalGame.g:5444:1: ( 'si' )
            {
            // InternalGame.g:5444:1: ( 'si' )
            // InternalGame.g:5445:2: 'si'
            {
             before(grammarAccess.getCheminAccess().getSiKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSiKeyword_6_1()); 

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
    // $ANTLR end "rule__Chemin__Group_6__1__Impl"


    // $ANTLR start "rule__Chemin__Group_6__2"
    // InternalGame.g:5454:1: rule__Chemin__Group_6__2 : rule__Chemin__Group_6__2__Impl rule__Chemin__Group_6__3 ;
    public final void rule__Chemin__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5458:1: ( rule__Chemin__Group_6__2__Impl rule__Chemin__Group_6__3 )
            // InternalGame.g:5459:2: rule__Chemin__Group_6__2__Impl rule__Chemin__Group_6__3
            {
            pushFollow(FOLLOW_22);
            rule__Chemin__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6__3();

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
    // $ANTLR end "rule__Chemin__Group_6__2"


    // $ANTLR start "rule__Chemin__Group_6__2__Impl"
    // InternalGame.g:5466:1: rule__Chemin__Group_6__2__Impl : ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_2 ) ) ;
    public final void rule__Chemin__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5470:1: ( ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_2 ) ) )
            // InternalGame.g:5471:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_2 ) )
            {
            // InternalGame.g:5471:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_2 ) )
            // InternalGame.g:5472:2: ( rule__Chemin__ConditionsVisibiliteAssignment_6_2 )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_6_2()); 
            // InternalGame.g:5473:2: ( rule__Chemin__ConditionsVisibiliteAssignment_6_2 )
            // InternalGame.g:5473:3: rule__Chemin__ConditionsVisibiliteAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsVisibiliteAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_6_2()); 

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
    // $ANTLR end "rule__Chemin__Group_6__2__Impl"


    // $ANTLR start "rule__Chemin__Group_6__3"
    // InternalGame.g:5481:1: rule__Chemin__Group_6__3 : rule__Chemin__Group_6__3__Impl ;
    public final void rule__Chemin__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5485:1: ( rule__Chemin__Group_6__3__Impl )
            // InternalGame.g:5486:2: rule__Chemin__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6__3__Impl();

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
    // $ANTLR end "rule__Chemin__Group_6__3"


    // $ANTLR start "rule__Chemin__Group_6__3__Impl"
    // InternalGame.g:5492:1: rule__Chemin__Group_6__3__Impl : ( ( rule__Chemin__Group_6_3__0 )* ) ;
    public final void rule__Chemin__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5496:1: ( ( ( rule__Chemin__Group_6_3__0 )* ) )
            // InternalGame.g:5497:1: ( ( rule__Chemin__Group_6_3__0 )* )
            {
            // InternalGame.g:5497:1: ( ( rule__Chemin__Group_6_3__0 )* )
            // InternalGame.g:5498:2: ( rule__Chemin__Group_6_3__0 )*
            {
             before(grammarAccess.getCheminAccess().getGroup_6_3()); 
            // InternalGame.g:5499:2: ( rule__Chemin__Group_6_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGame.g:5499:3: rule__Chemin__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Chemin__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCheminAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Chemin__Group_6__3__Impl"


    // $ANTLR start "rule__Chemin__Group_6_3__0"
    // InternalGame.g:5508:1: rule__Chemin__Group_6_3__0 : rule__Chemin__Group_6_3__0__Impl rule__Chemin__Group_6_3__1 ;
    public final void rule__Chemin__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5512:1: ( rule__Chemin__Group_6_3__0__Impl rule__Chemin__Group_6_3__1 )
            // InternalGame.g:5513:2: rule__Chemin__Group_6_3__0__Impl rule__Chemin__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6_3__1();

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
    // $ANTLR end "rule__Chemin__Group_6_3__0"


    // $ANTLR start "rule__Chemin__Group_6_3__0__Impl"
    // InternalGame.g:5520:1: rule__Chemin__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Chemin__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5524:1: ( ( ',' ) )
            // InternalGame.g:5525:1: ( ',' )
            {
            // InternalGame.g:5525:1: ( ',' )
            // InternalGame.g:5526:2: ','
            {
             before(grammarAccess.getCheminAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Chemin__Group_6_3__0__Impl"


    // $ANTLR start "rule__Chemin__Group_6_3__1"
    // InternalGame.g:5535:1: rule__Chemin__Group_6_3__1 : rule__Chemin__Group_6_3__1__Impl ;
    public final void rule__Chemin__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5539:1: ( rule__Chemin__Group_6_3__1__Impl )
            // InternalGame.g:5540:2: rule__Chemin__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Chemin__Group_6_3__1"


    // $ANTLR start "rule__Chemin__Group_6_3__1__Impl"
    // InternalGame.g:5546:1: rule__Chemin__Group_6_3__1__Impl : ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 ) ) ;
    public final void rule__Chemin__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5550:1: ( ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 ) ) )
            // InternalGame.g:5551:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 ) )
            {
            // InternalGame.g:5551:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 ) )
            // InternalGame.g:5552:2: ( rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_6_3_1()); 
            // InternalGame.g:5553:2: ( rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 )
            // InternalGame.g:5553:3: rule__Chemin__ConditionsVisibiliteAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsVisibiliteAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Chemin__Group_6_3__1__Impl"


    // $ANTLR start "rule__Joueur__Group__0"
    // InternalGame.g:5562:1: rule__Joueur__Group__0 : rule__Joueur__Group__0__Impl rule__Joueur__Group__1 ;
    public final void rule__Joueur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5566:1: ( rule__Joueur__Group__0__Impl rule__Joueur__Group__1 )
            // InternalGame.g:5567:2: rule__Joueur__Group__0__Impl rule__Joueur__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Joueur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__1();

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
    // $ANTLR end "rule__Joueur__Group__0"


    // $ANTLR start "rule__Joueur__Group__0__Impl"
    // InternalGame.g:5574:1: rule__Joueur__Group__0__Impl : ( ( rule__Joueur__NameAssignment_0 ) ) ;
    public final void rule__Joueur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5578:1: ( ( ( rule__Joueur__NameAssignment_0 ) ) )
            // InternalGame.g:5579:1: ( ( rule__Joueur__NameAssignment_0 ) )
            {
            // InternalGame.g:5579:1: ( ( rule__Joueur__NameAssignment_0 ) )
            // InternalGame.g:5580:2: ( rule__Joueur__NameAssignment_0 )
            {
             before(grammarAccess.getJoueurAccess().getNameAssignment_0()); 
            // InternalGame.g:5581:2: ( rule__Joueur__NameAssignment_0 )
            // InternalGame.g:5581:3: rule__Joueur__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Joueur__Group__0__Impl"


    // $ANTLR start "rule__Joueur__Group__1"
    // InternalGame.g:5589:1: rule__Joueur__Group__1 : rule__Joueur__Group__1__Impl rule__Joueur__Group__2 ;
    public final void rule__Joueur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5593:1: ( rule__Joueur__Group__1__Impl rule__Joueur__Group__2 )
            // InternalGame.g:5594:2: rule__Joueur__Group__1__Impl rule__Joueur__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Joueur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__2();

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
    // $ANTLR end "rule__Joueur__Group__1"


    // $ANTLR start "rule__Joueur__Group__1__Impl"
    // InternalGame.g:5601:1: rule__Joueur__Group__1__Impl : ( 'situe' ) ;
    public final void rule__Joueur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5605:1: ( ( 'situe' ) )
            // InternalGame.g:5606:1: ( 'situe' )
            {
            // InternalGame.g:5606:1: ( 'situe' )
            // InternalGame.g:5607:2: 'situe'
            {
             before(grammarAccess.getJoueurAccess().getSitueKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getSitueKeyword_1()); 

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
    // $ANTLR end "rule__Joueur__Group__1__Impl"


    // $ANTLR start "rule__Joueur__Group__2"
    // InternalGame.g:5616:1: rule__Joueur__Group__2 : rule__Joueur__Group__2__Impl rule__Joueur__Group__3 ;
    public final void rule__Joueur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5620:1: ( rule__Joueur__Group__2__Impl rule__Joueur__Group__3 )
            // InternalGame.g:5621:2: rule__Joueur__Group__2__Impl rule__Joueur__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Joueur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__3();

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
    // $ANTLR end "rule__Joueur__Group__2"


    // $ANTLR start "rule__Joueur__Group__2__Impl"
    // InternalGame.g:5628:1: rule__Joueur__Group__2__Impl : ( 'en' ) ;
    public final void rule__Joueur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5632:1: ( ( 'en' ) )
            // InternalGame.g:5633:1: ( 'en' )
            {
            // InternalGame.g:5633:1: ( 'en' )
            // InternalGame.g:5634:2: 'en'
            {
             before(grammarAccess.getJoueurAccess().getEnKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getEnKeyword_2()); 

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
    // $ANTLR end "rule__Joueur__Group__2__Impl"


    // $ANTLR start "rule__Joueur__Group__3"
    // InternalGame.g:5643:1: rule__Joueur__Group__3 : rule__Joueur__Group__3__Impl rule__Joueur__Group__4 ;
    public final void rule__Joueur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5647:1: ( rule__Joueur__Group__3__Impl rule__Joueur__Group__4 )
            // InternalGame.g:5648:2: rule__Joueur__Group__3__Impl rule__Joueur__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Joueur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__4();

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
    // $ANTLR end "rule__Joueur__Group__3"


    // $ANTLR start "rule__Joueur__Group__3__Impl"
    // InternalGame.g:5655:1: rule__Joueur__Group__3__Impl : ( ( rule__Joueur__LieuAssignment_3 ) ) ;
    public final void rule__Joueur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5659:1: ( ( ( rule__Joueur__LieuAssignment_3 ) ) )
            // InternalGame.g:5660:1: ( ( rule__Joueur__LieuAssignment_3 ) )
            {
            // InternalGame.g:5660:1: ( ( rule__Joueur__LieuAssignment_3 ) )
            // InternalGame.g:5661:2: ( rule__Joueur__LieuAssignment_3 )
            {
             before(grammarAccess.getJoueurAccess().getLieuAssignment_3()); 
            // InternalGame.g:5662:2: ( rule__Joueur__LieuAssignment_3 )
            // InternalGame.g:5662:3: rule__Joueur__LieuAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__LieuAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getLieuAssignment_3()); 

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
    // $ANTLR end "rule__Joueur__Group__3__Impl"


    // $ANTLR start "rule__Joueur__Group__4"
    // InternalGame.g:5670:1: rule__Joueur__Group__4 : rule__Joueur__Group__4__Impl rule__Joueur__Group__5 ;
    public final void rule__Joueur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5674:1: ( rule__Joueur__Group__4__Impl rule__Joueur__Group__5 )
            // InternalGame.g:5675:2: rule__Joueur__Group__4__Impl rule__Joueur__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__Joueur__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__5();

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
    // $ANTLR end "rule__Joueur__Group__4"


    // $ANTLR start "rule__Joueur__Group__4__Impl"
    // InternalGame.g:5682:1: rule__Joueur__Group__4__Impl : ( 'et' ) ;
    public final void rule__Joueur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5686:1: ( ( 'et' ) )
            // InternalGame.g:5687:1: ( 'et' )
            {
            // InternalGame.g:5687:1: ( 'et' )
            // InternalGame.g:5688:2: 'et'
            {
             before(grammarAccess.getJoueurAccess().getEtKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getEtKeyword_4()); 

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
    // $ANTLR end "rule__Joueur__Group__4__Impl"


    // $ANTLR start "rule__Joueur__Group__5"
    // InternalGame.g:5697:1: rule__Joueur__Group__5 : rule__Joueur__Group__5__Impl rule__Joueur__Group__6 ;
    public final void rule__Joueur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5701:1: ( rule__Joueur__Group__5__Impl rule__Joueur__Group__6 )
            // InternalGame.g:5702:2: rule__Joueur__Group__5__Impl rule__Joueur__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Joueur__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__6();

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
    // $ANTLR end "rule__Joueur__Group__5"


    // $ANTLR start "rule__Joueur__Group__5__Impl"
    // InternalGame.g:5709:1: rule__Joueur__Group__5__Impl : ( 'inventaire' ) ;
    public final void rule__Joueur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5713:1: ( ( 'inventaire' ) )
            // InternalGame.g:5714:1: ( 'inventaire' )
            {
            // InternalGame.g:5714:1: ( 'inventaire' )
            // InternalGame.g:5715:2: 'inventaire'
            {
             before(grammarAccess.getJoueurAccess().getInventaireKeyword_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getInventaireKeyword_5()); 

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
    // $ANTLR end "rule__Joueur__Group__5__Impl"


    // $ANTLR start "rule__Joueur__Group__6"
    // InternalGame.g:5724:1: rule__Joueur__Group__6 : rule__Joueur__Group__6__Impl rule__Joueur__Group__7 ;
    public final void rule__Joueur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5728:1: ( rule__Joueur__Group__6__Impl rule__Joueur__Group__7 )
            // InternalGame.g:5729:2: rule__Joueur__Group__6__Impl rule__Joueur__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Joueur__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__7();

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
    // $ANTLR end "rule__Joueur__Group__6"


    // $ANTLR start "rule__Joueur__Group__6__Impl"
    // InternalGame.g:5736:1: rule__Joueur__Group__6__Impl : ( 'taille' ) ;
    public final void rule__Joueur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5740:1: ( ( 'taille' ) )
            // InternalGame.g:5741:1: ( 'taille' )
            {
            // InternalGame.g:5741:1: ( 'taille' )
            // InternalGame.g:5742:2: 'taille'
            {
             before(grammarAccess.getJoueurAccess().getTailleKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getTailleKeyword_6()); 

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
    // $ANTLR end "rule__Joueur__Group__6__Impl"


    // $ANTLR start "rule__Joueur__Group__7"
    // InternalGame.g:5751:1: rule__Joueur__Group__7 : rule__Joueur__Group__7__Impl rule__Joueur__Group__8 ;
    public final void rule__Joueur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5755:1: ( rule__Joueur__Group__7__Impl rule__Joueur__Group__8 )
            // InternalGame.g:5756:2: rule__Joueur__Group__7__Impl rule__Joueur__Group__8
            {
            pushFollow(FOLLOW_51);
            rule__Joueur__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__8();

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
    // $ANTLR end "rule__Joueur__Group__7"


    // $ANTLR start "rule__Joueur__Group__7__Impl"
    // InternalGame.g:5763:1: rule__Joueur__Group__7__Impl : ( ( rule__Joueur__TailleAssignment_7 ) ) ;
    public final void rule__Joueur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5767:1: ( ( ( rule__Joueur__TailleAssignment_7 ) ) )
            // InternalGame.g:5768:1: ( ( rule__Joueur__TailleAssignment_7 ) )
            {
            // InternalGame.g:5768:1: ( ( rule__Joueur__TailleAssignment_7 ) )
            // InternalGame.g:5769:2: ( rule__Joueur__TailleAssignment_7 )
            {
             before(grammarAccess.getJoueurAccess().getTailleAssignment_7()); 
            // InternalGame.g:5770:2: ( rule__Joueur__TailleAssignment_7 )
            // InternalGame.g:5770:3: rule__Joueur__TailleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__TailleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getTailleAssignment_7()); 

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
    // $ANTLR end "rule__Joueur__Group__7__Impl"


    // $ANTLR start "rule__Joueur__Group__8"
    // InternalGame.g:5778:1: rule__Joueur__Group__8 : rule__Joueur__Group__8__Impl rule__Joueur__Group__9 ;
    public final void rule__Joueur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5782:1: ( rule__Joueur__Group__8__Impl rule__Joueur__Group__9 )
            // InternalGame.g:5783:2: rule__Joueur__Group__8__Impl rule__Joueur__Group__9
            {
            pushFollow(FOLLOW_51);
            rule__Joueur__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__9();

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
    // $ANTLR end "rule__Joueur__Group__8"


    // $ANTLR start "rule__Joueur__Group__8__Impl"
    // InternalGame.g:5790:1: rule__Joueur__Group__8__Impl : ( ( rule__Joueur__Group_8__0 )? ) ;
    public final void rule__Joueur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5794:1: ( ( ( rule__Joueur__Group_8__0 )? ) )
            // InternalGame.g:5795:1: ( ( rule__Joueur__Group_8__0 )? )
            {
            // InternalGame.g:5795:1: ( ( rule__Joueur__Group_8__0 )? )
            // InternalGame.g:5796:2: ( rule__Joueur__Group_8__0 )?
            {
             before(grammarAccess.getJoueurAccess().getGroup_8()); 
            // InternalGame.g:5797:2: ( rule__Joueur__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGame.g:5797:3: rule__Joueur__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joueur__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoueurAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Joueur__Group__8__Impl"


    // $ANTLR start "rule__Joueur__Group__9"
    // InternalGame.g:5805:1: rule__Joueur__Group__9 : rule__Joueur__Group__9__Impl ;
    public final void rule__Joueur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5809:1: ( rule__Joueur__Group__9__Impl )
            // InternalGame.g:5810:2: rule__Joueur__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group__9__Impl();

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
    // $ANTLR end "rule__Joueur__Group__9"


    // $ANTLR start "rule__Joueur__Group__9__Impl"
    // InternalGame.g:5816:1: rule__Joueur__Group__9__Impl : ( ( rule__Joueur__Group_9__0 )? ) ;
    public final void rule__Joueur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5820:1: ( ( ( rule__Joueur__Group_9__0 )? ) )
            // InternalGame.g:5821:1: ( ( rule__Joueur__Group_9__0 )? )
            {
            // InternalGame.g:5821:1: ( ( rule__Joueur__Group_9__0 )? )
            // InternalGame.g:5822:2: ( rule__Joueur__Group_9__0 )?
            {
             before(grammarAccess.getJoueurAccess().getGroup_9()); 
            // InternalGame.g:5823:2: ( rule__Joueur__Group_9__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGame.g:5823:3: rule__Joueur__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joueur__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoueurAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Joueur__Group__9__Impl"


    // $ANTLR start "rule__Joueur__Group_8__0"
    // InternalGame.g:5832:1: rule__Joueur__Group_8__0 : rule__Joueur__Group_8__0__Impl rule__Joueur__Group_8__1 ;
    public final void rule__Joueur__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5836:1: ( rule__Joueur__Group_8__0__Impl rule__Joueur__Group_8__1 )
            // InternalGame.g:5837:2: rule__Joueur__Group_8__0__Impl rule__Joueur__Group_8__1
            {
            pushFollow(FOLLOW_52);
            rule__Joueur__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_8__1();

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
    // $ANTLR end "rule__Joueur__Group_8__0"


    // $ANTLR start "rule__Joueur__Group_8__0__Impl"
    // InternalGame.g:5844:1: rule__Joueur__Group_8__0__Impl : ( 'commence' ) ;
    public final void rule__Joueur__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5848:1: ( ( 'commence' ) )
            // InternalGame.g:5849:1: ( 'commence' )
            {
            // InternalGame.g:5849:1: ( 'commence' )
            // InternalGame.g:5850:2: 'commence'
            {
             before(grammarAccess.getJoueurAccess().getCommenceKeyword_8_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getCommenceKeyword_8_0()); 

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
    // $ANTLR end "rule__Joueur__Group_8__0__Impl"


    // $ANTLR start "rule__Joueur__Group_8__1"
    // InternalGame.g:5859:1: rule__Joueur__Group_8__1 : rule__Joueur__Group_8__1__Impl rule__Joueur__Group_8__2 ;
    public final void rule__Joueur__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5863:1: ( rule__Joueur__Group_8__1__Impl rule__Joueur__Group_8__2 )
            // InternalGame.g:5864:2: rule__Joueur__Group_8__1__Impl rule__Joueur__Group_8__2
            {
            pushFollow(FOLLOW_3);
            rule__Joueur__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_8__2();

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
    // $ANTLR end "rule__Joueur__Group_8__1"


    // $ANTLR start "rule__Joueur__Group_8__1__Impl"
    // InternalGame.g:5871:1: rule__Joueur__Group_8__1__Impl : ( 'avec' ) ;
    public final void rule__Joueur__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5875:1: ( ( 'avec' ) )
            // InternalGame.g:5876:1: ( 'avec' )
            {
            // InternalGame.g:5876:1: ( 'avec' )
            // InternalGame.g:5877:2: 'avec'
            {
             before(grammarAccess.getJoueurAccess().getAvecKeyword_8_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getAvecKeyword_8_1()); 

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
    // $ANTLR end "rule__Joueur__Group_8__1__Impl"


    // $ANTLR start "rule__Joueur__Group_8__2"
    // InternalGame.g:5886:1: rule__Joueur__Group_8__2 : rule__Joueur__Group_8__2__Impl rule__Joueur__Group_8__3 ;
    public final void rule__Joueur__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5890:1: ( rule__Joueur__Group_8__2__Impl rule__Joueur__Group_8__3 )
            // InternalGame.g:5891:2: rule__Joueur__Group_8__2__Impl rule__Joueur__Group_8__3
            {
            pushFollow(FOLLOW_22);
            rule__Joueur__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_8__3();

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
    // $ANTLR end "rule__Joueur__Group_8__2"


    // $ANTLR start "rule__Joueur__Group_8__2__Impl"
    // InternalGame.g:5898:1: rule__Joueur__Group_8__2__Impl : ( ( rule__Joueur__InventaireAssignment_8_2 ) ) ;
    public final void rule__Joueur__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5902:1: ( ( ( rule__Joueur__InventaireAssignment_8_2 ) ) )
            // InternalGame.g:5903:1: ( ( rule__Joueur__InventaireAssignment_8_2 ) )
            {
            // InternalGame.g:5903:1: ( ( rule__Joueur__InventaireAssignment_8_2 ) )
            // InternalGame.g:5904:2: ( rule__Joueur__InventaireAssignment_8_2 )
            {
             before(grammarAccess.getJoueurAccess().getInventaireAssignment_8_2()); 
            // InternalGame.g:5905:2: ( rule__Joueur__InventaireAssignment_8_2 )
            // InternalGame.g:5905:3: rule__Joueur__InventaireAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__InventaireAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getInventaireAssignment_8_2()); 

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
    // $ANTLR end "rule__Joueur__Group_8__2__Impl"


    // $ANTLR start "rule__Joueur__Group_8__3"
    // InternalGame.g:5913:1: rule__Joueur__Group_8__3 : rule__Joueur__Group_8__3__Impl ;
    public final void rule__Joueur__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5917:1: ( rule__Joueur__Group_8__3__Impl )
            // InternalGame.g:5918:2: rule__Joueur__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group_8__3__Impl();

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
    // $ANTLR end "rule__Joueur__Group_8__3"


    // $ANTLR start "rule__Joueur__Group_8__3__Impl"
    // InternalGame.g:5924:1: rule__Joueur__Group_8__3__Impl : ( ( rule__Joueur__Group_8_3__0 )* ) ;
    public final void rule__Joueur__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5928:1: ( ( ( rule__Joueur__Group_8_3__0 )* ) )
            // InternalGame.g:5929:1: ( ( rule__Joueur__Group_8_3__0 )* )
            {
            // InternalGame.g:5929:1: ( ( rule__Joueur__Group_8_3__0 )* )
            // InternalGame.g:5930:2: ( rule__Joueur__Group_8_3__0 )*
            {
             before(grammarAccess.getJoueurAccess().getGroup_8_3()); 
            // InternalGame.g:5931:2: ( rule__Joueur__Group_8_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==27) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGame.g:5931:3: rule__Joueur__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Joueur__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getJoueurAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__Joueur__Group_8__3__Impl"


    // $ANTLR start "rule__Joueur__Group_8_3__0"
    // InternalGame.g:5940:1: rule__Joueur__Group_8_3__0 : rule__Joueur__Group_8_3__0__Impl rule__Joueur__Group_8_3__1 ;
    public final void rule__Joueur__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5944:1: ( rule__Joueur__Group_8_3__0__Impl rule__Joueur__Group_8_3__1 )
            // InternalGame.g:5945:2: rule__Joueur__Group_8_3__0__Impl rule__Joueur__Group_8_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Joueur__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_8_3__1();

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
    // $ANTLR end "rule__Joueur__Group_8_3__0"


    // $ANTLR start "rule__Joueur__Group_8_3__0__Impl"
    // InternalGame.g:5952:1: rule__Joueur__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Joueur__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5956:1: ( ( ',' ) )
            // InternalGame.g:5957:1: ( ',' )
            {
            // InternalGame.g:5957:1: ( ',' )
            // InternalGame.g:5958:2: ','
            {
             before(grammarAccess.getJoueurAccess().getCommaKeyword_8_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__Joueur__Group_8_3__0__Impl"


    // $ANTLR start "rule__Joueur__Group_8_3__1"
    // InternalGame.g:5967:1: rule__Joueur__Group_8_3__1 : rule__Joueur__Group_8_3__1__Impl ;
    public final void rule__Joueur__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5971:1: ( rule__Joueur__Group_8_3__1__Impl )
            // InternalGame.g:5972:2: rule__Joueur__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__Joueur__Group_8_3__1"


    // $ANTLR start "rule__Joueur__Group_8_3__1__Impl"
    // InternalGame.g:5978:1: rule__Joueur__Group_8_3__1__Impl : ( ( rule__Joueur__InventaireAssignment_8_3_1 ) ) ;
    public final void rule__Joueur__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5982:1: ( ( ( rule__Joueur__InventaireAssignment_8_3_1 ) ) )
            // InternalGame.g:5983:1: ( ( rule__Joueur__InventaireAssignment_8_3_1 ) )
            {
            // InternalGame.g:5983:1: ( ( rule__Joueur__InventaireAssignment_8_3_1 ) )
            // InternalGame.g:5984:2: ( rule__Joueur__InventaireAssignment_8_3_1 )
            {
             before(grammarAccess.getJoueurAccess().getInventaireAssignment_8_3_1()); 
            // InternalGame.g:5985:2: ( rule__Joueur__InventaireAssignment_8_3_1 )
            // InternalGame.g:5985:3: rule__Joueur__InventaireAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__InventaireAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getInventaireAssignment_8_3_1()); 

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
    // $ANTLR end "rule__Joueur__Group_8_3__1__Impl"


    // $ANTLR start "rule__Joueur__Group_9__0"
    // InternalGame.g:5994:1: rule__Joueur__Group_9__0 : rule__Joueur__Group_9__0__Impl rule__Joueur__Group_9__1 ;
    public final void rule__Joueur__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5998:1: ( rule__Joueur__Group_9__0__Impl rule__Joueur__Group_9__1 )
            // InternalGame.g:5999:2: rule__Joueur__Group_9__0__Impl rule__Joueur__Group_9__1
            {
            pushFollow(FOLLOW_53);
            rule__Joueur__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9__1();

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
    // $ANTLR end "rule__Joueur__Group_9__0"


    // $ANTLR start "rule__Joueur__Group_9__0__Impl"
    // InternalGame.g:6006:1: rule__Joueur__Group_9__0__Impl : ( 'connaissances' ) ;
    public final void rule__Joueur__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6010:1: ( ( 'connaissances' ) )
            // InternalGame.g:6011:1: ( 'connaissances' )
            {
            // InternalGame.g:6011:1: ( 'connaissances' )
            // InternalGame.g:6012:2: 'connaissances'
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesKeyword_9_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getConnaissancesKeyword_9_0()); 

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
    // $ANTLR end "rule__Joueur__Group_9__0__Impl"


    // $ANTLR start "rule__Joueur__Group_9__1"
    // InternalGame.g:6021:1: rule__Joueur__Group_9__1 : rule__Joueur__Group_9__1__Impl rule__Joueur__Group_9__2 ;
    public final void rule__Joueur__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6025:1: ( rule__Joueur__Group_9__1__Impl rule__Joueur__Group_9__2 )
            // InternalGame.g:6026:2: rule__Joueur__Group_9__1__Impl rule__Joueur__Group_9__2
            {
            pushFollow(FOLLOW_52);
            rule__Joueur__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9__2();

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
    // $ANTLR end "rule__Joueur__Group_9__1"


    // $ANTLR start "rule__Joueur__Group_9__1__Impl"
    // InternalGame.g:6033:1: rule__Joueur__Group_9__1__Impl : ( 'commence' ) ;
    public final void rule__Joueur__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6037:1: ( ( 'commence' ) )
            // InternalGame.g:6038:1: ( 'commence' )
            {
            // InternalGame.g:6038:1: ( 'commence' )
            // InternalGame.g:6039:2: 'commence'
            {
             before(grammarAccess.getJoueurAccess().getCommenceKeyword_9_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getCommenceKeyword_9_1()); 

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
    // $ANTLR end "rule__Joueur__Group_9__1__Impl"


    // $ANTLR start "rule__Joueur__Group_9__2"
    // InternalGame.g:6048:1: rule__Joueur__Group_9__2 : rule__Joueur__Group_9__2__Impl rule__Joueur__Group_9__3 ;
    public final void rule__Joueur__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6052:1: ( rule__Joueur__Group_9__2__Impl rule__Joueur__Group_9__3 )
            // InternalGame.g:6053:2: rule__Joueur__Group_9__2__Impl rule__Joueur__Group_9__3
            {
            pushFollow(FOLLOW_3);
            rule__Joueur__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9__3();

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
    // $ANTLR end "rule__Joueur__Group_9__2"


    // $ANTLR start "rule__Joueur__Group_9__2__Impl"
    // InternalGame.g:6060:1: rule__Joueur__Group_9__2__Impl : ( 'avec' ) ;
    public final void rule__Joueur__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6064:1: ( ( 'avec' ) )
            // InternalGame.g:6065:1: ( 'avec' )
            {
            // InternalGame.g:6065:1: ( 'avec' )
            // InternalGame.g:6066:2: 'avec'
            {
             before(grammarAccess.getJoueurAccess().getAvecKeyword_9_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getAvecKeyword_9_2()); 

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
    // $ANTLR end "rule__Joueur__Group_9__2__Impl"


    // $ANTLR start "rule__Joueur__Group_9__3"
    // InternalGame.g:6075:1: rule__Joueur__Group_9__3 : rule__Joueur__Group_9__3__Impl rule__Joueur__Group_9__4 ;
    public final void rule__Joueur__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6079:1: ( rule__Joueur__Group_9__3__Impl rule__Joueur__Group_9__4 )
            // InternalGame.g:6080:2: rule__Joueur__Group_9__3__Impl rule__Joueur__Group_9__4
            {
            pushFollow(FOLLOW_22);
            rule__Joueur__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9__4();

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
    // $ANTLR end "rule__Joueur__Group_9__3"


    // $ANTLR start "rule__Joueur__Group_9__3__Impl"
    // InternalGame.g:6087:1: rule__Joueur__Group_9__3__Impl : ( ( rule__Joueur__ConnaissancesAssignment_9_3 ) ) ;
    public final void rule__Joueur__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6091:1: ( ( ( rule__Joueur__ConnaissancesAssignment_9_3 ) ) )
            // InternalGame.g:6092:1: ( ( rule__Joueur__ConnaissancesAssignment_9_3 ) )
            {
            // InternalGame.g:6092:1: ( ( rule__Joueur__ConnaissancesAssignment_9_3 ) )
            // InternalGame.g:6093:2: ( rule__Joueur__ConnaissancesAssignment_9_3 )
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesAssignment_9_3()); 
            // InternalGame.g:6094:2: ( rule__Joueur__ConnaissancesAssignment_9_3 )
            // InternalGame.g:6094:3: rule__Joueur__ConnaissancesAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__ConnaissancesAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getConnaissancesAssignment_9_3()); 

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
    // $ANTLR end "rule__Joueur__Group_9__3__Impl"


    // $ANTLR start "rule__Joueur__Group_9__4"
    // InternalGame.g:6102:1: rule__Joueur__Group_9__4 : rule__Joueur__Group_9__4__Impl ;
    public final void rule__Joueur__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6106:1: ( rule__Joueur__Group_9__4__Impl )
            // InternalGame.g:6107:2: rule__Joueur__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9__4__Impl();

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
    // $ANTLR end "rule__Joueur__Group_9__4"


    // $ANTLR start "rule__Joueur__Group_9__4__Impl"
    // InternalGame.g:6113:1: rule__Joueur__Group_9__4__Impl : ( ( rule__Joueur__Group_9_4__0 )* ) ;
    public final void rule__Joueur__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6117:1: ( ( ( rule__Joueur__Group_9_4__0 )* ) )
            // InternalGame.g:6118:1: ( ( rule__Joueur__Group_9_4__0 )* )
            {
            // InternalGame.g:6118:1: ( ( rule__Joueur__Group_9_4__0 )* )
            // InternalGame.g:6119:2: ( rule__Joueur__Group_9_4__0 )*
            {
             before(grammarAccess.getJoueurAccess().getGroup_9_4()); 
            // InternalGame.g:6120:2: ( rule__Joueur__Group_9_4__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGame.g:6120:3: rule__Joueur__Group_9_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Joueur__Group_9_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getJoueurAccess().getGroup_9_4()); 

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
    // $ANTLR end "rule__Joueur__Group_9__4__Impl"


    // $ANTLR start "rule__Joueur__Group_9_4__0"
    // InternalGame.g:6129:1: rule__Joueur__Group_9_4__0 : rule__Joueur__Group_9_4__0__Impl rule__Joueur__Group_9_4__1 ;
    public final void rule__Joueur__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6133:1: ( rule__Joueur__Group_9_4__0__Impl rule__Joueur__Group_9_4__1 )
            // InternalGame.g:6134:2: rule__Joueur__Group_9_4__0__Impl rule__Joueur__Group_9_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Joueur__Group_9_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9_4__1();

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
    // $ANTLR end "rule__Joueur__Group_9_4__0"


    // $ANTLR start "rule__Joueur__Group_9_4__0__Impl"
    // InternalGame.g:6141:1: rule__Joueur__Group_9_4__0__Impl : ( ',' ) ;
    public final void rule__Joueur__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6145:1: ( ( ',' ) )
            // InternalGame.g:6146:1: ( ',' )
            {
            // InternalGame.g:6146:1: ( ',' )
            // InternalGame.g:6147:2: ','
            {
             before(grammarAccess.getJoueurAccess().getCommaKeyword_9_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getCommaKeyword_9_4_0()); 

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
    // $ANTLR end "rule__Joueur__Group_9_4__0__Impl"


    // $ANTLR start "rule__Joueur__Group_9_4__1"
    // InternalGame.g:6156:1: rule__Joueur__Group_9_4__1 : rule__Joueur__Group_9_4__1__Impl ;
    public final void rule__Joueur__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6160:1: ( rule__Joueur__Group_9_4__1__Impl )
            // InternalGame.g:6161:2: rule__Joueur__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group_9_4__1__Impl();

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
    // $ANTLR end "rule__Joueur__Group_9_4__1"


    // $ANTLR start "rule__Joueur__Group_9_4__1__Impl"
    // InternalGame.g:6167:1: rule__Joueur__Group_9_4__1__Impl : ( ( rule__Joueur__ConnaissancesAssignment_9_4_1 ) ) ;
    public final void rule__Joueur__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6171:1: ( ( ( rule__Joueur__ConnaissancesAssignment_9_4_1 ) ) )
            // InternalGame.g:6172:1: ( ( rule__Joueur__ConnaissancesAssignment_9_4_1 ) )
            {
            // InternalGame.g:6172:1: ( ( rule__Joueur__ConnaissancesAssignment_9_4_1 ) )
            // InternalGame.g:6173:2: ( rule__Joueur__ConnaissancesAssignment_9_4_1 )
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesAssignment_9_4_1()); 
            // InternalGame.g:6174:2: ( rule__Joueur__ConnaissancesAssignment_9_4_1 )
            // InternalGame.g:6174:3: rule__Joueur__ConnaissancesAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__ConnaissancesAssignment_9_4_1();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getConnaissancesAssignment_9_4_1()); 

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
    // $ANTLR end "rule__Joueur__Group_9_4__1__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalGame.g:6183:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6187:1: ( ( RULE_ID ) )
            // InternalGame.g:6188:2: ( RULE_ID )
            {
            // InternalGame.g:6188:2: ( RULE_ID )
            // InternalGame.g:6189:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Jeu__NameAssignment_1"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_4"
    // InternalGame.g:6198:1: rule__Jeu__JeuElementsAssignment_4 : ( ruleConnaissance ) ;
    public final void rule__Jeu__JeuElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6202:1: ( ( ruleConnaissance ) )
            // InternalGame.g:6203:2: ( ruleConnaissance )
            {
            // InternalGame.g:6203:2: ( ruleConnaissance )
            // InternalGame.g:6204:3: ruleConnaissance
            {
             before(grammarAccess.getJeuAccess().getJeuElementsConnaissanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsConnaissanceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_4"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_8"
    // InternalGame.g:6213:1: rule__Jeu__JeuElementsAssignment_8 : ( ruleObjet ) ;
    public final void rule__Jeu__JeuElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6217:1: ( ( ruleObjet ) )
            // InternalGame.g:6218:2: ( ruleObjet )
            {
            // InternalGame.g:6218:2: ( ruleObjet )
            // InternalGame.g:6219:3: ruleObjet
            {
             before(grammarAccess.getJeuAccess().getJeuElementsObjetParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsObjetParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_8"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_12"
    // InternalGame.g:6228:1: rule__Jeu__JeuElementsAssignment_12 : ( rulePNJ ) ;
    public final void rule__Jeu__JeuElementsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6232:1: ( ( rulePNJ ) )
            // InternalGame.g:6233:2: ( rulePNJ )
            {
            // InternalGame.g:6233:2: ( rulePNJ )
            // InternalGame.g:6234:3: rulePNJ
            {
             before(grammarAccess.getJeuAccess().getJeuElementsPNJParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulePNJ();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsPNJParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_12"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_16"
    // InternalGame.g:6243:1: rule__Jeu__JeuElementsAssignment_16 : ( ruleAction ) ;
    public final void rule__Jeu__JeuElementsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6247:1: ( ( ruleAction ) )
            // InternalGame.g:6248:2: ( ruleAction )
            {
            // InternalGame.g:6248:2: ( ruleAction )
            // InternalGame.g:6249:3: ruleAction
            {
             before(grammarAccess.getJeuAccess().getJeuElementsActionParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsActionParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_16"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_20"
    // InternalGame.g:6258:1: rule__Jeu__JeuElementsAssignment_20 : ( ruleCondition ) ;
    public final void rule__Jeu__JeuElementsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6262:1: ( ( ruleCondition ) )
            // InternalGame.g:6263:2: ( ruleCondition )
            {
            // InternalGame.g:6263:2: ( ruleCondition )
            // InternalGame.g:6264:3: ruleCondition
            {
             before(grammarAccess.getJeuAccess().getJeuElementsConditionParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsConditionParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_20"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_24"
    // InternalGame.g:6273:1: rule__Jeu__JeuElementsAssignment_24 : ( ruleLieu ) ;
    public final void rule__Jeu__JeuElementsAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6277:1: ( ( ruleLieu ) )
            // InternalGame.g:6278:2: ( ruleLieu )
            {
            // InternalGame.g:6278:2: ( ruleLieu )
            // InternalGame.g:6279:3: ruleLieu
            {
             before(grammarAccess.getJeuAccess().getJeuElementsLieuParserRuleCall_24_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsLieuParserRuleCall_24_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_24"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_28"
    // InternalGame.g:6288:1: rule__Jeu__JeuElementsAssignment_28 : ( ruleChemin ) ;
    public final void rule__Jeu__JeuElementsAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6292:1: ( ( ruleChemin ) )
            // InternalGame.g:6293:2: ( ruleChemin )
            {
            // InternalGame.g:6293:2: ( ruleChemin )
            // InternalGame.g:6294:3: ruleChemin
            {
             before(grammarAccess.getJeuAccess().getJeuElementsCheminParserRuleCall_28_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsCheminParserRuleCall_28_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_28"


    // $ANTLR start "rule__Jeu__JeuElementsAssignment_32"
    // InternalGame.g:6303:1: rule__Jeu__JeuElementsAssignment_32 : ( ruleJoueur ) ;
    public final void rule__Jeu__JeuElementsAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6307:1: ( ( ruleJoueur ) )
            // InternalGame.g:6308:2: ( ruleJoueur )
            {
            // InternalGame.g:6308:2: ( ruleJoueur )
            // InternalGame.g:6309:3: ruleJoueur
            {
             before(grammarAccess.getJeuAccess().getJeuElementsJoueurParserRuleCall_32_0()); 
            pushFollow(FOLLOW_2);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuElementsJoueurParserRuleCall_32_0()); 

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
    // $ANTLR end "rule__Jeu__JeuElementsAssignment_32"


    // $ANTLR start "rule__Connaissance__NameAssignment_0"
    // InternalGame.g:6318:1: rule__Connaissance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6322:1: ( ( RULE_ID ) )
            // InternalGame.g:6323:2: ( RULE_ID )
            {
            // InternalGame.g:6323:2: ( RULE_ID )
            // InternalGame.g:6324:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Connaissance__NameAssignment_0"


    // $ANTLR start "rule__Connaissance__ConditionsVisibiliteAssignment_1_2"
    // InternalGame.g:6333:1: rule__Connaissance__ConditionsVisibiliteAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Connaissance__ConditionsVisibiliteAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6337:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6338:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6338:2: ( ( RULE_ID ) )
            // InternalGame.g:6339:3: ( RULE_ID )
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionCrossReference_1_2_0()); 
            // InternalGame.g:6340:3: ( RULE_ID )
            // InternalGame.g:6341:4: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__Connaissance__ConditionsVisibiliteAssignment_1_2"


    // $ANTLR start "rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1"
    // InternalGame.g:6352:1: rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6356:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6357:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6357:2: ( ( RULE_ID ) )
            // InternalGame.g:6358:3: ( RULE_ID )
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionCrossReference_1_3_1_0()); 
            // InternalGame.g:6359:3: ( RULE_ID )
            // InternalGame.g:6360:4: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_1_3_1_0_1()); 

            }

             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionCrossReference_1_3_1_0()); 

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
    // $ANTLR end "rule__Connaissance__ConditionsVisibiliteAssignment_1_3_1"


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalGame.g:6371:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6375:1: ( ( RULE_ID ) )
            // InternalGame.g:6376:2: ( RULE_ID )
            {
            // InternalGame.g:6376:2: ( RULE_ID )
            // InternalGame.g:6377:3: RULE_ID
            {
             before(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Objet__NameAssignment_1"


    // $ANTLR start "rule__Objet__TailleAssignment_3"
    // InternalGame.g:6386:1: rule__Objet__TailleAssignment_3 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6390:1: ( ( RULE_INT ) )
            // InternalGame.g:6391:2: ( RULE_INT )
            {
            // InternalGame.g:6391:2: ( RULE_INT )
            // InternalGame.g:6392:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Objet__TailleAssignment_3"


    // $ANTLR start "rule__Objet__QuantiteAssignment_6"
    // InternalGame.g:6401:1: rule__Objet__QuantiteAssignment_6 : ( RULE_INT ) ;
    public final void rule__Objet__QuantiteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6405:1: ( ( RULE_INT ) )
            // InternalGame.g:6406:2: ( RULE_INT )
            {
            // InternalGame.g:6406:2: ( RULE_INT )
            // InternalGame.g:6407:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Objet__QuantiteAssignment_6"


    // $ANTLR start "rule__ObjetTenu__ObjetAssignment_0"
    // InternalGame.g:6416:1: rule__ObjetTenu__ObjetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjetTenu__ObjetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6420:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6421:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6421:2: ( ( RULE_ID ) )
            // InternalGame.g:6422:3: ( RULE_ID )
            {
             before(grammarAccess.getObjetTenuAccess().getObjetObjetCrossReference_0_0()); 
            // InternalGame.g:6423:3: ( RULE_ID )
            // InternalGame.g:6424:4: RULE_ID
            {
             before(grammarAccess.getObjetTenuAccess().getObjetObjetIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getObjetObjetIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjetTenuAccess().getObjetObjetCrossReference_0_0()); 

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
    // $ANTLR end "rule__ObjetTenu__ObjetAssignment_0"


    // $ANTLR start "rule__ObjetTenu__QuantiteAssignment_2"
    // InternalGame.g:6435:1: rule__ObjetTenu__QuantiteAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObjetTenu__QuantiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6439:1: ( ( RULE_INT ) )
            // InternalGame.g:6440:2: ( RULE_INT )
            {
            // InternalGame.g:6440:2: ( RULE_INT )
            // InternalGame.g:6441:3: RULE_INT
            {
             before(grammarAccess.getObjetTenuAccess().getQuantiteINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getQuantiteINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ObjetTenu__QuantiteAssignment_2"


    // $ANTLR start "rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2"
    // InternalGame.g:6450:1: rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6454:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6455:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6455:2: ( ( RULE_ID ) )
            // InternalGame.g:6456:3: ( RULE_ID )
            {
             before(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionCrossReference_3_2_0()); 
            // InternalGame.g:6457:3: ( RULE_ID )
            // InternalGame.g:6458:4: RULE_ID
            {
             before(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionCrossReference_3_2_0()); 

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
    // $ANTLR end "rule__ObjetTenu__ConditionsVisibiliteAssignment_3_2"


    // $ANTLR start "rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1"
    // InternalGame.g:6469:1: rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6473:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6474:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6474:2: ( ( RULE_ID ) )
            // InternalGame.g:6475:3: ( RULE_ID )
            {
             before(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionCrossReference_3_3_1_0()); 
            // InternalGame.g:6476:3: ( RULE_ID )
            // InternalGame.g:6477:4: RULE_ID
            {
             before(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionCrossReference_3_3_1_0()); 

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
    // $ANTLR end "rule__ObjetTenu__ConditionsVisibiliteAssignment_3_3_1"


    // $ANTLR start "rule__Condition__NameAssignment_0"
    // InternalGame.g:6488:1: rule__Condition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6492:1: ( ( RULE_ID ) )
            // InternalGame.g:6493:2: ( RULE_ID )
            {
            // InternalGame.g:6493:2: ( RULE_ID )
            // InternalGame.g:6494:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Condition__NameAssignment_0"


    // $ANTLR start "rule__Condition__NegationAssignment_5_0_0"
    // InternalGame.g:6503:1: rule__Condition__NegationAssignment_5_0_0 : ( ( 'pas' ) ) ;
    public final void rule__Condition__NegationAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6507:1: ( ( ( 'pas' ) ) )
            // InternalGame.g:6508:2: ( ( 'pas' ) )
            {
            // InternalGame.g:6508:2: ( ( 'pas' ) )
            // InternalGame.g:6509:3: ( 'pas' )
            {
             before(grammarAccess.getConditionAccess().getNegationPasKeyword_5_0_0_0()); 
            // InternalGame.g:6510:3: ( 'pas' )
            // InternalGame.g:6511:4: 'pas'
            {
             before(grammarAccess.getConditionAccess().getNegationPasKeyword_5_0_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNegationPasKeyword_5_0_0_0()); 

            }

             after(grammarAccess.getConditionAccess().getNegationPasKeyword_5_0_0_0()); 

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
    // $ANTLR end "rule__Condition__NegationAssignment_5_0_0"


    // $ANTLR start "rule__Condition__ObjetAssignment_5_0_2"
    // InternalGame.g:6522:1: rule__Condition__ObjetAssignment_5_0_2 : ( ruleObjetTenu ) ;
    public final void rule__Condition__ObjetAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6526:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:6527:2: ( ruleObjetTenu )
            {
            // InternalGame.g:6527:2: ( ruleObjetTenu )
            // InternalGame.g:6528:3: ruleObjetTenu
            {
             before(grammarAccess.getConditionAccess().getObjetObjetTenuParserRuleCall_5_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getObjetObjetTenuParserRuleCall_5_0_2_0()); 

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
    // $ANTLR end "rule__Condition__ObjetAssignment_5_0_2"


    // $ANTLR start "rule__Condition__NegationAssignment_5_1_0"
    // InternalGame.g:6537:1: rule__Condition__NegationAssignment_5_1_0 : ( ( 'pas' ) ) ;
    public final void rule__Condition__NegationAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6541:1: ( ( ( 'pas' ) ) )
            // InternalGame.g:6542:2: ( ( 'pas' ) )
            {
            // InternalGame.g:6542:2: ( ( 'pas' ) )
            // InternalGame.g:6543:3: ( 'pas' )
            {
             before(grammarAccess.getConditionAccess().getNegationPasKeyword_5_1_0_0()); 
            // InternalGame.g:6544:3: ( 'pas' )
            // InternalGame.g:6545:4: 'pas'
            {
             before(grammarAccess.getConditionAccess().getNegationPasKeyword_5_1_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNegationPasKeyword_5_1_0_0()); 

            }

             after(grammarAccess.getConditionAccess().getNegationPasKeyword_5_1_0_0()); 

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
    // $ANTLR end "rule__Condition__NegationAssignment_5_1_0"


    // $ANTLR start "rule__Condition__ConnaissanceAssignment_5_1_2"
    // InternalGame.g:6556:1: rule__Condition__ConnaissanceAssignment_5_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissanceAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6560:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6561:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6561:2: ( ( RULE_ID ) )
            // InternalGame.g:6562:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissanceConnaissanceCrossReference_5_1_2_0()); 
            // InternalGame.g:6563:3: ( RULE_ID )
            // InternalGame.g:6564:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getConnaissanceConnaissanceIDTerminalRuleCall_5_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissanceConnaissanceIDTerminalRuleCall_5_1_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getConnaissanceConnaissanceCrossReference_5_1_2_0()); 

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
    // $ANTLR end "rule__Condition__ConnaissanceAssignment_5_1_2"


    // $ANTLR start "rule__PNJ__NameAssignment_0"
    // InternalGame.g:6575:1: rule__PNJ__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PNJ__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6579:1: ( ( RULE_ID ) )
            // InternalGame.g:6580:2: ( RULE_ID )
            {
            // InternalGame.g:6580:2: ( RULE_ID )
            // InternalGame.g:6581:3: RULE_ID
            {
             before(grammarAccess.getPNJAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PNJ__NameAssignment_0"


    // $ANTLR start "rule__PNJ__LieuAssignment_3"
    // InternalGame.g:6590:1: rule__PNJ__LieuAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PNJ__LieuAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6594:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6595:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6595:2: ( ( RULE_ID ) )
            // InternalGame.g:6596:3: ( RULE_ID )
            {
             before(grammarAccess.getPNJAccess().getLieuLieuCrossReference_3_0()); 
            // InternalGame.g:6597:3: ( RULE_ID )
            // InternalGame.g:6598:4: RULE_ID
            {
             before(grammarAccess.getPNJAccess().getLieuLieuIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getLieuLieuIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPNJAccess().getLieuLieuCrossReference_3_0()); 

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
    // $ANTLR end "rule__PNJ__LieuAssignment_3"


    // $ANTLR start "rule__PNJ__DialogueAssignment_7"
    // InternalGame.g:6609:1: rule__PNJ__DialogueAssignment_7 : ( ruleDialogue ) ;
    public final void rule__PNJ__DialogueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6613:1: ( ( ruleDialogue ) )
            // InternalGame.g:6614:2: ( ruleDialogue )
            {
            // InternalGame.g:6614:2: ( ruleDialogue )
            // InternalGame.g:6615:3: ruleDialogue
            {
             before(grammarAccess.getPNJAccess().getDialogueDialogueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDialogue();

            state._fsp--;

             after(grammarAccess.getPNJAccess().getDialogueDialogueParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__PNJ__DialogueAssignment_7"


    // $ANTLR start "rule__PNJ__ConditionsVisibiliteAssignment_9_2"
    // InternalGame.g:6624:1: rule__PNJ__ConditionsVisibiliteAssignment_9_2 : ( ( RULE_ID ) ) ;
    public final void rule__PNJ__ConditionsVisibiliteAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6628:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6629:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6629:2: ( ( RULE_ID ) )
            // InternalGame.g:6630:3: ( RULE_ID )
            {
             before(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionCrossReference_9_2_0()); 
            // InternalGame.g:6631:3: ( RULE_ID )
            // InternalGame.g:6632:4: RULE_ID
            {
             before(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_9_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionCrossReference_9_2_0()); 

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
    // $ANTLR end "rule__PNJ__ConditionsVisibiliteAssignment_9_2"


    // $ANTLR start "rule__PNJ__ConditionsVisibiliteAssignment_9_3_1"
    // InternalGame.g:6643:1: rule__PNJ__ConditionsVisibiliteAssignment_9_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PNJ__ConditionsVisibiliteAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6647:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6648:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6648:2: ( ( RULE_ID ) )
            // InternalGame.g:6649:3: ( RULE_ID )
            {
             before(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionCrossReference_9_3_1_0()); 
            // InternalGame.g:6650:3: ( RULE_ID )
            // InternalGame.g:6651:4: RULE_ID
            {
             before(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_9_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getPNJAccess().getConditionsVisibiliteConditionCrossReference_9_3_1_0()); 

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
    // $ANTLR end "rule__PNJ__ConditionsVisibiliteAssignment_9_3_1"


    // $ANTLR start "rule__Lieu__NameAssignment_0"
    // InternalGame.g:6662:1: rule__Lieu__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6666:1: ( ( RULE_ID ) )
            // InternalGame.g:6667:2: ( RULE_ID )
            {
            // InternalGame.g:6667:2: ( RULE_ID )
            // InternalGame.g:6668:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Lieu__NameAssignment_0"


    // $ANTLR start "rule__Lieu__TypeAssignment_2"
    // InternalGame.g:6677:1: rule__Lieu__TypeAssignment_2 : ( ruletypePlace ) ;
    public final void rule__Lieu__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6681:1: ( ( ruletypePlace ) )
            // InternalGame.g:6682:2: ( ruletypePlace )
            {
            // InternalGame.g:6682:2: ( ruletypePlace )
            // InternalGame.g:6683:3: ruletypePlace
            {
             before(grammarAccess.getLieuAccess().getTypeTypePlaceEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletypePlace();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getTypeTypePlaceEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Lieu__TypeAssignment_2"


    // $ANTLR start "rule__Lieu__PnjsAssignment_3_1_1"
    // InternalGame.g:6692:1: rule__Lieu__PnjsAssignment_3_1_1 : ( rulePNJ ) ;
    public final void rule__Lieu__PnjsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6696:1: ( ( rulePNJ ) )
            // InternalGame.g:6697:2: ( rulePNJ )
            {
            // InternalGame.g:6697:2: ( rulePNJ )
            // InternalGame.g:6698:3: rulePNJ
            {
             before(grammarAccess.getLieuAccess().getPnjsPNJParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePNJ();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getPnjsPNJParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Lieu__PnjsAssignment_3_1_1"


    // $ANTLR start "rule__Lieu__PnjsAssignment_3_1_2_1"
    // InternalGame.g:6707:1: rule__Lieu__PnjsAssignment_3_1_2_1 : ( rulePNJ ) ;
    public final void rule__Lieu__PnjsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6711:1: ( ( rulePNJ ) )
            // InternalGame.g:6712:2: ( rulePNJ )
            {
            // InternalGame.g:6712:2: ( rulePNJ )
            // InternalGame.g:6713:3: rulePNJ
            {
             before(grammarAccess.getLieuAccess().getPnjsPNJParserRuleCall_3_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePNJ();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getPnjsPNJParserRuleCall_3_1_2_1_0()); 

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
    // $ANTLR end "rule__Lieu__PnjsAssignment_3_1_2_1"


    // $ANTLR start "rule__Lieu__ObjetsAssignment_3_2_1"
    // InternalGame.g:6722:1: rule__Lieu__ObjetsAssignment_3_2_1 : ( ruleObjetTenu ) ;
    public final void rule__Lieu__ObjetsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6726:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:6727:2: ( ruleObjetTenu )
            {
            // InternalGame.g:6727:2: ( ruleObjetTenu )
            // InternalGame.g:6728:3: ruleObjetTenu
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetTenuParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getObjetsObjetTenuParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Lieu__ObjetsAssignment_3_2_1"


    // $ANTLR start "rule__Lieu__ObjetsAssignment_3_2_2_1"
    // InternalGame.g:6737:1: rule__Lieu__ObjetsAssignment_3_2_2_1 : ( ruleObjetTenu ) ;
    public final void rule__Lieu__ObjetsAssignment_3_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6741:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:6742:2: ( ruleObjetTenu )
            {
            // InternalGame.g:6742:2: ( ruleObjetTenu )
            // InternalGame.g:6743:3: ruleObjetTenu
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetTenuParserRuleCall_3_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getObjetsObjetTenuParserRuleCall_3_2_2_1_0()); 

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
    // $ANTLR end "rule__Lieu__ObjetsAssignment_3_2_2_1"


    // $ANTLR start "rule__Lieu__ConnaissancesAssignment_3_3_1"
    // InternalGame.g:6752:1: rule__Lieu__ConnaissancesAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6756:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6757:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6757:2: ( ( RULE_ID ) )
            // InternalGame.g:6758:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_3_3_1_0()); 
            // InternalGame.g:6759:3: ( RULE_ID )
            // InternalGame.g:6760:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_3_3_1_0()); 

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
    // $ANTLR end "rule__Lieu__ConnaissancesAssignment_3_3_1"


    // $ANTLR start "rule__Lieu__ConnaissancesAssignment_3_3_2_1"
    // InternalGame.g:6771:1: rule__Lieu__ConnaissancesAssignment_3_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_3_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6775:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6776:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6776:2: ( ( RULE_ID ) )
            // InternalGame.g:6777:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_3_3_2_1_0()); 
            // InternalGame.g:6778:3: ( RULE_ID )
            // InternalGame.g:6779:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_3_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_3_3_2_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_3_3_2_1_0()); 

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
    // $ANTLR end "rule__Lieu__ConnaissancesAssignment_3_3_2_1"


    // $ANTLR start "rule__Dialogue__TexteAssignment_0"
    // InternalGame.g:6790:1: rule__Dialogue__TexteAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Dialogue__TexteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6794:1: ( ( RULE_STRING ) )
            // InternalGame.g:6795:2: ( RULE_STRING )
            {
            // InternalGame.g:6795:2: ( RULE_STRING )
            // InternalGame.g:6796:3: RULE_STRING
            {
             before(grammarAccess.getDialogueAccess().getTexteSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getTexteSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Dialogue__TexteAssignment_0"


    // $ANTLR start "rule__Dialogue__ReponsesAssignment_3"
    // InternalGame.g:6805:1: rule__Dialogue__ReponsesAssignment_3 : ( ruleChoix ) ;
    public final void rule__Dialogue__ReponsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6809:1: ( ( ruleChoix ) )
            // InternalGame.g:6810:2: ( ruleChoix )
            {
            // InternalGame.g:6810:2: ( ruleChoix )
            // InternalGame.g:6811:3: ruleChoix
            {
             before(grammarAccess.getDialogueAccess().getReponsesChoixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getDialogueAccess().getReponsesChoixParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dialogue__ReponsesAssignment_3"


    // $ANTLR start "rule__Dialogue__ConditionsVisibiliteAssignment_5_2"
    // InternalGame.g:6820:1: rule__Dialogue__ConditionsVisibiliteAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dialogue__ConditionsVisibiliteAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6824:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6825:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6825:2: ( ( RULE_ID ) )
            // InternalGame.g:6826:3: ( RULE_ID )
            {
             before(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionCrossReference_5_2_0()); 
            // InternalGame.g:6827:3: ( RULE_ID )
            // InternalGame.g:6828:4: RULE_ID
            {
             before(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Dialogue__ConditionsVisibiliteAssignment_5_2"


    // $ANTLR start "rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1"
    // InternalGame.g:6839:1: rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6843:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6844:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6844:2: ( ( RULE_ID ) )
            // InternalGame.g:6845:3: ( RULE_ID )
            {
             before(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionCrossReference_5_3_1_0()); 
            // InternalGame.g:6846:3: ( RULE_ID )
            // InternalGame.g:6847:4: RULE_ID
            {
             before(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_5_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Dialogue__ConditionsVisibiliteAssignment_5_3_1"


    // $ANTLR start "rule__Choix__TexteAssignment_0"
    // InternalGame.g:6858:1: rule__Choix__TexteAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Choix__TexteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6862:1: ( ( RULE_STRING ) )
            // InternalGame.g:6863:2: ( RULE_STRING )
            {
            // InternalGame.g:6863:2: ( RULE_STRING )
            // InternalGame.g:6864:3: RULE_STRING
            {
             before(grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Choix__TexteAssignment_0"


    // $ANTLR start "rule__Choix__ActionsAssignment_1_1"
    // InternalGame.g:6873:1: rule__Choix__ActionsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6877:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6878:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6878:2: ( ( RULE_ID ) )
            // InternalGame.g:6879:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getActionsActionCrossReference_1_1_0()); 
            // InternalGame.g:6880:3: ( RULE_ID )
            // InternalGame.g:6881:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getActionsActionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getActionsActionIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getActionsActionCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Choix__ActionsAssignment_1_1"


    // $ANTLR start "rule__Choix__ActionsAssignment_1_2_1"
    // InternalGame.g:6892:1: rule__Choix__ActionsAssignment_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ActionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6896:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6897:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6897:2: ( ( RULE_ID ) )
            // InternalGame.g:6898:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getActionsActionCrossReference_1_2_1_0()); 
            // InternalGame.g:6899:3: ( RULE_ID )
            // InternalGame.g:6900:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getActionsActionIDTerminalRuleCall_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getActionsActionIDTerminalRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getActionsActionCrossReference_1_2_1_0()); 

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
    // $ANTLR end "rule__Choix__ActionsAssignment_1_2_1"


    // $ANTLR start "rule__Choix__ConditionsVisibiliteAssignment_2_2"
    // InternalGame.g:6911:1: rule__Choix__ConditionsVisibiliteAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ConditionsVisibiliteAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6915:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6916:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6916:2: ( ( RULE_ID ) )
            // InternalGame.g:6917:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionCrossReference_2_2_0()); 
            // InternalGame.g:6918:3: ( RULE_ID )
            // InternalGame.g:6919:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__Choix__ConditionsVisibiliteAssignment_2_2"


    // $ANTLR start "rule__Choix__ConditionsVisibiliteAssignment_2_3_1"
    // InternalGame.g:6930:1: rule__Choix__ConditionsVisibiliteAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ConditionsVisibiliteAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6934:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:6935:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:6935:2: ( ( RULE_ID ) )
            // InternalGame.g:6936:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionCrossReference_2_3_1_0()); 
            // InternalGame.g:6937:3: ( RULE_ID )
            // InternalGame.g:6938:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getConditionsVisibiliteConditionCrossReference_2_3_1_0()); 

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
    // $ANTLR end "rule__Choix__ConditionsVisibiliteAssignment_2_3_1"


    // $ANTLR start "rule__Action__NameAssignment_0"
    // InternalGame.g:6949:1: rule__Action__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6953:1: ( ( RULE_ID ) )
            // InternalGame.g:6954:2: ( RULE_ID )
            {
            // InternalGame.g:6954:2: ( RULE_ID )
            // InternalGame.g:6955:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Action__NameAssignment_0"


    // $ANTLR start "rule__Action__ObjetsConsommesAssignment_1_1"
    // InternalGame.g:6964:1: rule__Action__ObjetsConsommesAssignment_1_1 : ( ruleObjetTenu ) ;
    public final void rule__Action__ObjetsConsommesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6968:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:6969:2: ( ruleObjetTenu )
            {
            // InternalGame.g:6969:2: ( ruleObjetTenu )
            // InternalGame.g:6970:3: ruleObjetTenu
            {
             before(grammarAccess.getActionAccess().getObjetsConsommesObjetTenuParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjetsConsommesObjetTenuParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Action__ObjetsConsommesAssignment_1_1"


    // $ANTLR start "rule__Action__ObjetsConsommesAssignment_1_2_1"
    // InternalGame.g:6979:1: rule__Action__ObjetsConsommesAssignment_1_2_1 : ( ruleObjetTenu ) ;
    public final void rule__Action__ObjetsConsommesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6983:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:6984:2: ( ruleObjetTenu )
            {
            // InternalGame.g:6984:2: ( ruleObjetTenu )
            // InternalGame.g:6985:3: ruleObjetTenu
            {
             before(grammarAccess.getActionAccess().getObjetsConsommesObjetTenuParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjetsConsommesObjetTenuParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Action__ObjetsConsommesAssignment_1_2_1"


    // $ANTLR start "rule__Action__ObjetDonnesAssignment_2_2_1"
    // InternalGame.g:6994:1: rule__Action__ObjetDonnesAssignment_2_2_1 : ( ruleObjetTenu ) ;
    public final void rule__Action__ObjetDonnesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:6998:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:6999:2: ( ruleObjetTenu )
            {
            // InternalGame.g:6999:2: ( ruleObjetTenu )
            // InternalGame.g:7000:3: ruleObjetTenu
            {
             before(grammarAccess.getActionAccess().getObjetDonnesObjetTenuParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjetDonnesObjetTenuParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Action__ObjetDonnesAssignment_2_2_1"


    // $ANTLR start "rule__Action__ObjetsDonnesAssignment_2_2_2_1"
    // InternalGame.g:7009:1: rule__Action__ObjetsDonnesAssignment_2_2_2_1 : ( ruleObjetTenu ) ;
    public final void rule__Action__ObjetsDonnesAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7013:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:7014:2: ( ruleObjetTenu )
            {
            // InternalGame.g:7014:2: ( ruleObjetTenu )
            // InternalGame.g:7015:3: ruleObjetTenu
            {
             before(grammarAccess.getActionAccess().getObjetsDonnesObjetTenuParserRuleCall_2_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjetsDonnesObjetTenuParserRuleCall_2_2_2_1_0()); 

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
    // $ANTLR end "rule__Action__ObjetsDonnesAssignment_2_2_2_1"


    // $ANTLR start "rule__Action__ConnaissancesAssignment_2_3_1"
    // InternalGame.g:7024:1: rule__Action__ConnaissancesAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ConnaissancesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7028:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7029:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7029:2: ( ( RULE_ID ) )
            // InternalGame.g:7030:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getConnaissancesConnaissanceCrossReference_2_3_1_0()); 
            // InternalGame.g:7031:3: ( RULE_ID )
            // InternalGame.g:7032:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getConnaissancesConnaissanceIDTerminalRuleCall_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConnaissancesConnaissanceIDTerminalRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getConnaissancesConnaissanceCrossReference_2_3_1_0()); 

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
    // $ANTLR end "rule__Action__ConnaissancesAssignment_2_3_1"


    // $ANTLR start "rule__Action__ConnaissancesAssignment_2_3_2_1"
    // InternalGame.g:7043:1: rule__Action__ConnaissancesAssignment_2_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ConnaissancesAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7047:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7048:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7048:2: ( ( RULE_ID ) )
            // InternalGame.g:7049:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getConnaissancesConnaissanceCrossReference_2_3_2_1_0()); 
            // InternalGame.g:7050:3: ( RULE_ID )
            // InternalGame.g:7051:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getConnaissancesConnaissanceIDTerminalRuleCall_2_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConnaissancesConnaissanceIDTerminalRuleCall_2_3_2_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getConnaissancesConnaissanceCrossReference_2_3_2_1_0()); 

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
    // $ANTLR end "rule__Action__ConnaissancesAssignment_2_3_2_1"


    // $ANTLR start "rule__Chemin__Lieu1Assignment_1"
    // InternalGame.g:7062:1: rule__Chemin__Lieu1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__Lieu1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7066:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7067:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7067:2: ( ( RULE_ID ) )
            // InternalGame.g:7068:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getLieu1LieuCrossReference_1_0()); 
            // InternalGame.g:7069:3: ( RULE_ID )
            // InternalGame.g:7070:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getLieu1LieuIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLieu1LieuIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getLieu1LieuCrossReference_1_0()); 

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
    // $ANTLR end "rule__Chemin__Lieu1Assignment_1"


    // $ANTLR start "rule__Chemin__Lieu2Assignment_3"
    // InternalGame.g:7081:1: rule__Chemin__Lieu2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__Lieu2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7085:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7086:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7086:2: ( ( RULE_ID ) )
            // InternalGame.g:7087:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getLieu2LieuCrossReference_3_0()); 
            // InternalGame.g:7088:3: ( RULE_ID )
            // InternalGame.g:7089:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getLieu2LieuIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLieu2LieuIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getLieu2LieuCrossReference_3_0()); 

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
    // $ANTLR end "rule__Chemin__Lieu2Assignment_3"


    // $ANTLR start "rule__Chemin__ActionsAssignment_4_1"
    // InternalGame.g:7100:1: rule__Chemin__ActionsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7104:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7105:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7105:2: ( ( RULE_ID ) )
            // InternalGame.g:7106:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getActionsActionCrossReference_4_1_0()); 
            // InternalGame.g:7107:3: ( RULE_ID )
            // InternalGame.g:7108:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getActionsActionIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getActionsActionIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getActionsActionCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Chemin__ActionsAssignment_4_1"


    // $ANTLR start "rule__Chemin__ActionsAssignment_4_2_1"
    // InternalGame.g:7119:1: rule__Chemin__ActionsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ActionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7123:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7124:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7124:2: ( ( RULE_ID ) )
            // InternalGame.g:7125:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getActionsActionCrossReference_4_2_1_0()); 
            // InternalGame.g:7126:3: ( RULE_ID )
            // InternalGame.g:7127:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getActionsActionIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getActionsActionIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getActionsActionCrossReference_4_2_1_0()); 

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
    // $ANTLR end "rule__Chemin__ActionsAssignment_4_2_1"


    // $ANTLR start "rule__Chemin__ConditionsOuvertureAssignment_5_2"
    // InternalGame.g:7138:1: rule__Chemin__ConditionsOuvertureAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditionsOuvertureAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7142:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7143:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7143:2: ( ( RULE_ID ) )
            // InternalGame.g:7144:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureConditionCrossReference_5_2_0()); 
            // InternalGame.g:7145:3: ( RULE_ID )
            // InternalGame.g:7146:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureConditionIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditionsOuvertureConditionIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditionsOuvertureConditionCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Chemin__ConditionsOuvertureAssignment_5_2"


    // $ANTLR start "rule__Chemin__ConditionsOuvertureAssignment_5_3_1"
    // InternalGame.g:7157:1: rule__Chemin__ConditionsOuvertureAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditionsOuvertureAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7161:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7162:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7162:2: ( ( RULE_ID ) )
            // InternalGame.g:7163:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureConditionCrossReference_5_3_1_0()); 
            // InternalGame.g:7164:3: ( RULE_ID )
            // InternalGame.g:7165:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureConditionIDTerminalRuleCall_5_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditionsOuvertureConditionIDTerminalRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditionsOuvertureConditionCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Chemin__ConditionsOuvertureAssignment_5_3_1"


    // $ANTLR start "rule__Chemin__ConditionsVisibiliteAssignment_6_2"
    // InternalGame.g:7176:1: rule__Chemin__ConditionsVisibiliteAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditionsVisibiliteAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7180:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7181:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7181:2: ( ( RULE_ID ) )
            // InternalGame.g:7182:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionCrossReference_6_2_0()); 
            // InternalGame.g:7183:3: ( RULE_ID )
            // InternalGame.g:7184:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__Chemin__ConditionsVisibiliteAssignment_6_2"


    // $ANTLR start "rule__Chemin__ConditionsVisibiliteAssignment_6_3_1"
    // InternalGame.g:7195:1: rule__Chemin__ConditionsVisibiliteAssignment_6_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditionsVisibiliteAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7199:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7200:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7200:2: ( ( RULE_ID ) )
            // InternalGame.g:7201:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionCrossReference_6_3_1_0()); 
            // InternalGame.g:7202:3: ( RULE_ID )
            // InternalGame.g:7203:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_6_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionIDTerminalRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__Chemin__ConditionsVisibiliteAssignment_6_3_1"


    // $ANTLR start "rule__Joueur__NameAssignment_0"
    // InternalGame.g:7214:1: rule__Joueur__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Joueur__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7218:1: ( ( RULE_ID ) )
            // InternalGame.g:7219:2: ( RULE_ID )
            {
            // InternalGame.g:7219:2: ( RULE_ID )
            // InternalGame.g:7220:3: RULE_ID
            {
             before(grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Joueur__NameAssignment_0"


    // $ANTLR start "rule__Joueur__LieuAssignment_3"
    // InternalGame.g:7229:1: rule__Joueur__LieuAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Joueur__LieuAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7233:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7234:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7234:2: ( ( RULE_ID ) )
            // InternalGame.g:7235:3: ( RULE_ID )
            {
             before(grammarAccess.getJoueurAccess().getLieuLieuCrossReference_3_0()); 
            // InternalGame.g:7236:3: ( RULE_ID )
            // InternalGame.g:7237:4: RULE_ID
            {
             before(grammarAccess.getJoueurAccess().getLieuLieuIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLieuLieuIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJoueurAccess().getLieuLieuCrossReference_3_0()); 

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
    // $ANTLR end "rule__Joueur__LieuAssignment_3"


    // $ANTLR start "rule__Joueur__TailleAssignment_7"
    // InternalGame.g:7248:1: rule__Joueur__TailleAssignment_7 : ( RULE_INT ) ;
    public final void rule__Joueur__TailleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7252:1: ( ( RULE_INT ) )
            // InternalGame.g:7253:2: ( RULE_INT )
            {
            // InternalGame.g:7253:2: ( RULE_INT )
            // InternalGame.g:7254:3: RULE_INT
            {
             before(grammarAccess.getJoueurAccess().getTailleINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getTailleINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Joueur__TailleAssignment_7"


    // $ANTLR start "rule__Joueur__InventaireAssignment_8_2"
    // InternalGame.g:7263:1: rule__Joueur__InventaireAssignment_8_2 : ( ruleObjetTenu ) ;
    public final void rule__Joueur__InventaireAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7267:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:7268:2: ( ruleObjetTenu )
            {
            // InternalGame.g:7268:2: ( ruleObjetTenu )
            // InternalGame.g:7269:3: ruleObjetTenu
            {
             before(grammarAccess.getJoueurAccess().getInventaireObjetTenuParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getJoueurAccess().getInventaireObjetTenuParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Joueur__InventaireAssignment_8_2"


    // $ANTLR start "rule__Joueur__InventaireAssignment_8_3_1"
    // InternalGame.g:7278:1: rule__Joueur__InventaireAssignment_8_3_1 : ( ruleObjetTenu ) ;
    public final void rule__Joueur__InventaireAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7282:1: ( ( ruleObjetTenu ) )
            // InternalGame.g:7283:2: ( ruleObjetTenu )
            {
            // InternalGame.g:7283:2: ( ruleObjetTenu )
            // InternalGame.g:7284:3: ruleObjetTenu
            {
             before(grammarAccess.getJoueurAccess().getInventaireObjetTenuParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetTenu();

            state._fsp--;

             after(grammarAccess.getJoueurAccess().getInventaireObjetTenuParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__Joueur__InventaireAssignment_8_3_1"


    // $ANTLR start "rule__Joueur__ConnaissancesAssignment_9_3"
    // InternalGame.g:7293:1: rule__Joueur__ConnaissancesAssignment_9_3 : ( ( RULE_ID ) ) ;
    public final void rule__Joueur__ConnaissancesAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7297:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7298:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7298:2: ( ( RULE_ID ) )
            // InternalGame.g:7299:3: ( RULE_ID )
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceCrossReference_9_3_0()); 
            // InternalGame.g:7300:3: ( RULE_ID )
            // InternalGame.g:7301:4: RULE_ID
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_9_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_9_3_0_1()); 

            }

             after(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceCrossReference_9_3_0()); 

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
    // $ANTLR end "rule__Joueur__ConnaissancesAssignment_9_3"


    // $ANTLR start "rule__Joueur__ConnaissancesAssignment_9_4_1"
    // InternalGame.g:7312:1: rule__Joueur__ConnaissancesAssignment_9_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joueur__ConnaissancesAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:7316:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:7317:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:7317:2: ( ( RULE_ID ) )
            // InternalGame.g:7318:3: ( RULE_ID )
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceCrossReference_9_4_1_0()); 
            // InternalGame.g:7319:3: ( RULE_ID )
            // InternalGame.g:7320:4: RULE_ID
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_9_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_9_4_1_0_1()); 

            }

             after(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceCrossReference_9_4_1_0()); 

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
    // $ANTLR end "rule__Joueur__ConnaissancesAssignment_9_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200001800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000340040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000300040000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010800002000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});

}