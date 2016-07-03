package model;

import javax.swing.JLabel;

public class Resource {

	private AbstractTask gt;
	private JLabel label;
	public Resource(AbstractTask gt2, JLabel l) {
		gt=gt2;
		label=l;

	}

	public AbstractTask getTask(){
		return gt;
	}
	
	public JLabel getJLabel(){
		return label;
	}
}
