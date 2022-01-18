/**
 */
package game.impl;

import game.Connaissance;
import game.GamePackage;
import game.Lieu;
import game.ObjetTenu;
import game.PNJ;
import game.typePlace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.LieuImpl#getName <em>Name</em>}</li>
 *   <li>{@link game.impl.LieuImpl#getType <em>Type</em>}</li>
 *   <li>{@link game.impl.LieuImpl#getPnjs <em>Pnjs</em>}</li>
 *   <li>{@link game.impl.LieuImpl#getObjets <em>Objets</em>}</li>
 *   <li>{@link game.impl.LieuImpl#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LieuImpl extends JeuElementImpl implements Lieu {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final typePlace TYPE_EDEFAULT = typePlace.DEBUT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected typePlace type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPnjs() <em>Pnjs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnjs()
	 * @generated
	 * @ordered
	 */
	protected EList<PNJ> pnjs;

	/**
	 * The cached value of the '{@link #getObjets() <em>Objets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjets()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjetTenu> objets;

	/**
	 * The cached value of the '{@link #getConnaissances() <em>Connaissances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnaissances()
	 * @generated
	 * @ordered
	 */
	protected EList<Connaissance> connaissances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LieuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.LIEU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LIEU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typePlace getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(typePlace newType) {
		typePlace oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LIEU__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PNJ> getPnjs() {
		if (pnjs == null) {
			pnjs = new EObjectContainmentEList<PNJ>(PNJ.class, this, GamePackage.LIEU__PNJS);
		}
		return pnjs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetTenu> getObjets() {
		if (objets == null) {
			objets = new EObjectContainmentEList<ObjetTenu>(ObjetTenu.class, this, GamePackage.LIEU__OBJETS);
		}
		return objets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connaissance> getConnaissances() {
		if (connaissances == null) {
			connaissances = new EObjectResolvingEList<Connaissance>(Connaissance.class, this, GamePackage.LIEU__CONNAISSANCES);
		}
		return connaissances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.LIEU__PNJS:
				return ((InternalEList<?>)getPnjs()).basicRemove(otherEnd, msgs);
			case GamePackage.LIEU__OBJETS:
				return ((InternalEList<?>)getObjets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamePackage.LIEU__NAME:
				return getName();
			case GamePackage.LIEU__TYPE:
				return getType();
			case GamePackage.LIEU__PNJS:
				return getPnjs();
			case GamePackage.LIEU__OBJETS:
				return getObjets();
			case GamePackage.LIEU__CONNAISSANCES:
				return getConnaissances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamePackage.LIEU__NAME:
				setName((String)newValue);
				return;
			case GamePackage.LIEU__TYPE:
				setType((typePlace)newValue);
				return;
			case GamePackage.LIEU__PNJS:
				getPnjs().clear();
				getPnjs().addAll((Collection<? extends PNJ>)newValue);
				return;
			case GamePackage.LIEU__OBJETS:
				getObjets().clear();
				getObjets().addAll((Collection<? extends ObjetTenu>)newValue);
				return;
			case GamePackage.LIEU__CONNAISSANCES:
				getConnaissances().clear();
				getConnaissances().addAll((Collection<? extends Connaissance>)newValue);
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
			case GamePackage.LIEU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.LIEU__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GamePackage.LIEU__PNJS:
				getPnjs().clear();
				return;
			case GamePackage.LIEU__OBJETS:
				getObjets().clear();
				return;
			case GamePackage.LIEU__CONNAISSANCES:
				getConnaissances().clear();
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
			case GamePackage.LIEU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.LIEU__TYPE:
				return type != TYPE_EDEFAULT;
			case GamePackage.LIEU__PNJS:
				return pnjs != null && !pnjs.isEmpty();
			case GamePackage.LIEU__OBJETS:
				return objets != null && !objets.isEmpty();
			case GamePackage.LIEU__CONNAISSANCES:
				return connaissances != null && !connaissances.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LieuImpl
