/**
 */
package io.getgauge.spec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.getgauge.spec.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.getgauge.io/Spec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecPackage eINSTANCE = io.getgauge.spec.impl.SpecPackageImpl.init();

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.ModelImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.AbstractEntityImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getAbstractEntity()
   * @generated
   */
  int ABSTRACT_ENTITY = 1;

  /**
   * The number of structural features of the '<em>Abstract Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.SpecImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__NAME = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.ScenarioImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.StepImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getStep()
   * @generated
   */
  int STEP = 4;

  /**
   * The feature id for the '<em><b>Static Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__STATIC_PARAMS = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dynamic Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DYNAMIC_PARAMS = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.StaticParamImpl <em>Static Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.StaticParamImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getStaticParam()
   * @generated
   */
  int STATIC_PARAM = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Static Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.DynamicParamImpl <em>Dynamic Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.DynamicParamImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getDynamicParam()
   * @generated
   */
  int DYNAMIC_PARAM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Dynamic Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link io.getgauge.spec.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.getgauge.spec.impl.CommentImpl
   * @see io.getgauge.spec.impl.SpecPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__TEXT = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link io.getgauge.spec.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see io.getgauge.spec.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link io.getgauge.spec.Model#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see io.getgauge.spec.Model#getDefinitions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Definitions();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.AbstractEntity <em>Abstract Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Entity</em>'.
   * @see io.getgauge.spec.AbstractEntity
   * @generated
   */
  EClass getAbstractEntity();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see io.getgauge.spec.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for the attribute list '{@link io.getgauge.spec.Spec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see io.getgauge.spec.Spec#getName()
   * @see #getSpec()
   * @generated
   */
  EAttribute getSpec_Name();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see io.getgauge.spec.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute list '{@link io.getgauge.spec.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see io.getgauge.spec.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see io.getgauge.spec.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the containment reference list '{@link io.getgauge.spec.Step#getStaticParams <em>Static Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Params</em>'.
   * @see io.getgauge.spec.Step#getStaticParams()
   * @see #getStep()
   * @generated
   */
  EReference getStep_StaticParams();

  /**
   * Returns the meta object for the containment reference list '{@link io.getgauge.spec.Step#getDynamicParams <em>Dynamic Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dynamic Params</em>'.
   * @see io.getgauge.spec.Step#getDynamicParams()
   * @see #getStep()
   * @generated
   */
  EReference getStep_DynamicParams();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.StaticParam <em>Static Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Param</em>'.
   * @see io.getgauge.spec.StaticParam
   * @generated
   */
  EClass getStaticParam();

  /**
   * Returns the meta object for the attribute '{@link io.getgauge.spec.StaticParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.getgauge.spec.StaticParam#getName()
   * @see #getStaticParam()
   * @generated
   */
  EAttribute getStaticParam_Name();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.DynamicParam <em>Dynamic Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Param</em>'.
   * @see io.getgauge.spec.DynamicParam
   * @generated
   */
  EClass getDynamicParam();

  /**
   * Returns the meta object for the attribute '{@link io.getgauge.spec.DynamicParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.getgauge.spec.DynamicParam#getName()
   * @see #getDynamicParam()
   * @generated
   */
  EAttribute getDynamicParam_Name();

  /**
   * Returns the meta object for class '{@link io.getgauge.spec.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see io.getgauge.spec.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute list '{@link io.getgauge.spec.Comment#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see io.getgauge.spec.Comment#getText()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpecFactory getSpecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.ModelImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEFINITIONS = eINSTANCE.getModel_Definitions();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.AbstractEntityImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getAbstractEntity()
     * @generated
     */
    EClass ABSTRACT_ENTITY = eINSTANCE.getAbstractEntity();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.SpecImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC__NAME = eINSTANCE.getSpec_Name();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.ScenarioImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.StepImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Static Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__STATIC_PARAMS = eINSTANCE.getStep_StaticParams();

    /**
     * The meta object literal for the '<em><b>Dynamic Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__DYNAMIC_PARAMS = eINSTANCE.getStep_DynamicParams();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.StaticParamImpl <em>Static Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.StaticParamImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getStaticParam()
     * @generated
     */
    EClass STATIC_PARAM = eINSTANCE.getStaticParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_PARAM__NAME = eINSTANCE.getStaticParam_Name();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.DynamicParamImpl <em>Dynamic Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.DynamicParamImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getDynamicParam()
     * @generated
     */
    EClass DYNAMIC_PARAM = eINSTANCE.getDynamicParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_PARAM__NAME = eINSTANCE.getDynamicParam_Name();

    /**
     * The meta object literal for the '{@link io.getgauge.spec.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see io.getgauge.spec.impl.CommentImpl
     * @see io.getgauge.spec.impl.SpecPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

  }

} //SpecPackage
