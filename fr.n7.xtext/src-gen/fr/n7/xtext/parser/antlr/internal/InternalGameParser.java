package fr.n7.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.xtext.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'Conaissances'", "'{'", "'}'", "'Objets'", "'PNJs'", "'Actions'", "'Conditions'", "'Lieux'", "'Chemins'", "'Joueur'", "'visible'", "'si'", "','", "'('", "'taille'", "')'", "'*'", "'est'", "'joueur'", "'possede'", "'pas'", "'objet:'", "'connaissance:'", "'situe'", "'en'", "'et'", "'dialogue'", "'contient ('", "'PNJs:'", "';'", "'objets:'", "'connaissances:'", "'propose'", "'implique'", "'consomme'", "'donne'", "'depuis'", "'jusqu\\'\\u00E0'", "'ouvert'", "'if'", "'inventaire'", "'commence'", "'avec'", "'connaissances'", "'debut'", "'fin'", "'intermediaire'"
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
    public static final int T__58=58;
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

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Jeu";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJeu"
    // InternalGame.g:65:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalGame.g:65:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalGame.g:66:2: iv_ruleJeu= ruleJeu EOF
            {
             newCompositeNode(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeu=ruleJeu();

            state._fsp--;

             current =iv_ruleJeu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalGame.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Conaissances' otherlv_3= '{' ( (lv_jeuElements_4_0= ruleConnaissance ) )* otherlv_5= '}' otherlv_6= 'Objets' otherlv_7= '{' ( (lv_jeuElements_8_0= ruleObjet ) )* otherlv_9= '}' otherlv_10= 'PNJs' otherlv_11= '{' ( (lv_jeuElements_12_0= rulePNJ ) )* otherlv_13= '}' otherlv_14= 'Actions' otherlv_15= '{' ( (lv_jeuElements_16_0= ruleAction ) )* otherlv_17= '}' otherlv_18= 'Conditions' otherlv_19= '{' ( (lv_jeuElements_20_0= ruleCondition ) )* otherlv_21= '}' otherlv_22= 'Lieux' otherlv_23= '{' ( (lv_jeuElements_24_0= ruleLieu ) )* otherlv_25= '}' otherlv_26= 'Chemins' otherlv_27= '{' ( (lv_jeuElements_28_0= ruleChemin ) )* otherlv_29= '}' otherlv_30= 'Joueur' otherlv_31= '{' ( (lv_jeuElements_32_0= ruleJoueur ) ) otherlv_33= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        EObject lv_jeuElements_4_0 = null;

        EObject lv_jeuElements_8_0 = null;

        EObject lv_jeuElements_12_0 = null;

        EObject lv_jeuElements_16_0 = null;

        EObject lv_jeuElements_20_0 = null;

        EObject lv_jeuElements_24_0 = null;

        EObject lv_jeuElements_28_0 = null;

        EObject lv_jeuElements_32_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Conaissances' otherlv_3= '{' ( (lv_jeuElements_4_0= ruleConnaissance ) )* otherlv_5= '}' otherlv_6= 'Objets' otherlv_7= '{' ( (lv_jeuElements_8_0= ruleObjet ) )* otherlv_9= '}' otherlv_10= 'PNJs' otherlv_11= '{' ( (lv_jeuElements_12_0= rulePNJ ) )* otherlv_13= '}' otherlv_14= 'Actions' otherlv_15= '{' ( (lv_jeuElements_16_0= ruleAction ) )* otherlv_17= '}' otherlv_18= 'Conditions' otherlv_19= '{' ( (lv_jeuElements_20_0= ruleCondition ) )* otherlv_21= '}' otherlv_22= 'Lieux' otherlv_23= '{' ( (lv_jeuElements_24_0= ruleLieu ) )* otherlv_25= '}' otherlv_26= 'Chemins' otherlv_27= '{' ( (lv_jeuElements_28_0= ruleChemin ) )* otherlv_29= '}' otherlv_30= 'Joueur' otherlv_31= '{' ( (lv_jeuElements_32_0= ruleJoueur ) ) otherlv_33= '}' ) )
            // InternalGame.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Conaissances' otherlv_3= '{' ( (lv_jeuElements_4_0= ruleConnaissance ) )* otherlv_5= '}' otherlv_6= 'Objets' otherlv_7= '{' ( (lv_jeuElements_8_0= ruleObjet ) )* otherlv_9= '}' otherlv_10= 'PNJs' otherlv_11= '{' ( (lv_jeuElements_12_0= rulePNJ ) )* otherlv_13= '}' otherlv_14= 'Actions' otherlv_15= '{' ( (lv_jeuElements_16_0= ruleAction ) )* otherlv_17= '}' otherlv_18= 'Conditions' otherlv_19= '{' ( (lv_jeuElements_20_0= ruleCondition ) )* otherlv_21= '}' otherlv_22= 'Lieux' otherlv_23= '{' ( (lv_jeuElements_24_0= ruleLieu ) )* otherlv_25= '}' otherlv_26= 'Chemins' otherlv_27= '{' ( (lv_jeuElements_28_0= ruleChemin ) )* otherlv_29= '}' otherlv_30= 'Joueur' otherlv_31= '{' ( (lv_jeuElements_32_0= ruleJoueur ) ) otherlv_33= '}' )
            {
            // InternalGame.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Conaissances' otherlv_3= '{' ( (lv_jeuElements_4_0= ruleConnaissance ) )* otherlv_5= '}' otherlv_6= 'Objets' otherlv_7= '{' ( (lv_jeuElements_8_0= ruleObjet ) )* otherlv_9= '}' otherlv_10= 'PNJs' otherlv_11= '{' ( (lv_jeuElements_12_0= rulePNJ ) )* otherlv_13= '}' otherlv_14= 'Actions' otherlv_15= '{' ( (lv_jeuElements_16_0= ruleAction ) )* otherlv_17= '}' otherlv_18= 'Conditions' otherlv_19= '{' ( (lv_jeuElements_20_0= ruleCondition ) )* otherlv_21= '}' otherlv_22= 'Lieux' otherlv_23= '{' ( (lv_jeuElements_24_0= ruleLieu ) )* otherlv_25= '}' otherlv_26= 'Chemins' otherlv_27= '{' ( (lv_jeuElements_28_0= ruleChemin ) )* otherlv_29= '}' otherlv_30= 'Joueur' otherlv_31= '{' ( (lv_jeuElements_32_0= ruleJoueur ) ) otherlv_33= '}' )
            // InternalGame.g:80:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Conaissances' otherlv_3= '{' ( (lv_jeuElements_4_0= ruleConnaissance ) )* otherlv_5= '}' otherlv_6= 'Objets' otherlv_7= '{' ( (lv_jeuElements_8_0= ruleObjet ) )* otherlv_9= '}' otherlv_10= 'PNJs' otherlv_11= '{' ( (lv_jeuElements_12_0= rulePNJ ) )* otherlv_13= '}' otherlv_14= 'Actions' otherlv_15= '{' ( (lv_jeuElements_16_0= ruleAction ) )* otherlv_17= '}' otherlv_18= 'Conditions' otherlv_19= '{' ( (lv_jeuElements_20_0= ruleCondition ) )* otherlv_21= '}' otherlv_22= 'Lieux' otherlv_23= '{' ( (lv_jeuElements_24_0= ruleLieu ) )* otherlv_25= '}' otherlv_26= 'Chemins' otherlv_27= '{' ( (lv_jeuElements_28_0= ruleChemin ) )* otherlv_29= '}' otherlv_30= 'Joueur' otherlv_31= '{' ( (lv_jeuElements_32_0= ruleJoueur ) ) otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalGame.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getConaissancesKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGame.g:110:3: ( (lv_jeuElements_4_0= ruleConnaissance ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:111:4: (lv_jeuElements_4_0= ruleConnaissance )
            	    {
            	    // InternalGame.g:111:4: (lv_jeuElements_4_0= ruleConnaissance )
            	    // InternalGame.g:112:5: lv_jeuElements_4_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsConnaissanceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_jeuElements_4_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_4_0,
            	    						"fr.n7.xtext.Game.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getJeuAccess().getObjetsKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalGame.g:141:3: ( (lv_jeuElements_8_0= ruleObjet ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:142:4: (lv_jeuElements_8_0= ruleObjet )
            	    {
            	    // InternalGame.g:142:4: (lv_jeuElements_8_0= ruleObjet )
            	    // InternalGame.g:143:5: lv_jeuElements_8_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsObjetParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_jeuElements_8_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_8_0,
            	    						"fr.n7.xtext.Game.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getJeuAccess().getPNJsKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalGame.g:172:3: ( (lv_jeuElements_12_0= rulePNJ ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:173:4: (lv_jeuElements_12_0= rulePNJ )
            	    {
            	    // InternalGame.g:173:4: (lv_jeuElements_12_0= rulePNJ )
            	    // InternalGame.g:174:5: lv_jeuElements_12_0= rulePNJ
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsPNJParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_jeuElements_12_0=rulePNJ();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_12_0,
            	    						"fr.n7.xtext.Game.PNJ");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getJeuAccess().getActionsKeyword_14());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalGame.g:203:3: ( (lv_jeuElements_16_0= ruleAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:204:4: (lv_jeuElements_16_0= ruleAction )
            	    {
            	    // InternalGame.g:204:4: (lv_jeuElements_16_0= ruleAction )
            	    // InternalGame.g:205:5: lv_jeuElements_16_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsActionParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_jeuElements_16_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_16_0,
            	    						"fr.n7.xtext.Game.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getJeuAccess().getConditionsKeyword_18());
            		
            otherlv_19=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalGame.g:234:3: ( (lv_jeuElements_20_0= ruleCondition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:235:4: (lv_jeuElements_20_0= ruleCondition )
            	    {
            	    // InternalGame.g:235:4: (lv_jeuElements_20_0= ruleCondition )
            	    // InternalGame.g:236:5: lv_jeuElements_20_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsConditionParserRuleCall_20_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_jeuElements_20_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_20_0,
            	    						"fr.n7.xtext.Game.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_21=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_21, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_22=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_22, grammarAccess.getJeuAccess().getLieuxKeyword_22());
            		
            otherlv_23=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_23, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_23());
            		
            // InternalGame.g:265:3: ( (lv_jeuElements_24_0= ruleLieu ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:266:4: (lv_jeuElements_24_0= ruleLieu )
            	    {
            	    // InternalGame.g:266:4: (lv_jeuElements_24_0= ruleLieu )
            	    // InternalGame.g:267:5: lv_jeuElements_24_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsLieuParserRuleCall_24_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_jeuElements_24_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_24_0,
            	    						"fr.n7.xtext.Game.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_25=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_25, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_25());
            		
            otherlv_26=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_26, grammarAccess.getJeuAccess().getCheminsKeyword_26());
            		
            otherlv_27=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_27());
            		
            // InternalGame.g:296:3: ( (lv_jeuElements_28_0= ruleChemin ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:297:4: (lv_jeuElements_28_0= ruleChemin )
            	    {
            	    // InternalGame.g:297:4: (lv_jeuElements_28_0= ruleChemin )
            	    // InternalGame.g:298:5: lv_jeuElements_28_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsCheminParserRuleCall_28_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_jeuElements_28_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuElements",
            	    						lv_jeuElements_28_0,
            	    						"fr.n7.xtext.Game.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_29=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_29, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_29());
            		
            otherlv_30=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_30, grammarAccess.getJeuAccess().getJoueurKeyword_30());
            		
            otherlv_31=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_31, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_31());
            		
            // InternalGame.g:327:3: ( (lv_jeuElements_32_0= ruleJoueur ) )
            // InternalGame.g:328:4: (lv_jeuElements_32_0= ruleJoueur )
            {
            // InternalGame.g:328:4: (lv_jeuElements_32_0= ruleJoueur )
            // InternalGame.g:329:5: lv_jeuElements_32_0= ruleJoueur
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getJeuElementsJoueurParserRuleCall_32_0());
            				
            pushFollow(FOLLOW_16);
            lv_jeuElements_32_0=ruleJoueur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					add(
            						current,
            						"jeuElements",
            						lv_jeuElements_32_0,
            						"fr.n7.xtext.Game.Joueur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_33=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_33());
            		

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
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGame.g:354:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGame.g:354:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGame.g:355:2: iv_ruleConnaissance= ruleConnaissance EOF
            {
             newCompositeNode(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissance=ruleConnaissance();

            state._fsp--;

             current =iv_ruleConnaissance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGame.g:361:1: ruleConnaissance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGame.g:367:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) )
            // InternalGame.g:368:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:368:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            // InternalGame.g:369:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            {
            // InternalGame.g:369:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:370:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:370:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:371:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:387:3: (otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:388:4: otherlv_1= 'visible' otherlv_2= 'si' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getConnaissanceAccess().getVisibleKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getSiKeyword_1_1());
                    			
                    // InternalGame.g:396:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGame.g:397:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGame.g:397:5: (otherlv_3= RULE_ID )
                    // InternalGame.g:398:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnaissanceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_3, grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionCrossReference_1_2_0());
                    					

                    }


                    }

                    // InternalGame.g:409:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==24) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGame.g:410:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getConnaissanceAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalGame.g:414:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGame.g:415:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGame.g:415:6: (otherlv_5= RULE_ID )
                    	    // InternalGame.g:416:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConnaissanceRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionCrossReference_1_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalGame.g:433:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGame.g:433:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGame.g:434:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGame.g:440:1: ruleObjet returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taille' ( (lv_taille_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '*' ( (lv_quantite_6_0= RULE_INT ) ) ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_taille_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_quantite_6_0=null;


        	enterRule();

        try {
            // InternalGame.g:446:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taille' ( (lv_taille_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '*' ( (lv_quantite_6_0= RULE_INT ) ) ) )
            // InternalGame.g:447:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taille' ( (lv_taille_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '*' ( (lv_quantite_6_0= RULE_INT ) ) )
            {
            // InternalGame.g:447:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taille' ( (lv_taille_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '*' ( (lv_quantite_6_0= RULE_INT ) ) )
            // InternalGame.g:448:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taille' ( (lv_taille_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '*' ( (lv_quantite_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGame.g:452:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:453:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:453:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:454:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getTailleKeyword_2());
            		
            // InternalGame.g:474:3: ( (lv_taille_3_0= RULE_INT ) )
            // InternalGame.g:475:4: (lv_taille_3_0= RULE_INT )
            {
            // InternalGame.g:475:4: (lv_taille_3_0= RULE_INT )
            // InternalGame.g:476:5: lv_taille_3_0= RULE_INT
            {
            lv_taille_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_taille_3_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getObjetAccess().getAsteriskKeyword_5());
            		
            // InternalGame.g:500:3: ( (lv_quantite_6_0= RULE_INT ) )
            // InternalGame.g:501:4: (lv_quantite_6_0= RULE_INT )
            {
            // InternalGame.g:501:4: (lv_quantite_6_0= RULE_INT )
            // InternalGame.g:502:5: lv_quantite_6_0= RULE_INT
            {
            lv_quantite_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantite_6_0, grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleObjetTenu"
    // InternalGame.g:522:1: entryRuleObjetTenu returns [EObject current=null] : iv_ruleObjetTenu= ruleObjetTenu EOF ;
    public final EObject entryRuleObjetTenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetTenu = null;


        try {
            // InternalGame.g:522:50: (iv_ruleObjetTenu= ruleObjetTenu EOF )
            // InternalGame.g:523:2: iv_ruleObjetTenu= ruleObjetTenu EOF
            {
             newCompositeNode(grammarAccess.getObjetTenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjetTenu=ruleObjetTenu();

            state._fsp--;

             current =iv_ruleObjetTenu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjetTenu"


    // $ANTLR start "ruleObjetTenu"
    // InternalGame.g:529:1: ruleObjetTenu returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? ) ;
    public final EObject ruleObjetTenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_quantite_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGame.g:535:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? ) )
            // InternalGame.g:536:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:536:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? )
            // InternalGame.g:537:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_quantite_2_0= RULE_INT ) ) (otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            {
            // InternalGame.g:537:3: ( (otherlv_0= RULE_ID ) )
            // InternalGame.g:538:4: (otherlv_0= RULE_ID )
            {
            // InternalGame.g:538:4: (otherlv_0= RULE_ID )
            // InternalGame.g:539:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetTenuRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getObjetTenuAccess().getObjetObjetCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getObjetTenuAccess().getAsteriskKeyword_1());
            		
            // InternalGame.g:554:3: ( (lv_quantite_2_0= RULE_INT ) )
            // InternalGame.g:555:4: (lv_quantite_2_0= RULE_INT )
            {
            // InternalGame.g:555:4: (lv_quantite_2_0= RULE_INT )
            // InternalGame.g:556:5: lv_quantite_2_0= RULE_INT
            {
            lv_quantite_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_quantite_2_0, grammarAccess.getObjetTenuAccess().getQuantiteINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetTenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:572:3: (otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:573:4: otherlv_3= 'visible' otherlv_4= 'si' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjetTenuAccess().getVisibleKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjetTenuAccess().getSiKeyword_3_1());
                    			
                    // InternalGame.g:581:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:582:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:582:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:583:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjetTenuRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_5, grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalGame.g:594:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==RULE_ID) ) {
                                int LA10_3 = input.LA(3);

                                if ( (LA10_3==EOF||LA10_3==RULE_ID||LA10_3==14||LA10_3==24||LA10_3==27||LA10_3==41||LA10_3==43||LA10_3==47||LA10_3==55) ) {
                                    alt10=1;
                                }


                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGame.g:595:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getObjetTenuAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGame.g:599:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalGame.g:600:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalGame.g:600:6: (otherlv_7= RULE_ID )
                    	    // InternalGame.g:601:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getObjetTenuRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getObjetTenuAccess().getConditionsVisibiliteConditionCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleObjetTenu"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:618:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGame.g:618:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGame.g:619:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:625:1: ruleCondition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' otherlv_2= 'joueur' otherlv_3= 'possede' otherlv_4= '(' ( ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) ) | ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_negation_5_0=null;
        Token otherlv_6=null;
        Token lv_negation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_objet_7_0 = null;



        	enterRule();

        try {
            // InternalGame.g:631:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' otherlv_2= 'joueur' otherlv_3= 'possede' otherlv_4= '(' ( ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) ) | ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= ')' ) )
            // InternalGame.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' otherlv_2= 'joueur' otherlv_3= 'possede' otherlv_4= '(' ( ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) ) | ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= ')' )
            {
            // InternalGame.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' otherlv_2= 'joueur' otherlv_3= 'possede' otherlv_4= '(' ( ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) ) | ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= ')' )
            // InternalGame.g:633:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' otherlv_2= 'joueur' otherlv_3= 'possede' otherlv_4= '(' ( ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) ) | ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= ')'
            {
            // InternalGame.g:633:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:634:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:634:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:635:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getEstKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getJoueurKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getPossedeKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalGame.g:667:3: ( ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) ) | ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) ) )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==33) ) {
                    alt14=1;
                }
                else if ( (LA14_1==34) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGame.g:668:4: ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) )
                    {
                    // InternalGame.g:668:4: ( ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) ) )
                    // InternalGame.g:669:5: ( (lv_negation_5_0= 'pas' ) )? otherlv_6= 'objet:' ( (lv_objet_7_0= ruleObjetTenu ) )
                    {
                    // InternalGame.g:669:5: ( (lv_negation_5_0= 'pas' ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==32) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGame.g:670:6: (lv_negation_5_0= 'pas' )
                            {
                            // InternalGame.g:670:6: (lv_negation_5_0= 'pas' )
                            // InternalGame.g:671:7: lv_negation_5_0= 'pas'
                            {
                            lv_negation_5_0=(Token)match(input,32,FOLLOW_29); 

                            							newLeafNode(lv_negation_5_0, grammarAccess.getConditionAccess().getNegationPasKeyword_5_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_5_0 != null, "pas");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getObjetKeyword_5_0_1());
                    				
                    // InternalGame.g:687:5: ( (lv_objet_7_0= ruleObjetTenu ) )
                    // InternalGame.g:688:6: (lv_objet_7_0= ruleObjetTenu )
                    {
                    // InternalGame.g:688:6: (lv_objet_7_0= ruleObjetTenu )
                    // InternalGame.g:689:7: lv_objet_7_0= ruleObjetTenu
                    {

                    							newCompositeNode(grammarAccess.getConditionAccess().getObjetObjetTenuParserRuleCall_5_0_2_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_objet_7_0=ruleObjetTenu();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    							}
                    							set(
                    								current,
                    								"objet",
                    								lv_objet_7_0,
                    								"fr.n7.xtext.Game.ObjetTenu");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:708:4: ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalGame.g:708:4: ( ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) ) )
                    // InternalGame.g:709:5: ( (lv_negation_8_0= 'pas' ) )? otherlv_9= 'connaissance:' ( (otherlv_10= RULE_ID ) )
                    {
                    // InternalGame.g:709:5: ( (lv_negation_8_0= 'pas' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==32) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGame.g:710:6: (lv_negation_8_0= 'pas' )
                            {
                            // InternalGame.g:710:6: (lv_negation_8_0= 'pas' )
                            // InternalGame.g:711:7: lv_negation_8_0= 'pas'
                            {
                            lv_negation_8_0=(Token)match(input,32,FOLLOW_30); 

                            							newLeafNode(lv_negation_8_0, grammarAccess.getConditionAccess().getNegationPasKeyword_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_8_0 != null, "pas");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    					newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getConnaissanceKeyword_5_1_1());
                    				
                    // InternalGame.g:727:5: ( (otherlv_10= RULE_ID ) )
                    // InternalGame.g:728:6: (otherlv_10= RULE_ID )
                    {
                    // InternalGame.g:728:6: (otherlv_10= RULE_ID )
                    // InternalGame.g:729:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getConnaissanceConnaissanceCrossReference_5_1_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePNJ"
    // InternalGame.g:750:1: entryRulePNJ returns [EObject current=null] : iv_rulePNJ= rulePNJ EOF ;
    public final EObject entryRulePNJ() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePNJ = null;


        try {
            // InternalGame.g:750:44: (iv_rulePNJ= rulePNJ EOF )
            // InternalGame.g:751:2: iv_rulePNJ= rulePNJ EOF
            {
             newCompositeNode(grammarAccess.getPNJRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePNJ=rulePNJ();

            state._fsp--;

             current =iv_rulePNJ; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePNJ"


    // $ANTLR start "rulePNJ"
    // InternalGame.g:757:1: rulePNJ returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'dialogue' otherlv_6= '{' ( (lv_dialogue_7_0= ruleDialogue ) )* otherlv_8= '}' (otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) ;
    public final EObject rulePNJ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_dialogue_7_0 = null;



        	enterRule();

        try {
            // InternalGame.g:763:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'dialogue' otherlv_6= '{' ( (lv_dialogue_7_0= ruleDialogue ) )* otherlv_8= '}' (otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) )
            // InternalGame.g:764:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'dialogue' otherlv_6= '{' ( (lv_dialogue_7_0= ruleDialogue ) )* otherlv_8= '}' (otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:764:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'dialogue' otherlv_6= '{' ( (lv_dialogue_7_0= ruleDialogue ) )* otherlv_8= '}' (otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            // InternalGame.g:765:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'dialogue' otherlv_6= '{' ( (lv_dialogue_7_0= ruleDialogue ) )* otherlv_8= '}' (otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            {
            // InternalGame.g:765:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:766:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:766:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:767:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPNJAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPNJRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getPNJAccess().getSitueKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPNJAccess().getEnKeyword_2());
            		
            // InternalGame.g:791:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:792:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:792:4: (otherlv_3= RULE_ID )
            // InternalGame.g:793:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPNJRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getPNJAccess().getLieuLieuCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getPNJAccess().getEtKeyword_4());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPNJAccess().getDialogueKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getPNJAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalGame.g:816:3: ( (lv_dialogue_7_0= ruleDialogue ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:817:4: (lv_dialogue_7_0= ruleDialogue )
            	    {
            	    // InternalGame.g:817:4: (lv_dialogue_7_0= ruleDialogue )
            	    // InternalGame.g:818:5: lv_dialogue_7_0= ruleDialogue
            	    {

            	    					newCompositeNode(grammarAccess.getPNJAccess().getDialogueDialogueParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_dialogue_7_0=ruleDialogue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPNJRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dialogue",
            	    						lv_dialogue_7_0,
            	    						"fr.n7.xtext.Game.Dialogue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getPNJAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalGame.g:839:3: (otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGame.g:840:4: otherlv_9= 'visible' otherlv_10= 'si' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getPNJAccess().getVisibleKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPNJAccess().getSiKeyword_9_1());
                    			
                    // InternalGame.g:848:4: ( (otherlv_11= RULE_ID ) )
                    // InternalGame.g:849:5: (otherlv_11= RULE_ID )
                    {
                    // InternalGame.g:849:5: (otherlv_11= RULE_ID )
                    // InternalGame.g:850:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPNJRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_11, grammarAccess.getPNJAccess().getConditionsVisibiliteConditionCrossReference_9_2_0());
                    					

                    }


                    }

                    // InternalGame.g:861:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==RULE_ID) ) {
                                int LA16_3 = input.LA(3);

                                if ( (LA16_3==EOF||LA16_3==RULE_ID||LA16_3==14||LA16_3==24||LA16_3==41) ) {
                                    alt16=1;
                                }


                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalGame.g:862:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPNJAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalGame.g:866:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalGame.g:867:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalGame.g:867:6: (otherlv_13= RULE_ID )
                    	    // InternalGame.g:868:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPNJRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getPNJAccess().getConditionsVisibiliteConditionCrossReference_9_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "rulePNJ"


    // $ANTLR start "entryRuleLieu"
    // InternalGame.g:885:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGame.g:885:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGame.g:886:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGame.g:892:1: ruleLieu returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' ( (lv_type_2_0= ruletypePlace ) ) (otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')' )? ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_pnjs_5_0 = null;

        EObject lv_pnjs_7_0 = null;

        EObject lv_objets_10_0 = null;

        EObject lv_objets_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:898:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' ( (lv_type_2_0= ruletypePlace ) ) (otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')' )? ) )
            // InternalGame.g:899:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' ( (lv_type_2_0= ruletypePlace ) ) (otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')' )? )
            {
            // InternalGame.g:899:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' ( (lv_type_2_0= ruletypePlace ) ) (otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')' )? )
            // InternalGame.g:900:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'est' ( (lv_type_2_0= ruletypePlace ) ) (otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')' )?
            {
            // InternalGame.g:900:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:901:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:901:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:902:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getLieuAccess().getEstKeyword_1());
            		
            // InternalGame.g:922:3: ( (lv_type_2_0= ruletypePlace ) )
            // InternalGame.g:923:4: (lv_type_2_0= ruletypePlace )
            {
            // InternalGame.g:923:4: (lv_type_2_0= ruletypePlace )
            // InternalGame.g:924:5: lv_type_2_0= ruletypePlace
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getTypeTypePlaceEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_type_2_0=ruletypePlace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.n7.xtext.Game.typePlace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:941:3: (otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:942:4: otherlv_3= 'contient (' (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )? (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )? (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )? otherlv_19= ')'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getContientKeyword_3_0());
                    			
                    // InternalGame.g:946:4: (otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==40) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGame.g:947:5: otherlv_4= 'PNJs:' ( (lv_pnjs_5_0= rulePNJ ) ) (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )* otherlv_8= ';'
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getPNJsKeyword_3_1_0());
                            				
                            // InternalGame.g:951:5: ( (lv_pnjs_5_0= rulePNJ ) )
                            // InternalGame.g:952:6: (lv_pnjs_5_0= rulePNJ )
                            {
                            // InternalGame.g:952:6: (lv_pnjs_5_0= rulePNJ )
                            // InternalGame.g:953:7: lv_pnjs_5_0= rulePNJ
                            {

                            							newCompositeNode(grammarAccess.getLieuAccess().getPnjsPNJParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_39);
                            lv_pnjs_5_0=rulePNJ();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLieuRule());
                            							}
                            							add(
                            								current,
                            								"pnjs",
                            								lv_pnjs_5_0,
                            								"fr.n7.xtext.Game.PNJ");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGame.g:970:5: (otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==24) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalGame.g:971:6: otherlv_6= ',' ( (lv_pnjs_7_0= rulePNJ ) )
                            	    {
                            	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getCommaKeyword_3_1_2_0());
                            	    					
                            	    // InternalGame.g:975:6: ( (lv_pnjs_7_0= rulePNJ ) )
                            	    // InternalGame.g:976:7: (lv_pnjs_7_0= rulePNJ )
                            	    {
                            	    // InternalGame.g:976:7: (lv_pnjs_7_0= rulePNJ )
                            	    // InternalGame.g:977:8: lv_pnjs_7_0= rulePNJ
                            	    {

                            	    								newCompositeNode(grammarAccess.getLieuAccess().getPnjsPNJParserRuleCall_3_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_39);
                            	    lv_pnjs_7_0=rulePNJ();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getLieuRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"pnjs",
                            	    									lv_pnjs_7_0,
                            	    									"fr.n7.xtext.Game.PNJ");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,41,FOLLOW_40); 

                            					newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getSemicolonKeyword_3_1_3());
                            				

                            }
                            break;

                    }

                    // InternalGame.g:1000:4: (otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==42) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGame.g:1001:5: otherlv_9= 'objets:' ( (lv_objets_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )* otherlv_13= ';'
                            {
                            otherlv_9=(Token)match(input,42,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getObjetsKeyword_3_2_0());
                            				
                            // InternalGame.g:1005:5: ( (lv_objets_10_0= ruleObjetTenu ) )
                            // InternalGame.g:1006:6: (lv_objets_10_0= ruleObjetTenu )
                            {
                            // InternalGame.g:1006:6: (lv_objets_10_0= ruleObjetTenu )
                            // InternalGame.g:1007:7: lv_objets_10_0= ruleObjetTenu
                            {

                            							newCompositeNode(grammarAccess.getLieuAccess().getObjetsObjetTenuParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_39);
                            lv_objets_10_0=ruleObjetTenu();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLieuRule());
                            							}
                            							add(
                            								current,
                            								"objets",
                            								lv_objets_10_0,
                            								"fr.n7.xtext.Game.ObjetTenu");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGame.g:1024:5: (otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==24) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalGame.g:1025:6: otherlv_11= ',' ( (lv_objets_12_0= ruleObjetTenu ) )
                            	    {
                            	    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getLieuAccess().getCommaKeyword_3_2_2_0());
                            	    					
                            	    // InternalGame.g:1029:6: ( (lv_objets_12_0= ruleObjetTenu ) )
                            	    // InternalGame.g:1030:7: (lv_objets_12_0= ruleObjetTenu )
                            	    {
                            	    // InternalGame.g:1030:7: (lv_objets_12_0= ruleObjetTenu )
                            	    // InternalGame.g:1031:8: lv_objets_12_0= ruleObjetTenu
                            	    {

                            	    								newCompositeNode(grammarAccess.getLieuAccess().getObjetsObjetTenuParserRuleCall_3_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_39);
                            	    lv_objets_12_0=ruleObjetTenu();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getLieuRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"objets",
                            	    									lv_objets_12_0,
                            	    									"fr.n7.xtext.Game.ObjetTenu");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,41,FOLLOW_41); 

                            					newLeafNode(otherlv_13, grammarAccess.getLieuAccess().getSemicolonKeyword_3_2_3());
                            				

                            }
                            break;

                    }

                    // InternalGame.g:1054:4: (otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==43) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalGame.g:1055:5: otherlv_14= 'connaissances:' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ';'
                            {
                            otherlv_14=(Token)match(input,43,FOLLOW_3); 

                            					newLeafNode(otherlv_14, grammarAccess.getLieuAccess().getConnaissancesKeyword_3_3_0());
                            				
                            // InternalGame.g:1059:5: ( (otherlv_15= RULE_ID ) )
                            // InternalGame.g:1060:6: (otherlv_15= RULE_ID )
                            {
                            // InternalGame.g:1060:6: (otherlv_15= RULE_ID )
                            // InternalGame.g:1061:7: otherlv_15= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLieuRule());
                            							}
                            						
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_39); 

                            							newLeafNode(otherlv_15, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_3_3_1_0());
                            						

                            }


                            }

                            // InternalGame.g:1072:5: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==24) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalGame.g:1073:6: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                            	    {
                            	    otherlv_16=(Token)match(input,24,FOLLOW_3); 

                            	    						newLeafNode(otherlv_16, grammarAccess.getLieuAccess().getCommaKeyword_3_3_2_0());
                            	    					
                            	    // InternalGame.g:1077:6: ( (otherlv_17= RULE_ID ) )
                            	    // InternalGame.g:1078:7: (otherlv_17= RULE_ID )
                            	    {
                            	    // InternalGame.g:1078:7: (otherlv_17= RULE_ID )
                            	    // InternalGame.g:1079:8: otherlv_17= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getLieuRule());
                            	    								}
                            	    							
                            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_39); 

                            	    								newLeafNode(otherlv_17, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_3_3_2_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_18=(Token)match(input,41,FOLLOW_22); 

                            					newLeafNode(otherlv_18, grammarAccess.getLieuAccess().getSemicolonKeyword_3_3_3());
                            				

                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getLieuAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleDialogue"
    // InternalGame.g:1105:1: entryRuleDialogue returns [EObject current=null] : iv_ruleDialogue= ruleDialogue EOF ;
    public final EObject entryRuleDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogue = null;


        try {
            // InternalGame.g:1105:49: (iv_ruleDialogue= ruleDialogue EOF )
            // InternalGame.g:1106:2: iv_ruleDialogue= ruleDialogue EOF
            {
             newCompositeNode(grammarAccess.getDialogueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDialogue=ruleDialogue();

            state._fsp--;

             current =iv_ruleDialogue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDialogue"


    // $ANTLR start "ruleDialogue"
    // InternalGame.g:1112:1: ruleDialogue returns [EObject current=null] : ( ( (lv_texte_0_0= RULE_STRING ) ) otherlv_1= 'propose' otherlv_2= '{' ( (lv_reponses_3_0= ruleChoix ) )* otherlv_4= '}' (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) ;
    public final EObject ruleDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_texte_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_reponses_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1118:2: ( ( ( (lv_texte_0_0= RULE_STRING ) ) otherlv_1= 'propose' otherlv_2= '{' ( (lv_reponses_3_0= ruleChoix ) )* otherlv_4= '}' (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) )
            // InternalGame.g:1119:2: ( ( (lv_texte_0_0= RULE_STRING ) ) otherlv_1= 'propose' otherlv_2= '{' ( (lv_reponses_3_0= ruleChoix ) )* otherlv_4= '}' (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:1119:2: ( ( (lv_texte_0_0= RULE_STRING ) ) otherlv_1= 'propose' otherlv_2= '{' ( (lv_reponses_3_0= ruleChoix ) )* otherlv_4= '}' (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            // InternalGame.g:1120:3: ( (lv_texte_0_0= RULE_STRING ) ) otherlv_1= 'propose' otherlv_2= '{' ( (lv_reponses_3_0= ruleChoix ) )* otherlv_4= '}' (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            {
            // InternalGame.g:1120:3: ( (lv_texte_0_0= RULE_STRING ) )
            // InternalGame.g:1121:4: (lv_texte_0_0= RULE_STRING )
            {
            // InternalGame.g:1121:4: (lv_texte_0_0= RULE_STRING )
            // InternalGame.g:1122:5: lv_texte_0_0= RULE_STRING
            {
            lv_texte_0_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_texte_0_0, grammarAccess.getDialogueAccess().getTexteSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDialogueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDialogueAccess().getProposeKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getDialogueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:1146:3: ( (lv_reponses_3_0= ruleChoix ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGame.g:1147:4: (lv_reponses_3_0= ruleChoix )
            	    {
            	    // InternalGame.g:1147:4: (lv_reponses_3_0= ruleChoix )
            	    // InternalGame.g:1148:5: lv_reponses_3_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getDialogueAccess().getReponsesChoixParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_reponses_3_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDialogueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reponses",
            	    						lv_reponses_3_0,
            	    						"fr.n7.xtext.Game.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDialogueAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalGame.g:1169:3: (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:1170:4: otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getDialogueAccess().getVisibleKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDialogueAccess().getSiKeyword_5_1());
                    			
                    // InternalGame.g:1178:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:1179:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:1179:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:1180:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDialogueRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_7, grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalGame.g:1191:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==24) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGame.g:1192:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDialogueAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGame.g:1196:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalGame.g:1197:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalGame.g:1197:6: (otherlv_9= RULE_ID )
                    	    // InternalGame.g:1198:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDialogueRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getDialogueAccess().getConditionsVisibiliteConditionCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleDialogue"


    // $ANTLR start "entryRuleChoix"
    // InternalGame.g:1215:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGame.g:1215:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGame.g:1216:2: iv_ruleChoix= ruleChoix EOF
            {
             newCompositeNode(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoix=ruleChoix();

            state._fsp--;

             current =iv_ruleChoix; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGame.g:1222:1: ruleChoix returns [EObject current=null] : ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token lv_texte_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGame.g:1228:2: ( ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) )
            // InternalGame.g:1229:2: ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:1229:2: ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            // InternalGame.g:1230:3: ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            {
            // InternalGame.g:1230:3: ( (lv_texte_0_0= RULE_STRING ) )
            // InternalGame.g:1231:4: (lv_texte_0_0= RULE_STRING )
            {
            // InternalGame.g:1231:4: (lv_texte_0_0= RULE_STRING )
            // InternalGame.g:1232:5: lv_texte_0_0= RULE_STRING
            {
            lv_texte_0_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_texte_0_0, grammarAccess.getChoixAccess().getTexteSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:1248:3: (otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGame.g:1249:4: otherlv_1= 'implique' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getChoixAccess().getImpliqueKeyword_1_0());
                    			
                    // InternalGame.g:1253:4: ( (otherlv_2= RULE_ID ) )
                    // InternalGame.g:1254:5: (otherlv_2= RULE_ID )
                    {
                    // InternalGame.g:1254:5: (otherlv_2= RULE_ID )
                    // InternalGame.g:1255:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoixRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getActionsActionCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalGame.g:1266:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==24) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalGame.g:1267:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalGame.g:1271:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalGame.g:1272:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalGame.g:1272:6: (otherlv_4= RULE_ID )
                    	    // InternalGame.g:1273:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getChoixRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_44); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getChoixAccess().getActionsActionCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1286:3: (otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:1287:4: otherlv_5= 'visible' otherlv_6= 'si' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getVisibleKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getChoixAccess().getSiKeyword_2_1());
                    			
                    // InternalGame.g:1295:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGame.g:1296:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGame.g:1296:5: (otherlv_7= RULE_ID )
                    // InternalGame.g:1297:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoixRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_7, grammarAccess.getChoixAccess().getConditionsVisibiliteConditionCrossReference_2_2_0());
                    					

                    }


                    }

                    // InternalGame.g:1308:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==24) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGame.g:1309:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getChoixAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalGame.g:1313:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalGame.g:1314:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalGame.g:1314:6: (otherlv_9= RULE_ID )
                    	    // InternalGame.g:1315:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getChoixRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getChoixAccess().getConditionsVisibiliteConditionCrossReference_2_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:1332:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGame.g:1332:47: (iv_ruleAction= ruleAction EOF )
            // InternalGame.g:1333:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGame.g:1339:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )* )? (otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_objetsConsommes_2_0 = null;

        EObject lv_objetsConsommes_4_0 = null;

        EObject lv_ObjetDonnes_8_0 = null;

        EObject lv_objetsDonnes_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1345:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )* )? (otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')' )? ) )
            // InternalGame.g:1346:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )* )? (otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')' )? )
            {
            // InternalGame.g:1346:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )* )? (otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')' )? )
            // InternalGame.g:1347:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )* )? (otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')' )?
            {
            // InternalGame.g:1347:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1348:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1348:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1349:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:1365:3: (otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGame.g:1366:4: otherlv_1= 'consomme' ( (lv_objetsConsommes_2_0= ruleObjetTenu ) ) (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )*
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getConsommeKeyword_1_0());
                    			
                    // InternalGame.g:1370:4: ( (lv_objetsConsommes_2_0= ruleObjetTenu ) )
                    // InternalGame.g:1371:5: (lv_objetsConsommes_2_0= ruleObjetTenu )
                    {
                    // InternalGame.g:1371:5: (lv_objetsConsommes_2_0= ruleObjetTenu )
                    // InternalGame.g:1372:6: lv_objetsConsommes_2_0= ruleObjetTenu
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getObjetsConsommesObjetTenuParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_objetsConsommes_2_0=ruleObjetTenu();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"objetsConsommes",
                    							lv_objetsConsommes_2_0,
                    							"fr.n7.xtext.Game.ObjetTenu");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1389:4: (otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==24) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGame.g:1390:5: otherlv_3= ',' ( (lv_objetsConsommes_4_0= ruleObjetTenu ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalGame.g:1394:5: ( (lv_objetsConsommes_4_0= ruleObjetTenu ) )
                    	    // InternalGame.g:1395:6: (lv_objetsConsommes_4_0= ruleObjetTenu )
                    	    {
                    	    // InternalGame.g:1395:6: (lv_objetsConsommes_4_0= ruleObjetTenu )
                    	    // InternalGame.g:1396:7: lv_objetsConsommes_4_0= ruleObjetTenu
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getObjetsConsommesObjetTenuParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_objetsConsommes_4_0=ruleObjetTenu();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objetsConsommes",
                    	    								lv_objetsConsommes_4_0,
                    	    								"fr.n7.xtext.Game.ObjetTenu");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1415:3: (otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGame.g:1416:4: otherlv_5= 'donne' otherlv_6= '(' (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )? (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDonneKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,25,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalGame.g:1424:4: (otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==42) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGame.g:1425:5: otherlv_7= 'objets:' ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) ) (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )*
                            {
                            otherlv_7=(Token)match(input,42,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getActionAccess().getObjetsKeyword_2_2_0());
                            				
                            // InternalGame.g:1429:5: ( (lv_ObjetDonnes_8_0= ruleObjetTenu ) )
                            // InternalGame.g:1430:6: (lv_ObjetDonnes_8_0= ruleObjetTenu )
                            {
                            // InternalGame.g:1430:6: (lv_ObjetDonnes_8_0= ruleObjetTenu )
                            // InternalGame.g:1431:7: lv_ObjetDonnes_8_0= ruleObjetTenu
                            {

                            							newCompositeNode(grammarAccess.getActionAccess().getObjetDonnesObjetTenuParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_47);
                            lv_ObjetDonnes_8_0=ruleObjetTenu();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActionRule());
                            							}
                            							add(
                            								current,
                            								"ObjetDonnes",
                            								lv_ObjetDonnes_8_0,
                            								"fr.n7.xtext.Game.ObjetTenu");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGame.g:1448:5: (otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==24) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalGame.g:1449:6: otherlv_9= ',' ( (lv_objetsDonnes_10_0= ruleObjetTenu ) )
                            	    {
                            	    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getActionAccess().getCommaKeyword_2_2_2_0());
                            	    					
                            	    // InternalGame.g:1453:6: ( (lv_objetsDonnes_10_0= ruleObjetTenu ) )
                            	    // InternalGame.g:1454:7: (lv_objetsDonnes_10_0= ruleObjetTenu )
                            	    {
                            	    // InternalGame.g:1454:7: (lv_objetsDonnes_10_0= ruleObjetTenu )
                            	    // InternalGame.g:1455:8: lv_objetsDonnes_10_0= ruleObjetTenu
                            	    {

                            	    								newCompositeNode(grammarAccess.getActionAccess().getObjetsDonnesObjetTenuParserRuleCall_2_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_47);
                            	    lv_objetsDonnes_10_0=ruleObjetTenu();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getActionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"objetsDonnes",
                            	    									lv_objetsDonnes_10_0,
                            	    									"fr.n7.xtext.Game.ObjetTenu");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalGame.g:1474:4: (otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==43) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalGame.g:1475:5: otherlv_11= 'connaissances:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                            {
                            otherlv_11=(Token)match(input,43,FOLLOW_3); 

                            					newLeafNode(otherlv_11, grammarAccess.getActionAccess().getConnaissancesKeyword_2_3_0());
                            				
                            // InternalGame.g:1479:5: ( (otherlv_12= RULE_ID ) )
                            // InternalGame.g:1480:6: (otherlv_12= RULE_ID )
                            {
                            // InternalGame.g:1480:6: (otherlv_12= RULE_ID )
                            // InternalGame.g:1481:7: otherlv_12= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            						
                            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_48); 

                            							newLeafNode(otherlv_12, grammarAccess.getActionAccess().getConnaissancesConnaissanceCrossReference_2_3_1_0());
                            						

                            }


                            }

                            // InternalGame.g:1492:5: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==24) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalGame.g:1493:6: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                            	    {
                            	    otherlv_13=(Token)match(input,24,FOLLOW_3); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getActionAccess().getCommaKeyword_2_3_2_0());
                            	    					
                            	    // InternalGame.g:1497:6: ( (otherlv_14= RULE_ID ) )
                            	    // InternalGame.g:1498:7: (otherlv_14= RULE_ID )
                            	    {
                            	    // InternalGame.g:1498:7: (otherlv_14= RULE_ID )
                            	    // InternalGame.g:1499:8: otherlv_14= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getActionRule());
                            	    								}
                            	    							
                            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_48); 

                            	    								newLeafNode(otherlv_14, grammarAccess.getActionAccess().getConnaissancesConnaissanceCrossReference_2_3_2_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleChemin"
    // InternalGame.g:1521:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGame.g:1521:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGame.g:1522:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGame.g:1528:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'depuis' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'jusqu\\'\\u00E0' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalGame.g:1534:2: ( (otherlv_0= 'depuis' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'jusqu\\'\\u00E0' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? ) )
            // InternalGame.g:1535:2: (otherlv_0= 'depuis' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'jusqu\\'\\u00E0' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:1535:2: (otherlv_0= 'depuis' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'jusqu\\'\\u00E0' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? )
            // InternalGame.g:1536:3: otherlv_0= 'depuis' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'jusqu\\'\\u00E0' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? (otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getDepuisKeyword_0());
            		
            // InternalGame.g:1540:3: ( (otherlv_1= RULE_ID ) )
            // InternalGame.g:1541:4: (otherlv_1= RULE_ID )
            {
            // InternalGame.g:1541:4: (otherlv_1= RULE_ID )
            // InternalGame.g:1542:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_1, grammarAccess.getCheminAccess().getLieu1LieuCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getJusquKeyword_2());
            		
            // InternalGame.g:1557:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:1558:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:1558:4: (otherlv_3= RULE_ID )
            // InternalGame.g:1559:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(otherlv_3, grammarAccess.getCheminAccess().getLieu2LieuCrossReference_3_0());
            				

            }


            }

            // InternalGame.g:1570:3: (otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGame.g:1571:4: otherlv_4= 'implique' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getImpliqueKeyword_4_0());
                    			
                    // InternalGame.g:1575:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGame.g:1576:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGame.g:1576:5: (otherlv_5= RULE_ID )
                    // InternalGame.g:1577:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_51); 

                    						newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getActionsActionCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalGame.g:1588:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==24) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalGame.g:1589:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalGame.g:1593:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalGame.g:1594:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalGame.g:1594:6: (otherlv_7= RULE_ID )
                    	    // InternalGame.g:1595:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCheminRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_51); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getActionsActionCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1608:3: (otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGame.g:1609:4: otherlv_8= 'ouvert' otherlv_9= 'si' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getOuvertKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getSiKeyword_5_1());
                    			
                    // InternalGame.g:1617:4: ( (otherlv_10= RULE_ID ) )
                    // InternalGame.g:1618:5: (otherlv_10= RULE_ID )
                    {
                    // InternalGame.g:1618:5: (otherlv_10= RULE_ID )
                    // InternalGame.g:1619:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(otherlv_10, grammarAccess.getCheminAccess().getConditionsOuvertureConditionCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalGame.g:1630:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==24) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGame.g:1631:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCheminAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGame.g:1635:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalGame.g:1636:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalGame.g:1636:6: (otherlv_12= RULE_ID )
                    	    // InternalGame.g:1637:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCheminRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_44); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getCheminAccess().getConditionsOuvertureConditionCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1650:3: (otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGame.g:1651:4: otherlv_13= 'visible' otherlv_14= 'if' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_52); 

                    				newLeafNode(otherlv_13, grammarAccess.getCheminAccess().getVisibleKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getCheminAccess().getIfKeyword_6_1());
                    			
                    // InternalGame.g:1659:4: ( (otherlv_15= RULE_ID ) )
                    // InternalGame.g:1660:5: (otherlv_15= RULE_ID )
                    {
                    // InternalGame.g:1660:5: (otherlv_15= RULE_ID )
                    // InternalGame.g:1661:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheminRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_15, grammarAccess.getCheminAccess().getConditionsVisibiliteConditionCrossReference_6_2_0());
                    					

                    }


                    }

                    // InternalGame.g:1672:4: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==24) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalGame.g:1673:5: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                    	    {
                    	    otherlv_16=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getCheminAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGame.g:1677:5: ( (otherlv_17= RULE_ID ) )
                    	    // InternalGame.g:1678:6: (otherlv_17= RULE_ID )
                    	    {
                    	    // InternalGame.g:1678:6: (otherlv_17= RULE_ID )
                    	    // InternalGame.g:1679:7: otherlv_17= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCheminRule());
                    	    							}
                    	    						
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_17, grammarAccess.getCheminAccess().getConditionsVisibiliteConditionCrossReference_6_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleConditionnel"
    // InternalGame.g:1696:1: entryRuleConditionnel returns [EObject current=null] : iv_ruleConditionnel= ruleConditionnel EOF ;
    public final EObject entryRuleConditionnel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionnel = null;


        try {
            // InternalGame.g:1696:53: (iv_ruleConditionnel= ruleConditionnel EOF )
            // InternalGame.g:1697:2: iv_ruleConditionnel= ruleConditionnel EOF
            {
             newCompositeNode(grammarAccess.getConditionnelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionnel=ruleConditionnel();

            state._fsp--;

             current =iv_ruleConditionnel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionnel"


    // $ANTLR start "ruleConditionnel"
    // InternalGame.g:1703:1: ruleConditionnel returns [EObject current=null] : (this_PNJ_0= rulePNJ | this_Connaissance_1= ruleConnaissance | this_ObjetTenu_2= ruleObjetTenu | this_Chemin_3= ruleChemin | this_Dialogue_4= ruleDialogue | this_Choix_5= ruleChoix ) ;
    public final EObject ruleConditionnel() throws RecognitionException {
        EObject current = null;

        EObject this_PNJ_0 = null;

        EObject this_Connaissance_1 = null;

        EObject this_ObjetTenu_2 = null;

        EObject this_Chemin_3 = null;

        EObject this_Dialogue_4 = null;

        EObject this_Choix_5 = null;



        	enterRule();

        try {
            // InternalGame.g:1709:2: ( (this_PNJ_0= rulePNJ | this_Connaissance_1= ruleConnaissance | this_ObjetTenu_2= ruleObjetTenu | this_Chemin_3= ruleChemin | this_Dialogue_4= ruleDialogue | this_Choix_5= ruleChoix ) )
            // InternalGame.g:1710:2: (this_PNJ_0= rulePNJ | this_Connaissance_1= ruleConnaissance | this_ObjetTenu_2= ruleObjetTenu | this_Chemin_3= ruleChemin | this_Dialogue_4= ruleDialogue | this_Choix_5= ruleChoix )
            {
            // InternalGame.g:1710:2: (this_PNJ_0= rulePNJ | this_Connaissance_1= ruleConnaissance | this_ObjetTenu_2= ruleObjetTenu | this_Chemin_3= ruleChemin | this_Dialogue_4= ruleDialogue | this_Choix_5= ruleChoix )
            int alt45=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt45=1;
                    }
                    break;
                case EOF:
                case 22:
                    {
                    alt45=2;
                    }
                    break;
                case 28:
                    {
                    alt45=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }

                }
                break;
            case 48:
                {
                alt45=4;
                }
                break;
            case RULE_STRING:
                {
                int LA45_3 = input.LA(2);

                if ( (LA45_3==EOF||LA45_3==22||LA45_3==45) ) {
                    alt45=6;
                }
                else if ( (LA45_3==44) ) {
                    alt45=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalGame.g:1711:3: this_PNJ_0= rulePNJ
                    {

                    			newCompositeNode(grammarAccess.getConditionnelAccess().getPNJParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PNJ_0=rulePNJ();

                    state._fsp--;


                    			current = this_PNJ_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:1720:3: this_Connaissance_1= ruleConnaissance
                    {

                    			newCompositeNode(grammarAccess.getConditionnelAccess().getConnaissanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connaissance_1=ruleConnaissance();

                    state._fsp--;


                    			current = this_Connaissance_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:1729:3: this_ObjetTenu_2= ruleObjetTenu
                    {

                    			newCompositeNode(grammarAccess.getConditionnelAccess().getObjetTenuParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjetTenu_2=ruleObjetTenu();

                    state._fsp--;


                    			current = this_ObjetTenu_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGame.g:1738:3: this_Chemin_3= ruleChemin
                    {

                    			newCompositeNode(grammarAccess.getConditionnelAccess().getCheminParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chemin_3=ruleChemin();

                    state._fsp--;


                    			current = this_Chemin_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGame.g:1747:3: this_Dialogue_4= ruleDialogue
                    {

                    			newCompositeNode(grammarAccess.getConditionnelAccess().getDialogueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dialogue_4=ruleDialogue();

                    state._fsp--;


                    			current = this_Dialogue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGame.g:1756:3: this_Choix_5= ruleChoix
                    {

                    			newCompositeNode(grammarAccess.getConditionnelAccess().getChoixParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choix_5=ruleChoix();

                    state._fsp--;


                    			current = this_Choix_5;
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
    // $ANTLR end "ruleConditionnel"


    // $ANTLR start "entryRuleJoueur"
    // InternalGame.g:1768:1: entryRuleJoueur returns [EObject current=null] : iv_ruleJoueur= ruleJoueur EOF ;
    public final EObject entryRuleJoueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoueur = null;


        try {
            // InternalGame.g:1768:47: (iv_ruleJoueur= ruleJoueur EOF )
            // InternalGame.g:1769:2: iv_ruleJoueur= ruleJoueur EOF
            {
             newCompositeNode(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoueur=ruleJoueur();

            state._fsp--;

             current =iv_ruleJoueur; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalGame.g:1775:1: ruleJoueur returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'inventaire' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) (otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )* )? (otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? ) ;
    public final EObject ruleJoueur() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_taille_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_inventaire_10_0 = null;

        EObject lv_inventaire_12_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1781:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'inventaire' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) (otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )* )? (otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? ) )
            // InternalGame.g:1782:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'inventaire' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) (otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )* )? (otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? )
            {
            // InternalGame.g:1782:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'inventaire' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) (otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )* )? (otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? )
            // InternalGame.g:1783:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'situe' otherlv_2= 'en' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'et' otherlv_5= 'inventaire' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) (otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )* )? (otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )?
            {
            // InternalGame.g:1783:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1784:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1784:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1785:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_0_0, grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getJoueurAccess().getSitueKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJoueurAccess().getEnKeyword_2());
            		
            // InternalGame.g:1809:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:1810:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:1810:4: (otherlv_3= RULE_ID )
            // InternalGame.g:1811:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getJoueurAccess().getLieuLieuCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_53); 

            			newLeafNode(otherlv_4, grammarAccess.getJoueurAccess().getEtKeyword_4());
            		
            otherlv_5=(Token)match(input,52,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getJoueurAccess().getInventaireKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getJoueurAccess().getTailleKeyword_6());
            		
            // InternalGame.g:1834:3: ( (lv_taille_7_0= RULE_INT ) )
            // InternalGame.g:1835:4: (lv_taille_7_0= RULE_INT )
            {
            // InternalGame.g:1835:4: (lv_taille_7_0= RULE_INT )
            // InternalGame.g:1836:5: lv_taille_7_0= RULE_INT
            {
            lv_taille_7_0=(Token)match(input,RULE_INT,FOLLOW_54); 

            					newLeafNode(lv_taille_7_0, grammarAccess.getJoueurAccess().getTailleINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGame.g:1852:3: (otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGame.g:1853:4: otherlv_8= 'commence' otherlv_9= 'avec' ( (lv_inventaire_10_0= ruleObjetTenu ) ) (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )*
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_55); 

                    				newLeafNode(otherlv_8, grammarAccess.getJoueurAccess().getCommenceKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getJoueurAccess().getAvecKeyword_8_1());
                    			
                    // InternalGame.g:1861:4: ( (lv_inventaire_10_0= ruleObjetTenu ) )
                    // InternalGame.g:1862:5: (lv_inventaire_10_0= ruleObjetTenu )
                    {
                    // InternalGame.g:1862:5: (lv_inventaire_10_0= ruleObjetTenu )
                    // InternalGame.g:1863:6: lv_inventaire_10_0= ruleObjetTenu
                    {

                    						newCompositeNode(grammarAccess.getJoueurAccess().getInventaireObjetTenuParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_inventaire_10_0=ruleObjetTenu();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJoueurRule());
                    						}
                    						add(
                    							current,
                    							"inventaire",
                    							lv_inventaire_10_0,
                    							"fr.n7.xtext.Game.ObjetTenu");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:1880:4: (otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==24) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalGame.g:1881:5: otherlv_11= ',' ( (lv_inventaire_12_0= ruleObjetTenu ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getJoueurAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGame.g:1885:5: ( (lv_inventaire_12_0= ruleObjetTenu ) )
                    	    // InternalGame.g:1886:6: (lv_inventaire_12_0= ruleObjetTenu )
                    	    {
                    	    // InternalGame.g:1886:6: (lv_inventaire_12_0= ruleObjetTenu )
                    	    // InternalGame.g:1887:7: lv_inventaire_12_0= ruleObjetTenu
                    	    {

                    	    							newCompositeNode(grammarAccess.getJoueurAccess().getInventaireObjetTenuParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    lv_inventaire_12_0=ruleObjetTenu();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJoueurRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inventaire",
                    	    								lv_inventaire_12_0,
                    	    								"fr.n7.xtext.Game.ObjetTenu");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGame.g:1906:3: (otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGame.g:1907:4: otherlv_13= 'connaissances' otherlv_14= 'commence' otherlv_15= 'avec' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
                    {
                    otherlv_13=(Token)match(input,55,FOLLOW_57); 

                    				newLeafNode(otherlv_13, grammarAccess.getJoueurAccess().getConnaissancesKeyword_9_0());
                    			
                    otherlv_14=(Token)match(input,53,FOLLOW_55); 

                    				newLeafNode(otherlv_14, grammarAccess.getJoueurAccess().getCommenceKeyword_9_1());
                    			
                    otherlv_15=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getJoueurAccess().getAvecKeyword_9_2());
                    			
                    // InternalGame.g:1919:4: ( (otherlv_16= RULE_ID ) )
                    // InternalGame.g:1920:5: (otherlv_16= RULE_ID )
                    {
                    // InternalGame.g:1920:5: (otherlv_16= RULE_ID )
                    // InternalGame.g:1921:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoueurRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_16, grammarAccess.getJoueurAccess().getConnaissancesConnaissanceCrossReference_9_3_0());
                    					

                    }


                    }

                    // InternalGame.g:1932:4: (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==24) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalGame.g:1933:5: otherlv_17= ',' ( (otherlv_18= RULE_ID ) )
                    	    {
                    	    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getJoueurAccess().getCommaKeyword_9_4_0());
                    	    				
                    	    // InternalGame.g:1937:5: ( (otherlv_18= RULE_ID ) )
                    	    // InternalGame.g:1938:6: (otherlv_18= RULE_ID )
                    	    {
                    	    // InternalGame.g:1938:6: (otherlv_18= RULE_ID )
                    	    // InternalGame.g:1939:7: otherlv_18= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoueurRule());
                    	    							}
                    	    						
                    	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_18, grammarAccess.getJoueurAccess().getConnaissancesConnaissanceCrossReference_9_4_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "ruletypePlace"
    // InternalGame.g:1956:1: ruletypePlace returns [Enumerator current=null] : ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) ;
    public final Enumerator ruletypePlace() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:1962:2: ( ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) ) )
            // InternalGame.g:1963:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            {
            // InternalGame.g:1963:2: ( (enumLiteral_0= 'debut' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'intermediaire' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt50=1;
                }
                break;
            case 57:
                {
                alt50=2;
                }
                break;
            case 58:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalGame.g:1964:3: (enumLiteral_0= 'debut' )
                    {
                    // InternalGame.g:1964:3: (enumLiteral_0= 'debut' )
                    // InternalGame.g:1965:4: enumLiteral_0= 'debut'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypePlaceAccess().getDebutEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypePlaceAccess().getDebutEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1972:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalGame.g:1972:3: (enumLiteral_1= 'fin' )
                    // InternalGame.g:1973:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTypePlaceAccess().getFinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypePlaceAccess().getFinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1980:3: (enumLiteral_2= 'intermediaire' )
                    {
                    // InternalGame.g:1980:3: (enumLiteral_2= 'intermediaire' )
                    // InternalGame.g:1981:4: enumLiteral_2= 'intermediaire'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTypePlaceAccess().getIntermediaireEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypePlaceAccess().getIntermediaireEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruletypePlace"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000D0008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000C0008000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000400002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800001000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080009000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004200000400002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000001400002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000001000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000000000L});

}