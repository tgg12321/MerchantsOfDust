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

import model.GatheringTask;
import model.TasksModel;
import buttonControllers.CommitWorkerController;
import buttonControllers.JRadioWorkerButton;
import controllers.RadioListener;
import controllers.TasksScreenController;

public class TasksScreen extends JPanel{

	private static ButtonGroup bGroup;
	private static JButton btnCommitWorker;
	private static JLabel label;
	private static TasksScreenController tController;
	
	public TasksScreen(TasksScreenController tc) {
		this.setSize(800, 800);
		tController= tc;
		
		JButton gameButton = new JButton("Back");
		gameButton.setBounds(23, 716, 96, 41);
		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainView.getCardLayout().show(MainView.mainViewScreen, "Game");
			}
		});
		
		label = new JLabel("No Task Selected");
		bGroup= new ButtonGroup();
		btnCommitWorker= new JButton("Commit Worker " +"( "+ tController.getTasksModel().getWorkerCount()+ " )");
		btnCommitWorker.addActionListener(new CommitWorkerController(tController));
		setLayout(null);
		add(gameButton);
		
		btnCommitWorker.setBounds(284, 716, 197, 41);
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
		
		fillJMenu("Mining", mnMining, tController.getTasksModel(), bGroup);
		
		
		label.setBounds(501, 729, 145, 14);
		add(label);
	}
	
	public void fillJMenu(String category, JMenu menu, TasksModel tModel, ButtonGroup bGroup){
		ArrayList<GatheringTask> gList= tModel.getCategoryList(category);
		for(GatheringTask gt : gList){
			JRadioWorkerButton button= new JRadioWorkerButton(gt.getName(), gt);
			menu.add(button);
			bGroup.add(button);
			button.addActionListener(new RadioListener(button));
			button.setActionCommand(gt.getActionCommand());
			tController.addToTaskList(button);	
				
		}
		
	}

	public JLabel getLabel(){
		return label;
	}
	
	public ButtonGroup getButtonGroup(){
		return bGroup;
	}

	public static void setWorkerString(String w){
		label.setText(w);
	}
	public static String getBGroupSelection(){
		return bGroup.getSelection().getActionCommand();
	}
	
	public JButton getCommitButton(){
		return btnCommitWorker;
	}
	
	public void repaintWorkerButton(){
		
		btnCommitWorker.setText("Commit Worker " + "( " + tController.getTasksModel().getWorkerCount() + " )");
		if(tController.getTasksModel().getWorkerCount()==0){
			btnCommitWorker.setEnabled(false);
		}else{
			btnCommitWorker.setEnabled(true);
		}
	}
	
	public void workerCommitted(){
		JRadioWorkerButton worker = tController.findTask(getBGroupSelection());
		worker.getGatheringTask().workerCommitted();
		worker.setText(worker.getName()+ " ( "+ worker.getGatheringTask().getWorkersCommitted()+ " )");
			
	}
	
	public static void resetCommittedWorkers(){
		for(int i =0; i< tController.getTaskList().size(); i++){
			tController.getTaskList().get(i).getGatheringTask().setWorkersCommitted(0);
			tController.getTaskList().get(i).setText(tController.getTaskList().get(i).getName());
		}
		
	}
	
}
