package io.getgauge.tests;

import com.google.inject.Inject;
import io.getgauge.SpecInjectorProvider;
import io.getgauge.StepUtil;
import io.getgauge.spec.Element;
import io.getgauge.spec.Model;
import io.getgauge.spec.Scenario;
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
public class ScenarioParserTests {
  @Inject
  private ParseHelper<Model> model;
  
  @Test
  public void parseScenarioHeading() {
    try {
      final String stepText = "## This is a sample Scenario";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      int _size = _definitions.size();
      Assert.assertSame(Integer.valueOf(_size), Integer.valueOf(1));
      EList<Element> _definitions_1 = parsedModel.getDefinitions();
      final Element spec = _definitions_1.get(0);
      Assert.assertTrue((spec instanceof Scenario));
      String _elementText = StepUtil.getElementText(spec);
      Assert.assertEquals(stepText, _elementText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseScenarioHeadingWithNumbers() {
    try {
      final String stepText = "## This is 1st sample Scenario with 2 steps";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      int _size = _definitions.size();
      Assert.assertSame(Integer.valueOf(_size), Integer.valueOf(1));
      EList<Element> _definitions_1 = parsedModel.getDefinitions();
      final Element spec = _definitions_1.get(0);
      Assert.assertTrue((spec instanceof Scenario));
      String _elementText = StepUtil.getElementText(spec);
      Assert.assertEquals(stepText, _elementText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseScenarioHeadingAlt() {
    try {
      final String stepText = "This is my 1st sample Scenario\n----------------------";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      int _size = _definitions.size();
      Assert.assertSame(Integer.valueOf(_size), Integer.valueOf(1));
      EList<Element> _definitions_1 = parsedModel.getDefinitions();
      final Element spec = _definitions_1.get(0);
      Assert.assertTrue((spec instanceof Scenario));
      String _elementText = StepUtil.getElementText(spec);
      Assert.assertEquals(stepText, _elementText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
