/**
 */
package io.getgauge.spec.impl;

import io.getgauge.spec.DynamicParam;
import io.getgauge.spec.SpecPackage;
import io.getgauge.spec.StaticParam;
import io.getgauge.spec.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.getgauge.spec.impl.StepImpl#getStaticParams <em>Static Params</em>}</li>
 *   <li>{@link io.getgauge.spec.impl.StepImpl#getDynamicParams <em>Dynamic Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends AbstractEntityImpl implements Step
{
  /**
   * The cached value of the '{@link #getStaticParams() <em>Static Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticParams()
   * @generated
   * @ordered
   */
  protected EList<StaticParam> staticParams;

  /**
   * The cached value of the '{@link #getDynamicParams() <em>Dynamic Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamicParams()
   * @generated
   * @ordered
   */
  protected EList<DynamicParam> dynamicParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StepImpl()
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
    return SpecPackage.Literals.STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StaticParam> getStaticParams()
  {
    if (staticParams == null)
    {
      staticParams = new EObjectContainmentEList<StaticParam>(StaticParam.class, this, SpecPackage.STEP__STATIC_PARAMS);
    }
    return staticParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DynamicParam> getDynamicParams()
  {
    if (dynamicParams == null)
    {
      dynamicParams = new EObjectContainmentEList<DynamicParam>(DynamicParam.class, this, SpecPackage.STEP__DYNAMIC_PARAMS);
    }
    return dynamicParams;
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
      case SpecPackage.STEP__STATIC_PARAMS:
        return ((InternalEList<?>)getStaticParams()).basicRemove(otherEnd, msgs);
      case SpecPackage.STEP__DYNAMIC_PARAMS:
        return ((InternalEList<?>)getDynamicParams()).basicRemove(otherEnd, msgs);
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
      case SpecPackage.STEP__STATIC_PARAMS:
        return getStaticParams();
      case SpecPackage.STEP__DYNAMIC_PARAMS:
        return getDynamicParams();
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
      case SpecPackage.STEP__STATIC_PARAMS:
        getStaticParams().clear();
        getStaticParams().addAll((Collection<? extends StaticParam>)newValue);
        return;
      case SpecPackage.STEP__DYNAMIC_PARAMS:
        getDynamicParams().clear();
        getDynamicParams().addAll((Collection<? extends DynamicParam>)newValue);
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
      case SpecPackage.STEP__STATIC_PARAMS:
        getStaticParams().clear();
        return;
      case SpecPackage.STEP__DYNAMIC_PARAMS:
        getDynamicParams().clear();
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
      case SpecPackage.STEP__STATIC_PARAMS:
        return staticParams != null && !staticParams.isEmpty();
      case SpecPackage.STEP__DYNAMIC_PARAMS:
        return dynamicParams != null && !dynamicParams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StepImpl
