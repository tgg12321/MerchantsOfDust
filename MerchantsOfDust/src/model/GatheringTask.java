package model;

import java.text.DecimalFormat;
import java.util.Random;

public class GatheringTask {
	private int workersCommitted;
	private String actionCommand, category, name;
	private double maxGatherable, minGatherable, gathered;
	
	
	public GatheringTask(String a, String c, String n, double max, double min) {
		workersCommitted=0;
		actionCommand=a;
		category=c;
		name=n;		
		maxGatherable=max;
		minGatherable=min;
		gathered=0;
	}
	
	
	public void triggerGather(){
			Random r = new Random(); 
		   
			while(workersCommitted!=0){
				gathered+= ((minGatherable) + (maxGatherable-minGatherable)* r.nextDouble());
				workersCommitted--;
			}
			
	}
	public int getWorkersCommitted(){
		return workersCommitted;
	}
	public double getGathered(){
		return gathered;
	}
	public String getName(){
		return name;
	}
	
	public String getCategory(){
		return category;
	}
	
	public String getActionCommand(){
		return actionCommand;
	}
	
	public void workerCommitted(){
		workersCommitted++;
	}
	public void setWorkersCommitted(int i){
		workersCommitted=i;
	}

}
