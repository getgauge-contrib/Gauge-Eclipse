/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link io.getgauge.spec.Step#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
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

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(Table)
   * @see io.getgauge.spec.SpecPackage#getStep_Table()
   * @model containment="true"
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link io.getgauge.spec.Step#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

} // Step
