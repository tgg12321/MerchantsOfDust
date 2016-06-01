package buttonControllers;

import javax.swing.JRadioButtonMenuItem;

public class JRadioWorkerButton extends JRadioButtonMenuItem {

	private int workersCommitted;
	private String name;
	public JRadioWorkerButton() {
		super();
	}
	
	public JRadioWorkerButton(String s){
		super(s);
		name=s;
		if(workersCommitted!=0){
			this.setText(s+ " "+ workersCommitted);
		}
	}
	public void addWorker(){
		workersCommitted++;
	}
	public int getWorkersCommitted(){
		return workersCommitted;
	}
	
	public String getName(){
		return name;
	}
	
	public void setWorkersCommitted(int i){
		workersCommitted=i;
	}
	
}
