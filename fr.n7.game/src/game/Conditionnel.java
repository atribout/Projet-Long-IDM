/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditionnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Conditionnel#getConditionsVisibilite <em>Conditions Visibilite</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getConditionnel()
 * @model
 * @generated
 */
public interface Conditionnel extends JeuElement {
	/**
	 * Returns the value of the '<em><b>Conditions Visibilite</b></em>' reference list.
	 * The list contents are of type {@link game.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Visibilite</em>' reference list.
	 * @see game.GamePackage#getConditionnel_ConditionsVisibilite()
	 * @model
	 * @generated
	 */
	EList<Condition> getConditionsVisibilite();

} // Conditionnel
