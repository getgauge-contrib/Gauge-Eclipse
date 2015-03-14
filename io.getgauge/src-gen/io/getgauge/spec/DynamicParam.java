/**
 */
package io.getgauge.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.DynamicParam#getType <em>Type</em>}</li>
 *   <li>{@link io.getgauge.spec.DynamicParam#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getDynamicParam()
 * @model
 * @generated
 */
public interface DynamicParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see io.getgauge.spec.SpecPackage#getDynamicParam_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link io.getgauge.spec.DynamicParam#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see io.getgauge.spec.SpecPackage#getDynamicParam_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link io.getgauge.spec.DynamicParam#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // DynamicParam
