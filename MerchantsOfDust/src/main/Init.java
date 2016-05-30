package main;

import javax.swing.JFrame;

import view.MainView;


public class Init {
	
	//main function, should be kept as simple as possible. If anything complex must be done, make a new class	
	
	private static MainView view;
	
	
	public static void main(String[] args){
		
		
		
		view = new MainView();
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(800, 800);
		view.setVisible(true);
		view.setResizable(false);
		
		
	}
	

}
