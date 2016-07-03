package models;

import java.util.ArrayList;

public class WorldMapModel {
	
	private ArrayList<Hex> HexList;
	
	public WorldMapModel(){
		HexList=new ArrayList<Hex>();
		generateWorld();
		
	}
	
	public void generateWorld(){
		for(int i=0; i<15; i++){
			for(int j=0; j<15; j++){
				HexList.add(new Hex(i,j));
				
			}
		}
	}
}
