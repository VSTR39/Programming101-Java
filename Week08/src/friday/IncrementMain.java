package friday;

public class IncrementMain {
	public static void main(String[] args) throws InterruptedException {
		Counter cnt = new Counter(400);
		CustomThread tr1 = new CustomThread(cnt);
		CustomThread tr2 = new CustomThread(cnt);
		tr1.start();
		tr2.start();
		tr1.join();
		tr2.join();
		System.out.println("Counter:" + cnt.getX());
	}
}