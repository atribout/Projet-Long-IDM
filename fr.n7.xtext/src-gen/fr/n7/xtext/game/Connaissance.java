/**
 * generated by Xtext 2.23.0
 */
package fr.n7.xtext.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.xtext.game.Connaissance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.n7.xtext.game.GamePackage#getConnaissance()
 * @model
 * @generated
 */
public interface Connaissance extends Conditionnel
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.xtext.game.GamePackage#getConnaissance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.xtext.game.Connaissance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Connaissance
