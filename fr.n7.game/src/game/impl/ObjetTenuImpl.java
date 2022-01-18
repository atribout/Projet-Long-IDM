/**
 */
package game.impl;

import game.GamePackage;
import game.Objet;
import game.ObjetTenu;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objet Tenu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.ObjetTenuImpl#getObjet <em>Objet</em>}</li>
 *   <li>{@link game.impl.ObjetTenuImpl#getQuantite <em>Quantite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetTenuImpl extends ConditionnelImpl implements ObjetTenu {
	/**
	 * The cached value of the '{@link #getObjet() <em>Objet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjet()
	 * @generated
	 * @ordered
	 */
	protected Objet objet;

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
	protected ObjetTenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.OBJET_TENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objet getObjet() {
		if (objet != null && objet.eIsProxy()) {
			InternalEObject oldObjet = (InternalEObject)objet;
			objet = (Objet)eResolveProxy(oldObjet);
			if (objet != oldObjet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.OBJET_TENU__OBJET, oldObjet, objet));
			}
		}
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objet basicGetObjet() {
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjet(Objet newObjet) {
		Objet oldObjet = objet;
		objet = newObjet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJET_TENU__OBJET, oldObjet, objet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(int newQuantite) {
		int oldQuantite = quantite;
		quantite = newQuantite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.OBJET_TENU__QUANTITE, oldQuantite, quantite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamePackage.OBJET_TENU__OBJET:
				if (resolve) return getObjet();
				return basicGetObjet();
			case GamePackage.OBJET_TENU__QUANTITE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamePackage.OBJET_TENU__OBJET:
				setObjet((Objet)newValue);
				return;
			case GamePackage.OBJET_TENU__QUANTITE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GamePackage.OBJET_TENU__OBJET:
				setObjet((Objet)null);
				return;
			case GamePackage.OBJET_TENU__QUANTITE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GamePackage.OBJET_TENU__OBJET:
				return objet != null;
			case GamePackage.OBJET_TENU__QUANTITE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantite: ");
		result.append(quantite);
		result.append(')');
		return result.toString();
	}

} //ObjetTenuImpl
