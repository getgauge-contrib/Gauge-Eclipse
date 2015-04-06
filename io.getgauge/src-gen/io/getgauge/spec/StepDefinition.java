/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.StepDefinition#getStaticParams <em>Static Params</em>}</li>
 *   <li>{@link io.getgauge.spec.StepDefinition#getDynamicParams <em>Dynamic Params</em>}</li>
 *   <li>{@link io.getgauge.spec.StepDefinition#getText <em>Text</em>}</li>
 *   <li>{@link io.getgauge.spec.StepDefinition#getSeparators <em>Separators</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getStepDefinition()
 * @model
 * @generated
 */
public interface StepDefinition extends EObject
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
   * @see io.getgauge.spec.SpecPackage#getStepDefinition_StaticParams()
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
   * @see io.getgauge.spec.SpecPackage#getStepDefinition_DynamicParams()
   * @model containment="true"
   * @generated
   */
  EList<DynamicParam> getDynamicParams();

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute list.
   * @see io.getgauge.spec.SpecPackage#getStepDefinition_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

  /**
   * Returns the value of the '<em><b>Separators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separators</em>' attribute list.
   * @see io.getgauge.spec.SpecPackage#getStepDefinition_Separators()
   * @model unique="false"
   * @generated
   */
  EList<String> getSeparators();

} // StepDefinition
