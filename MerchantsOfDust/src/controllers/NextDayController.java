package controllers;

import javax.swing.JButton;
import javax.swing.JProgressBar;

import model.NextDayModel;
import view.GamePlayScreen;
import buttonControllers.NextDayButtonController;

public class NextDayController {


	
	
	private NextDayButtonController nDayBC;
	private JButton nextDayButton;
	private  NextDayModel nDayModel;
	private GamePlayScreen gamePlayScreen;
	private TasksScreenController tcController;
	private RawMaterialsController rController;
	
	public NextDayController(TasksScreenController tc, RawMaterialsController rc) {
		tcController=tc;
		rController=rc;
		
		nDayModel= new NextDayModel(tcController.getTasksModel());
		nDayBC= new NextDayButtonController(this);
		
		
		nextDayButton = new JButton();
		
		
		nextDayButton.setText("Next Day");
		nextDayButton.addActionListener(nDayBC);
		gamePlayScreen= new GamePlayScreen(this);
		
	}

	
	public JButton getNextDayButton(){
		return nextDayButton; 
	}
	

	
	public GamePlayScreen getNextDayScreen(){
		return gamePlayScreen;
	}
	
	public NextDayModel getNextDayModel(){
		return nDayModel;
	}
	
	public TasksScreenController getTasksController(){
		return tcController;
	}
	
	public RawMaterialsController getRawMaterialsController(){
		return rController;
	}
	
	
}
