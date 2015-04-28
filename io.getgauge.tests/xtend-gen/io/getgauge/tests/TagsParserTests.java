package io.getgauge.tests;

import com.google.inject.Inject;
import io.getgauge.SpecInjectorProvider;
import io.getgauge.spec.Element;
import io.getgauge.spec.Model;
import io.getgauge.spec.Tags;
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
public class TagsParserTests {
  @Inject
  private ParseHelper<Model> model;
  
  @Test
  public void parseTags() {
    try {
      final String tagText = "tags: foo, bar, tag with spaces";
      final Model parsedModel = this.model.parse(tagText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      int _size = _definitions.size();
      Assert.assertSame(Integer.valueOf(_size), Integer.valueOf(1));
      EList<Element> _definitions_1 = parsedModel.getDefinitions();
      final Element tags = _definitions_1.get(0);
      Assert.assertTrue((tags instanceof Tags));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
