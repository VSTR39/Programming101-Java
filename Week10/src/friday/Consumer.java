package friday;

import java.util.concurrent.atomic.AtomicInteger;

public class Consumer extends Thread{

	private static AtomicInteger mElementsToBeConsumed;
	private Memory mMemory;
	private AtomicInteger mOddNumbersCount;

	public Consumer(Memory memory, int elementsToBeConsumed) {
		mMemory = memory;
		mElementsToBeConsumed = new AtomicInteger(elementsToBeConsumed);
		mOddNumbersCount = new AtomicInteger(0);
	}
	
	private boolean isEven(int number){
		return (number%2==0);
	}
	
	public void consume(int index) throws InterruptedException{
		if(!isEven((int) mMemory.get(index))){
			mOddNumbersCount.incrementAndGet();
		}
		mElementsToBeConsumed.decrementAndGet();
	}
	public void run(){
		try {
			consume(mMemory.getSize());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
