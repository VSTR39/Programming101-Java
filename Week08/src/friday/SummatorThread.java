package friday;

import java.io.PrintStream;

public class SummatorThread extends Thread {
	private Summator summator;

	public SummatorThread(Summator s) {
		setSummator(s);
	}

	public Summator getSummator() {
		return summator;
	}

	public void setSummator(Summator summator) {
		this.summator = summator;
	}

	public void run() {
		PrintStream out = System.out;
		out.println("The sum of " + summator.getA() + " and " + summator.getB() + " is " + summator.getSum());
	}
	public static void main(String[] args) {
		SummatorThread t1 = new SummatorThread(new Summator(2,2));
		t1.start();
	}
}
