package friday;

public class MemoryLock {
	private boolean isLocked = false;
	
	public MemoryLock(){
		isLocked = false;
	}

	public synchronized void lock() throws InterruptedException {
		while (isLocked) {
			wait();
		}
		isLocked = true;
	}

	public synchronized void unlock() {
		isLocked = false;
		notify();
	}
}
