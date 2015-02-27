package io.getgauge.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import io.getgauge.services.SpecGrammarAccess;
import io.getgauge.spec.Scenario;
import io.getgauge.spec.Spec;
import io.getgauge.spec.SpecPackage;
import io.getgauge.spec.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SpecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpecGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpecPackage.SCENARIO:
				if(context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.SPEC:
				if(context == grammarAccess.getSpecRule()) {
					sequence_Spec(context, (Spec) semanticObject); 
					return; 
				}
				else break;
			case SpecPackage.STEP:
				if(context == grammarAccess.getStepRule()) {
					sequence_Step(context, (Step) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     text+=ID+
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (text+=ID+ scenarios+=Scenario* steps+=Step*)
	 */
	protected void sequence_Spec(EObject context, Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text+=ID+
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
