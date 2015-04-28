package io.getgauge.tests

import com.google.inject.Inject
import io.getgauge.SpecInjectorProvider
import io.getgauge.spec.Comment
import io.getgauge.spec.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SpecInjectorProvider)

class CommentParserTests {
	@Inject
  	ParseHelper<Model> model
  	
  	@Test
  	def void parseTags() {
  		val text = "I am a comment, do I not map to any entity?"
  		val parsedModel = model.parse(text)
  		  		
  		val tags = parsedModel.definitions.get(0)
  		assertTrue(tags instanceof Comment)
  	}	
	
}