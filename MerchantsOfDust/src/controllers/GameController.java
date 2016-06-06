package controllers;

import view.GamePlayScreen;
import view.MainView;

public class GameController {
	private static MainView view;
	private TasksScreenController tController;
	private NextDayController nController;
	private RawMaterialsController rController;
	
		public GameController() {
			view= new MainView();
			
			tController = new TasksScreenController();
			rController= new RawMaterialsController(tController);
			nController= new NextDayController(tController, rController);

			
			view.addToMainView(nController.getNextDayScreen(), "Game");
			view.addToMainView(tController.getTasksScreenView(), "Tasks");
			view.addToMainView(rController.getRawMaterialsScreen(), "Raw");
		}
		
		public MainView getMainView(){
			return view;
		}
}	
