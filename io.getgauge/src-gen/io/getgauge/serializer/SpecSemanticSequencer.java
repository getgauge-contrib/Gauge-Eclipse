package io.getgauge.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import io.getgauge.services.SpecGrammarAccess;
import io.getgauge.spec.Comment;
import io.getgauge.spec.DynamicParam;
import io.getgauge.spec.Model;
import io.getgauge.spec.Scenario;
import io.getgauge.spec.Spec;
import io.getgauge.spec.SpecPackage;
import io.getgauge.spec.StaticParam;
import io.getgauge.spec.Step;
import io.getgauge.spec.StepDefinition;
import io.getgauge.spec.Table;
import io.getgauge.spec.TableCell;
import io.getgauge.spec.TableRow;
import io.getgauge.spec.Tags;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SpecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpecGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpecPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.DYNAMIC_PARAM:
				if(context == grammarAccess.getDynamicParamRule()) {
					sequence_DynamicParam(context, (DynamicParam) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.SCENARIO:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.SPEC:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getSpecRule()) {
					sequence_Spec(context, (Spec) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.STATIC_PARAM:
				if(context == grammarAccess.getStaticParamRule()) {
					sequence_StaticParam(context, (StaticParam) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.STEP:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_Step(context, (Step) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.STEP_DEFINITION:
				if(context == grammarAccess.getStepDefinitionRule()) {
					sequence_StepDefinition(context, (StepDefinition) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.TABLE:
				if(context == grammarAccess.getTableRule()) {
					sequence_Table(context, (Table) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.TABLE_CELL:
				if(context == grammarAccess.getTableCellRule()) {
					sequence_TableCell(context, (TableCell) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.TABLE_ROW:
				if(context == grammarAccess.getTableRowRule()) {
					sequence_TableRow(context, (TableRow) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.TAGS:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getTagsRule()) {
					sequence_Tags(context, (Tags) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name+=TextPart 
	 *         (
	 *             name+=TextPart | 
	 *             name+='-' | 
	 *             name+='=' | 
	 *             name+='|' | 
	 *             name+=',' | 
	 *             name+=':'
	 *         )*
	 *     )
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=DYNAMIC_PARAM
	 */
	protected void sequence_DynamicParam(EObject context, DynamicParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecPackage.Literals.DYNAMIC_PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.DYNAMIC_PARAM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDynamicParamAccess().getNameDYNAMIC_PARAMTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (definitions+=Element*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=TextPart+ | name+=TextPart+)
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=TextPart+ | name+=TextPart+)
	 */
	protected void sequence_Spec(EObject context, Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STATIC_PARAM
	 */
	protected void sequence_StaticParam(EObject context, StaticParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecPackage.Literals.STATIC_PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.STATIC_PARAM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStaticParamAccess().getNameSTATIC_PARAMTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             staticParams+=StaticParam | 
	 *             dynamicParams+=DynamicParam | 
	 *             text+=WORD | 
	 *             text+='-' | 
	 *             text+='=' | 
	 *             text+=WS
	 *         ) 
	 *         separators+=SEPARATORS*
	 *     )+
	 */
	protected void sequence_StepDefinition(EObject context, StepDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (definition=StepDefinition table=Table?)
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=WORD | name+=SEPARATORS | name+=WS)+
	 */
	protected void sequence_TableCell(EObject context, TableCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cells+=TableCell+
	 */
	protected void sequence_TableRow(EObject context, TableRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (heading=TableRow rows+=TableRow+)
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Tags}
	 */
	protected void sequence_Tags(EObject context, Tags semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
