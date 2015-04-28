package io.getgauge.tests;

import com.google.inject.Inject;
import io.getgauge.SpecInjectorProvider;
import io.getgauge.spec.Comment;
import io.getgauge.spec.Element;
import io.getgauge.spec.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SpecInjectorProvider.class)
@SuppressWarnings("all")
public class CommentParserTests {
  @Inject
  private ParseHelper<Model> model;
  
  @Test
  public void parseTags() {
    try {
      final String text = "I am a comment, do I not map to any entity?";
      final Model parsedModel = this.model.parse(text);
      EList<Element> _definitions = parsedModel.getDefinitions();
      final Element tags = _definitions.get(0);
      Assert.assertTrue((tags instanceof Comment));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
