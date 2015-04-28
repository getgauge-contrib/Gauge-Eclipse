package io.getgauge.tests

import com.google.inject.Inject
import io.getgauge.SpecInjectorProvider
import io.getgauge.spec.Model
import io.getgauge.spec.Tags
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SpecInjectorProvider)

class TagsParserTests {
	@Inject
  	ParseHelper<Model> model
  	
  	@Test
  	def void parseTags() {
  		val tagText = "tags: foo, bar, tag with spaces"
  		val parsedModel = model.parse(tagText)
  		
  		assertSame(parsedModel.definitions.size, 1)
  		
  		val tags = parsedModel.definitions.get(0)
  		assertTrue(tags instanceof Tags)
  	}	
}