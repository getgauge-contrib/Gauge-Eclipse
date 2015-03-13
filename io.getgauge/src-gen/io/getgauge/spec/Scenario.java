/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.Scenario#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends AbstractEntity
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see io.getgauge.spec.SpecPackage#getScenario_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // Scenario
