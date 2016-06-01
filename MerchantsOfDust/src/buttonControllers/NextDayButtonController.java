package buttonControllers;

import java.awt.event.ActionEvent;

import controllers.ThreadController;
import controllers.GameController;

public class NextDayButtonController extends ButtonController {
	

	
	public NextDayButtonController() {
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!GameController.bnextDay){
			GameController.nDayProgress();
			new Thread(new ThreadController()).start();
		}
	}
	
}
