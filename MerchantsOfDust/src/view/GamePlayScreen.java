package view;

import javax.swing.JPanel;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GamePlayScreen extends JPanel {

	public GamePlayScreen() {
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
		
	}
}
