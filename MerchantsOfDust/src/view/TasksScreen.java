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

public class TasksScreen extends JPanel{
	private static JLabel label;
	private static JButton btnCommitWorker;
	private static ButtonGroup bGroup;
	private static ArrayList <JRadioWorkerButton> taskList;
	
	public TasksScreen() {
		this.setSize(800, 800);
		
		JButton gameButton = new JButton("Back");
		gameButton.setBounds(23, 716, 96, 41);
		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Game");
			}
		});
		setLayout(null);
		add(gameButton);
		
		taskList=new ArrayList <JRadioWorkerButton>();
		bGroup = new ButtonGroup();
		btnCommitWorker = new JButton("Commit Worker " +"( "+ GameController.getWorkerCount()+ " )");
		btnCommitWorker.setBounds(284, 716, 197, 41);
		btnCommitWorker.addActionListener(new CommitWorkerController());
		add(btnCommitWorker);
		
		
							
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
		taskList.add(rdbtnmntmIron);
		
		JRadioWorkerButton rdbtnmntmCopper = new JRadioWorkerButton("Copper");
		mnMining.add(rdbtnmntmCopper);
		bGroup.add(rdbtnmntmCopper);	
		rdbtnmntmCopper.addActionListener(new RadioListener(rdbtnmntmCopper));
		rdbtnmntmCopper.setActionCommand("Mining Copper");							
		taskList.add(rdbtnmntmCopper);
		
		JRadioWorkerButton rdbtnmntmCoal = new JRadioWorkerButton("Coal");
		mnMining.add(rdbtnmntmCoal);
		bGroup.add(rdbtnmntmCoal);	
		rdbtnmntmCoal.addActionListener(new RadioListener(rdbtnmntmCoal));
		rdbtnmntmCoal.setActionCommand("Mining Coal");	
		taskList.add(rdbtnmntmCoal);
		
		label = new JLabel("No Job Selected");
		label.setBounds(501, 729, 96, 14);
		add(label);
	}
	
	public static void setWorkerString(String w){
		label.setText(w);
	}
	
	public static void repaintWorkerButton(){
		btnCommitWorker.setText("Commit Worker " + "( " + GameController.getWorkerCount()+ " )");
		if(GameController.getWorkerCount()==0){
			btnCommitWorker.setEnabled(false);
		}else{
			btnCommitWorker.setEnabled(true);
		}
	}
	
	public static void workerCommitted(){
		for(int i=0; i< taskList.size(); i++){
			if(getBGroupSelection().equals(taskList.get(i).getActionCommand())){
				taskList.get(i).addWorker();
				taskList.get(i).setText(taskList.get(i).getName()+ " ( "+ taskList.get(i).getWorkersCommitted()+ " )");
				break;
			}
		}
	
	}
	public static void resetCommittedWorkers(){
		for(int i =0; i< taskList.size(); i++){
			taskList.get(i).setWorkersCommitted(0);
			taskList.get(i).setText(taskList.get(i).getName());
		}
		
	}
	
	public static String getBGroupSelection(){
		return bGroup.getSelection().getActionCommand();
	}
}
