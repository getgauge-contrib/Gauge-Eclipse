package com.thoughtworks.gauge.eclipse.execution;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class GaugeParametersTab extends AbstractLaunchConfigurationTab {
	private Text specsText;
	private Text environmentText;
	private Text tagsText;
	private Button parallelRunCheckBox;
	private Text parallelsText;
	private Group parallelRunGroup;

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		setControl(composite);
	    
	    createLabel(composite, Constants.SPECS_TO_EXECUTE_TEXT);

	    specsText = new Text(composite, SWT.SINGLE | SWT.BORDER);
	    specsText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    createLabel(composite, Constants.ENVIRONMENT_TEXT);
	    
	    environmentText = new Text(composite, SWT.SINGLE | SWT.BORDER);
	    environmentText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    createLabel(composite, Constants.TAG_EXPRESSION_TEXT);
	    
	    tagsText = new Text(composite, SWT.SINGLE | SWT.BORDER);
	    tagsText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    parallelRunCheckBox = new Button(composite, SWT.CHECK);
	    parallelRunCheckBox.setText(Constants.IN_PARALLEL_TEXT);
	    parallelRunCheckBox.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				parallelRunGroup.setEnabled(parallelRunCheckBox.getSelection());
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    parallelRunGroup = new Group(composite, SWT.NONE);
	    parallelRunGroup.setLayout(new GridLayout(2, false));
	    parallelRunGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    createLabel(parallelRunGroup, Constants.DEGREE_OF_PARALLELISM_TEXT);
	    parallelsText = new Text(parallelRunGroup, SWT.SINGLE | SWT.BORDER);
	    parallelsText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}
	
	private Label createLabel(Composite parent, String text) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(GridData.BEGINNING));
		label.setText(text);
		return label;
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(Constants.SPECS_TO_EXECUTE, Constants.SPECS_TO_EXECUTE_DEFAULT);
		configuration.setAttribute(Constants.ENVIRONMENT, Constants.ENVIRONMENT_DEFAULT);
		configuration.setAttribute(Constants.TAG_EXPRESSION, Constants.TAG_EXPRESSION_DEFAULT);
		configuration.setAttribute(Constants.PARALLEL_ENABLED, Constants.PARALLEL_ENABLED_DEFAULT);
		configuration.setAttribute(Constants.PARALLEL_NUMBER, Constants.PARALLEL_NUMBER_DEFAULT);
	}

	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			specsText.setText(configuration.getAttribute(Constants.SPECS_TO_EXECUTE, Constants.SPECS_TO_EXECUTE_DEFAULT));
			environmentText.setText(configuration.getAttribute(Constants.ENVIRONMENT, Constants.ENVIRONMENT_DEFAULT));
			tagsText.setText(configuration.getAttribute(Constants.TAG_EXPRESSION_DEFAULT, Constants.TAG_EXPRESSION_DEFAULT));
			parallelsText.setText(configuration.getAttribute(Constants.PARALLEL_NUMBER, Constants.PARALLEL_NUMBER_DEFAULT));
			parallelRunCheckBox.setEnabled(configuration.getAttribute(Constants.PARALLEL_ENABLED, Constants.PARALLEL_ENABLED_DEFAULT));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(Constants.SPECS_TO_EXECUTE, specsText.getText());
		configuration.setAttribute(Constants.ENVIRONMENT, environmentText.getText());
		configuration.setAttribute(Constants.PARALLEL_NUMBER, parallelsText.getText());
		configuration.setAttribute(Constants.TAG_EXPRESSION, tagsText.getText());
		configuration.setAttribute(Constants.PARALLEL_ENABLED, parallelRunCheckBox.getSelection());
	}

	public String getName() {
		return Constants.TAB_NAME;
	}
}
