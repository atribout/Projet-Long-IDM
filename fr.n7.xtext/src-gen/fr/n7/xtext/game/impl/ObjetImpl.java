/**
 * generated by Xtext 2.23.0
 */
package fr.n7.xtext.game.impl;

import fr.n7.xtext.game.GamePackage;
import fr.n7.xtext.game.Objet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.xtext.game.impl.ObjetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.xtext.game.impl.ObjetImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link fr.n7.xtext.game.impl.ObjetImpl#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetImpl extends MinimalEObjectImpl.Container implements Objet
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected static final int TAILLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected int taille = TAILLE_EDEFAULT;

  /**
   * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantite()
   * @generated
   * @ordered
   */
  protected static final int QUANTITE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantite()
   * @generated
   * @ordered
   */
  protected int quantite = QUANTITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GamePackage.Literals.OBJET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTaille()
  {
    return taille;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTaille(int newTaille)
  {
    int oldTaille = taille;
    taille = newTaille;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJET__TAILLE, oldTaille, taille));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getQuantite()
  {
    return quantite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantite(int newQuantite)
  {
    int oldQuantite = quantite;
    quantite = newQuantite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJET__QUANTITE, oldQuantite, quantite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GamePackage.OBJET__NAME:
        return getName();
      case GamePackage.OBJET__TAILLE:
        return getTaille();
      case GamePackage.OBJET__QUANTITE:
        return getQuantite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GamePackage.OBJET__NAME:
        setName((String)newValue);
        return;
      case GamePackage.OBJET__TAILLE:
        setTaille((Integer)newValue);
        return;
      case GamePackage.OBJET__QUANTITE:
        setQuantite((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GamePackage.OBJET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamePackage.OBJET__TAILLE:
        setTaille(TAILLE_EDEFAULT);
        return;
      case GamePackage.OBJET__QUANTITE:
        setQuantite(QUANTITE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GamePackage.OBJET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamePackage.OBJET__TAILLE:
        return taille != TAILLE_EDEFAULT;
      case GamePackage.OBJET__QUANTITE:
        return quantite != QUANTITE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", taille: ");
    result.append(taille);
    result.append(", quantite: ");
    result.append(quantite);
    result.append(')');
    return result.toString();
  }

} //ObjetImpl
