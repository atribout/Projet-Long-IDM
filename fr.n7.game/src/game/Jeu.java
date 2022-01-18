/**
 */
package game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jeu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Jeu#getName <em>Name</em>}</li>
 *   <li>{@link game.Jeu#getJeuElements <em>Jeu Elements</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getJeu()
 * @model
 * @generated
 */
public interface Jeu extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getJeu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.Jeu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jeu Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jeu Elements</em>' containment reference list.
	 * @see game.GamePackage#getJeu_JeuElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getJeuElements();

} // Jeu
