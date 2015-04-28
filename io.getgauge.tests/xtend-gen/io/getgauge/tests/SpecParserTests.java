package io.getgauge.tests;

import com.google.inject.Inject;
import io.getgauge.SpecInjectorProvider;
import io.getgauge.StepUtil;
import io.getgauge.spec.Element;
import io.getgauge.spec.Model;
import io.getgauge.spec.Spec;
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
public class SpecParserTests {
  @Inject
  private ParseHelper<Model> model;
  
  @Test
  public void parseSpecHeading() {
    try {
      final String stepText = "# This is a sample Specification";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      int _size = _definitions.size();
      Assert.assertSame(Integer.valueOf(_size), Integer.valueOf(1));
      EList<Element> _definitions_1 = parsedModel.getDefinitions();
      final Element spec = _definitions_1.get(0);
      Assert.assertTrue((spec instanceof Spec));
      String _elementText = StepUtil.getElementText(spec);
      Assert.assertEquals(stepText, _elementText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseSpecHeadingAlt() {
    try {
      final String stepText = "This is a sample Specification\n===================";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      int _size = _definitions.size();
      Assert.assertSame(Integer.valueOf(_size), Integer.valueOf(1));
      EList<Element> _definitions_1 = parsedModel.getDefinitions();
      final Element spec = _definitions_1.get(0);
      Assert.assertTrue((spec instanceof Spec));
      String _elementText = StepUtil.getElementText(spec);
      Assert.assertEquals(stepText, _elementText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
