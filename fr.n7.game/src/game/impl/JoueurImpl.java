/**
 */
package game.impl;

import game.Connaissance;
import game.GamePackage;
import game.Joueur;
import game.Lieu;
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
 * An implementation of the model object '<em><b>Joueur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.JoueurImpl#getName <em>Name</em>}</li>
 *   <li>{@link game.impl.JoueurImpl#getLieu <em>Lieu</em>}</li>
 *   <li>{@link game.impl.JoueurImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link game.impl.JoueurImpl#getInventaire <em>Inventaire</em>}</li>
 *   <li>{@link game.impl.JoueurImpl#getConnaissances <em>Connaissances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoueurImpl extends JeuElementImpl implements Joueur {
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
	 * The cached value of the '{@link #getLieu() <em>Lieu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu()
	 * @generated
	 * @ordered
	 */
	protected Lieu lieu;

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
	 * The cached value of the '{@link #getInventaire() <em>Inventaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventaire()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjetTenu> inventaire;

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
	protected JoueurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.JOUEUR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.JOUEUR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu getLieu() {
		if (lieu != null && lieu.eIsProxy()) {
			InternalEObject oldLieu = (InternalEObject)lieu;
			lieu = (Lieu)eResolveProxy(oldLieu);
			if (lieu != oldLieu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.JOUEUR__LIEU, oldLieu, lieu));
			}
		}
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu basicGetLieu() {
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieu(Lieu newLieu) {
		Lieu oldLieu = lieu;
		lieu = newLieu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.JOUEUR__LIEU, oldLieu, lieu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaille(int newTaille) {
		int oldTaille = taille;
		taille = newTaille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.JOUEUR__TAILLE, oldTaille, taille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetTenu> getInventaire() {
		if (inventaire == null) {
			inventaire = new EObjectContainmentEList<ObjetTenu>(ObjetTenu.class, this, GamePackage.JOUEUR__INVENTAIRE);
		}
		return inventaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connaissance> getConnaissances() {
		if (connaissances == null) {
			connaissances = new EObjectResolvingEList<Connaissance>(Connaissance.class, this, GamePackage.JOUEUR__CONNAISSANCES);
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
			case GamePackage.JOUEUR__INVENTAIRE:
				return ((InternalEList<?>)getInventaire()).basicRemove(otherEnd, msgs);
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
			case GamePackage.JOUEUR__NAME:
				return getName();
			case GamePackage.JOUEUR__LIEU:
				if (resolve) return getLieu();
				return basicGetLieu();
			case GamePackage.JOUEUR__TAILLE:
				return getTaille();
			case GamePackage.JOUEUR__INVENTAIRE:
				return getInventaire();
			case GamePackage.JOUEUR__CONNAISSANCES:
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
			case GamePackage.JOUEUR__NAME:
				setName((String)newValue);
				return;
			case GamePackage.JOUEUR__LIEU:
				setLieu((Lieu)newValue);
				return;
			case GamePackage.JOUEUR__TAILLE:
				setTaille((Integer)newValue);
				return;
			case GamePackage.JOUEUR__INVENTAIRE:
				getInventaire().clear();
				getInventaire().addAll((Collection<? extends ObjetTenu>)newValue);
				return;
			case GamePackage.JOUEUR__CONNAISSANCES:
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
			case GamePackage.JOUEUR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.JOUEUR__LIEU:
				setLieu((Lieu)null);
				return;
			case GamePackage.JOUEUR__TAILLE:
				setTaille(TAILLE_EDEFAULT);
				return;
			case GamePackage.JOUEUR__INVENTAIRE:
				getInventaire().clear();
				return;
			case GamePackage.JOUEUR__CONNAISSANCES:
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
			case GamePackage.JOUEUR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.JOUEUR__LIEU:
				return lieu != null;
			case GamePackage.JOUEUR__TAILLE:
				return taille != TAILLE_EDEFAULT;
			case GamePackage.JOUEUR__INVENTAIRE:
				return inventaire != null && !inventaire.isEmpty();
			case GamePackage.JOUEUR__CONNAISSANCES:
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
		result.append(", taille: ");
		result.append(taille);
		result.append(')');
		return result.toString();
	}

} //JoueurImpl
