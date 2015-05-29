package com.thoughtworks.gauge.eclipse.ui.wizards;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import com.thoughtworks.gauge.eclipse.util.GaugeProjectUtil;

public class GaugeProjectImportWizardPage extends WizardNewProjectCreationPage {

	public GaugeProjectImportWizardPage(String pageName) {
		super(pageName);
	}
	
	protected boolean validatePage() {
		Boolean valid =  super.validatePage();
		if (valid) {
			if (!GaugeProjectUtil.isGaugeProject(getLocationPath().toFile())) {
				setErrorMessage("Select a valid Gauge project");
				setMessage("Select a valid Gauge Project");
				valid = false;
			}
		}
		return valid;
	}
}
