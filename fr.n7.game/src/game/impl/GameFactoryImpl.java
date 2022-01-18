/**
 */
package game.impl;

import game.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameFactoryImpl extends EFactoryImpl implements GameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameFactory init() {
		try {
			GameFactory theGameFactory = (GameFactory)EPackage.Registry.INSTANCE.getEFactory(GamePackage.eNS_URI);
			if (theGameFactory != null) {
				return theGameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GamePackage.JEU: return createJeu();
			case GamePackage.CONNAISSANCE: return createConnaissance();
			case GamePackage.OBJET: return createObjet();
			case GamePackage.OBJET_TENU: return createObjetTenu();
			case GamePackage.CONDITION: return createCondition();
			case GamePackage.PNJ: return createPNJ();
			case GamePackage.LIEU: return createLieu();
			case GamePackage.DIALOGUE: return createDialogue();
			case GamePackage.CHOIX: return createChoix();
			case GamePackage.ACTION: return createAction();
			case GamePackage.CHEMIN: return createChemin();
			case GamePackage.CONDITIONNEL: return createConditionnel();
			case GamePackage.JOUEUR: return createJoueur();
			case GamePackage.JEU_ELEMENT: return createJeuElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GamePackage.TYPE_PLACE:
				return createtypePlaceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GamePackage.TYPE_PLACE:
				return converttypePlaceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jeu createJeu() {
		JeuImpl jeu = new JeuImpl();
		return jeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connaissance createConnaissance() {
		ConnaissanceImpl connaissance = new ConnaissanceImpl();
		return connaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objet createObjet() {
		ObjetImpl objet = new ObjetImpl();
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetTenu createObjetTenu() {
		ObjetTenuImpl objetTenu = new ObjetTenuImpl();
		return objetTenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNJ createPNJ() {
		PNJImpl pnj = new PNJImpl();
		return pnj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu createLieu() {
		LieuImpl lieu = new LieuImpl();
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue createDialogue() {
		DialogueImpl dialogue = new DialogueImpl();
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choix createChoix() {
		ChoixImpl choix = new ChoixImpl();
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chemin createChemin() {
		CheminImpl chemin = new CheminImpl();
		return chemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditionnel createConditionnel() {
		ConditionnelImpl conditionnel = new ConditionnelImpl();
		return conditionnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joueur createJoueur() {
		JoueurImpl joueur = new JoueurImpl();
		return joueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeuElement createJeuElement() {
		JeuElementImpl jeuElement = new JeuElementImpl();
		return jeuElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typePlace createtypePlaceFromString(EDataType eDataType, String initialValue) {
		typePlace result = typePlace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypePlaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePackage getGamePackage() {
		return (GamePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamePackage getPackage() {
		return GamePackage.eINSTANCE;
	}

} //GameFactoryImpl
