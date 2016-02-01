package friday;

public class AtomicCustomThread extends Thread {
	private AtomicCounter cnt;

	public AtomicCustomThread(AtomicCounter c) {
		this.cnt = c;
	}

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			cnt.increment();
		}
	}
}
