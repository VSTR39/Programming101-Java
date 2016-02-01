package friday;

public class MainVisibility {
public static class VisibilityExampleThread extends Thread{
	volatile boolean keepRunning = true;
	
	public void setToFalse(){
		keepRunning = false;
	}
	public boolean getValue(){
		return keepRunning;
	}
	public void run(){
		while(keepRunning){}
		System.out.println("I'm done.");
	}
}
	public static void main(String[] args) throws InterruptedException {
		VisibilityExampleThread tr = new VisibilityExampleThread();
		tr.run();
		Thread.sleep(1000);
		tr.setToFalse();
		System.out.println("Set to false");
	}

}