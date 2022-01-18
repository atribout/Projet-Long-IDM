/**
 */
package game.impl;

import game.Action;
import game.Connaissance;
import game.GamePackage;
import game.ObjetTenu;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link game.impl.ActionImpl#getObjetsConsommes <em>Objets Consommes</em>}</li>
 *   <li>{@link game.impl.ActionImpl#getObjetDonnes <em>Objet Donnes</em>}</li>
 *   <li>{@link game.impl.ActionImpl#getObjetsDonnes <em>Objets Donnes</em>}</li>
 *   <li>{@link game.impl.ActionImpl#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends JeuElementImpl implements Action {
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
	 * The cached value of the '{@link #getObjetsConsommes() <em>Objets Consommes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetsConsommes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjetTenu> objetsConsommes;

	/**
	 * The cached value of the '{@link #getObjetDonnes() <em>Objet Donnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetDonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjetTenu> objetDonnes;

	/**
	 * The cached value of the '{@link #getObjetsDonnes() <em>Objets Donnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetsDonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjetTenu> objetsDonnes;

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
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetTenu> getObjetsConsommes() {
		if (objetsConsommes == null) {
			objetsConsommes = new EObjectContainmentEList<ObjetTenu>(ObjetTenu.class, this, GamePackage.ACTION__OBJETS_CONSOMMES);
		}
		return objetsConsommes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetTenu> getObjetDonnes() {
		if (objetDonnes == null) {
			objetDonnes = new EObjectContainmentEList<ObjetTenu>(ObjetTenu.class, this, GamePackage.ACTION__OBJET_DONNES);
		}
		return objetDonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetTenu> getObjetsDonnes() {
		if (objetsDonnes == null) {
			objetsDonnes = new EObjectContainmentEList<ObjetTenu>(ObjetTenu.class, this, GamePackage.ACTION__OBJETS_DONNES);
		}
		return objetsDonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connaissance> getConnaissances() {
		if (connaissances == null) {
			connaissances = new EObjectResolvingEList<Connaissance>(Connaissance.class, this, GamePackage.ACTION__CONNAISSANCES);
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
			case GamePackage.ACTION__OBJETS_CONSOMMES:
				return ((InternalEList<?>)getObjetsConsommes()).basicRemove(otherEnd, msgs);
			case GamePackage.ACTION__OBJET_DONNES:
				return ((InternalEList<?>)getObjetDonnes()).basicRemove(otherEnd, msgs);
			case GamePackage.ACTION__OBJETS_DONNES:
				return ((InternalEList<?>)getObjetsDonnes()).basicRemove(otherEnd, msgs);
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
			case GamePackage.ACTION__NAME:
				return getName();
			case GamePackage.ACTION__OBJETS_CONSOMMES:
				return getObjetsConsommes();
			case GamePackage.ACTION__OBJET_DONNES:
				return getObjetDonnes();
			case GamePackage.ACTION__OBJETS_DONNES:
				return getObjetsDonnes();
			case GamePackage.ACTION__CONNAISSANCES:
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
			case GamePackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case GamePackage.ACTION__OBJETS_CONSOMMES:
				getObjetsConsommes().clear();
				getObjetsConsommes().addAll((Collection<? extends ObjetTenu>)newValue);
				return;
			case GamePackage.ACTION__OBJET_DONNES:
				getObjetDonnes().clear();
				getObjetDonnes().addAll((Collection<? extends ObjetTenu>)newValue);
				return;
			case GamePackage.ACTION__OBJETS_DONNES:
				getObjetsDonnes().clear();
				getObjetsDonnes().addAll((Collection<? extends ObjetTenu>)newValue);
				return;
			case GamePackage.ACTION__CONNAISSANCES:
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
			case GamePackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.ACTION__OBJETS_CONSOMMES:
				getObjetsConsommes().clear();
				return;
			case GamePackage.ACTION__OBJET_DONNES:
				getObjetDonnes().clear();
				return;
			case GamePackage.ACTION__OBJETS_DONNES:
				getObjetsDonnes().clear();
				return;
			case GamePackage.ACTION__CONNAISSANCES:
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
			case GamePackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.ACTION__OBJETS_CONSOMMES:
				return objetsConsommes != null && !objetsConsommes.isEmpty();
			case GamePackage.ACTION__OBJET_DONNES:
				return objetDonnes != null && !objetDonnes.isEmpty();
			case GamePackage.ACTION__OBJETS_DONNES:
				return objetsDonnes != null && !objetsDonnes.isEmpty();
			case GamePackage.ACTION__CONNAISSANCES:
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
		result.append(')');
		return result.toString();
	}

} //ActionImpl
