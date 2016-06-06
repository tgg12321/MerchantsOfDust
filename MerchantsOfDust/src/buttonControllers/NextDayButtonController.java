package buttonControllers;

import java.awt.event.ActionEvent;

import model.NextDayModel;
import controllers.NextDayController;
import controllers.ThreadController;

public class NextDayButtonController extends ButtonController {
	
	private NextDayController nController;
	
	public NextDayButtonController(NextDayController nc) {
		nController=nc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!NextDayModel.getbNextDay()){
			NextDayModel.nDayProgress();
			new Thread(new ThreadController(nController)).start();
		}
	}
	
}
