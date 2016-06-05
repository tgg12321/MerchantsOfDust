package buttonControllers;

import java.awt.event.ActionEvent;

import controllers.GameController;
import controllers.TasksScreenController;

public class CommitWorkerController extends ButtonController{

	public CommitWorkerController() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((TasksScreenController.getWorkerCount()>0)){
			TasksScreenController.setWorkerCount((TasksScreenController.getWorkerCount())-1);
			TasksScreenController.repaintWorkerButton();
			TasksScreenController.workerCommitted();
		}
		
	}

}
