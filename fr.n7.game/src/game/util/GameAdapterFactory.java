/**
 */
package game.util;

import game.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see game.GamePackage
 * @generated
 */
public class GameAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GamePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameSwitch<Adapter> modelSwitch =
		new GameSwitch<Adapter>() {
			@Override
			public Adapter caseJeu(Jeu object) {
				return createJeuAdapter();
			}
			@Override
			public Adapter caseConnaissance(Connaissance object) {
				return createConnaissanceAdapter();
			}
			@Override
			public Adapter caseObjet(Objet object) {
				return createObjetAdapter();
			}
			@Override
			public Adapter caseObjetTenu(ObjetTenu object) {
				return createObjetTenuAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter casePNJ(PNJ object) {
				return createPNJAdapter();
			}
			@Override
			public Adapter caseLieu(Lieu object) {
				return createLieuAdapter();
			}
			@Override
			public Adapter caseDialogue(Dialogue object) {
				return createDialogueAdapter();
			}
			@Override
			public Adapter caseChoix(Choix object) {
				return createChoixAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseChemin(Chemin object) {
				return createCheminAdapter();
			}
			@Override
			public Adapter caseConditionnel(Conditionnel object) {
				return createConditionnelAdapter();
			}
			@Override
			public Adapter caseJoueur(Joueur object) {
				return createJoueurAdapter();
			}
			@Override
			public Adapter caseJeuElement(JeuElement object) {
				return createJeuElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link game.Jeu <em>Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Jeu
	 * @generated
	 */
	public Adapter createJeuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Connaissance <em>Connaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Connaissance
	 * @generated
	 */
	public Adapter createConnaissanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Objet
	 * @generated
	 */
	public Adapter createObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.ObjetTenu <em>Objet Tenu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.ObjetTenu
	 * @generated
	 */
	public Adapter createObjetTenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.PNJ <em>PNJ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.PNJ
	 * @generated
	 */
	public Adapter createPNJAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Lieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Lieu
	 * @generated
	 */
	public Adapter createLieuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Dialogue
	 * @generated
	 */
	public Adapter createDialogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Choix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Choix
	 * @generated
	 */
	public Adapter createChoixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Chemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Chemin
	 * @generated
	 */
	public Adapter createCheminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Conditionnel <em>Conditionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Conditionnel
	 * @generated
	 */
	public Adapter createConditionnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.Joueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.Joueur
	 * @generated
	 */
	public Adapter createJoueurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link game.JeuElement <em>Jeu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see game.JeuElement
	 * @generated
	 */
	public Adapter createJeuElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GameAdapterFactory
