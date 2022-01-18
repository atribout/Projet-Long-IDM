/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Lieu#getName <em>Name</em>}</li>
 *   <li>{@link game.Lieu#getType <em>Type</em>}</li>
 *   <li>{@link game.Lieu#getPnjs <em>Pnjs</em>}</li>
 *   <li>{@link game.Lieu#getObjets <em>Objets</em>}</li>
 *   <li>{@link game.Lieu#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getLieu()
 * @model
 * @generated
 */
public interface Lieu extends JeuElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getLieu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.Lieu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link game.typePlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see game.typePlace
	 * @see #setType(typePlace)
	 * @see game.GamePackage#getLieu_Type()
	 * @model
	 * @generated
	 */
	typePlace getType();

	/**
	 * Sets the value of the '{@link game.Lieu#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see game.typePlace
	 * @see #getType()
	 * @generated
	 */
	void setType(typePlace value);

	/**
	 * Returns the value of the '<em><b>Pnjs</b></em>' containment reference list.
	 * The list contents are of type {@link game.PNJ}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnjs</em>' containment reference list.
	 * @see game.GamePackage#getLieu_Pnjs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PNJ> getPnjs();

	/**
	 * Returns the value of the '<em><b>Objets</b></em>' containment reference list.
	 * The list contents are of type {@link game.ObjetTenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objets</em>' containment reference list.
	 * @see game.GamePackage#getLieu_Objets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjetTenu> getObjets();

	/**
	 * Returns the value of the '<em><b>Connaissances</b></em>' reference list.
	 * The list contents are of type {@link game.Connaissance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connaissances</em>' reference list.
	 * @see game.GamePackage#getLieu_Connaissances()
	 * @model
	 * @generated
	 */
	EList<Connaissance> getConnaissances();

} // Lieu
