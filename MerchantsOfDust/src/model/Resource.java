package model;

import javax.swing.JLabel;

public class Resource {

	private GatheringTask gt;
	private JLabel label;
	public Resource(GatheringTask g, JLabel l) {
		gt=g;
		label=l;

	}

	public GatheringTask getGatheringTask(){
		return gt;
	}
	
	public JLabel getJLabel(){
		return label;
	}
}
