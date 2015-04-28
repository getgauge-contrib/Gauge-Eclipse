package io.getgauge.tests

import com.google.inject.Inject
import io.getgauge.SpecInjectorProvider
import io.getgauge.StepUtil
import io.getgauge.spec.Model
import io.getgauge.spec.Scenario
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SpecInjectorProvider)

class ScenarioParserTests {
	@Inject
  	ParseHelper<Model> model
  	
  	@Test
  	def void parseScenarioHeading() {
  		val stepText = "## This is a sample Scenario"
  		val parsedModel = model.parse(stepText)
  		
  		assertSame(parsedModel.definitions.size, 1)
  		
  		val spec = parsedModel.definitions.get(0)
  		assertTrue(spec instanceof Scenario)
  		assertEquals(stepText, StepUtil.getElementText(spec))
  	}

  	@Test
  	def void parseScenarioHeadingAlt() {
  		val stepText = "This is a sample Scenario\n----------------------"
  		val parsedModel = model.parse(stepText)
  		
  		assertSame(parsedModel.definitions.size, 1)
  		
  		val spec = parsedModel.definitions.get(0)
  		assertTrue(spec instanceof Scenario)
  		assertEquals(stepText, StepUtil.getElementText(spec))
  	}

}