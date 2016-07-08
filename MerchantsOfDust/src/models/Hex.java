package models;

public class Hex {
	
	private int tLeft, tRight, left, right, bLeft, bRight, index, row;
	
	public Hex(int i, int tl, int tr, int l, int r, int bl, int br, int ro){
			index=i;
			tLeft=tl;
			tRight=tr;
			left=l;
			right=r;
			bLeft=bl;
			bRight=br;
			row=ro;
			//Region model
	}
	public Hex(int i, int ro){
		index=i;
		row=ro;
	}
	
	public void fillHex(int rowSize, int numRows){
		
		if(row%2==0){//If row is even
		
			tLeft= (index-rowSize);
			tRight=(index-(rowSize-1));
			left= (index-1);
			right= (index+1);
			bLeft= (index+rowSize);
			bRight= (index+(rowSize+1));
			if(index%rowSize==0){
				right=0;
				bRight=0;
				tRight=0;
			}else if((index-1)%rowSize==0){
				left=0;
			}
		}else{//If row is odd
			tLeft= (index-(rowSize+1));
			tRight=(index-(rowSize));
			left= (index-1);
			right= (index+1);
			bLeft= (index+(rowSize-1));
			bRight= (index+rowSize);
			if(index%rowSize==0){
				right=0;
			}else if((index-1)%rowSize==0){
				bLeft=0;
				tLeft=0;
				left=0;
			}
			
		}
		boundHex(numRows);
		
	}
	private void boundHex(int numRows){
		if(tLeft<0){tLeft=0;}
		if(tRight<0){tRight=0;}
		if(left<0){left=0;}
		if(right<0){right=0;}
		if(bLeft<0){bLeft=0;}
		if(bRight<0){bRight=0;}
		if(row==numRows){
			bLeft=0;
			bRight=0;
		}
	}
	public String toString(){
		return "i= "+index +" tl= "+tLeft+" tr= "+tRight+" r= "+right+ " l= "+left+ " bl= "+bLeft+" br= "+bRight+" Row= "+row;
	}
}
