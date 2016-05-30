package view;


import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//main menu, should be fairly straightforward. buttons are to be implemented w/ CController

import buttonControllers.MainBController;

public class OptionsMenu extends JPanel{
	
	public OptionsMenu(){
	
		this.setLayout(new GridBagLayout());
		
		JLabel lblWargame = new JLabel("Options");
		GridBagConstraints gbc_lblWargame = new GridBagConstraints();
		gbc_lblWargame.anchor = GridBagConstraints.NORTH;
		gbc_lblWargame.insets = new Insets(0, 0, 5, 0);
		gbc_lblWargame.gridx = 1;
		gbc_lblWargame.gridy = 0;
		add(lblWargame, gbc_lblWargame);
		
		Component verticalStrut = Box.createVerticalStrut(80);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.gridheight = 3;
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 1;
		add(verticalStrut, gbc_verticalStrut);
		
		JButton btnOPButton=new JButton();		
		btnOPButton.setText("Add Some options ");
		GridBagConstraints gbc_btnOPButton = new GridBagConstraints();
		gbc_btnOPButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnOPButton.gridx = 1;
		gbc_btnOPButton.gridy = 6;
		this.add(btnOPButton, gbc_btnOPButton);
		
		JButton btnEXButton=new JButton();
		btnEXButton.setText("Back");
		GridBagConstraints gbc_btnEXButton = new GridBagConstraints();
		gbc_btnEXButton.gridx = 1;
		gbc_btnEXButton.gridy = 7;
		btnEXButton.addActionListener(new MainBController());
		this.add(btnEXButton, gbc_btnEXButton);
		
		
	}

}
