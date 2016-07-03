package controllers;

import models.MainModel;
import view.MainView;

public class GameController{
		private MainView mainView;
		private MainModel mainModel;
		
		public GameController(){
			mainView = new MainView();
		}
		
		public MainView getMainView(){
			return mainView;
		}
}
