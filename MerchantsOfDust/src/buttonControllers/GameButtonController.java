package buttonControllers;

import java.awt.event.ActionEvent;

import view.MainView;




public class GameButtonController extends ButtonController{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		MainView.c1.show(MainView.mainViewScreen,"Game");
		
	}
	
	
	
	

}
