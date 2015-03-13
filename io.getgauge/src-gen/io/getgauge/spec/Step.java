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
 *   <li>{@link io.getgauge.spec.Step#getParams <em>Params</em>}</li>
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
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.StaticParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getStep_Params()
   * @model containment="true"
   * @generated
   */
  EList<StaticParam> getParams();

} // Step
