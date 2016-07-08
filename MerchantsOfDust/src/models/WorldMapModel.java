package models;

import java.util.ArrayList;

public class WorldMapModel {
	
	private ArrayList<Hex> HexList;
	
	public WorldMapModel(){
		HexList=new ArrayList<Hex>();
		generateWorld(5, 5);
		printHexList();
	}
	
	public void generateWorld(int rowSize, int numRows){
		int ind=1;
		for(int i=1; i<=numRows; i++){
			for(int j=1; j<rowSize+1; j++){
				Hex hex= new Hex(ind, i);
				hex.fillHex(rowSize, numRows);
				HexList.add(hex);
				ind++;
			}
			
		}
	}
	public void printHexList(){
		for(int i=0; i<HexList.size();i++){
			System.out.println(HexList.get(i).toString());
		}
	
	}
}
