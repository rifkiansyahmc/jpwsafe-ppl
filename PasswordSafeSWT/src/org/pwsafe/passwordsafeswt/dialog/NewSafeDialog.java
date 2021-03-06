package org.pwsafe.passwordsafeswt.dialog;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/*
 * Copyright (c) 2008 David Muller <roxon@users.sourceforge.net>.
 * All rights reserved. Use of the code is allowed under the
 * Artistic License 2.0 terms, as specified in the LICENSE file
 * distributed with this code, or available from
 * http://www.opensource.org/licenses/artistic-license-2.0.php
 */

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.pwsafe.passwordsafeswt.util.ShellHelpers;

import com.virtual.keyboard.start_vk;

/**
 * Prompts the user for passwords for a new safe.
 *
 * @author Glen Smith
 */
public class NewSafeDialog extends Dialog {

	private Text txtVerify;
	private Text txtCombination;
	protected Object result;
	protected Shell shell;
	private Label label;
	private Label lblCombination;
	public NewSafeDialog(Shell parent, int style) {
		super(parent, style);
	}
	public NewSafeDialog(Shell parent) {
		this(parent, SWT.NONE);
	}
	public Object open() {
		createContents();
		ShellHelpers.centreShell(getParent(), shell);
		
		Button btnVirtualKeyboard = new Button(shell, SWT.NONE);
		btnVirtualKeyboard.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				start_vk vk1 = new start_vk();
				vk1.showVK(btnVirtualKeyboard, txtCombination);
			}
		});
		FormData fd_btnVirtualKeyboard = new FormData();
		fd_btnVirtualKeyboard.top = new FormAttachment(lblCombination, -5, SWT.TOP);
		fd_btnVirtualKeyboard.left = new FormAttachment(txtCombination, 6);
		btnVirtualKeyboard.setLayoutData(fd_btnVirtualKeyboard);
		btnVirtualKeyboard.setText("Virtual Keyboard");
		
		Button btnVirtualKeyboard_1 = new Button(shell, SWT.NONE);
		btnVirtualKeyboard_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				start_vk vk2 = new start_vk();
				vk2.showVK(btnVirtualKeyboard_1, txtVerify);
			}
		});
		FormData fd_btnVirtualKeyboard_1 = new FormData();
		fd_btnVirtualKeyboard_1.bottom = new FormAttachment(txtVerify, 0, SWT.BOTTOM);
		fd_btnVirtualKeyboard_1.left = new FormAttachment(txtVerify, 6);
		btnVirtualKeyboard_1.setLayoutData(fd_btnVirtualKeyboard_1);
		btnVirtualKeyboard_1.setText("Virtual Keyboard");
		//shell.pack();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		return result;
	}
	protected void createContents() {
		shell = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell.setLayout(new FormLayout());
		shell.setSize(380, 250);
		shell.setText("Membuat Kombinasi Brankas");
		label = new Label(shell, SWT.WRAP);
		final FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0, 5);
		fd_label.right = new FormAttachment(100, -5);
		fd_label.left = new FormAttachment(0, 5);
		label.setLayoutData(fd_label);
		label.setText("Sebuah database password baru akan dibuat. Kombinasi yang anda masukkan akan digunakan untuk mengenkripsi file database kata kunci. Kombinasi brankas dapat menggunakan kunci apapun di keyboard dan case sensitive.");

		lblCombination = new Label(shell, SWT.NONE);
		final FormData fd_lblCombination = new FormData();
		fd_lblCombination.top = new FormAttachment(label, 33);
		fd_lblCombination.left = new FormAttachment(label, 0, SWT.LEFT);
		lblCombination.setLayoutData(fd_lblCombination);
		lblCombination.setText("Kombinasi Brankas:");

		txtCombination = new Text(shell, SWT.PASSWORD | SWT.BORDER);
		final FormData formData_2 = new FormData();
		formData_2.left = new FormAttachment(lblCombination, 6);
		formData_2.right = new FormAttachment(100, -109);
		txtCombination.setLayoutData(formData_2);

		final Label lblVerify = new Label(shell, SWT.NONE);
		final FormData formData_3 = new FormData();
		formData_3.top = new FormAttachment(lblCombination, 20);
		formData_3.right = new FormAttachment(lblCombination, 0, SWT.RIGHT);
		lblVerify.setLayoutData(formData_3);
		lblVerify.setText("Verifikasi:");

		txtVerify = new Text(shell, SWT.PASSWORD | SWT.BORDER);
		formData_2.bottom = new FormAttachment(100, -105);
		final FormData formData_4 = new FormData();
		formData_4.top = new FormAttachment(txtCombination, 14);
		formData_4.left = new FormAttachment(lblVerify, 6);
		formData_4.right = new FormAttachment(100, -109);
		txtVerify.setLayoutData(formData_4);

		final Button btnCancel = new Button(shell, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
			}
		});
		final FormData formData_7 = new FormData();
		formData_7.width = 80;
		formData_7.bottom = new FormAttachment(100, -10);
		formData_7.left = new FormAttachment(50, -5);
		btnCancel.setLayoutData(formData_7);
		btnCancel.setText("Batalkan");

		final Button btnOk = new Button(shell, SWT.NONE);
		shell.setDefaultButton(btnOk);
		btnOk.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (txtCombination.getText().equals(txtVerify.getText())) {
					result = txtCombination.getText(); 
					shell.dispose();
				} else {
					MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
					mb.setText("Password Tak Sama");
					mb.setMessage("Kedua masukan tidak sama");
					mb.open();
				}
			}
		});
		final FormData formData_6 = new FormData();
		formData_6.width = 80;
		formData_6.top = new FormAttachment(btnCancel, 0, SWT.TOP);
		formData_6.right = new FormAttachment(btnCancel, -10, SWT.LEFT);
		btnOk.setLayoutData(formData_6);
		btnOk.setText("OK");

		final Button btnHelp = new Button(shell, SWT.NONE);
		final FormData formData_8 = new FormData();
		formData_8.width = 80;
		formData_8.top = new FormAttachment(btnCancel, 0, SWT.TOP);
		formData_8.left = new FormAttachment(btnCancel, 10, SWT.RIGHT);
		btnHelp.setLayoutData(formData_8);
		btnHelp.setText("Bantuan");
	}
}