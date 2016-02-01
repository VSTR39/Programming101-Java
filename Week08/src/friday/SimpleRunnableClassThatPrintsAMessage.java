package friday;

import java.io.PrintStream;

public class SimpleRunnableClassThatPrintsAMessage implements Runnable {
	private String mMessage;

	public SimpleRunnableClassThatPrintsAMessage() {
	}

	public SimpleRunnableClassThatPrintsAMessage(String message) {
		setMessage(message);
	}

	public String getMessage() {
		return mMessage;
	}

	public void setMessage(String mMessage) {
		this.mMessage = mMessage;
	}

	public void run() {
		PrintStream out = System.out;
		if (getMessage() != null) {
			out.println("I am a simple thread that prints a message." + " " + Thread.currentThread().getName() + " "
					+ getMessage());
		} else {
			out.println("I am a simple thread that prints a message." + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SimpleRunnableClassThatPrintsAMessage simpleRunnableClassThatPrintsAMessage1 = new SimpleRunnableClassThatPrintsAMessage(
				"Oh yes I can");
		Thread thread1 = new Thread(simpleRunnableClassThatPrintsAMessage1);
		thread1.start();
		/*SimpleRunnableClassThatPrintsAMessage simpleRunnableClassThatPrintsAMessage2 = new SimpleRunnableClassThatPrintsAMessage();
		Thread thread2 = new Thread(simpleRunnableClassThatPrintsAMessage2);
		thread2.start();
		thread1.join();
		thread2.join();
		 */
	}
}