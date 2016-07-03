package model;

import java.util.ArrayList;

public class TasksModel {
	
	private int workerCount, maxWorkers;
	
	private ArrayList<AbstractTask> abstractList;
	
	public TasksModel() {
		
		workerCount=5;
		maxWorkers=workerCount;
		abstractList= new ArrayList<AbstractTask>();
		fillAbstractList(abstractList);
	}
	
	public void fillAbstractList(ArrayList<AbstractTask> aList){
		aList.add(new GatheringTask("Mining Iron", "Mining", "Iron", .01, .03));
		aList.add(new GatheringTask("Mining Copper", "Mining","Copper", .01, .03));
		aList.add(new GatheringTask("Mining Coal", "Mining", "Coal", .01, .03));
		aList.add(new GatheringTask("Mining Gold", "Mining", "Gold", .01, .03));
	}
	
	public ArrayList<AbstractTask> getCategoryList(String category){
		ArrayList<AbstractTask> gList= new ArrayList<AbstractTask>();
		for(int i=0; i<abstractList.size();i++){
			if(abstractList.get(i).getCategory().equals(category)){
				gList.add(abstractList.get(i));
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
		for(AbstractTask gt : abstractList){
		
			((GatheringTask) gt).triggerGather();
		}
	}
	
	public ArrayList<AbstractTask> getAbstractList(){
		return abstractList;
	}
	
	public AbstractTask findTask(String name){
		for(AbstractTask gt : abstractList){
			if(gt.getName().equals(name)){
				return gt;
			}
		}
		return null;
	}
	
}
