package controllers;

import javax.swing.JButton;
import javax.swing.JProgressBar;

import view.TasksScreen;
import buttonControllers.NextDayButtonController;

public class GameController {
	public static boolean bnextDay;
	public static int day;
	private static JProgressBar progressBar;
	private NextDayButtonController nDayBC;
	private JButton nextDayButton;
	private static int workerCount, maxWorkers;
	
	public GameController() {
		workerCount=5;
		maxWorkers=workerCount;
		bnextDay=false;
		progressBar = new JProgressBar();
		day=1;
		nDayBC= new NextDayButtonController();
		nextDayButton = new JButton();
		nextDayButton.setText("Next Day");
		nextDayButton.addActionListener(nDayBC);
		progressBar.setString("Day"+ day);
	}

	public JProgressBar getProgressBar(){
		return progressBar;
	}
	
	public JButton getNextDayButton(){
		return nextDayButton;
	}
	

	public static void setProgress(int x){
		progressBar.setValue(x);
	}
	
	public static void repaintProgress(){
		progressBar.repaint();
	}
	public static void nextDay(){
			day++;
			progressBar.setString("Day "+ day);
			bnextDay=false;
			workerCount=maxWorkers;
			TasksScreen.resetCommittedWorkers();
			TasksScreen.repaintWorkerButton();
		
			
	}
	public static void nDayProgress(){
		bnextDay=true;
	}
	
	public static int getWorkerCount(){
		return workerCount;
	}
	
	public static void setWorkerCount(int s){
		workerCount=s;
	}
	
	
	
	
}
