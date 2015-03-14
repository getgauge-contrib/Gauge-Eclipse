/**
 */
package io.getgauge.spec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.getgauge.spec.SpecPackage
 * @generated
 */
public interface SpecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecFactory eINSTANCE = io.getgauge.spec.impl.SpecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Abstract Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Entity</em>'.
   * @generated
   */
  AbstractEntity createAbstractEntity();

  /**
   * Returns a new object of class '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec</em>'.
   * @generated
   */
  Spec createSpec();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>Static Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Param</em>'.
   * @generated
   */
  StaticParam createStaticParam();

  /**
   * Returns a new object of class '<em>Dynamic Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Param</em>'.
   * @generated
   */
  DynamicParam createDynamicParam();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpecPackage getSpecPackage();

} //SpecFactory
