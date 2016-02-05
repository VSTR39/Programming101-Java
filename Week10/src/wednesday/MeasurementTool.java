package wednesday;

public class MeasurementTool {
	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		int producers = 10;
		int consumers = 10;
		int elementsToBeProducedAndConsumed = 10;
		int maxStackSize = 100;
		Stack<Integer> stack = new Stack<Integer>(maxStackSize, elementsToBeProducedAndConsumed);
		Producer[] producer = new Producer[producers];
		Consumer[] consumer = new Consumer[consumers];
		TestPairs[][] tp = new TestPairs[5][5];
		for (i = 0; i < producers; i++) {
			producer[i] = new Producer(stack);
			consumer[i] = new Consumer(stack);
			producer[i].start();
			consumer[i].start();
			producer[i].join();
			consumer[i].join();
		}

	}
}
