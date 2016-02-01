package monday;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleBlockingQueue<T> {
	private AtomicInteger mTopOfQueue;
	private AtomicInteger mBottomOfQueue;
	private int mQueueMaxSize = 10;
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

	public boolean put(T e) throws InterruptedException {
		boolean result = false;
		if (this.getQueueMaxSize() > this.getTopOfQueue()) {
			mQueue.add(e);
			setTopOfQueue(mTopOfQueue.incrementAndGet());
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public T poll() throws InterruptedException {
		T result = null;
		if (0 >= this.getTopOfQueue()) {
			result = null;
		} else {
			setTopOfQueue(mTopOfQueue.decrementAndGet());
			result = mQueue.remove(getTopOfQueue());
		}
		return result;
	}

}