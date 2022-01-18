/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PNJ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.PNJ#getName <em>Name</em>}</li>
 *   <li>{@link game.PNJ#getLieu <em>Lieu</em>}</li>
 *   <li>{@link game.PNJ#getDialogue <em>Dialogue</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getPNJ()
 * @model
 * @generated
 */
public interface PNJ extends Conditionnel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getPNJ_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.PNJ#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lieu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu</em>' reference.
	 * @see #setLieu(Lieu)
	 * @see game.GamePackage#getPNJ_Lieu()
	 * @model
	 * @generated
	 */
	Lieu getLieu();

	/**
	 * Sets the value of the '{@link game.PNJ#getLieu <em>Lieu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu</em>' reference.
	 * @see #getLieu()
	 * @generated
	 */
	void setLieu(Lieu value);

	/**
	 * Returns the value of the '<em><b>Dialogue</b></em>' containment reference list.
	 * The list contents are of type {@link game.Dialogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogue</em>' containment reference list.
	 * @see game.GamePackage#getPNJ_Dialogue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dialogue> getDialogue();

} // PNJ
