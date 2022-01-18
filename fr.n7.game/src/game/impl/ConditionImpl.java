/**
 */
package game.impl;

import game.Condition;
import game.Connaissance;
import game.GamePackage;
import game.ObjetTenu;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.ConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link game.impl.ConditionImpl#isNegation <em>Negation</em>}</li>
 *   <li>{@link game.impl.ConditionImpl#getObjet <em>Objet</em>}</li>
 *   <li>{@link game.impl.ConditionImpl#getConnaissance <em>Connaissance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends JeuElementImpl implements Condition {
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
	 * The default value of the '{@link #isNegation() <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegation() <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegation()
	 * @generated
	 * @ordered
	 */
	protected boolean negation = NEGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjet() <em>Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjet()
	 * @generated
	 * @ordered
	 */
	protected ObjetTenu objet;

	/**
	 * The cached value of the '{@link #getConnaissance() <em>Connaissance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnaissance()
	 * @generated
	 * @ordered
	 */
	protected Connaissance connaissance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegation() {
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegation(boolean newNegation) {
		boolean oldNegation = negation;
		negation = newNegation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONDITION__NEGATION, oldNegation, negation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetTenu getObjet() {
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjet(ObjetTenu newObjet, NotificationChain msgs) {
		ObjetTenu oldObjet = objet;
		objet = newObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.CONDITION__OBJET, oldObjet, newObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjet(ObjetTenu newObjet) {
		if (newObjet != objet) {
			NotificationChain msgs = null;
			if (objet != null)
				msgs = ((InternalEObject)objet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.CONDITION__OBJET, null, msgs);
			if (newObjet != null)
				msgs = ((InternalEObject)newObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.CONDITION__OBJET, null, msgs);
			msgs = basicSetObjet(newObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONDITION__OBJET, newObjet, newObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connaissance getConnaissance() {
		if (connaissance != null && connaissance.eIsProxy()) {
			InternalEObject oldConnaissance = (InternalEObject)connaissance;
			connaissance = (Connaissance)eResolveProxy(oldConnaissance);
			if (connaissance != oldConnaissance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.CONDITION__CONNAISSANCE, oldConnaissance, connaissance));
			}
		}
		return connaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connaissance basicGetConnaissance() {
		return connaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnaissance(Connaissance newConnaissance) {
		Connaissance oldConnaissance = connaissance;
		connaissance = newConnaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONDITION__CONNAISSANCE, oldConnaissance, connaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.CONDITION__OBJET:
				return basicSetObjet(null, msgs);
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
			case GamePackage.CONDITION__NAME:
				return getName();
			case GamePackage.CONDITION__NEGATION:
				return isNegation();
			case GamePackage.CONDITION__OBJET:
				return getObjet();
			case GamePackage.CONDITION__CONNAISSANCE:
				if (resolve) return getConnaissance();
				return basicGetConnaissance();
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
			case GamePackage.CONDITION__NAME:
				setName((String)newValue);
				return;
			case GamePackage.CONDITION__NEGATION:
				setNegation((Boolean)newValue);
				return;
			case GamePackage.CONDITION__OBJET:
				setObjet((ObjetTenu)newValue);
				return;
			case GamePackage.CONDITION__CONNAISSANCE:
				setConnaissance((Connaissance)newValue);
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
			case GamePackage.CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.CONDITION__NEGATION:
				setNegation(NEGATION_EDEFAULT);
				return;
			case GamePackage.CONDITION__OBJET:
				setObjet((ObjetTenu)null);
				return;
			case GamePackage.CONDITION__CONNAISSANCE:
				setConnaissance((Connaissance)null);
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
			case GamePackage.CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.CONDITION__NEGATION:
				return negation != NEGATION_EDEFAULT;
			case GamePackage.CONDITION__OBJET:
				return objet != null;
			case GamePackage.CONDITION__CONNAISSANCE:
				return connaissance != null;
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
		result.append(", negation: ");
		result.append(negation);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl