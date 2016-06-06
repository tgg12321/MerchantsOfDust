package controllers;


public class ThreadController implements Runnable {
	
	private NextDayController nController;
	public ThreadController(NextDayController nc) {
		 nController=nc;
	}

	@Override
	public void run() {
		
		for (int i=0; i<=100; i++){
			   nController.getNextDayScreen().setProgress(i);
			   nController.getNextDayScreen().repaintProgress();
			   
			    try{Thread.sleep(15);}
			    catch (InterruptedException err){}
			
			}

		nController.getNextDayScreen().nextDay();
		nController.getNextDayScreen().setProgress(0);
	}

}
