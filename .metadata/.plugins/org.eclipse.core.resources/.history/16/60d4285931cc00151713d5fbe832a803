package friday;

public class CountOddNumbers {
	public static void main(String[] args) throws InterruptedException {
		int cores = Runtime.getRuntime().availableProcessors();
		Memory memory = new Memory();

		Producer[] producers = new Producer[cores / 2];
		Consumer[] consumers = new Consumer[cores / 2];
		long startTime = System.nanoTime();
		for (int i = 0; i < cores / 2; i++) {
			producers[i].start();
			consumers[i].start();
			producers[i].join();
			consumers[i].join();
		}
		long endTime = System.nanoTime();
		System.out.println("Execution Time:" + ((endTime - startTime) / 1_000_000_000));
	}

}
