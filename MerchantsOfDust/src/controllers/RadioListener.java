package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;

import view.TasksScreen;

public class RadioListener implements ActionListener{

	private JRadioButtonMenuItem button;
	public RadioListener(JRadioButtonMenuItem b) {
		
		button=b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TasksScreen.setWorkerString(button.getActionCommand());
	}

}
