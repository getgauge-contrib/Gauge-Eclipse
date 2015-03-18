/**
 */
package io.getgauge.spec.impl;

import io.getgauge.spec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecFactoryImpl extends EFactoryImpl implements SpecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpecFactory init()
  {
    try
    {
      SpecFactory theSpecFactory = (SpecFactory)EPackage.Registry.INSTANCE.getEFactory(SpecPackage.eNS_URI);
      if (theSpecFactory != null)
      {
        return theSpecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpecPackage.MODEL: return createModel();
      case SpecPackage.SPEC: return createSpec();
      case SpecPackage.SCENARIO: return createScenario();
      case SpecPackage.STEP: return createStep();
      case SpecPackage.STATIC_PARAM: return createStaticParam();
      case SpecPackage.DYNAMIC_PARAM: return createDynamicParam();
      case SpecPackage.COMMENT: return createComment();
      case SpecPackage.TABLE: return createTable();
      case SpecPackage.TABLE_ROW: return createTableRow();
      case SpecPackage.TABLE_CELL: return createTableCell();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spec createSpec()
  {
    SpecImpl spec = new SpecImpl();
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticParam createStaticParam()
  {
    StaticParamImpl staticParam = new StaticParamImpl();
    return staticParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicParam createDynamicParam()
  {
    DynamicParamImpl dynamicParam = new DynamicParamImpl();
    return dynamicParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRow createTableRow()
  {
    TableRowImpl tableRow = new TableRowImpl();
    return tableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableCell createTableCell()
  {
    TableCellImpl tableCell = new TableCellImpl();
    return tableCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecPackage getSpecPackage()
  {
    return (SpecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpecPackage getPackage()
  {
    return SpecPackage.eINSTANCE;
  }

} //SpecFactoryImpl
