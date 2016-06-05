package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import buttonControllers.CommitWorkerController;
import buttonControllers.JRadioWorkerButton;
import controllers.GameController;
import controllers.RadioListener;
import controllers.TasksScreenController;

public class TasksScreen extends JPanel{

	private TasksScreenController tController;
	
	public TasksScreen() {
		this.setSize(800, 800);
		tController = new TasksScreenController();
		JButton gameButton = new JButton("Back");
		gameButton.setBounds(23, 716, 96, 41);
		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Game");
			}
		});
		setLayout(null);
		add(gameButton);
		
		JButton btnCommitWorker = tController.getCommitButton();
		btnCommitWorker.setBounds(284, 716, 197, 41);
		add(btnCommitWorker);
		
		ButtonGroup bGroup= tController.getButtonGroup();
							
		JPanel panel = new JPanel();
		panel.setBounds(107, 87, 76, 346);
		add(panel);
		panel.setLayout(null);
							
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 114, 21);
		panel.add(menuBar);
								
		JMenu mnMining = new JMenu("Mining");
		menuBar.add(mnMining);
		
		bGroup.add(mnMining);						
		mnMining.setEnabled(true);
								
		JRadioWorkerButton rdbtnmntmIron = new JRadioWorkerButton("Iron");
		
		mnMining.add(rdbtnmntmIron);
		bGroup.add(rdbtnmntmIron);	
		rdbtnmntmIron.addActionListener(new RadioListener(rdbtnmntmIron));
		rdbtnmntmIron.setActionCommand("Mining Iron");	
		tController.addToTaskList(rdbtnmntmIron);
		
		JRadioWorkerButton rdbtnmntmCopper = new JRadioWorkerButton("Copper");
		mnMining.add(rdbtnmntmCopper);
		bGroup.add(rdbtnmntmCopper);	
		rdbtnmntmCopper.addActionListener(new RadioListener(rdbtnmntmCopper));
		rdbtnmntmCopper.setActionCommand("Mining Copper");							
		tController.addToTaskList(rdbtnmntmCopper);
		
		JRadioWorkerButton rdbtnmntmCoal = new JRadioWorkerButton("Coal");
		mnMining.add(rdbtnmntmCoal);
		bGroup.add(rdbtnmntmCoal);	
		rdbtnmntmCoal.addActionListener(new RadioListener(rdbtnmntmCoal));
		rdbtnmntmCoal.setActionCommand("Mining Coal");	
		tController.addToTaskList(rdbtnmntmCoal);
		
		JLabel label = tController.getLabel();
		label.setBounds(501, 729, 96, 14);
		add(label);
	}
	

	
}
