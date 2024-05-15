package Thread;

// Implementing the Runnable interface for creating threads
class Print implements Runnable {
	// Overriding the run() method to define the task of the thread
	public void run() {
		// Loop to print numbers from 0 to 4
		for (int i = 0; i < 5; i++) {
			try {
				// Pausing the execution of the thread for 1000 milliseconds (1 second)
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Printing any InterruptedException that occurs
				e.printStackTrace();
			}

			// Printing the value of 'i'
			System.out.println(i);
		}
	}
}

// Main class for executing the program
public class ThreadSleepMethod {
	public static void main(String[] args) {
		// Creating an instance of the Runnable class
		Print p = new Print();
		// Creating a thread with the Runnable object
		Thread t = new Thread(p);
		// Starting the thread
		t.start();
	}
}
