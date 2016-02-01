package friday;

public class AtomicIncrementMain {
	public static void main(String[] args) throws InterruptedException {
		AtomicCounter cnt = new AtomicCounter(400);
		AtomicCustomThread tr1 = new AtomicCustomThread(cnt);
		AtomicCustomThread tr2 = new AtomicCustomThread(cnt);
		tr1.start();
		tr2.start();
		tr1.join();
		tr2.join();
		System.out.println("Counter:" + cnt.getX());
	}
}