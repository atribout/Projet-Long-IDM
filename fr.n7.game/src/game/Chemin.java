/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chemin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Chemin#getLieu1 <em>Lieu1</em>}</li>
 *   <li>{@link game.Chemin#getLieu2 <em>Lieu2</em>}</li>
 *   <li>{@link game.Chemin#getActions <em>Actions</em>}</li>
 *   <li>{@link game.Chemin#getConditionsOuverture <em>Conditions Ouverture</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getChemin()
 * @model
 * @generated
 */
public interface Chemin extends Conditionnel {
	/**
	 * Returns the value of the '<em><b>Lieu1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu1</em>' reference.
	 * @see #setLieu1(Lieu)
	 * @see game.GamePackage#getChemin_Lieu1()
	 * @model
	 * @generated
	 */
	Lieu getLieu1();

	/**
	 * Sets the value of the '{@link game.Chemin#getLieu1 <em>Lieu1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu1</em>' reference.
	 * @see #getLieu1()
	 * @generated
	 */
	void setLieu1(Lieu value);

	/**
	 * Returns the value of the '<em><b>Lieu2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu2</em>' reference.
	 * @see #setLieu2(Lieu)
	 * @see game.GamePackage#getChemin_Lieu2()
	 * @model
	 * @generated
	 */
	Lieu getLieu2();

	/**
	 * Sets the value of the '{@link game.Chemin#getLieu2 <em>Lieu2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu2</em>' reference.
	 * @see #getLieu2()
	 * @generated
	 */
	void setLieu2(Lieu value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link game.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see game.GamePackage#getChemin_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Conditions Ouverture</b></em>' reference list.
	 * The list contents are of type {@link game.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Ouverture</em>' reference list.
	 * @see game.GamePackage#getChemin_ConditionsOuverture()
	 * @model
	 * @generated
	 */
	EList<Condition> getConditionsOuverture();

} // Chemin
