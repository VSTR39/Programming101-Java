package wednesday;

import java.util.Random;

public class Consumer extends Thread {
	private Stack<Integer> mStack;

	public Consumer(Stack<Integer> stack) {
		mStack = stack;

	}

	public void run() {
		while (mStack.getTopOfStack() > 0) {
			Integer x = mStack.get();
			System.out.println("Consumer: " + Thread.currentThread().getName() + "just extracted element" + ":" + x
					+ " from position " + mStack.getTopOfStack() + " in the queue.");
			//mStack.setTopOfStack((mStack.getTopOfStack() - 1));

		}
	}

}
