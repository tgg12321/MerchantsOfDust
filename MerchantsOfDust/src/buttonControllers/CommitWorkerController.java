package buttonControllers;

import java.awt.event.ActionEvent;

import view.TasksScreen;
import controllers.GameController;

public class CommitWorkerController extends ButtonController{

	public CommitWorkerController() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((GameController.getWorkerCount()>0)){
			GameController.setWorkerCount((GameController.getWorkerCount())-1);
			TasksScreen.repaintWorkerButton();
			TasksScreen.workerCommitted();
		}
		
	}

}
