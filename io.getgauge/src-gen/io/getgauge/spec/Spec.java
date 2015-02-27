/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.Spec#getText <em>Text</em>}</li>
 *   <li>{@link io.getgauge.spec.Spec#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link io.getgauge.spec.Spec#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getSpec()
 * @model
 * @generated
 */
public interface Spec extends EObject
{
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
   * @see io.getgauge.spec.SpecPackage#getSpec_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getSpec_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getSpec_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // Spec
