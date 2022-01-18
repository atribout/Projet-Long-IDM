/**
 */
package game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>type Place</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see game.GamePackage#gettypePlace()
 * @model
 * @generated
 */
public enum typePlace implements Enumerator {
	/**
	 * The '<em><b>Debut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUT_VALUE
	 * @generated
	 * @ordered
	 */
	DEBUT(0, "debut", "debut"),

	/**
	 * The '<em><b>Fin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIN_VALUE
	 * @generated
	 * @ordered
	 */
	FIN(1, "fin", "fin"),

	/**
	 * The '<em><b>Intermediaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIAIRE(2, "intermediaire", "intermediaire");

	/**
	 * The '<em><b>Debut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUT
	 * @model name="debut"
	 * @generated
	 * @ordered
	 */
	public static final int DEBUT_VALUE = 0;

	/**
	 * The '<em><b>Fin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIN
	 * @model name="fin"
	 * @generated
	 * @ordered
	 */
	public static final int FIN_VALUE = 1;

	/**
	 * The '<em><b>Intermediaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIAIRE
	 * @model name="intermediaire"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIAIRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>type Place</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final typePlace[] VALUES_ARRAY =
		new typePlace[] {
			DEBUT,
			FIN,
			INTERMEDIAIRE,
		};

	/**
	 * A public read-only list of all the '<em><b>type Place</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<typePlace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>type Place</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static typePlace get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typePlace result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Place</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static typePlace getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typePlace result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Place</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static typePlace get(int value) {
		switch (value) {
			case DEBUT_VALUE: return DEBUT;
			case FIN_VALUE: return FIN;
			case INTERMEDIAIRE_VALUE: return INTERMEDIAIRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private typePlace(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //typePlace
