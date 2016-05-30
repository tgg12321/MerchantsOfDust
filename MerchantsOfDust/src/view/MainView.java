package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import team5.project.main.Nghia;

public class MainView extends JFrame{ //View is a frame with a Cardlayout, to change from one screen to another (like from main menu to options menu) simply use show in cardlayout
	
	public static JPanel mainViewScreen;
	private MainMenu mainMenu;
	private OptionsMenu optionsMenu;
	private GameOverScreen gameOver;
	private GamePlayScreen gamePlay;
	public static CardLayout c1;

	
	public MainView(){
		
		super("Merchants Of Dust");
		c1=new CardLayout();
		
		mainViewScreen=new JPanel();
		mainViewScreen.setLayout(c1);

		this.add(mainViewScreen);
		
		mainMenu=new MainMenu();
		mainViewScreen.add(mainMenu, "Main");
		
		optionsMenu=new OptionsMenu();
		mainViewScreen.add(optionsMenu,"Options");

		gameOver= new GameOverScreen();
		mainViewScreen.add(gameOver, "GameOver");
		
		gamePlay = new GamePlayScreen();
		mainViewScreen.add(gamePlay, "Game");
		
		
	}
	

	
}