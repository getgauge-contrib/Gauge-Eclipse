package io.getgauge.ui.dialogs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewClassWizardAction;
import org.eclipse.jdt.ui.actions.OrganizeImportsAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;

@SuppressWarnings("restriction")
public class GaugeTypeDialog extends FilteredTypesSelectionDialog {

	private static final int NEW_CLASS = 2;
	private String methodText;


	public GaugeTypeDialog(Shell parent, String methodText) {
		super(parent, false, new ProgressMonitorDialog(parent), SearchEngine.createWorkspaceScope(), IJavaSearchConstants.CLASS);
		// TODO Auto-generated constructor stub
		this.methodText = methodText;
	}

	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		Button newClassButton = createButton(parent, NONE, "New Class", false);
		newClassButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				OpenNewClassWizardAction wizardAction = new OpenNewClassWizardAction();
				wizardAction.run();
				IJavaElement createdElement = wizardAction.getCreatedElement();
				if(createdElement!=null) {
					ICompilationUnit unit = (ICompilationUnit) createdElement.getParent();
					IProgressMonitor monitor = new NullProgressMonitor();
					try {
						IMethod method = unit.getTypes()[0].createMethod(methodText, null, false, monitor);
						JavaEditor editor = (JavaEditor) JavaUI.openInEditor(method);
						new OrganizeImportsAction(editor).run();
					} catch (JavaModelException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					} catch (PartInitException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				}
				setReturnCode(NEW_CLASS);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		super.createButtonsForButtonBar(parent);
	}
}
