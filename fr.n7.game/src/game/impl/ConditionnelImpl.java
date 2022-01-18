/**
 */
package game.impl;

import game.Condition;
import game.Conditionnel;
import game.GamePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditionnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.ConditionnelImpl#getConditionsVisibilite <em>Conditions Visibilite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionnelImpl extends JeuElementImpl implements Conditionnel {
	/**
	 * The cached value of the '{@link #getConditionsVisibilite() <em>Conditions Visibilite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsVisibilite()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditionsVisibilite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.CONDITIONNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditionsVisibilite() {
		if (conditionsVisibilite == null) {
			conditionsVisibilite = new EObjectResolvingEList<Condition>(Condition.class, this, GamePackage.CONDITIONNEL__CONDITIONS_VISIBILITE);
		}
		return conditionsVisibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamePackage.CONDITIONNEL__CONDITIONS_VISIBILITE:
				return getConditionsVisibilite();
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
			case GamePackage.CONDITIONNEL__CONDITIONS_VISIBILITE:
				getConditionsVisibilite().clear();
				getConditionsVisibilite().addAll((Collection<? extends Condition>)newValue);
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
			case GamePackage.CONDITIONNEL__CONDITIONS_VISIBILITE:
				getConditionsVisibilite().clear();
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
			case GamePackage.CONDITIONNEL__CONDITIONS_VISIBILITE:
				return conditionsVisibilite != null && !conditionsVisibilite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionnelImpl
