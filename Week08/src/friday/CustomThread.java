package friday;

public class CustomThread extends Thread {
	private Counter cnt;

	public CustomThread(Counter c) {
		this.cnt = c;
	}

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			cnt.increment();
		}
	}
}
