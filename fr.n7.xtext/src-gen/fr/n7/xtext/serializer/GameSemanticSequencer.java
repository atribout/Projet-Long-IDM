/*
 * generated by Xtext 2.23.0
 */
package fr.n7.xtext.serializer;

import com.google.inject.Inject;
import fr.n7.xtext.game.Chemin;
import fr.n7.xtext.game.Choix;
import fr.n7.xtext.game.Condition;
import fr.n7.xtext.game.Connaissance;
import fr.n7.xtext.game.Dialogue;
import fr.n7.xtext.game.GamePackage;
import fr.n7.xtext.game.Jeu;
import fr.n7.xtext.game.Joueur;
import fr.n7.xtext.game.Lieu;
import fr.n7.xtext.game.Objet;
import fr.n7.xtext.game.ObjetTenu;
import fr.n7.xtext.game.PNJ;
import fr.n7.xtext.services.GameGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GameSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GameGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GamePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GamePackage.ACTION:
				sequence_Action(context, (fr.n7.xtext.game.Action) semanticObject); 
				return; 
			case GamePackage.CHEMIN:
				sequence_Chemin(context, (Chemin) semanticObject); 
				return; 
			case GamePackage.CHOIX:
				sequence_Choix(context, (Choix) semanticObject); 
				return; 
			case GamePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GamePackage.CONNAISSANCE:
				sequence_Connaissance(context, (Connaissance) semanticObject); 
				return; 
			case GamePackage.DIALOGUE:
				sequence_Dialogue(context, (Dialogue) semanticObject); 
				return; 
			case GamePackage.JEU:
				sequence_Jeu(context, (Jeu) semanticObject); 
				return; 
			case GamePackage.JOUEUR:
				sequence_Joueur(context, (Joueur) semanticObject); 
				return; 
			case GamePackage.LIEU:
				sequence_Lieu(context, (Lieu) semanticObject); 
				return; 
			case GamePackage.OBJET:
				sequence_Objet(context, (Objet) semanticObject); 
				return; 
			case GamePackage.OBJET_TENU:
				sequence_ObjetTenu(context, (ObjetTenu) semanticObject); 
				return; 
			case GamePackage.PNJ:
				sequence_PNJ(context, (PNJ) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *     JeuElement returns Action
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (objetsConsommes+=ObjetTenu objetsConsommes+=ObjetTenu*)? 
	 *         (ObjetDonnes+=ObjetTenu objetsDonnes+=ObjetTenu*)? 
	 *         (connaissances+=[Connaissance|ID] connaissances+=[Connaissance|ID]*)?
	 *     )
	 */
	protected void sequence_Action(ISerializationContext context, fr.n7.xtext.game.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Chemin returns Chemin
	 *     Conditionnel returns Chemin
	 *     JeuElement returns Chemin
	 *
	 * Constraint:
	 *     (
	 *         lieu1=[Lieu|ID] 
	 *         lieu2=[Lieu|ID] 
	 *         (actions+=[Action|ID] actions+=[Action|ID]*)? 
	 *         (conditionsOuverture+=[Condition|ID] conditionsOuverture+=[Condition|ID]*)? 
	 *         (conditionsVisibilite+=[Condition|ID] conditionsVisibilite+=[Condition|ID]*)?
	 *     )
	 */
	protected void sequence_Chemin(ISerializationContext context, Chemin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Choix returns Choix
	 *     Conditionnel returns Choix
	 *     JeuElement returns Choix
	 *
	 * Constraint:
	 *     (texte=STRING (actions+=[Action|ID] actions+=[Action|ID]*)? (conditionsVisibilite+=[Condition|ID] conditionsVisibilite+=[Condition|ID]*)?)
	 */
	protected void sequence_Choix(ISerializationContext context, Choix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *     JeuElement returns Condition
	 *
	 * Constraint:
	 *     (name=ID ((negation?='pas'? objet=ObjetTenu) | (negation?='pas'? connaissance=[Connaissance|ID])))
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connaissance returns Connaissance
	 *     Conditionnel returns Connaissance
	 *     JeuElement returns Connaissance
	 *
	 * Constraint:
	 *     (name=ID (conditionsVisibilite+=[Condition|ID] conditionsVisibilite+=[Condition|ID]*)?)
	 */
	protected void sequence_Connaissance(ISerializationContext context, Connaissance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dialogue returns Dialogue
	 *     Conditionnel returns Dialogue
	 *     JeuElement returns Dialogue
	 *
	 * Constraint:
	 *     (texte=STRING reponses+=Choix* (conditionsVisibilite+=[Condition|ID] conditionsVisibilite+=[Condition|ID]*)?)
	 */
	protected void sequence_Dialogue(ISerializationContext context, Dialogue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Jeu returns Jeu
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         jeuElements+=Connaissance* 
	 *         jeuElements+=Objet* 
	 *         jeuElements+=PNJ* 
	 *         jeuElements+=Action* 
	 *         jeuElements+=Condition* 
	 *         jeuElements+=Lieu* 
	 *         jeuElements+=Chemin* 
	 *         jeuElements+=Joueur
	 *     )
	 */
	protected void sequence_Jeu(ISerializationContext context, Jeu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Joueur returns Joueur
	 *     JeuElement returns Joueur
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         lieu=[Lieu|ID] 
	 *         taille=INT 
	 *         (inventaire+=ObjetTenu inventaire+=ObjetTenu*)? 
	 *         (connaissances+=[Connaissance|ID] connaissances+=[Connaissance|ID]*)?
	 *     )
	 */
	protected void sequence_Joueur(ISerializationContext context, Joueur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lieu returns Lieu
	 *     JeuElement returns Lieu
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=typePlace 
	 *         (pnjs+=PNJ pnjs+=PNJ*)? 
	 *         (objets+=ObjetTenu objets+=ObjetTenu*)? 
	 *         (connaissances+=[Connaissance|ID] connaissances+=[Connaissance|ID]*)?
	 *     )
	 */
	protected void sequence_Lieu(ISerializationContext context, Lieu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjetTenu returns ObjetTenu
	 *     Conditionnel returns ObjetTenu
	 *     JeuElement returns ObjetTenu
	 *
	 * Constraint:
	 *     (objet=[Objet|ID] quantite=INT (conditionsVisibilite+=[Condition|ID] conditionsVisibilite+=[Condition|ID]*)?)
	 */
	protected void sequence_ObjetTenu(ISerializationContext context, ObjetTenu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Objet returns Objet
	 *
	 * Constraint:
	 *     (name=ID taille=INT quantite=INT)
	 */
	protected void sequence_Objet(ISerializationContext context, Objet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.OBJET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.OBJET__NAME));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.OBJET__TAILLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.OBJET__TAILLE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.OBJET__QUANTITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.OBJET__QUANTITE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_3_0(), semanticObject.getTaille());
		feeder.accept(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_6_0(), semanticObject.getQuantite());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PNJ returns PNJ
	 *     Conditionnel returns PNJ
	 *     JeuElement returns PNJ
	 *
	 * Constraint:
	 *     (name=ID lieu=[Lieu|ID] dialogue+=Dialogue* (conditionsVisibilite+=[Condition|ID] conditionsVisibilite+=[Condition|ID]*)?)
	 */
	protected void sequence_PNJ(ISerializationContext context, PNJ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
