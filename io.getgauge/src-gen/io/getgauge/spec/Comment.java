/**
 */
package io.getgauge.spec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.getgauge.spec.Comment#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.getgauge.spec.SpecPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends AbstractEntity
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
   * @see io.getgauge.spec.SpecPackage#getComment_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

} // Comment
