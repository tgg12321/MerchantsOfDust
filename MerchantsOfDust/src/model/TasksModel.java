package model;

import java.util.ArrayList;

public class TasksModel {
	
	private int workerCount, maxWorkers;
	
	private ArrayList<GatheringTask> gatherList;
	
	public TasksModel() {
		
		workerCount=5;
		maxWorkers=workerCount;
		gatherList= new ArrayList<GatheringTask>();
		fillGatherList(gatherList);
	}
	
	public void fillGatherList(ArrayList<GatheringTask> gList){
		gList.add(new GatheringTask("Mining Iron", "Mining", "Iron", .01, .03));
		gList.add(new GatheringTask("Mining Copper", "Mining","Copper", .01, .03));
		gList.add(new GatheringTask("Mining Coal", "Mining", "Coal", .01, .03));
		gList.add(new GatheringTask("Mining Gold", "Mining", "Gold", .01, .03));
	}
	
	public ArrayList<GatheringTask> getCategoryList(String category){
		ArrayList<GatheringTask> gList= new ArrayList<GatheringTask>();
		for(int i=0; i<gatherList.size();i++){
			if(gatherList.get(i).getCategory().equals(category)){
				gList.add(gatherList.get(i));
			}
		}
		return gList;
	}
	
	public int getWorkerCount(){
		return workerCount;
	}
	
	public int getMaxWorkers(){
		return maxWorkers;
	}

	public void setWorkerCount(int i) {
		workerCount=i;
		
	}
	
	public void gatherAll(){
		for(GatheringTask gt : gatherList){
			gt.triggerGather();
		}
	}
	
	public ArrayList<GatheringTask> getGatherList(){
		return gatherList;
	}
	
	public GatheringTask findTask(String name){
		for(GatheringTask gt : gatherList){
			if(gt.getName().equals(name)){
				return gt;
			}
		}
		return null;
	}
	
}
