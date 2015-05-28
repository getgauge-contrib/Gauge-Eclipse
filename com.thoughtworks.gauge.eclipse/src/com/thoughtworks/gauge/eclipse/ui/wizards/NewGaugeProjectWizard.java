package com.thoughtworks.gauge.eclipse.ui.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.thoughtworks.gauge.eclipse.project.GaugeProjectCreator;

public class NewGaugeProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private WizardNewProjectCreationPage _newProjectPage;
	private IConfigurationElement _configurationElement;

	public NewGaugeProjectWizard() {
		setWindowTitle("New Gauge Project");
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}

	@Override
	public boolean performFinish() {
		String name = _newProjectPage.getProjectName();
		
		if (_newProjectPage.useDefaults()) {
			new GaugeProjectCreator(name, _newProjectPage.getLocationPath().append(name)).createProject();
		} else {
			new GaugeProjectCreator(name, _newProjectPage.getLocationPath()).createProject();
		}
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		return true;
	}

	@Override
	public void addPages() {
		super.addPages();
		_newProjectPage = new WizardNewProjectCreationPage(
				"New Gauge Project Wizard");
		_newProjectPage.setTitle("New Gauge Project");
		_newProjectPage.setDescription("Create a new Gauge Test Project.");

		addPage(_newProjectPage);
	}

}
