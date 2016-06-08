package controllers;

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

import model.TasksModel;
import view.TasksScreen;
import buttonControllers.CommitWorkerController;
import buttonControllers.JRadioWorkerButton;

public class TasksScreenController {
	
	
	private static ArrayList <JRadioWorkerButton> taskList;
	private static TasksModel tModel;
	private TasksScreen tasksScreen;
	
	public TasksScreenController() {
		
		tModel= new TasksModel();
		taskList=new ArrayList <JRadioWorkerButton>();
		tasksScreen= new TasksScreen(this);
	
		
	
	}
	
	public static JRadioWorkerButton findTask(String task){
		for(int i=0; i< taskList.size(); i++){
			if(task.equals(taskList.get(i).getActionCommand())){
				return taskList.get(i);
			}
			
		}
		return null;
	}
	
	public TasksModel getTasksModel(){
		return tModel;
	}
	
	

	public void addToTaskList(JRadioWorkerButton jb){
		taskList.add(jb);
	}
	
	public ArrayList<JRadioWorkerButton> getTaskList(){
		return taskList;
	}

	public TasksScreen getTasksScreenView(){
		return tasksScreen;
	}
	
	public void triggerNextDay(){
		
		tModel.gatherAll();
		tModel.setWorkerCount(tModel.getMaxWorkers());
		TasksScreen.resetCommittedWorkers();
		tasksScreen.repaintWorkerButton();
	
	}
	

}
