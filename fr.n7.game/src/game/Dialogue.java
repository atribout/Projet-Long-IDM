/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Dialogue#getTexte <em>Texte</em>}</li>
 *   <li>{@link game.Dialogue#getReponses <em>Reponses</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getDialogue()
 * @model
 * @generated
 */
public interface Dialogue extends Conditionnel {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see game.GamePackage#getDialogue_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link game.Dialogue#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Reponses</b></em>' containment reference list.
	 * The list contents are of type {@link game.Choix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses</em>' containment reference list.
	 * @see game.GamePackage#getDialogue_Reponses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choix> getReponses();

} // Dialogue
