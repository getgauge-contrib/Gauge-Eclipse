package com.thoughtworks.gauge.eclipse.execution;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class GaugeFolderPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		// TODO Auto-generated method stub
		IFolder folder = (IFolder) receiver;
		try {
			for (IResource resource : folder.members()) {
				if (resource.getFileExtension().equals("spec"))
					return true;
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
