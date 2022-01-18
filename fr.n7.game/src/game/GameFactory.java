/**
 */
package game;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see game.GamePackage
 * @generated
 */
public interface GameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GameFactory eINSTANCE = game.impl.GameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Jeu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jeu</em>'.
	 * @generated
	 */
	Jeu createJeu();

	/**
	 * Returns a new object of class '<em>Connaissance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connaissance</em>'.
	 * @generated
	 */
	Connaissance createConnaissance();

	/**
	 * Returns a new object of class '<em>Objet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objet</em>'.
	 * @generated
	 */
	Objet createObjet();

	/**
	 * Returns a new object of class '<em>Objet Tenu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objet Tenu</em>'.
	 * @generated
	 */
	ObjetTenu createObjetTenu();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>PNJ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PNJ</em>'.
	 * @generated
	 */
	PNJ createPNJ();

	/**
	 * Returns a new object of class '<em>Lieu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lieu</em>'.
	 * @generated
	 */
	Lieu createLieu();

	/**
	 * Returns a new object of class '<em>Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialogue</em>'.
	 * @generated
	 */
	Dialogue createDialogue();

	/**
	 * Returns a new object of class '<em>Choix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choix</em>'.
	 * @generated
	 */
	Choix createChoix();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Chemin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chemin</em>'.
	 * @generated
	 */
	Chemin createChemin();

	/**
	 * Returns a new object of class '<em>Conditionnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditionnel</em>'.
	 * @generated
	 */
	Conditionnel createConditionnel();

	/**
	 * Returns a new object of class '<em>Joueur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joueur</em>'.
	 * @generated
	 */
	Joueur createJoueur();

	/**
	 * Returns a new object of class '<em>Jeu Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jeu Element</em>'.
	 * @generated
	 */
	JeuElement createJeuElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GamePackage getGamePackage();

} //GameFactory