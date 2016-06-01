package controllers;

public class ThreadController implements Runnable {

	public ThreadController() {
		 
	}

	@Override
	public void run() {
		
		for (int i=0; i<=100; i++){
			    GameController.setProgress(i);
			    GameController.repaintProgress();
			   
			    try{Thread.sleep(15);}
			    catch (InterruptedException err){}
			
			}

		   GameController.nextDay();
		   GameController.setProgress(0);
	}

}
