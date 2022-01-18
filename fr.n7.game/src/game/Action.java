/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Action#getName <em>Name</em>}</li>
 *   <li>{@link game.Action#getObjetsConsommes <em>Objets Consommes</em>}</li>
 *   <li>{@link game.Action#getObjetDonnes <em>Objet Donnes</em>}</li>
 *   <li>{@link game.Action#getObjetsDonnes <em>Objets Donnes</em>}</li>
 *   <li>{@link game.Action#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends JeuElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objets Consommes</b></em>' containment reference list.
	 * The list contents are of type {@link game.ObjetTenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objets Consommes</em>' containment reference list.
	 * @see game.GamePackage#getAction_ObjetsConsommes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjetTenu> getObjetsConsommes();

	/**
	 * Returns the value of the '<em><b>Objet Donnes</b></em>' containment reference list.
	 * The list contents are of type {@link game.ObjetTenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Donnes</em>' containment reference list.
	 * @see game.GamePackage#getAction_ObjetDonnes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjetTenu> getObjetDonnes();

	/**
	 * Returns the value of the '<em><b>Objets Donnes</b></em>' containment reference list.
	 * The list contents are of type {@link game.ObjetTenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objets Donnes</em>' containment reference list.
	 * @see game.GamePackage#getAction_ObjetsDonnes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjetTenu> getObjetsDonnes();

	/**
	 * Returns the value of the '<em><b>Connaissances</b></em>' reference list.
	 * The list contents are of type {@link game.Connaissance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connaissances</em>' reference list.
	 * @see game.GamePackage#getAction_Connaissances()
	 * @model
	 * @generated
	 */
	EList<Connaissance> getConnaissances();

} // Action
