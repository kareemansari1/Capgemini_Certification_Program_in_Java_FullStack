package Thread;

// Implementing the Runnable interface for creating threads
class Threadone implements Runnable {

	// Overriding the run() method to define the task of the thread
	@Override
	public void run() {
		// Loop to print numbers from 0 to 14
		for (int i = 0; i < 15; i++) {
			System.out.print(i + " ");
		}
	}

}

// Another class implementing the Runnable interface
class ThreadTwo implements Runnable {

	// Overriding the run() method
	@Override
	public void run() {
		// Printing a newline character
		// Loop to print even numbers from 2 to 18
		for (int i = 2; i < 20; i = i + 2) {
			System.out.println("Even No is :" + i);
		}
	}

}

// Main class for executing the program
public class RunnableInterface {

	public static void main(String[] args) {
		// Creating instances of the Runnable classes
		Threadone t1 = new Threadone();
		ThreadTwo t2 = new ThreadTwo();

		// Creating threads with the Runnable objects
		Thread t = new Thread(t1);
		Thread t3 = new Thread(t2);

		// Starting the threads by invoking the run() method directly (not recommended)
		t.start();
		t3.start();

		// Note: The correct way to start threads is by calling the start() method, not
		// run().
		// When calling run(), it executes in the current thread, not in a new thread.
	}

}
