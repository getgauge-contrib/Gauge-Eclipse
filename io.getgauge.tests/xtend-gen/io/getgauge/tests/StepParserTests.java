package io.getgauge.tests;

import com.google.inject.Inject;
import io.getgauge.SpecInjectorProvider;
import io.getgauge.StepUtil;
import io.getgauge.spec.DynamicParam;
import io.getgauge.spec.Element;
import io.getgauge.spec.Model;
import io.getgauge.spec.StaticParam;
import io.getgauge.spec.Step;
import io.getgauge.spec.StepDefinition;
import io.getgauge.spec.Table;
import io.getgauge.spec.TableCell;
import io.getgauge.spec.TableRow;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
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
public class StepParserTests {
  @Inject
  private ParseHelper<Model> model;
  
  @Test
  public void parseSimpleStep() {
    try {
      final String stepText = "* I am a dumb step";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      final Element step = _definitions.get(0);
      Assert.assertTrue((step instanceof Step));
      String _elementText = StepUtil.getElementText(step);
      Assert.assertEquals(stepText, _elementText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void readSimpleStepText() {
    try {
      final String stepText = "I am a dumb step";
      final Model parsedModel = this.model.parse(("* " + stepText));
      EList<Element> _definitions = parsedModel.getDefinitions();
      final Element step = _definitions.get(0);
      Assert.assertTrue((step instanceof Step));
      String _stepText = StepUtil.getStepText(((Step) step));
      Assert.assertEquals(stepText, _stepText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseStepWithStaticParams() {
    try {
      final String stepText = "* I am a \"step\" with \"two\" parameters";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      Element _get = _definitions.get(0);
      final Step step = ((Step) _get);
      StepDefinition _definition = step.getDefinition();
      final EList<StaticParam> staticParams = _definition.getStaticParams();
      int _size = staticParams.size();
      Assert.assertEquals(2, _size);
      StaticParam _get_1 = staticParams.get(0);
      String _name = _get_1.getName();
      Assert.assertEquals("\"step\"", _name);
      StaticParam _get_2 = staticParams.get(1);
      String _name_1 = _get_2.getName();
      Assert.assertEquals("\"two\"", _name_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void readTextForStepWithStaticParams() {
    try {
      final String stepText = "I am a \"step\" with \"two\" parameters";
      final Model parsedModel = this.model.parse(("* " + stepText));
      EList<Element> _definitions = parsedModel.getDefinitions();
      Element _get = _definitions.get(0);
      final Step step = ((Step) _get);
      String _stepText = StepUtil.getStepText(step);
      Assert.assertEquals(stepText, _stepText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseStepWithDynamicParams() {
    try {
      final String stepText = "* I am a <step> with <two> parameters";
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      Element _get = _definitions.get(0);
      final Step step = ((Step) _get);
      StepDefinition _definition = step.getDefinition();
      final EList<DynamicParam> dynamicParams = _definition.getDynamicParams();
      int _size = dynamicParams.size();
      Assert.assertEquals(2, _size);
      DynamicParam _get_1 = dynamicParams.get(0);
      String _name = _get_1.getName();
      Assert.assertEquals("<step>", _name);
      DynamicParam _get_2 = dynamicParams.get(1);
      String _name_1 = _get_2.getName();
      Assert.assertEquals("<two>", _name_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void readTextForStepWithDynamicParams() {
    try {
      final String stepText = "I am a <step> with <two> parameters";
      final Model parsedModel = this.model.parse(("* " + stepText));
      EList<Element> _definitions = parsedModel.getDefinitions();
      Element _get = _definitions.get(0);
      final Step step = ((Step) _get);
      String _stepText = StepUtil.getStepText(step);
      Assert.assertEquals(stepText, _stepText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseStepWithTableParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("* I am a <step> with");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Product|       Description           |");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|-------|-----------------------------|");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Gauge|BDD style testing with ease  |");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Mingle|Agile project management     |");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Snap|Hosted continuous integration|");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Gocd|Continuous delivery platform |");
      _builder.newLine();
      final String stepText = _builder.toString();
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      Element _get = _definitions.get(0);
      final Step step = ((Step) _get);
      final Table table = step.getTable();
      EList<TableRow> _rows = table.getRows();
      int _size = _rows.size();
      Assert.assertEquals(4, _size);
      TableRow _heading = table.getHeading();
      EList<TableCell> _cells = _heading.getCells();
      TableCell _get_1 = _cells.get(0);
      EList<String> _name = _get_1.getName();
      String _string = _name.toString();
      Assert.assertEquals("[Product]", _string);
      EList<TableRow> _rows_1 = table.getRows();
      TableRow _get_2 = _rows_1.get(0);
      EList<TableCell> _cells_1 = _get_2.getCells();
      TableCell _get_3 = _cells_1.get(0);
      EList<String> _name_1 = _get_3.getName();
      String _string_1 = _name_1.toString();
      Assert.assertEquals("[Gauge]", _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void readTextForStepWithTableParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("* I am a <step> with");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Product|       Description           |");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|-------|-----------------------------|");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Gauge|BDD style testing with ease  |");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Mingle|Agile project management     |");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Snap|Hosted continuous integration|");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("|Gocd|Continuous delivery platform |");
      final String stepText = _builder.toString();
      final Model parsedModel = this.model.parse(stepText);
      EList<Element> _definitions = parsedModel.getDefinitions();
      Element _get = _definitions.get(0);
      final Step step = ((Step) _get);
      String _stepText = StepUtil.getStepText(step);
      Assert.assertEquals("I am a <step> with <table>", _stepText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
