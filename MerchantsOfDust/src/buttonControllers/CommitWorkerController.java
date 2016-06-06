package buttonControllers;

import java.awt.event.ActionEvent;

import controllers.TasksScreenController;

public class CommitWorkerController extends ButtonController{
	
	private TasksScreenController tController;
	public CommitWorkerController(TasksScreenController tc) {
		tController=tc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((tController.getTasksModel().getWorkerCount()>0)){
			tController.getTasksModel().setWorkerCount((tController.getTasksModel().getWorkerCount())-1);
			tController.getTasksScreenView().repaintWorkerButton();
			tController.getTasksScreenView().workerCommitted();
			
		}
		
	}

}
