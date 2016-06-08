package controllers;

import model.RawMaterialsModel;
import view.RawMaterialsScreen;

public class RawMaterialsController {

	private RawMaterialsModel rModel;
	private RawMaterialsScreen rScreen;
	private TasksScreenController tController;
	
	public RawMaterialsController(TasksScreenController tc) {
		tController=tc;
		rModel=new RawMaterialsModel(tController.getTasksModel());
		rScreen=new RawMaterialsScreen(this);
		
	}

	public RawMaterialsModel getRawMaterialsModel(){
		return rModel;
	}
	public RawMaterialsScreen getRawMaterialsScreen(){
		return rScreen;
	}
	
	public TasksScreenController getTasksScreenController(){
		return tController;
	}
	
}
