package com.thoughtworks.gauge.eclipse.ui.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.thoughtworks.gauge.eclipse.project.GaugeProjectCreator;

public class ImportGaugeProjectWizard extends Wizard implements IImportWizard {

	private WizardNewProjectCreationPage importProjectPage;
	private IConfigurationElement configurationElement;

	public ImportGaugeProjectWizard() {
		setWindowTitle("Import Gauge Project");
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configurationElement = config;
	}

	public boolean performFinish() {
		String name = importProjectPage.getProjectName();
		IPath projectPath = importProjectPage.getLocationPath();
		new GaugeProjectCreator(name, projectPath).addProjectToWorkspace();
		BasicNewProjectResourceWizard.updatePerspective(configurationElement);
		return true;
	}

	public void addPages() {
		super.addPages();
		importProjectPage = new GaugeProjectImportWizardPage("Gauge Project Import Wizard");
		importProjectPage.setTitle("Import Gauge Project");
		importProjectPage.setDescription("Import a Gauge Test Project into Eclipse");
		addPage(importProjectPage);
	}
}
