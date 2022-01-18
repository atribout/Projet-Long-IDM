/**
 */
package game.impl;

import game.Action;
import game.Chemin;
import game.Condition;
import game.GamePackage;
import game.Lieu;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chemin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.CheminImpl#getLieu1 <em>Lieu1</em>}</li>
 *   <li>{@link game.impl.CheminImpl#getLieu2 <em>Lieu2</em>}</li>
 *   <li>{@link game.impl.CheminImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link game.impl.CheminImpl#getConditionsOuverture <em>Conditions Ouverture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheminImpl extends ConditionnelImpl implements Chemin {
	/**
	 * The cached value of the '{@link #getLieu1() <em>Lieu1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu1()
	 * @generated
	 * @ordered
	 */
	protected Lieu lieu1;

	/**
	 * The cached value of the '{@link #getLieu2() <em>Lieu2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu2()
	 * @generated
	 * @ordered
	 */
	protected Lieu lieu2;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getConditionsOuverture() <em>Conditions Ouverture</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsOuverture()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditionsOuverture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.CHEMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu getLieu1() {
		if (lieu1 != null && lieu1.eIsProxy()) {
			InternalEObject oldLieu1 = (InternalEObject)lieu1;
			lieu1 = (Lieu)eResolveProxy(oldLieu1);
			if (lieu1 != oldLieu1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.CHEMIN__LIEU1, oldLieu1, lieu1));
			}
		}
		return lieu1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu basicGetLieu1() {
		return lieu1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieu1(Lieu newLieu1) {
		Lieu oldLieu1 = lieu1;
		lieu1 = newLieu1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CHEMIN__LIEU1, oldLieu1, lieu1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu getLieu2() {
		if (lieu2 != null && lieu2.eIsProxy()) {
			InternalEObject oldLieu2 = (InternalEObject)lieu2;
			lieu2 = (Lieu)eResolveProxy(oldLieu2);
			if (lieu2 != oldLieu2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.CHEMIN__LIEU2, oldLieu2, lieu2));
			}
		}
		return lieu2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu basicGetLieu2() {
		return lieu2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieu2(Lieu newLieu2) {
		Lieu oldLieu2 = lieu2;
		lieu2 = newLieu2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CHEMIN__LIEU2, oldLieu2, lieu2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Action>(Action.class, this, GamePackage.CHEMIN__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditionsOuverture() {
		if (conditionsOuverture == null) {
			conditionsOuverture = new EObjectResolvingEList<Condition>(Condition.class, this, GamePackage.CHEMIN__CONDITIONS_OUVERTURE);
		}
		return conditionsOuverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamePackage.CHEMIN__LIEU1:
				if (resolve) return getLieu1();
				return basicGetLieu1();
			case GamePackage.CHEMIN__LIEU2:
				if (resolve) return getLieu2();
				return basicGetLieu2();
			case GamePackage.CHEMIN__ACTIONS:
				return getActions();
			case GamePackage.CHEMIN__CONDITIONS_OUVERTURE:
				return getConditionsOuverture();
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
			case GamePackage.CHEMIN__LIEU1:
				setLieu1((Lieu)newValue);
				return;
			case GamePackage.CHEMIN__LIEU2:
				setLieu2((Lieu)newValue);
				return;
			case GamePackage.CHEMIN__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case GamePackage.CHEMIN__CONDITIONS_OUVERTURE:
				getConditionsOuverture().clear();
				getConditionsOuverture().addAll((Collection<? extends Condition>)newValue);
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
			case GamePackage.CHEMIN__LIEU1:
				setLieu1((Lieu)null);
				return;
			case GamePackage.CHEMIN__LIEU2:
				setLieu2((Lieu)null);
				return;
			case GamePackage.CHEMIN__ACTIONS:
				getActions().clear();
				return;
			case GamePackage.CHEMIN__CONDITIONS_OUVERTURE:
				getConditionsOuverture().clear();
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
			case GamePackage.CHEMIN__LIEU1:
				return lieu1 != null;
			case GamePackage.CHEMIN__LIEU2:
				return lieu2 != null;
			case GamePackage.CHEMIN__ACTIONS:
				return actions != null && !actions.isEmpty();
			case GamePackage.CHEMIN__CONDITIONS_OUVERTURE:
				return conditionsOuverture != null && !conditionsOuverture.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CheminImpl
