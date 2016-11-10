package org.eclipse.epsilon.emc.ada.dt;

import org.eclipse.epsilon.common.dt.launching.dialogs.AbstractCachedModelConfigurationDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class AdaModelConfigurationDialog extends AbstractCachedModelConfigurationDialog {

	private Text fileText;
	
	@Override
	protected String getModelName() {
		return "Ada Model";
	}

	@Override
	protected String getModelType() {
		return "Ada";
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFileGroup(control);
		createLoadStoreOptionsGroup(control);
	}

	private void createFileGroup(Composite parent) {
		final Composite groupContent = createGroupContainer(parent, "Files", 3);
		
		final Label modelFileLabel = new Label(groupContent, SWT.NONE);
		modelFileLabel.setText("Model file: ");
		
		fileText = new Text(groupContent, SWT.BORDER);
		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		final Button browseFile = new Button(groupContent, SWT.NONE);
		browseFile.setText("Browse Workspace...");
		browseFile.addListener(SWT.Selection, new BrowseWorkspaceForModelsListener(fileText, "Ada files in the workspace", "Select an Ada file"));
		
	}

}
