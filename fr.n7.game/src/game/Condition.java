/**
 */
package game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Condition#getName <em>Name</em>}</li>
 *   <li>{@link game.Condition#isNegation <em>Negation</em>}</li>
 *   <li>{@link game.Condition#getObjet <em>Objet</em>}</li>
 *   <li>{@link game.Condition#getConnaissance <em>Connaissance</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends JeuElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negation</em>' attribute.
	 * @see #setNegation(boolean)
	 * @see game.GamePackage#getCondition_Negation()
	 * @model
	 * @generated
	 */
	boolean isNegation();

	/**
	 * Sets the value of the '{@link game.Condition#isNegation <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation</em>' attribute.
	 * @see #isNegation()
	 * @generated
	 */
	void setNegation(boolean value);

	/**
	 * Returns the value of the '<em><b>Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet</em>' containment reference.
	 * @see #setObjet(ObjetTenu)
	 * @see game.GamePackage#getCondition_Objet()
	 * @model containment="true"
	 * @generated
	 */
	ObjetTenu getObjet();

	/**
	 * Sets the value of the '{@link game.Condition#getObjet <em>Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet</em>' containment reference.
	 * @see #getObjet()
	 * @generated
	 */
	void setObjet(ObjetTenu value);

	/**
	 * Returns the value of the '<em><b>Connaissance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connaissance</em>' reference.
	 * @see #setConnaissance(Connaissance)
	 * @see game.GamePackage#getCondition_Connaissance()
	 * @model
	 * @generated
	 */
	Connaissance getConnaissance();

	/**
	 * Sets the value of the '{@link game.Condition#getConnaissance <em>Connaissance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connaissance</em>' reference.
	 * @see #getConnaissance()
	 * @generated
	 */
	void setConnaissance(Connaissance value);

} // Condition
