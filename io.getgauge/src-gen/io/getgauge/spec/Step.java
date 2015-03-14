/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.Step#getStaticParams <em>Static Params</em>}</li>
 *   <li>{@link io.getgauge.spec.Step#getDynamicParams <em>Dynamic Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends AbstractEntity
{
  /**
   * Returns the value of the '<em><b>Static Params</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.StaticParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Params</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getStep_StaticParams()
   * @model containment="true"
   * @generated
   */
  EList<StaticParam> getStaticParams();

  /**
   * Returns the value of the '<em><b>Dynamic Params</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.DynamicParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Params</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getStep_DynamicParams()
   * @model containment="true"
   * @generated
   */
  EList<DynamicParam> getDynamicParams();

} // Step
