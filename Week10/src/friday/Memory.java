package friday;

import java.util.LinkedList;

public class Memory<T> {
	private LinkedList<T> mMemory;
	private MemoryLock lock;

	public Memory() {
		mMemory = new LinkedList<>();
		lock = new MemoryLock();
	}
	
	public int getSize(){
		return mMemory.size();
	}

	public void put(T e) throws InterruptedException {
		lock.lock();
		mMemory.add(e);
		lock.unlock();
	}

	public T get(int index) throws InterruptedException {
		lock.lock();
		T result = null;
		result = mMemory.get(index);
		lock.unlock();
		return result;
	}
}
