/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Query1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getControl <em>Control</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getStart1 <em>Start1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getEnd1 <em>End1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getY <em>Y</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getStart2 <em>Start2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query1Impl#getEnd2 <em>End2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Query1Impl extends RelationalQueryImpl implements Query1
{
  /**
   * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected static final String FACTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected String factor = FACTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected String control = CONTROL_EDEFAULT;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final String X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected String x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getStart1() <em>Start1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart1()
   * @generated
   * @ordered
   */
  protected static final String START1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart1() <em>Start1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart1()
   * @generated
   * @ordered
   */
  protected String start1 = START1_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd1() <em>End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd1()
   * @generated
   * @ordered
   */
  protected static final String END1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd1() <em>End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd1()
   * @generated
   * @ordered
   */
  protected String end1 = END1_EDEFAULT;

  /**
   * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected String response = RESPONSE_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final String Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected String y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getStart2() <em>Start2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart2()
   * @generated
   * @ordered
   */
  protected static final String START2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart2() <em>Start2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart2()
   * @generated
   * @ordered
   */
  protected String start2 = START2_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd2() <em>End2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd2()
   * @generated
   * @ordered
   */
  protected static final String END2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd2() <em>End2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd2()
   * @generated
   * @ordered
   */
  protected String end2 = END2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Query1Impl()
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
    return ExperimentOntologyPackage.Literals.QUERY1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(String newFactor)
  {
    String oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__FACTOR, oldFactor, factor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl(String newControl)
  {
    String oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(String newX)
  {
    String oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStart1()
  {
    return start1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart1(String newStart1)
  {
    String oldStart1 = start1;
    start1 = newStart1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__START1, oldStart1, start1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd1()
  {
    return end1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd1(String newEnd1)
  {
    String oldEnd1 = end1;
    end1 = newEnd1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__END1, oldEnd1, end1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponse()
  {
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse(String newResponse)
  {
    String oldResponse = response;
    response = newResponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__RESPONSE, oldResponse, response));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(String newY)
  {
    String oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStart2()
  {
    return start2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart2(String newStart2)
  {
    String oldStart2 = start2;
    start2 = newStart2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__START2, oldStart2, start2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd2()
  {
    return end2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd2(String newEnd2)
  {
    String oldEnd2 = end2;
    end2 = newEnd2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY1__END2, oldEnd2, end2));
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
      case ExperimentOntologyPackage.QUERY1__FACTOR:
        return getFactor();
      case ExperimentOntologyPackage.QUERY1__CONTROL:
        return getControl();
      case ExperimentOntologyPackage.QUERY1__X:
        return getX();
      case ExperimentOntologyPackage.QUERY1__START1:
        return getStart1();
      case ExperimentOntologyPackage.QUERY1__END1:
        return getEnd1();
      case ExperimentOntologyPackage.QUERY1__RESPONSE:
        return getResponse();
      case ExperimentOntologyPackage.QUERY1__Y:
        return getY();
      case ExperimentOntologyPackage.QUERY1__START2:
        return getStart2();
      case ExperimentOntologyPackage.QUERY1__END2:
        return getEnd2();
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
      case ExperimentOntologyPackage.QUERY1__FACTOR:
        setFactor((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__CONTROL:
        setControl((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__X:
        setX((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__START1:
        setStart1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__END1:
        setEnd1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__RESPONSE:
        setResponse((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__Y:
        setY((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__START2:
        setStart2((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY1__END2:
        setEnd2((String)newValue);
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
      case ExperimentOntologyPackage.QUERY1__FACTOR:
        setFactor(FACTOR_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__CONTROL:
        setControl(CONTROL_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__X:
        setX(X_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__START1:
        setStart1(START1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__END1:
        setEnd1(END1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__RESPONSE:
        setResponse(RESPONSE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__Y:
        setY(Y_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__START2:
        setStart2(START2_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY1__END2:
        setEnd2(END2_EDEFAULT);
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
      case ExperimentOntologyPackage.QUERY1__FACTOR:
        return FACTOR_EDEFAULT == null ? factor != null : !FACTOR_EDEFAULT.equals(factor);
      case ExperimentOntologyPackage.QUERY1__CONTROL:
        return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
      case ExperimentOntologyPackage.QUERY1__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case ExperimentOntologyPackage.QUERY1__START1:
        return START1_EDEFAULT == null ? start1 != null : !START1_EDEFAULT.equals(start1);
      case ExperimentOntologyPackage.QUERY1__END1:
        return END1_EDEFAULT == null ? end1 != null : !END1_EDEFAULT.equals(end1);
      case ExperimentOntologyPackage.QUERY1__RESPONSE:
        return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
      case ExperimentOntologyPackage.QUERY1__Y:
        return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
      case ExperimentOntologyPackage.QUERY1__START2:
        return START2_EDEFAULT == null ? start2 != null : !START2_EDEFAULT.equals(start2);
      case ExperimentOntologyPackage.QUERY1__END2:
        return END2_EDEFAULT == null ? end2 != null : !END2_EDEFAULT.equals(end2);
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
    result.append(" (factor: ");
    result.append(factor);
    result.append(", control: ");
    result.append(control);
    result.append(", x: ");
    result.append(x);
    result.append(", start1: ");
    result.append(start1);
    result.append(", end1: ");
    result.append(end1);
    result.append(", response: ");
    result.append(response);
    result.append(", y: ");
    result.append(y);
    result.append(", start2: ");
    result.append(start2);
    result.append(", end2: ");
    result.append(end2);
    result.append(')');
    return result.toString();
  }

} //Query1Impl
