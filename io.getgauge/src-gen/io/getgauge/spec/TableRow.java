/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.TableRow#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject
{
  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link io.getgauge.spec.TableCell}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see io.getgauge.spec.SpecPackage#getTableRow_Cells()
   * @model containment="true"
   * @generated
   */
  EList<TableCell> getCells();

} // TableRow
