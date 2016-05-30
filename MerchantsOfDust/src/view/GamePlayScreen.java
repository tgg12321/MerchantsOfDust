package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import controllers.gameController;

public class GamePlayScreen extends JPanel {

	private static gameController gController;
	private boolean running=true;
	public GamePlayScreen() {
		
		gController= new gameController();
		setLayout(null);
		
		JLabel lblHowWillYou = new JLabel("How will you spend your day?");
		lblHowWillYou.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHowWillYou.setBounds(299, 19, 202, 35);
		add(lblHowWillYou);
		
		JButton button = new JButton("Assets");
		button.setBounds(343, 139, 118, 70);
		add(button);
		
		JButton button_1 = new JButton("Raw Materials");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(555, 139, 123, 70);
		add(button_1);
		
		JButton button_2 = new JButton("Tasks");
		button_2.setBounds(126, 139, 123, 70);
		add(button_2);
		
		JProgressBar progressBar = gController.getProgressBar();
		progressBar.setBounds(146, 667, 507, 58);
		add(progressBar);
		
		
		JButton btnNewButton = gController.getNextDayButton();
		btnNewButton.setBounds(355, 632, 89, 23);
		add(btnNewButton);
		
		JLabel lblDay = gController.getDayLabel();
		lblDay.setBounds(10, 11, 46, 14);
		add(lblDay);
		
		
		
	}
}
