package monday;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleBlockingQueue<T> {
	private AtomicInteger mTopOfQueue;
	private AtomicInteger mBottomOfQueue;
	private static int mQueueMaxSize = 10;
	protected ArrayList<T> mQueue;

	public int getTopOfQueue() {
		return mTopOfQueue.get();
	}

	public void setTopOfQueue(int topOfQueue) {
		this.mTopOfQueue = new AtomicInteger(topOfQueue);
	}

	public int getBottomOfQueue() {
		return mBottomOfQueue.get();
	}

	public void setBottomOfQueue(int bottomOfQueue) {
		this.mBottomOfQueue = new AtomicInteger(bottomOfQueue);
	}

	public ArrayList<T> getQueue() {
		return mQueue;
	}

	public int getQueueMaxSize() {
		return mQueueMaxSize;
	}

	public SimpleBlockingQueue() {
		mQueue = new ArrayList<T>();
		setTopOfQueue(0);
		setBottomOfQueue(0);
	}

	public boolean isEmpty() {
		boolean result = true;
		if (mTopOfQueue == mBottomOfQueue) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public synchronized void put(T e) throws InterruptedException {
		while (this.getQueueMaxSize() == mQueue.size()) {
			notifyAll();
			wait();
		}
		mQueue.add(e);
		this.setTopOfQueue(mTopOfQueue.incrementAndGet());
	}

	public synchronized T poll() throws InterruptedException {
		T result = null;
		while (this.getTopOfQueue() < this.getQueueMaxSize()) {
			//notify();
			wait();
		}
		result = mQueue.remove(getBottomOfQueue());
		this.setTopOfQueue(mTopOfQueue.decrementAndGet());
		return result;
	}

}
