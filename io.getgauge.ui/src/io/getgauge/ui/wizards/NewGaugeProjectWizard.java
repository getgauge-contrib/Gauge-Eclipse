package io.getgauge.ui.wizards;

import io.getgauge.ui.project.GaugeProjectCreator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class NewGaugeProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private WizardNewProjectCreationPage _newProjectPage;
	private IConfigurationElement _configurationElement;

	public NewGaugeProjectWizard() {
		setWindowTitle("New Gauge Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}

	@Override
	public boolean performFinish() {
		String name = _newProjectPage.getProjectName();
		new GaugeProjectCreator(name).createProject();
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
