package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import controllers.GameController;

public class GamePlayScreen extends JPanel {

	private static GameController gController;
	private boolean running=true;
	public GamePlayScreen() {
		
		gController= new GameController();
		setLayout(null);
		
		JLabel lblHowWillYou = new JLabel("How will you spend your day?");
		lblHowWillYou.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHowWillYou.setBounds(299, 19, 202, 35);
		add(lblHowWillYou);
		
		JButton assetButton = new JButton("Assets");
		assetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView.getCardLayout().show(MainView.mainViewScreen, "Assets");
			}
		});
		assetButton.setBounds(343, 139, 118, 70);
		add(assetButton);
		
		JButton rawButton = new JButton("Raw Materials");
		rawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Raw");
			}
		});
		rawButton.setBounds(555, 139, 123, 70);
		add(rawButton);
		
		JButton tasksButton = new JButton("Tasks");
		tasksButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView.getCardLayout().show(MainView.mainViewScreen, "Tasks");
			}
		});
		tasksButton.setBounds(126, 139, 123, 70);
		add(tasksButton);
		
		JProgressBar progressBar = gController.getProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(146, 667, 507, 58);
		add(progressBar);
		
		
		JButton btnNewButton = gController.getNextDayButton();
		btnNewButton.setBounds(355, 632, 89, 23);
		add(btnNewButton);
		
		
		
		
		
	}
}
