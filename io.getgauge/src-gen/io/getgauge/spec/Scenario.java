/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link io.getgauge.spec.Scenario#getComments <em>Comments</em>}</li>
 *   <li>{@link io.getgauge.spec.Scenario#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
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

  /**
   * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getScenario_Comments()
   * @model containment="true"
   * @generated
   */
  EList<Comment> getComments();

  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute.
   * @see #setTags(String)
   * @see io.getgauge.spec.SpecPackage#getScenario_Tags()
   * @model
   * @generated
   */
  String getTags();

  /**
   * Sets the value of the '{@link io.getgauge.spec.Scenario#getTags <em>Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tags</em>' attribute.
   * @see #getTags()
   * @generated
   */
  void setTags(String value);

} // Scenario
