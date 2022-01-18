/**
 */
package game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objet Tenu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.ObjetTenu#getObjet <em>Objet</em>}</li>
 *   <li>{@link game.ObjetTenu#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getObjetTenu()
 * @model
 * @generated
 */
public interface ObjetTenu extends Conditionnel {
	/**
	 * Returns the value of the '<em><b>Objet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet</em>' reference.
	 * @see #setObjet(Objet)
	 * @see game.GamePackage#getObjetTenu_Objet()
	 * @model
	 * @generated
	 */
	Objet getObjet();

	/**
	 * Sets the value of the '{@link game.ObjetTenu#getObjet <em>Objet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet</em>' reference.
	 * @see #getObjet()
	 * @generated
	 */
	void setObjet(Objet value);

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(int)
	 * @see game.GamePackage#getObjetTenu_Quantite()
	 * @model
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link game.ObjetTenu#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

} // ObjetTenu
