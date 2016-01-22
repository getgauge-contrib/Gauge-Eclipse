package io.getgauge.tests

import com.google.inject.Inject
import io.getgauge.SpecInjectorProvider
import io.getgauge.StepUtil
import io.getgauge.spec.Model
import io.getgauge.spec.Spec
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SpecInjectorProvider)
class SpecParserTests {
	@Inject
	ParseHelper<Model> model

	@Test
	def void parseSpecHeading() {
		val stepText = "# This is a sample Specification"
		val parsedModel = model.parse(stepText)

		assertSame(parsedModel.definitions.size, 1)

		val spec = parsedModel.definitions.get(0)
		assertTrue(spec instanceof Spec)
		assertEquals(stepText, StepUtil.getElementText(spec))
	}

	@Test
	def void parseSpecHeadingWithNumbers() {
		val stepText = "# This is my 1st specification 345 foo bar"
		val parsedModel = model.parse(stepText)

		assertSame(parsedModel.definitions.size, 1)

		val spec = parsedModel.definitions.get(0)
		assertTrue(spec instanceof Spec)
		assertEquals(stepText, StepUtil.getElementText(spec))
	}

	@Test
	def void parseSpecHeadingWithSpecialChars() {
		val stepText = "# This is spec1 @78$(blah)foo%!bar No.1"
		val parsedModel = model.parse(stepText)

		assertSame(parsedModel.definitions.size, 1)

		val spec = parsedModel.definitions.get(0)
		assertTrue(spec instanceof Spec)
		assertEquals(stepText, StepUtil.getElementText(spec))
	}

	@Test
	def void parseSpecHeadingAlt() {
		val stepText = "This is my 1st sample Specification\n==================="
		val parsedModel = model.parse(stepText)

		assertSame(parsedModel.definitions.size, 1)

		val spec = parsedModel.definitions.get(0)
		assertTrue(spec instanceof Spec)
		assertEquals(stepText, StepUtil.getElementText(spec))
	}

}
