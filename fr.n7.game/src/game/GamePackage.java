/**
 */
package game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.n7.fr/xtext/Game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link game.impl.JeuImpl <em>Jeu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.JeuImpl
	 * @see game.impl.GamePackageImpl#getJeu()
	 * @generated
	 */
	int JEU = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Jeu Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__JEU_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link game.impl.JeuElementImpl <em>Jeu Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.JeuElementImpl
	 * @see game.impl.GamePackageImpl#getJeuElement()
	 * @generated
	 */
	int JEU_ELEMENT = 13;

	/**
	 * The number of structural features of the '<em>Jeu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Jeu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link game.impl.ConditionnelImpl <em>Conditionnel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ConditionnelImpl
	 * @see game.impl.GamePackageImpl#getConditionnel()
	 * @generated
	 */
	int CONDITIONNEL = 11;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNEL__CONDITIONS_VISIBILITE = JEU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditionnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNEL_FEATURE_COUNT = JEU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditionnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNEL_OPERATION_COUNT = JEU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.ConnaissanceImpl <em>Connaissance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ConnaissanceImpl
	 * @see game.impl.GamePackageImpl#getConnaissance()
	 * @generated
	 */
	int CONNAISSANCE = 1;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNAISSANCE__CONDITIONS_VISIBILITE = CONDITIONNEL__CONDITIONS_VISIBILITE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNAISSANCE__NAME = CONDITIONNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connaissance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNAISSANCE_FEATURE_COUNT = CONDITIONNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connaissance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNAISSANCE_OPERATION_COUNT = CONDITIONNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.ObjetImpl <em>Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ObjetImpl
	 * @see game.impl.GamePackageImpl#getObjet()
	 * @generated
	 */
	int OBJET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__TAILLE = 1;

	/**
	 * The feature id for the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__QUANTITE = 2;

	/**
	 * The number of structural features of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link game.impl.ObjetTenuImpl <em>Objet Tenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ObjetTenuImpl
	 * @see game.impl.GamePackageImpl#getObjetTenu()
	 * @generated
	 */
	int OBJET_TENU = 3;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_TENU__CONDITIONS_VISIBILITE = CONDITIONNEL__CONDITIONS_VISIBILITE;

	/**
	 * The feature id for the '<em><b>Objet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_TENU__OBJET = CONDITIONNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_TENU__QUANTITE = CONDITIONNEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Objet Tenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_TENU_FEATURE_COUNT = CONDITIONNEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Objet Tenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_TENU_OPERATION_COUNT = CONDITIONNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ConditionImpl
	 * @see game.impl.GamePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = JEU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEGATION = JEU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OBJET = JEU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connaissance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONNAISSANCE = JEU_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = JEU_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = JEU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.PNJImpl <em>PNJ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.PNJImpl
	 * @see game.impl.GamePackageImpl#getPNJ()
	 * @generated
	 */
	int PNJ = 5;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNJ__CONDITIONS_VISIBILITE = CONDITIONNEL__CONDITIONS_VISIBILITE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNJ__NAME = CONDITIONNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lieu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNJ__LIEU = CONDITIONNEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dialogue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNJ__DIALOGUE = CONDITIONNEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PNJ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNJ_FEATURE_COUNT = CONDITIONNEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PNJ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNJ_OPERATION_COUNT = CONDITIONNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.LieuImpl <em>Lieu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.LieuImpl
	 * @see game.impl.GamePackageImpl#getLieu()
	 * @generated
	 */
	int LIEU = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__NAME = JEU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__TYPE = JEU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pnjs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__PNJS = JEU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__OBJETS = JEU_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connaissances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__CONNAISSANCES = JEU_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lieu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU_FEATURE_COUNT = JEU_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Lieu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU_OPERATION_COUNT = JEU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.DialogueImpl <em>Dialogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.DialogueImpl
	 * @see game.impl.GamePackageImpl#getDialogue()
	 * @generated
	 */
	int DIALOGUE = 7;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__CONDITIONS_VISIBILITE = CONDITIONNEL__CONDITIONS_VISIBILITE;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__TEXTE = CONDITIONNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reponses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__REPONSES = CONDITIONNEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_FEATURE_COUNT = CONDITIONNEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_OPERATION_COUNT = CONDITIONNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.ChoixImpl <em>Choix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ChoixImpl
	 * @see game.impl.GamePackageImpl#getChoix()
	 * @generated
	 */
	int CHOIX = 8;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX__CONDITIONS_VISIBILITE = CONDITIONNEL__CONDITIONS_VISIBILITE;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX__TEXTE = CONDITIONNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX__ACTIONS = CONDITIONNEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_FEATURE_COUNT = CONDITIONNEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_OPERATION_COUNT = CONDITIONNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.ActionImpl
	 * @see game.impl.GamePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = JEU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objets Consommes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OBJETS_CONSOMMES = JEU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objet Donnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OBJET_DONNES = JEU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objets Donnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OBJETS_DONNES = JEU_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connaissances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONNAISSANCES = JEU_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = JEU_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = JEU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.CheminImpl <em>Chemin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.CheminImpl
	 * @see game.impl.GamePackageImpl#getChemin()
	 * @generated
	 */
	int CHEMIN = 10;

	/**
	 * The feature id for the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN__CONDITIONS_VISIBILITE = CONDITIONNEL__CONDITIONS_VISIBILITE;

	/**
	 * The feature id for the '<em><b>Lieu1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN__LIEU1 = CONDITIONNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lieu2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN__LIEU2 = CONDITIONNEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN__ACTIONS = CONDITIONNEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditions Ouverture</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN__CONDITIONS_OUVERTURE = CONDITIONNEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Chemin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN_FEATURE_COUNT = CONDITIONNEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Chemin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMIN_OPERATION_COUNT = CONDITIONNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.impl.JoueurImpl <em>Joueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.JoueurImpl
	 * @see game.impl.GamePackageImpl#getJoueur()
	 * @generated
	 */
	int JOUEUR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__NAME = JEU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lieu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__LIEU = JEU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__TAILLE = JEU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inventaire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__INVENTAIRE = JEU_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connaissances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__CONNAISSANCES = JEU_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_FEATURE_COUNT = JEU_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_OPERATION_COUNT = JEU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link game.typePlace <em>type Place</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.typePlace
	 * @see game.impl.GamePackageImpl#gettypePlace()
	 * @generated
	 */
	int TYPE_PLACE = 14;


	/**
	 * Returns the meta object for class '{@link game.Jeu <em>Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jeu</em>'.
	 * @see game.Jeu
	 * @generated
	 */
	EClass getJeu();

	/**
	 * Returns the meta object for the attribute '{@link game.Jeu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Jeu#getName()
	 * @see #getJeu()
	 * @generated
	 */
	EAttribute getJeu_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Jeu#getJeuElements <em>Jeu Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jeu Elements</em>'.
	 * @see game.Jeu#getJeuElements()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_JeuElements();

	/**
	 * Returns the meta object for class '{@link game.Connaissance <em>Connaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connaissance</em>'.
	 * @see game.Connaissance
	 * @generated
	 */
	EClass getConnaissance();

	/**
	 * Returns the meta object for the attribute '{@link game.Connaissance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Connaissance#getName()
	 * @see #getConnaissance()
	 * @generated
	 */
	EAttribute getConnaissance_Name();

	/**
	 * Returns the meta object for class '{@link game.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet</em>'.
	 * @see game.Objet
	 * @generated
	 */
	EClass getObjet();

	/**
	 * Returns the meta object for the attribute '{@link game.Objet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Objet#getName()
	 * @see #getObjet()
	 * @generated
	 */
	EAttribute getObjet_Name();

	/**
	 * Returns the meta object for the attribute '{@link game.Objet#getTaille <em>Taille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille</em>'.
	 * @see game.Objet#getTaille()
	 * @see #getObjet()
	 * @generated
	 */
	EAttribute getObjet_Taille();

	/**
	 * Returns the meta object for the attribute '{@link game.Objet#getQuantite <em>Quantite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantite</em>'.
	 * @see game.Objet#getQuantite()
	 * @see #getObjet()
	 * @generated
	 */
	EAttribute getObjet_Quantite();

	/**
	 * Returns the meta object for class '{@link game.ObjetTenu <em>Objet Tenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet Tenu</em>'.
	 * @see game.ObjetTenu
	 * @generated
	 */
	EClass getObjetTenu();

	/**
	 * Returns the meta object for the reference '{@link game.ObjetTenu#getObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objet</em>'.
	 * @see game.ObjetTenu#getObjet()
	 * @see #getObjetTenu()
	 * @generated
	 */
	EReference getObjetTenu_Objet();

	/**
	 * Returns the meta object for the attribute '{@link game.ObjetTenu#getQuantite <em>Quantite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantite</em>'.
	 * @see game.ObjetTenu#getQuantite()
	 * @see #getObjetTenu()
	 * @generated
	 */
	EAttribute getObjetTenu_Quantite();

	/**
	 * Returns the meta object for class '{@link game.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see game.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link game.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link game.Condition#isNegation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation</em>'.
	 * @see game.Condition#isNegation()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Negation();

	/**
	 * Returns the meta object for the containment reference '{@link game.Condition#getObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objet</em>'.
	 * @see game.Condition#getObjet()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Objet();

	/**
	 * Returns the meta object for the reference '{@link game.Condition#getConnaissance <em>Connaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connaissance</em>'.
	 * @see game.Condition#getConnaissance()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Connaissance();

	/**
	 * Returns the meta object for class '{@link game.PNJ <em>PNJ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PNJ</em>'.
	 * @see game.PNJ
	 * @generated
	 */
	EClass getPNJ();

	/**
	 * Returns the meta object for the attribute '{@link game.PNJ#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.PNJ#getName()
	 * @see #getPNJ()
	 * @generated
	 */
	EAttribute getPNJ_Name();

	/**
	 * Returns the meta object for the reference '{@link game.PNJ#getLieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lieu</em>'.
	 * @see game.PNJ#getLieu()
	 * @see #getPNJ()
	 * @generated
	 */
	EReference getPNJ_Lieu();

	/**
	 * Returns the meta object for the containment reference list '{@link game.PNJ#getDialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialogue</em>'.
	 * @see game.PNJ#getDialogue()
	 * @see #getPNJ()
	 * @generated
	 */
	EReference getPNJ_Dialogue();

	/**
	 * Returns the meta object for class '{@link game.Lieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lieu</em>'.
	 * @see game.Lieu
	 * @generated
	 */
	EClass getLieu();

	/**
	 * Returns the meta object for the attribute '{@link game.Lieu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Lieu#getName()
	 * @see #getLieu()
	 * @generated
	 */
	EAttribute getLieu_Name();

	/**
	 * Returns the meta object for the attribute '{@link game.Lieu#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see game.Lieu#getType()
	 * @see #getLieu()
	 * @generated
	 */
	EAttribute getLieu_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Lieu#getPnjs <em>Pnjs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pnjs</em>'.
	 * @see game.Lieu#getPnjs()
	 * @see #getLieu()
	 * @generated
	 */
	EReference getLieu_Pnjs();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Lieu#getObjets <em>Objets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objets</em>'.
	 * @see game.Lieu#getObjets()
	 * @see #getLieu()
	 * @generated
	 */
	EReference getLieu_Objets();

	/**
	 * Returns the meta object for the reference list '{@link game.Lieu#getConnaissances <em>Connaissances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connaissances</em>'.
	 * @see game.Lieu#getConnaissances()
	 * @see #getLieu()
	 * @generated
	 */
	EReference getLieu_Connaissances();

	/**
	 * Returns the meta object for class '{@link game.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue</em>'.
	 * @see game.Dialogue
	 * @generated
	 */
	EClass getDialogue();

	/**
	 * Returns the meta object for the attribute '{@link game.Dialogue#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see game.Dialogue#getTexte()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_Texte();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Dialogue#getReponses <em>Reponses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponses</em>'.
	 * @see game.Dialogue#getReponses()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Reponses();

	/**
	 * Returns the meta object for class '{@link game.Choix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choix</em>'.
	 * @see game.Choix
	 * @generated
	 */
	EClass getChoix();

	/**
	 * Returns the meta object for the attribute '{@link game.Choix#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see game.Choix#getTexte()
	 * @see #getChoix()
	 * @generated
	 */
	EAttribute getChoix_Texte();

	/**
	 * Returns the meta object for the reference list '{@link game.Choix#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see game.Choix#getActions()
	 * @see #getChoix()
	 * @generated
	 */
	EReference getChoix_Actions();

	/**
	 * Returns the meta object for class '{@link game.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see game.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link game.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Action#getObjetsConsommes <em>Objets Consommes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objets Consommes</em>'.
	 * @see game.Action#getObjetsConsommes()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ObjetsConsommes();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Action#getObjetDonnes <em>Objet Donnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objet Donnes</em>'.
	 * @see game.Action#getObjetDonnes()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ObjetDonnes();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Action#getObjetsDonnes <em>Objets Donnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objets Donnes</em>'.
	 * @see game.Action#getObjetsDonnes()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ObjetsDonnes();

	/**
	 * Returns the meta object for the reference list '{@link game.Action#getConnaissances <em>Connaissances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connaissances</em>'.
	 * @see game.Action#getConnaissances()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Connaissances();

	/**
	 * Returns the meta object for class '{@link game.Chemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chemin</em>'.
	 * @see game.Chemin
	 * @generated
	 */
	EClass getChemin();

	/**
	 * Returns the meta object for the reference '{@link game.Chemin#getLieu1 <em>Lieu1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lieu1</em>'.
	 * @see game.Chemin#getLieu1()
	 * @see #getChemin()
	 * @generated
	 */
	EReference getChemin_Lieu1();

	/**
	 * Returns the meta object for the reference '{@link game.Chemin#getLieu2 <em>Lieu2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lieu2</em>'.
	 * @see game.Chemin#getLieu2()
	 * @see #getChemin()
	 * @generated
	 */
	EReference getChemin_Lieu2();

	/**
	 * Returns the meta object for the reference list '{@link game.Chemin#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see game.Chemin#getActions()
	 * @see #getChemin()
	 * @generated
	 */
	EReference getChemin_Actions();

	/**
	 * Returns the meta object for the reference list '{@link game.Chemin#getConditionsOuverture <em>Conditions Ouverture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions Ouverture</em>'.
	 * @see game.Chemin#getConditionsOuverture()
	 * @see #getChemin()
	 * @generated
	 */
	EReference getChemin_ConditionsOuverture();

	/**
	 * Returns the meta object for class '{@link game.Conditionnel <em>Conditionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditionnel</em>'.
	 * @see game.Conditionnel
	 * @generated
	 */
	EClass getConditionnel();

	/**
	 * Returns the meta object for the reference list '{@link game.Conditionnel#getConditionsVisibilite <em>Conditions Visibilite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions Visibilite</em>'.
	 * @see game.Conditionnel#getConditionsVisibilite()
	 * @see #getConditionnel()
	 * @generated
	 */
	EReference getConditionnel_ConditionsVisibilite();

	/**
	 * Returns the meta object for class '{@link game.Joueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joueur</em>'.
	 * @see game.Joueur
	 * @generated
	 */
	EClass getJoueur();

	/**
	 * Returns the meta object for the attribute '{@link game.Joueur#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see game.Joueur#getName()
	 * @see #getJoueur()
	 * @generated
	 */
	EAttribute getJoueur_Name();

	/**
	 * Returns the meta object for the reference '{@link game.Joueur#getLieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lieu</em>'.
	 * @see game.Joueur#getLieu()
	 * @see #getJoueur()
	 * @generated
	 */
	EReference getJoueur_Lieu();

	/**
	 * Returns the meta object for the attribute '{@link game.Joueur#getTaille <em>Taille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille</em>'.
	 * @see game.Joueur#getTaille()
	 * @see #getJoueur()
	 * @generated
	 */
	EAttribute getJoueur_Taille();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Joueur#getInventaire <em>Inventaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventaire</em>'.
	 * @see game.Joueur#getInventaire()
	 * @see #getJoueur()
	 * @generated
	 */
	EReference getJoueur_Inventaire();

	/**
	 * Returns the meta object for the reference list '{@link game.Joueur#getConnaissances <em>Connaissances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connaissances</em>'.
	 * @see game.Joueur#getConnaissances()
	 * @see #getJoueur()
	 * @generated
	 */
	EReference getJoueur_Connaissances();

	/**
	 * Returns the meta object for class '{@link game.JeuElement <em>Jeu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jeu Element</em>'.
	 * @see game.JeuElement
	 * @generated
	 */
	EClass getJeuElement();

	/**
	 * Returns the meta object for enum '{@link game.typePlace <em>type Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Place</em>'.
	 * @see game.typePlace
	 * @generated
	 */
	EEnum gettypePlace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link game.impl.JeuImpl <em>Jeu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.JeuImpl
		 * @see game.impl.GamePackageImpl#getJeu()
		 * @generated
		 */
		EClass JEU = eINSTANCE.getJeu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEU__NAME = eINSTANCE.getJeu_Name();

		/**
		 * The meta object literal for the '<em><b>Jeu Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__JEU_ELEMENTS = eINSTANCE.getJeu_JeuElements();

		/**
		 * The meta object literal for the '{@link game.impl.ConnaissanceImpl <em>Connaissance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ConnaissanceImpl
		 * @see game.impl.GamePackageImpl#getConnaissance()
		 * @generated
		 */
		EClass CONNAISSANCE = eINSTANCE.getConnaissance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNAISSANCE__NAME = eINSTANCE.getConnaissance_Name();

		/**
		 * The meta object literal for the '{@link game.impl.ObjetImpl <em>Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ObjetImpl
		 * @see game.impl.GamePackageImpl#getObjet()
		 * @generated
		 */
		EClass OBJET = eINSTANCE.getObjet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJET__NAME = eINSTANCE.getObjet_Name();

		/**
		 * The meta object literal for the '<em><b>Taille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJET__TAILLE = eINSTANCE.getObjet_Taille();

		/**
		 * The meta object literal for the '<em><b>Quantite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJET__QUANTITE = eINSTANCE.getObjet_Quantite();

		/**
		 * The meta object literal for the '{@link game.impl.ObjetTenuImpl <em>Objet Tenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ObjetTenuImpl
		 * @see game.impl.GamePackageImpl#getObjetTenu()
		 * @generated
		 */
		EClass OBJET_TENU = eINSTANCE.getObjetTenu();

		/**
		 * The meta object literal for the '<em><b>Objet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJET_TENU__OBJET = eINSTANCE.getObjetTenu_Objet();

		/**
		 * The meta object literal for the '<em><b>Quantite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJET_TENU__QUANTITE = eINSTANCE.getObjetTenu_Quantite();

		/**
		 * The meta object literal for the '{@link game.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ConditionImpl
		 * @see game.impl.GamePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NEGATION = eINSTANCE.getCondition_Negation();

		/**
		 * The meta object literal for the '<em><b>Objet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__OBJET = eINSTANCE.getCondition_Objet();

		/**
		 * The meta object literal for the '<em><b>Connaissance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONNAISSANCE = eINSTANCE.getCondition_Connaissance();

		/**
		 * The meta object literal for the '{@link game.impl.PNJImpl <em>PNJ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.PNJImpl
		 * @see game.impl.GamePackageImpl#getPNJ()
		 * @generated
		 */
		EClass PNJ = eINSTANCE.getPNJ();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNJ__NAME = eINSTANCE.getPNJ_Name();

		/**
		 * The meta object literal for the '<em><b>Lieu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNJ__LIEU = eINSTANCE.getPNJ_Lieu();

		/**
		 * The meta object literal for the '<em><b>Dialogue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNJ__DIALOGUE = eINSTANCE.getPNJ_Dialogue();

		/**
		 * The meta object literal for the '{@link game.impl.LieuImpl <em>Lieu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.LieuImpl
		 * @see game.impl.GamePackageImpl#getLieu()
		 * @generated
		 */
		EClass LIEU = eINSTANCE.getLieu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEU__NAME = eINSTANCE.getLieu_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEU__TYPE = eINSTANCE.getLieu_Type();

		/**
		 * The meta object literal for the '<em><b>Pnjs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEU__PNJS = eINSTANCE.getLieu_Pnjs();

		/**
		 * The meta object literal for the '<em><b>Objets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEU__OBJETS = eINSTANCE.getLieu_Objets();

		/**
		 * The meta object literal for the '<em><b>Connaissances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEU__CONNAISSANCES = eINSTANCE.getLieu_Connaissances();

		/**
		 * The meta object literal for the '{@link game.impl.DialogueImpl <em>Dialogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.DialogueImpl
		 * @see game.impl.GamePackageImpl#getDialogue()
		 * @generated
		 */
		EClass DIALOGUE = eINSTANCE.getDialogue();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__TEXTE = eINSTANCE.getDialogue_Texte();

		/**
		 * The meta object literal for the '<em><b>Reponses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__REPONSES = eINSTANCE.getDialogue_Reponses();

		/**
		 * The meta object literal for the '{@link game.impl.ChoixImpl <em>Choix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ChoixImpl
		 * @see game.impl.GamePackageImpl#getChoix()
		 * @generated
		 */
		EClass CHOIX = eINSTANCE.getChoix();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOIX__TEXTE = eINSTANCE.getChoix_Texte();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOIX__ACTIONS = eINSTANCE.getChoix_Actions();

		/**
		 * The meta object literal for the '{@link game.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ActionImpl
		 * @see game.impl.GamePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Objets Consommes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OBJETS_CONSOMMES = eINSTANCE.getAction_ObjetsConsommes();

		/**
		 * The meta object literal for the '<em><b>Objet Donnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OBJET_DONNES = eINSTANCE.getAction_ObjetDonnes();

		/**
		 * The meta object literal for the '<em><b>Objets Donnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OBJETS_DONNES = eINSTANCE.getAction_ObjetsDonnes();

		/**
		 * The meta object literal for the '<em><b>Connaissances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONNAISSANCES = eINSTANCE.getAction_Connaissances();

		/**
		 * The meta object literal for the '{@link game.impl.CheminImpl <em>Chemin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.CheminImpl
		 * @see game.impl.GamePackageImpl#getChemin()
		 * @generated
		 */
		EClass CHEMIN = eINSTANCE.getChemin();

		/**
		 * The meta object literal for the '<em><b>Lieu1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEMIN__LIEU1 = eINSTANCE.getChemin_Lieu1();

		/**
		 * The meta object literal for the '<em><b>Lieu2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEMIN__LIEU2 = eINSTANCE.getChemin_Lieu2();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEMIN__ACTIONS = eINSTANCE.getChemin_Actions();

		/**
		 * The meta object literal for the '<em><b>Conditions Ouverture</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEMIN__CONDITIONS_OUVERTURE = eINSTANCE.getChemin_ConditionsOuverture();

		/**
		 * The meta object literal for the '{@link game.impl.ConditionnelImpl <em>Conditionnel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.ConditionnelImpl
		 * @see game.impl.GamePackageImpl#getConditionnel()
		 * @generated
		 */
		EClass CONDITIONNEL = eINSTANCE.getConditionnel();

		/**
		 * The meta object literal for the '<em><b>Conditions Visibilite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONNEL__CONDITIONS_VISIBILITE = eINSTANCE.getConditionnel_ConditionsVisibilite();

		/**
		 * The meta object literal for the '{@link game.impl.JoueurImpl <em>Joueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.JoueurImpl
		 * @see game.impl.GamePackageImpl#getJoueur()
		 * @generated
		 */
		EClass JOUEUR = eINSTANCE.getJoueur();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOUEUR__NAME = eINSTANCE.getJoueur_Name();

		/**
		 * The meta object literal for the '<em><b>Lieu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOUEUR__LIEU = eINSTANCE.getJoueur_Lieu();

		/**
		 * The meta object literal for the '<em><b>Taille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOUEUR__TAILLE = eINSTANCE.getJoueur_Taille();

		/**
		 * The meta object literal for the '<em><b>Inventaire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOUEUR__INVENTAIRE = eINSTANCE.getJoueur_Inventaire();

		/**
		 * The meta object literal for the '<em><b>Connaissances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOUEUR__CONNAISSANCES = eINSTANCE.getJoueur_Connaissances();

		/**
		 * The meta object literal for the '{@link game.impl.JeuElementImpl <em>Jeu Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.JeuElementImpl
		 * @see game.impl.GamePackageImpl#getJeuElement()
		 * @generated
		 */
		EClass JEU_ELEMENT = eINSTANCE.getJeuElement();

		/**
		 * The meta object literal for the '{@link game.typePlace <em>type Place</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.typePlace
		 * @see game.impl.GamePackageImpl#gettypePlace()
		 * @generated
		 */
		EEnum TYPE_PLACE = eINSTANCE.gettypePlace();

	}

} //GamePackage
