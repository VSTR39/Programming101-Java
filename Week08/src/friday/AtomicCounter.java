package friday;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
	private AtomicInteger c;

	public AtomicCounter(int x) {
		this.c = new AtomicInteger(x);
	}

	public void increment() {
		c.incrementAndGet();
	}

	public void decrement() {
		c.decrementAndGet();
	}

	public int getX() {
		return c.get();
	}

}