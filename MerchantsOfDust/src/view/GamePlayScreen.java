package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import controllers.NextDayController;

public class GamePlayScreen extends JPanel {

	private NextDayController nController;
	private boolean running=true;
	private JProgressBar progressBar;
	
	public GamePlayScreen(NextDayController nc) {
		
		nController=nc;
		progressBar = new JProgressBar();
		progressBar.setString("Day "+ nController.getNextDayModel().getDay());
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
		
		
		progressBar.setStringPainted(true);
		progressBar.setBounds(146, 667, 507, 58);
		add(progressBar);
		
		
		JButton btnNewButton = nController.getNextDayButton();
		btnNewButton.setBounds(355, 632, 89, 23);
		add(btnNewButton);
		
		
		
		
		
	}
	public void setProgress(int x){
		progressBar.setValue(x);
	}
	
	public void repaintProgress(){
		progressBar.repaint();
	}
	public void nextDay(){
		
			nController.getNextDayModel().triggerModelNextDay();
			progressBar.setString("Day "+ nController.getNextDayModel().getDay());
			nController.getTasksController().triggerNextDay();
			nController.getRawMaterialsController().getRawMaterialsScreen().repaintResources();

	}
	
	public JProgressBar getProgressBar(){
		return progressBar;
	}
	
}
