/**
 */
package io.getgauge.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.StaticParam#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getStaticParam()
 * @model
 * @generated
 */
public interface StaticParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see io.getgauge.spec.SpecPackage#getStaticParam_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link io.getgauge.spec.StaticParam#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StaticParam
