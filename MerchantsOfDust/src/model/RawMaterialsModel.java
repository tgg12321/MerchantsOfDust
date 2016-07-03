package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JLabel;

public class RawMaterialsModel {
	
	private TasksModel tModel;
	private ArrayList<Resource> resourceList;
	
	public RawMaterialsModel(TasksModel t) {
		tModel=t;
		resourceList=new ArrayList<Resource>();
		fillResourceList();
		
	}
	
	public ArrayList<JLabel> getCollectedMaterials(String category){
		ArrayList<JLabel> jlist= new ArrayList<JLabel>();
		
		for(AbstractTask gt: tModel.getCategoryList(category)){
			jlist.add(new JLabel(gt.getName()+" Ore: "+ ((GatheringTask) gt).getGathered()));
		}
		return jlist;
	}
	
	public void fillResourceList(){
		 DecimalFormat df= new DecimalFormat("#.##");
		for(AbstractTask gt: tModel.getAbstractList()){
			resourceList.add(new Resource(gt,new JLabel(gt.getName()+" : "+ df.format(((GatheringTask) gt).getGathered())+ " tons")));
		}
	}
	
	public ArrayList<Resource> getResourceList(){
		return resourceList;
	}

}
