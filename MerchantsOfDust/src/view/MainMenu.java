package view;


import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//main menu, should be fairly straightforward. buttons are to be implemented w/ CController

import models.WorldMapModel;

public class MainMenu extends JPanel{
	
	public MainMenu(){
	
		this.setLayout(new GridBagLayout());
		
		JLabel lblWargame = new JLabel("World Sim");
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
		
		JButton btnBEButton= new JButton();
		btnBEButton.setText("Begin");
		GridBagConstraints gbc_btnMPButton = new GridBagConstraints();
		gbc_btnMPButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnMPButton.gridx = 1;
		gbc_btnMPButton.gridy = 5;
		
		btnBEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Game");
				WorldMapModel wm= new WorldMapModel();
			}
		});
		this.add(btnBEButton, gbc_btnMPButton);
		
		JButton btnOPButton=new JButton();		
		btnOPButton.setText("Options");
		GridBagConstraints gbc_btnOPButton = new GridBagConstraints();
		gbc_btnOPButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnOPButton.gridx = 1;
		gbc_btnOPButton.gridy = 6;
	
		btnOPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Options");
			}
		});
		this.add(btnOPButton, gbc_btnOPButton);
		
		JButton btnEXButton=new JButton();
		btnEXButton.setText("Exit");
		GridBagConstraints gbc_btnEXButton = new GridBagConstraints();
		gbc_btnEXButton.gridx = 1;
		gbc_btnEXButton.gridy = 7;
		
		btnEXButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.add(btnEXButton, gbc_btnEXButton);
		
		
	}

}
