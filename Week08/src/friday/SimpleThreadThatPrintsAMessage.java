package friday;

import java.io.PrintStream;

public class SimpleThreadThatPrintsAMessage extends Thread {
	private String mMessage;
	public SimpleThreadThatPrintsAMessage(){}
	public SimpleThreadThatPrintsAMessage(String message) {
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
	    SimpleThreadThatPrintsAMessage thread1 = new SimpleThreadThatPrintsAMessage();
		thread1.start();
		/*
		SimpleThreadThatPrintsAMessage thread2 = new SimpleThreadThatPrintsAMessage("I told you I can.");
		thread2.start();
		thread1.join();
		thread2.join();
		*/

	}
}
