/**
 * generated by Xtext 2.23.0
 */
package fr.n7.xtext.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.xtext.game.Choix#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.n7.xtext.game.Choix#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see fr.n7.xtext.game.GamePackage#getChoix()
 * @model
 * @generated
 */
public interface Choix extends Conditionnel
{
  /**
   * Returns the value of the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texte</em>' attribute.
   * @see #setTexte(String)
   * @see fr.n7.xtext.game.GamePackage#getChoix_Texte()
   * @model
   * @generated
   */
  String getTexte();

  /**
   * Sets the value of the '{@link fr.n7.xtext.game.Choix#getTexte <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texte</em>' attribute.
   * @see #getTexte()
   * @generated
   */
  void setTexte(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link fr.n7.xtext.game.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see fr.n7.xtext.game.GamePackage#getChoix_Actions()
   * @model
   * @generated
   */
  EList<Action> getActions();

} // Choix
