/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.DependentVariables;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Response;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.DependentVariablesImpl#getResponseName <em>Response Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependentVariablesImpl extends MinimalEObjectImpl.Container implements DependentVariables
{
  /**
   * The cached value of the '{@link #getResponseName() <em>Response Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseName()
   * @generated
   * @ordered
   */
  protected Response responseName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependentVariablesImpl()
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
    return ExperimentOntologyPackage.Literals.DEPENDENT_VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Response getResponseName()
  {
    return responseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponseName(Response newResponseName, NotificationChain msgs)
  {
    Response oldResponseName = responseName;
    responseName = newResponseName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME, oldResponseName, newResponseName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseName(Response newResponseName)
  {
    if (newResponseName != responseName)
    {
      NotificationChain msgs = null;
      if (responseName != null)
        msgs = ((InternalEObject)responseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME, null, msgs);
      if (newResponseName != null)
        msgs = ((InternalEObject)newResponseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME, null, msgs);
      msgs = basicSetResponseName(newResponseName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME, newResponseName, newResponseName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME:
        return basicSetResponseName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME:
        return getResponseName();
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
      case ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME:
        setResponseName((Response)newValue);
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
      case ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME:
        setResponseName((Response)null);
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
      case ExperimentOntologyPackage.DEPENDENT_VARIABLES__RESPONSE_NAME:
        return responseName != null;
    }
    return super.eIsSet(featureID);
  }

} //DependentVariablesImpl
