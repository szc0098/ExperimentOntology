/**
 */
package org.xtext.DOE.experimentOntology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variable Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getVariableType()
 * @model
 * @generated
 */
public enum VariableType implements Enumerator
{
  /**
   * The '<em><b>QUALITATIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUALITATIVE_VALUE
   * @generated
   * @ordered
   */
  QUALITATIVE(0, "QUALITATIVE", "QUALITATIVE"),

  /**
   * The '<em><b>QUANTITATIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUANTITATIVE_VALUE
   * @generated
   * @ordered
   */
  QUANTITATIVE(1, "QUANTITATIVE", "QUANTITATIVE"),

  /**
   * The '<em><b>CONTINOUS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTINOUS_VALUE
   * @generated
   * @ordered
   */
  CONTINOUS(2, "CONTINOUS", "CONTINOUS"),

  /**
   * The '<em><b>DISCRETE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISCRETE_VALUE
   * @generated
   * @ordered
   */
  DISCRETE(3, "DISCRETE", "DISCRETE"),

  /**
   * The '<em><b>BINARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BINARY_VALUE
   * @generated
   * @ordered
   */
  BINARY(4, "BINARY", "BINARY"),

  /**
   * The '<em><b>NONBINARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONBINARY_VALUE
   * @generated
   * @ordered
   */
  NONBINARY(5, "NONBINARY", "NONBINARY");

  /**
   * The '<em><b>QUALITATIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>QUALITATIVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #QUALITATIVE
   * @model
   * @generated
   * @ordered
   */
  public static final int QUALITATIVE_VALUE = 0;

  /**
   * The '<em><b>QUANTITATIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>QUANTITATIVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #QUANTITATIVE
   * @model
   * @generated
   * @ordered
   */
  public static final int QUANTITATIVE_VALUE = 1;

  /**
   * The '<em><b>CONTINOUS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONTINOUS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTINOUS
   * @model
   * @generated
   * @ordered
   */
  public static final int CONTINOUS_VALUE = 2;

  /**
   * The '<em><b>DISCRETE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DISCRETE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISCRETE
   * @model
   * @generated
   * @ordered
   */
  public static final int DISCRETE_VALUE = 3;

  /**
   * The '<em><b>BINARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BINARY
   * @model
   * @generated
   * @ordered
   */
  public static final int BINARY_VALUE = 4;

  /**
   * The '<em><b>NONBINARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONBINARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONBINARY
   * @model
   * @generated
   * @ordered
   */
  public static final int NONBINARY_VALUE = 5;

  /**
   * An array of all the '<em><b>Variable Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VariableType[] VALUES_ARRAY =
    new VariableType[]
    {
      QUALITATIVE,
      QUANTITATIVE,
      CONTINOUS,
      DISCRETE,
      BINARY,
      NONBINARY,
    };

  /**
   * A public read-only list of all the '<em><b>Variable Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VariableType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Variable Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariableType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VariableType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Variable Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariableType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VariableType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Variable Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariableType get(int value)
  {
    switch (value)
    {
      case QUALITATIVE_VALUE: return QUALITATIVE;
      case QUANTITATIVE_VALUE: return QUANTITATIVE;
      case CONTINOUS_VALUE: return CONTINOUS;
      case DISCRETE_VALUE: return DISCRETE;
      case BINARY_VALUE: return BINARY;
      case NONBINARY_VALUE: return NONBINARY;
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
  private VariableType(int value, String name, String literal)
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
  
} //VariableType
