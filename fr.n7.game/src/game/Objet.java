/**
 */
package game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Objet#getName <em>Name</em>}</li>
 *   <li>{@link game.Objet#getTaille <em>Taille</em>}</li>
 *   <li>{@link game.Objet#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getObjet()
 * @model
 * @generated
 */
public interface Objet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getObjet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.Objet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille</em>' attribute.
	 * @see #setTaille(int)
	 * @see game.GamePackage#getObjet_Taille()
	 * @model
	 * @generated
	 */
	int getTaille();

	/**
	 * Sets the value of the '{@link game.Objet#getTaille <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille</em>' attribute.
	 * @see #getTaille()
	 * @generated
	 */
	void setTaille(int value);

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(int)
	 * @see game.GamePackage#getObjet_Quantite()
	 * @model
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link game.Objet#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

} // Objet
