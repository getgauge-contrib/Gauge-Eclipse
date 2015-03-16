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
				if(context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getCommentRule()) {
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
				if(context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.SPEC:
				if(context == grammarAccess.getAbstractEntityRule() ||
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
				if(context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_Step(context, (Step) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (text+=WORD | text+=STATIC_PARAM | text+=DYNAMIC_PARAM) 
	 *         (
	 *             text+=WORD | 
	 *             text+=SEPARATORS | 
	 *             text+=STATIC_PARAM | 
	 *             text+=DYNAMIC_PARAM | 
	 *             text+='-' | 
	 *             text+='='
	 *         )+
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
	 *     definitions+=AbstractEntity*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=WORD | name+=SEPARATORS)+ | (name+=WORD | name+=SEPARATORS)+)
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=WORD | name+=SEPARATORS)+ | (name+=WORD | name+=SEPARATORS)+)
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
	 *     ((staticParams+=StaticParam | dynamicParams+=DynamicParam)*)
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
