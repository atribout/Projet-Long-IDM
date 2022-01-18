/**
 */
package game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joueur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.Joueur#getName <em>Name</em>}</li>
 *   <li>{@link game.Joueur#getLieu <em>Lieu</em>}</li>
 *   <li>{@link game.Joueur#getTaille <em>Taille</em>}</li>
 *   <li>{@link game.Joueur#getInventaire <em>Inventaire</em>}</li>
 *   <li>{@link game.Joueur#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getJoueur()
 * @model
 * @generated
 */
public interface Joueur extends JeuElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see game.GamePackage#getJoueur_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link game.Joueur#getName <em>Name</em>}' attribute.
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
	 * @see game.GamePackage#getJoueur_Lieu()
	 * @model
	 * @generated
	 */
	Lieu getLieu();

	/**
	 * Sets the value of the '{@link game.Joueur#getLieu <em>Lieu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu</em>' reference.
	 * @see #getLieu()
	 * @generated
	 */
	void setLieu(Lieu value);

	/**
	 * Returns the value of the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille</em>' attribute.
	 * @see #setTaille(int)
	 * @see game.GamePackage#getJoueur_Taille()
	 * @model
	 * @generated
	 */
	int getTaille();

	/**
	 * Sets the value of the '{@link game.Joueur#getTaille <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille</em>' attribute.
	 * @see #getTaille()
	 * @generated
	 */
	void setTaille(int value);

	/**
	 * Returns the value of the '<em><b>Inventaire</b></em>' containment reference list.
	 * The list contents are of type {@link game.ObjetTenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventaire</em>' containment reference list.
	 * @see game.GamePackage#getJoueur_Inventaire()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjetTenu> getInventaire();

	/**
	 * Returns the value of the '<em><b>Connaissances</b></em>' reference list.
	 * The list contents are of type {@link game.Connaissance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connaissances</em>' reference list.
	 * @see game.GamePackage#getJoueur_Connaissances()
	 * @model
	 * @generated
	 */
	EList<Connaissance> getConnaissances();

} // Joueur
