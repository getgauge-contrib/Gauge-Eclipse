/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.Table#getHeading <em>Heading</em>}</li>
 *   <li>{@link io.getgauge.spec.Table#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(TableRow)
   * @see io.getgauge.spec.SpecPackage#getTable_Heading()
   * @model containment="true"
   * @generated
   */
  TableRow getHeading();

  /**
   * Sets the value of the '{@link io.getgauge.spec.Table#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(TableRow value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.TableRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getTable_Rows()
   * @model containment="true"
   * @generated
   */
  EList<TableRow> getRows();

} // Table
