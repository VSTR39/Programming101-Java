package wednesday;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Stack<T> {
	private AtomicInteger mTopOfStack;
	private LinkedList<T> mStack;
	private static int mMaxStackSize;
	private static int mElements;
	

	public int getElements() {
		return mElements;
	}

	public static void setElements(int mElements) {
		Stack.mElements = mElements;
	}

	public void setTopOfStack(int topOfStack) {
		mTopOfStack.getAndSet(topOfStack);
	}

	public int getTopOfStack() {
		return mTopOfStack.addAndGet(0);
	}

	public int getMaxStackSize() {
		return mMaxStackSize;
	}

	public static void setMaxStackSize(int mMaxStackSize) {
		Stack.mMaxStackSize = mMaxStackSize;
	}

	public Stack() {
		mStack = new LinkedList<T>();
		mTopOfStack = new AtomicInteger(0);
	}

	public Stack(int size,int elements) {
		mStack = new LinkedList<T>();
		mTopOfStack = new AtomicInteger(0);
		mMaxStackSize = size;
		mElements = elements;
	}

	public synchronized void put(T e) {
		while (mStack.size() == mMaxStackSize) {
			try {
				wait();
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		mStack.add(e);
		//System.out.println("Top of Stack is:" + mTopOfStack);
		//this.setTopOfStack(mTopOfStack.getAndAdd(1));
		notifyAll();
	}

	public boolean isEmpty() {
		return (0 == mTopOfStack.addAndGet(0));
	}

	public synchronized T get() {
		T result = null;
		while (this.isEmpty()) {
			// notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("Top of Stack is1:" + mTopOfStack);
		result = mStack.remove(this.getTopOfStack() - 1);
		
		this.setTopOfStack(mTopOfStack.decrementAndGet());
		//System.out.println("Top of Stack is2:" + mTopOfStack);
		notifyAll();
		return result;

	}
}
