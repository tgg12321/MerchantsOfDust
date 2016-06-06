package buttonControllers;

import javax.swing.JRadioButtonMenuItem;

import model.GatheringTask;

public class JRadioWorkerButton extends JRadioButtonMenuItem {

	private GatheringTask gt;
	private String name;
	public JRadioWorkerButton() {
		super();
	}
	
	public JRadioWorkerButton(String s, GatheringTask g){
		super(s);
		name=s;
		gt=g;
		
		if(gt.getWorkersCommitted()!=0){
			this.setText(s+ " "+ gt.getWorkersCommitted());
		}
	}
	
	
	public String getName(){
		return name;
	}
	
	public GatheringTask getGatheringTask(){
		return gt;
	}
	
}
