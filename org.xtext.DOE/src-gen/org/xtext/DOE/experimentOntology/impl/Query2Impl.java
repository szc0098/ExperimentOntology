/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Function;
import org.xtext.DOE.experimentOntology.Query2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query2Impl#getFunction1 <em>Function1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query2Impl#getResponse1 <em>Response1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query2Impl#getFactor1 <em>Factor1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query2Impl#getFunction2 <em>Function2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query2Impl#getResponse2 <em>Response2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query2Impl#getFactor2 <em>Factor2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Query2Impl extends RelationalQueryImpl implements Query2
{
  /**
   * The default value of the '{@link #getFunction1() <em>Function1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction1()
   * @generated
   * @ordered
   */
  protected static final Function FUNCTION1_EDEFAULT = Function.MIN;

  /**
   * The cached value of the '{@link #getFunction1() <em>Function1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction1()
   * @generated
   * @ordered
   */
  protected Function function1 = FUNCTION1_EDEFAULT;

  /**
   * The default value of the '{@link #getResponse1() <em>Response1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse1()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponse1() <em>Response1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse1()
   * @generated
   * @ordered
   */
  protected String response1 = RESPONSE1_EDEFAULT;

  /**
   * The default value of the '{@link #getFactor1() <em>Factor1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor1()
   * @generated
   * @ordered
   */
  protected static final String FACTOR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactor1() <em>Factor1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor1()
   * @generated
   * @ordered
   */
  protected String factor1 = FACTOR1_EDEFAULT;

  /**
   * The default value of the '{@link #getFunction2() <em>Function2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction2()
   * @generated
   * @ordered
   */
  protected static final Function FUNCTION2_EDEFAULT = Function.MIN;

  /**
   * The cached value of the '{@link #getFunction2() <em>Function2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction2()
   * @generated
   * @ordered
   */
  protected Function function2 = FUNCTION2_EDEFAULT;

  /**
   * The default value of the '{@link #getResponse2() <em>Response2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse2()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponse2() <em>Response2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse2()
   * @generated
   * @ordered
   */
  protected String response2 = RESPONSE2_EDEFAULT;

  /**
   * The default value of the '{@link #getFactor2() <em>Factor2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor2()
   * @generated
   * @ordered
   */
  protected static final String FACTOR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactor2() <em>Factor2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor2()
   * @generated
   * @ordered
   */
  protected String factor2 = FACTOR2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Query2Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExperimentOntologyPackage.Literals.QUERY2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunction1()
  {
    return function1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction1(Function newFunction1)
  {
    Function oldFunction1 = function1;
    function1 = newFunction1 == null ? FUNCTION1_EDEFAULT : newFunction1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY2__FUNCTION1, oldFunction1, function1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponse1()
  {
    return response1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse1(String newResponse1)
  {
    String oldResponse1 = response1;
    response1 = newResponse1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY2__RESPONSE1, oldResponse1, response1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactor1()
  {
    return factor1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor1(String newFactor1)
  {
    String oldFactor1 = factor1;
    factor1 = newFactor1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY2__FACTOR1, oldFactor1, factor1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunction2()
  {
    return function2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction2(Function newFunction2)
  {
    Function oldFunction2 = function2;
    function2 = newFunction2 == null ? FUNCTION2_EDEFAULT : newFunction2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY2__FUNCTION2, oldFunction2, function2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponse2()
  {
    return response2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse2(String newResponse2)
  {
    String oldResponse2 = response2;
    response2 = newResponse2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY2__RESPONSE2, oldResponse2, response2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactor2()
  {
    return factor2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor2(String newFactor2)
  {
    String oldFactor2 = factor2;
    factor2 = newFactor2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY2__FACTOR2, oldFactor2, factor2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.QUERY2__FUNCTION1:
        return getFunction1();
      case ExperimentOntologyPackage.QUERY2__RESPONSE1:
        return getResponse1();
      case ExperimentOntologyPackage.QUERY2__FACTOR1:
        return getFactor1();
      case ExperimentOntologyPackage.QUERY2__FUNCTION2:
        return getFunction2();
      case ExperimentOntologyPackage.QUERY2__RESPONSE2:
        return getResponse2();
      case ExperimentOntologyPackage.QUERY2__FACTOR2:
        return getFactor2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.QUERY2__FUNCTION1:
        setFunction1((Function)newValue);
        return;
      case ExperimentOntologyPackage.QUERY2__RESPONSE1:
        setResponse1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY2__FACTOR1:
        setFactor1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY2__FUNCTION2:
        setFunction2((Function)newValue);
        return;
      case ExperimentOntologyPackage.QUERY2__RESPONSE2:
        setResponse2((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY2__FACTOR2:
        setFactor2((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.QUERY2__FUNCTION1:
        setFunction1(FUNCTION1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY2__RESPONSE1:
        setResponse1(RESPONSE1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY2__FACTOR1:
        setFactor1(FACTOR1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY2__FUNCTION2:
        setFunction2(FUNCTION2_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY2__RESPONSE2:
        setResponse2(RESPONSE2_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY2__FACTOR2:
        setFactor2(FACTOR2_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.QUERY2__FUNCTION1:
        return function1 != FUNCTION1_EDEFAULT;
      case ExperimentOntologyPackage.QUERY2__RESPONSE1:
        return RESPONSE1_EDEFAULT == null ? response1 != null : !RESPONSE1_EDEFAULT.equals(response1);
      case ExperimentOntologyPackage.QUERY2__FACTOR1:
        return FACTOR1_EDEFAULT == null ? factor1 != null : !FACTOR1_EDEFAULT.equals(factor1);
      case ExperimentOntologyPackage.QUERY2__FUNCTION2:
        return function2 != FUNCTION2_EDEFAULT;
      case ExperimentOntologyPackage.QUERY2__RESPONSE2:
        return RESPONSE2_EDEFAULT == null ? response2 != null : !RESPONSE2_EDEFAULT.equals(response2);
      case ExperimentOntologyPackage.QUERY2__FACTOR2:
        return FACTOR2_EDEFAULT == null ? factor2 != null : !FACTOR2_EDEFAULT.equals(factor2);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (function1: ");
    result.append(function1);
    result.append(", response1: ");
    result.append(response1);
    result.append(", factor1: ");
    result.append(factor1);
    result.append(", function2: ");
    result.append(function2);
    result.append(", response2: ");
    result.append(response2);
    result.append(", factor2: ");
    result.append(factor2);
    result.append(')');
    return result.toString();
  }

} //Query2Impl
