package model;

public abstract class AbstractTask {
	
	protected int workersCommitted;
	protected String actionCommand, category, name, taskType;
	
	
	public AbstractTask(String a, String c, String n){
		actionCommand=a;
		category=c;
		name=n;		
		workersCommitted=0;
		
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
	public String getTaskType(){
		return taskType;
	}
	public int getWorkersCommitted(){
		return workersCommitted;
	}
	
	public void workerCommitted(){
		workersCommitted++;
	}

	public void setWorkersCommitted(int i){
		workersCommitted=i;
	}
	
	
	
	
	
}
