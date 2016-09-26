/**
 */
package org.xtext.DOE.experimentOntology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.MechHypothesis;
import org.xtext.DOE.experimentOntology.TemporalPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mech Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl#getMName <em>MName</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl#getAssoMech <em>Asso Mech</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl#getMechanisticHypothesis <em>Mechanistic Hypothesis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MechHypothesisImpl extends MinimalEObjectImpl.Container implements MechHypothesis
{
  /**
   * The default value of the '{@link #getMName() <em>MName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMName()
   * @generated
   * @ordered
   */
  protected static final String MNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMName() <em>MName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMName()
   * @generated
   * @ordered
   */
  protected String mName = MNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssoMech() <em>Asso Mech</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssoMech()
   * @generated
   * @ordered
   */
  protected EList<TemporalPattern> assoMech;

  /**
   * The default value of the '{@link #getMechanisticHypothesis() <em>Mechanistic Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisticHypothesis()
   * @generated
   * @ordered
   */
  protected static final String MECHANISTIC_HYPOTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMechanisticHypothesis() <em>Mechanistic Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisticHypothesis()
   * @generated
   * @ordered
   */
  protected String mechanisticHypothesis = MECHANISTIC_HYPOTHESIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MechHypothesisImpl()
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
    return ExperimentOntologyPackage.Literals.MECH_HYPOTHESIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMName()
  {
    return mName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMName(String newMName)
  {
    String oldMName = mName;
    mName = newMName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECH_HYPOTHESIS__MNAME, oldMName, mName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemporalPattern> getAssoMech()
  {
    if (assoMech == null)
    {
      assoMech = new EObjectContainmentEList<TemporalPattern>(TemporalPattern.class, this, ExperimentOntologyPackage.MECH_HYPOTHESIS__ASSO_MECH);
    }
    return assoMech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMechanisticHypothesis()
  {
    return mechanisticHypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMechanisticHypothesis(String newMechanisticHypothesis)
  {
    String oldMechanisticHypothesis = mechanisticHypothesis;
    mechanisticHypothesis = newMechanisticHypothesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS, oldMechanisticHypothesis, mechanisticHypothesis));
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
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__ASSO_MECH:
        return ((InternalEList<?>)getAssoMech()).basicRemove(otherEnd, msgs);
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
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MNAME:
        return getMName();
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__ASSO_MECH:
        return getAssoMech();
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS:
        return getMechanisticHypothesis();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MNAME:
        setMName((String)newValue);
        return;
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__ASSO_MECH:
        getAssoMech().clear();
        getAssoMech().addAll((Collection<? extends TemporalPattern>)newValue);
        return;
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS:
        setMechanisticHypothesis((String)newValue);
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
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MNAME:
        setMName(MNAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__ASSO_MECH:
        getAssoMech().clear();
        return;
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS:
        setMechanisticHypothesis(MECHANISTIC_HYPOTHESIS_EDEFAULT);
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
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MNAME:
        return MNAME_EDEFAULT == null ? mName != null : !MNAME_EDEFAULT.equals(mName);
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__ASSO_MECH:
        return assoMech != null && !assoMech.isEmpty();
      case ExperimentOntologyPackage.MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS:
        return MECHANISTIC_HYPOTHESIS_EDEFAULT == null ? mechanisticHypothesis != null : !MECHANISTIC_HYPOTHESIS_EDEFAULT.equals(mechanisticHypothesis);
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
    result.append(" (mName: ");
    result.append(mName);
    result.append(", mechanisticHypothesis: ");
    result.append(mechanisticHypothesis);
    result.append(')');
    return result.toString();
  }

} //MechHypothesisImpl
