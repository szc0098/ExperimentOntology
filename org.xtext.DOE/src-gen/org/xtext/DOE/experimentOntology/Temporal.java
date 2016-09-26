/**
 */
package org.xtext.DOE.experimentOntology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temporal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getTemporal()
 * @model
 * @generated
 */
public enum Temporal implements Enumerator
{
  /**
   * The '<em><b>Precedes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRECEDES_VALUE
   * @generated
   * @ordered
   */
  PRECEDES(0, "precedes", "precedes"),

  /**
   * The '<em><b>Between</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BETWEEN_VALUE
   * @generated
   * @ordered
   */
  BETWEEN(1, "between", "between"),

  /**
   * The '<em><b>Eventually</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVENTUALLY_VALUE
   * @generated
   * @ordered
   */
  EVENTUALLY(2, "eventually", "eventually"),

  /**
   * The '<em><b>Always</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALWAYS_VALUE
   * @generated
   * @ordered
   */
  ALWAYS(3, "always", "always"),

  /**
   * The '<em><b>Before</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_VALUE
   * @generated
   * @ordered
   */
  BEFORE(4, "before", "before"),

  /**
   * The '<em><b>After</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTER_VALUE
   * @generated
   * @ordered
   */
  AFTER(5, "after", "after"),

  /**
   * The '<em><b>Until</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNTIL_VALUE
   * @generated
   * @ordered
   */
  UNTIL(6, "until", "until"),

  /**
   * The '<em><b>Never</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEVER_VALUE
   * @generated
   * @ordered
   */
  NEVER(7, "never", "never"),

  /**
   * The '<em><b>Leads</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEADS_VALUE
   * @generated
   * @ordered
   */
  LEADS(8, "leads", "leads"),

  /**
   * The '<em><b>Absent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSENT_VALUE
   * @generated
   * @ordered
   */
  ABSENT(9, "absent", "absent"),

  /**
   * The '<em><b>Exists</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXISTS_VALUE
   * @generated
   * @ordered
   */
  EXISTS(10, "exists", "exists");

  /**
   * The '<em><b>Precedes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Precedes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRECEDES
   * @model name="precedes"
   * @generated
   * @ordered
   */
  public static final int PRECEDES_VALUE = 0;

  /**
   * The '<em><b>Between</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Between</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BETWEEN
   * @model name="between"
   * @generated
   * @ordered
   */
  public static final int BETWEEN_VALUE = 1;

  /**
   * The '<em><b>Eventually</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Eventually</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EVENTUALLY
   * @model name="eventually"
   * @generated
   * @ordered
   */
  public static final int EVENTUALLY_VALUE = 2;

  /**
   * The '<em><b>Always</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALWAYS
   * @model name="always"
   * @generated
   * @ordered
   */
  public static final int ALWAYS_VALUE = 3;

  /**
   * The '<em><b>Before</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Before</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFORE
   * @model name="before"
   * @generated
   * @ordered
   */
  public static final int BEFORE_VALUE = 4;

  /**
   * The '<em><b>After</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>After</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AFTER
   * @model name="after"
   * @generated
   * @ordered
   */
  public static final int AFTER_VALUE = 5;

  /**
   * The '<em><b>Until</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Until</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNTIL
   * @model name="until"
   * @generated
   * @ordered
   */
  public static final int UNTIL_VALUE = 6;

  /**
   * The '<em><b>Never</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEVER
   * @model name="never"
   * @generated
   * @ordered
   */
  public static final int NEVER_VALUE = 7;

  /**
   * The '<em><b>Leads</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Leads</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEADS
   * @model name="leads"
   * @generated
   * @ordered
   */
  public static final int LEADS_VALUE = 8;

  /**
   * The '<em><b>Absent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Absent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSENT
   * @model name="absent"
   * @generated
   * @ordered
   */
  public static final int ABSENT_VALUE = 9;

  /**
   * The '<em><b>Exists</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exists</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXISTS
   * @model name="exists"
   * @generated
   * @ordered
   */
  public static final int EXISTS_VALUE = 10;

  /**
   * An array of all the '<em><b>Temporal</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Temporal[] VALUES_ARRAY =
    new Temporal[]
    {
      PRECEDES,
      BETWEEN,
      EVENTUALLY,
      ALWAYS,
      BEFORE,
      AFTER,
      UNTIL,
      NEVER,
      LEADS,
      ABSENT,
      EXISTS,
    };

  /**
   * A public read-only list of all the '<em><b>Temporal</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Temporal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Temporal</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Temporal get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Temporal result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Temporal</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Temporal getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Temporal result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Temporal</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Temporal get(int value)
  {
    switch (value)
    {
      case PRECEDES_VALUE: return PRECEDES;
      case BETWEEN_VALUE: return BETWEEN;
      case EVENTUALLY_VALUE: return EVENTUALLY;
      case ALWAYS_VALUE: return ALWAYS;
      case BEFORE_VALUE: return BEFORE;
      case AFTER_VALUE: return AFTER;
      case UNTIL_VALUE: return UNTIL;
      case NEVER_VALUE: return NEVER;
      case LEADS_VALUE: return LEADS;
      case ABSENT_VALUE: return ABSENT;
      case EXISTS_VALUE: return EXISTS;
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
  private Temporal(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Temporal
