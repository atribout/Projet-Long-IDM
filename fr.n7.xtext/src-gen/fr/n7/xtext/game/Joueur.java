/**
 * generated by Xtext 2.23.0
 */
package fr.n7.xtext.game;

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
 *   <li>{@link fr.n7.xtext.game.Joueur#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.xtext.game.Joueur#getLieu <em>Lieu</em>}</li>
 *   <li>{@link fr.n7.xtext.game.Joueur#getTaille <em>Taille</em>}</li>
 *   <li>{@link fr.n7.xtext.game.Joueur#getInventaire <em>Inventaire</em>}</li>
 *   <li>{@link fr.n7.xtext.game.Joueur#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @see fr.n7.xtext.game.GamePackage#getJoueur()
 * @model
 * @generated
 */
public interface Joueur extends JeuElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.xtext.game.GamePackage#getJoueur_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.xtext.game.Joueur#getName <em>Name</em>}' attribute.
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
   * @see fr.n7.xtext.game.GamePackage#getJoueur_Lieu()
   * @model
   * @generated
   */
  Lieu getLieu();

  /**
   * Sets the value of the '{@link fr.n7.xtext.game.Joueur#getLieu <em>Lieu</em>}' reference.
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
   * @see fr.n7.xtext.game.GamePackage#getJoueur_Taille()
   * @model
   * @generated
   */
  int getTaille();

  /**
   * Sets the value of the '{@link fr.n7.xtext.game.Joueur#getTaille <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Taille</em>' attribute.
   * @see #getTaille()
   * @generated
   */
  void setTaille(int value);

  /**
   * Returns the value of the '<em><b>Inventaire</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.xtext.game.ObjetTenu}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inventaire</em>' containment reference list.
   * @see fr.n7.xtext.game.GamePackage#getJoueur_Inventaire()
   * @model containment="true"
   * @generated
   */
  EList<ObjetTenu> getInventaire();

  /**
   * Returns the value of the '<em><b>Connaissances</b></em>' reference list.
   * The list contents are of type {@link fr.n7.xtext.game.Connaissance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connaissances</em>' reference list.
   * @see fr.n7.xtext.game.GamePackage#getJoueur_Connaissances()
   * @model
   * @generated
   */
  EList<Connaissance> getConnaissances();

} // Joueur
