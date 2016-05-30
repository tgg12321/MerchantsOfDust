package view;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import buttonControllers.ExitBController;

public class GameOverScreen extends JPanel{

	private static int winner;

	
	public GameOverScreen() {
		

		this.setLayout(new GridBagLayout());
	
		GridBagConstraints gbc_lblWargame = new GridBagConstraints();
		gbc_lblWargame.anchor = GridBagConstraints.NORTH;
		gbc_lblWargame.insets = new Insets(0, 0, 5, 0);
		gbc_lblWargame.gridx = 1;
		gbc_lblWargame.gridy = 0;

		
		Component verticalStrut = Box.createVerticalStrut(80);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.gridheight = 3;
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 1;
		add(verticalStrut, gbc_verticalStrut);

		JButton btnEXButton=new JButton();
		btnEXButton.setText("Exit");
		GridBagConstraints gbc_btnEXButton = new GridBagConstraints();
		gbc_btnEXButton.gridx = 1;
		gbc_btnEXButton.gridy = 7;
		btnEXButton.addActionListener(new ExitBController());
		this.add(btnEXButton, gbc_btnEXButton);
		
	}

}
