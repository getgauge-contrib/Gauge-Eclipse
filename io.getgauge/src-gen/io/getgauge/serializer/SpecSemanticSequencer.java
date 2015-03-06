package io.getgauge.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import io.getgauge.services.SpecGrammarAccess;
import io.getgauge.spec.BlankLine;
import io.getgauge.spec.Comment;
import io.getgauge.spec.Model;
import io.getgauge.spec.Scenario;
import io.getgauge.spec.Spec;
import io.getgauge.spec.SpecPackage;
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
			case SpecPackage.BLANK_LINE:
				if(context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getBlankLineRule()) {
					sequence_BlankLine(context, (BlankLine) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.COMMENT:
				if(context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getCommentRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
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
	 *     (text=SINGLE_NL | text=MULTI_NL)
	 */
	protected void sequence_BlankLine(EObject context, BlankLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=LINE_TEXT
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecPackage.Literals.COMMENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.COMMENT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getTextLINE_TEXTTerminalRuleCall_0(), semanticObject.getText());
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
	 *     name=LINE_TEXT
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecPackage.Literals.SCENARIO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.SCENARIO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScenarioAccess().getNameLINE_TEXTTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LINE_TEXT
	 */
	protected void sequence_Spec(EObject context, Spec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecPackage.Literals.SPEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.SPEC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpecAccess().getNameLINE_TEXTTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LINE_TEXT
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.STEP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStepAccess().getNameLINE_TEXTTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
