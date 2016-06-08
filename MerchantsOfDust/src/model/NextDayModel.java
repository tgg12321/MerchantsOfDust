package model;

import controllers.TasksScreenController;

public class NextDayModel {
	
	private int day;
	private static boolean bnextDay;
	private TasksModel tModel;
	
	public NextDayModel(TasksModel tm) {
		tModel=tm;
		day=1;
		bnextDay=false;
	}
	
	public void triggerModelNextDay(){
		day++;
		bnextDay=false;
		tModel.gatherAll();
	}
	
	public int getDay(){
		return day;
	}
	
	
	public static void nDayProgress(){
		bnextDay=true;
	}
	
	public static boolean getbNextDay(){
		return bnextDay;
	}
}
