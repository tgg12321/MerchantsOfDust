package buttonControllers;

import javax.swing.JRadioButtonMenuItem;

import model.AbstractTask;

public class JRadioWorkerButton extends JRadioButtonMenuItem {

	private AbstractTask aTask;
	private String name;
	public JRadioWorkerButton() {
		super();
	}
	
	public JRadioWorkerButton(String s, AbstractTask a){
		super(s);
		name=s;
		aTask=a;
		
		if(aTask.getWorkersCommitted()!=0){
			this.setText(s+ " "+ aTask.getWorkersCommitted());
		}
	}
	
	
	public String getName(){
		return name;
	}
	
	public AbstractTask getAbstractTask(){
		return aTask;
	}
	
}
