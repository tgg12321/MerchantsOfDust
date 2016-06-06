package main;

import javax.swing.JFrame;

import controllers.GameController;


public class Init {
	
	//main function, should be kept as simple as possible. If anything complex must be done, make a new class	
	
	
	private static GameController gController;
	
	public static void main(String[] args){
		
		gController= new GameController();
		gController.getMainView().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gController.getMainView().setSize(800, 800);
		gController.getMainView().setVisible(true);
		gController.getMainView().setResizable(false);
		
		
	}
	

}
