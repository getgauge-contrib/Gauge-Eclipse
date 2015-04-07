package io.getgauge.ui;

import io.getgauge.spec.DynamicParam;
import io.getgauge.spec.Scenario;
import io.getgauge.spec.Spec;
import io.getgauge.spec.StaticParam;
import io.getgauge.spec.Step;
import io.getgauge.spec.Tags;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class SpecHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		
		INode root = resource.getParseResult().getRootNode();
        BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
        while( it.hasNext() )
        {
        	INode node = it.next();
    		String nodeType="";
    		EObject semanticElement = node.getSemanticElement();
        	if( node instanceof CompositeNodeWithSemanticElement)
        	{
        		if(semanticElement instanceof Spec )
        			nodeType=SpecHighlightingConfiguration.SPEC;
        		else if( semanticElement instanceof Scenario )
        			nodeType=SpecHighlightingConfiguration.SCENARIO;
        		else if( semanticElement instanceof Tags)
        			nodeType=SpecHighlightingConfiguration.TAGS;
        		else if( semanticElement instanceof StaticParam )
        			nodeType=SpecHighlightingConfiguration.STATIC_PARAM;
        		else if( semanticElement instanceof DynamicParam)
        			nodeType=SpecHighlightingConfiguration.DYNAMIC_PARAM;
        		else if( semanticElement instanceof Step )
        			nodeType=SpecHighlightingConfiguration.STEP;
        		else
        			nodeType=SpecHighlightingConfiguration.DEFAULT;
        	}
			acceptor.addPosition(node.getOffset(), node.getLength(), nodeType);
        }
	}
}
