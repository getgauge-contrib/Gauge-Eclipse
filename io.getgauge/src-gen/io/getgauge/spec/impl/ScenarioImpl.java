/**
 */
package io.getgauge.spec.impl;

import io.getgauge.spec.Comment;
import io.getgauge.spec.Scenario;
import io.getgauge.spec.SpecPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.getgauge.spec.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.getgauge.spec.impl.ScenarioImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link io.getgauge.spec.impl.ScenarioImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected EList<Comment> comments;

  /**
   * The default value of the '{@link #getTags() <em>Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected static final String TAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected String tags = TAGS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return SpecPackage.Literals.SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, SpecPackage.SCENARIO__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment> getComments()
  {
    if (comments == null)
    {
      comments = new EObjectContainmentEList<Comment>(Comment.class, this, SpecPackage.SCENARIO__COMMENTS);
    }
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTags()
  {
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTags(String newTags)
  {
    String oldTags = tags;
    tags = newTags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.SCENARIO__TAGS, oldTags, tags));
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
      case SpecPackage.SCENARIO__COMMENTS:
        return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
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
      case SpecPackage.SCENARIO__NAME:
        return getName();
      case SpecPackage.SCENARIO__COMMENTS:
        return getComments();
      case SpecPackage.SCENARIO__TAGS:
        return getTags();
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
      case SpecPackage.SCENARIO__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case SpecPackage.SCENARIO__COMMENTS:
        getComments().clear();
        getComments().addAll((Collection<? extends Comment>)newValue);
        return;
      case SpecPackage.SCENARIO__TAGS:
        setTags((String)newValue);
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
      case SpecPackage.SCENARIO__NAME:
        getName().clear();
        return;
      case SpecPackage.SCENARIO__COMMENTS:
        getComments().clear();
        return;
      case SpecPackage.SCENARIO__TAGS:
        setTags(TAGS_EDEFAULT);
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
      case SpecPackage.SCENARIO__NAME:
        return name != null && !name.isEmpty();
      case SpecPackage.SCENARIO__COMMENTS:
        return comments != null && !comments.isEmpty();
      case SpecPackage.SCENARIO__TAGS:
        return TAGS_EDEFAULT == null ? tags != null : !TAGS_EDEFAULT.equals(tags);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", tags: ");
    result.append(tags);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
