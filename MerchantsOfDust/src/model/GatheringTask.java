package model;

import java.text.DecimalFormat;
import java.util.Random;

public class GatheringTask extends AbstractTask{
	
	private double maxGatherable, minGatherable;
	private double gathered;
	
	public GatheringTask(String a, String c, String n, double max, double min) {
		super(a,c,n);
		taskType="GatheringTask";
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
	
	
	public double getGathered(){
		return gathered;
	}
	
	
	
	
}
