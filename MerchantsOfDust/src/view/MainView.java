package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainView extends JFrame{ //View is a frame with a Cardlayout, to change from one screen to another (like from main menu to options menu) simply use show in cardlayout
	
	public static JPanel mainViewScreen;
	private MainMenu mainMenu;
	private OptionsMenu optionsMenu;
	
	private GamePlayScreen gamePlay;
	private AssetScreen assets;
	private RawMaterialsScreen rawScreen;

	
	public static CardLayout c1;

	
	public MainView(){
		
		super("World Sim");
		c1=new CardLayout();
		
		mainViewScreen=new JPanel();
		mainViewScreen.setLayout(c1);

		this.add(mainViewScreen);
		
		mainMenu=new MainMenu();
		mainViewScreen.add(mainMenu, "Main");
		
		optionsMenu=new OptionsMenu();
		mainViewScreen.add(optionsMenu,"Options");
		
		assets = new AssetScreen();
		mainViewScreen.add(assets, "Assets");
		
		
		
	}
	
	public void addToMainView(JPanel panel, String s){
			mainViewScreen.add(panel, s);
	}
		

	
	public static CardLayout getCardLayout(){
		return c1;
	}
	

	
}