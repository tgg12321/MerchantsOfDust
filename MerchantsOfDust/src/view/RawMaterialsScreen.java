package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RawMaterialsScreen extends JPanel{

	public RawMaterialsScreen() {
		setLayout(null);
		this.setSize(800, 800);
		
		JButton gameButton = new JButton("Back");
		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Game");
			}
		});
		gameButton.setBounds(23, 716, 96, 41);
		add(gameButton);
	
	}

}
