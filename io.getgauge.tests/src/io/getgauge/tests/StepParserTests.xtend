package io.getgauge.tests

import com.google.inject.Inject
import io.getgauge.SpecInjectorProvider
import io.getgauge.StepUtil
import io.getgauge.spec.Model
import io.getgauge.spec.Step
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SpecInjectorProvider)
class StepParserTests {

	@Inject
  	ParseHelper<Model> model

	@Test
	def void parseSimpleStep() {
		val stepText = "* I am a dumb step"
		
		val parsedModel = model.parse(stepText)
  		
  		val step = parsedModel.definitions.get(0)
  		assertTrue(step instanceof Step)
  		assertEquals(stepText, StepUtil.getElementText(step))
	}

	@Test
	def void readSimpleStepText() {
		val stepText = "I am a dumb step"
		
		val parsedModel = model.parse("* " + stepText)
  		
  		val step = parsedModel.definitions.get(0)
  		assertTrue(step instanceof Step)
  		assertEquals(stepText, StepUtil.getStepText(step as Step))
	}

	@Test
	def void parseStepWithStaticParams() {
		val stepText = "* I am a \"step\" with \"two\" parameters"
		
		val parsedModel = model.parse(stepText)
  		
  		val step = parsedModel.definitions.get(0) as Step
  		val staticParams = step.definition.staticParams
		assertEquals(2, staticParams.size)
		assertEquals("\"step\"", staticParams.get(0).name)
		assertEquals("\"two\"", staticParams.get(1).name)
	}
	
	@Test
	def void readTextForStepWithStaticParams() {
		val stepText = "I am a \"step\" with \"two\" parameters"
		
		val parsedModel = model.parse("* " + stepText)
  		
  		val step = parsedModel.definitions.get(0) as Step
  		assertEquals(stepText, StepUtil.getStepText(step))
	}

	@Test
	def void parseStepWithDynamicParams() {
		val stepText = "* I am a <step> with <two> parameters"
		
		val parsedModel = model.parse(stepText)
  		
  		val step = parsedModel.definitions.get(0) as Step
  		val dynamicParams = step.definition.dynamicParams
		assertEquals(2, dynamicParams.size)
		assertEquals("<step>", dynamicParams.get(0).name)
		assertEquals("<two>", dynamicParams.get(1).name)
	}
	
	@Test
	def void readTextForStepWithDynamicParams() {
		val stepText = "I am a <step> with <two> parameters"
		
		val parsedModel = model.parse("* " + stepText)
  		
  		val step = parsedModel.definitions.get(0) as Step
  		assertEquals(stepText, StepUtil.getStepText(step))
	}
	
	@Test
	def void parseStepWithTableParam() {
		val stepText = '''* I am a <step> with
    |Product|       Description           |
    |-------|-----------------------------|
    |Gauge|BDD style testing with ease  |
    |Mingle|Agile project management     |
    |Snap|Hosted continuous integration|
    |Gocd|Continuous delivery platform |
    '''
		
		val parsedModel = model.parse(stepText)
  		
  		val step = parsedModel.definitions.get(0) as Step
  		val table = step.table
		assertEquals(4, table.rows.size)
		// table.cell.name is a collection of words and separators.
		// hence assert on string equivalent of array
		assertEquals("[Product]", table.heading.cells.get(0).name.toString)
		assertEquals("[Gauge]", table.rows.get(0).cells.get(0).name.toString)
	}
	
	@Test
	def void readTextForStepWithTableParam() {
		val stepText = '''* I am a <step> with
    |Product|       Description           |
    |-------|-----------------------------|
    |Gauge|BDD style testing with ease  |
    |Mingle|Agile project management     |
    |Snap|Hosted continuous integration|
    |Gocd|Continuous delivery platform |'''
		
		val parsedModel = model.parse(stepText)
  		
  		val step = parsedModel.definitions.get(0) as Step
  		assertEquals("I am a <step> with <table>", StepUtil.getStepText(step))
	}
}