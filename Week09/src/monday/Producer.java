package monday;

import java.util.Random;

public class Producer extends Thread {
	private SimpleBlockingQueue<Integer> mQueue;

	public Producer() {
		mQueue = new SimpleBlockingQueue<Integer>();
	}

	public Producer(SimpleBlockingQueue<Integer> queue) {
		this.mQueue = queue;
	}

	public SimpleBlockingQueue<Integer> getQueue() {
		return mQueue;
	}

	public void setQueue(SimpleBlockingQueue<Integer> mQueue) {
		this.mQueue = mQueue;
	}

	public void run() {
		Random rand = new Random();
		while (true) {
			try {
				int x = rand.nextInt(100);
				Thread.sleep(1000);
				mQueue.put(x);

				System.out.println("Producer " + Thread.currentThread().getName() + "started production.");
				System.out.println(
						"Producer " + Thread.currentThread().getName() + " have just put " + x + " into the queue.");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
