package Thread;

// Extending the Thread class to create a custom thread
class ThreadP extends Thread {
	// Overriding the run() method to define the task of the thread
	public void run() {
		System.out.println("Thread 1 running");
	}
}

// Main class for executing the program
public class ThreadPriorityEx {
	public static void main(String[] args) {
		// Creating an instance of ThreadP
		ThreadP tp = new ThreadP();

		// Getting and printing the name and priority of the thread
		System.out.println("Thread Name: " + tp.getName());
		System.out.println("Thread Priority: " + tp.getPriority());

		// Creating another instance of ThreadP
		ThreadP tp1 = new ThreadP();

		// Setting name and priority for the new thread
		tp1.setName("Thread priority");
		tp1.setPriority(9); // Setting priority to 9 (maximum priority)

		// Getting and printing the name and priority of the new thread
		System.out.println("Thread Name: " + tp1.getName());
		System.out.println("Thread Priority: " + tp1.getPriority());

		// Creating another instance of ThreadP
		ThreadP tp2 = new ThreadP();

		// Setting priority to the default (NORM_PRIORITY)
		tp2.setPriority(Thread.NORM_PRIORITY);
		// Getting and printing the priority of the thread
		System.out.println("Thread Priority: " + tp2.getPriority());

		// Setting priority to the maximum priority
		tp2.setPriority(Thread.MAX_PRIORITY);
		// Getting and printing the priority of the thread
		System.out.println("Thread Priority: " + tp2.getPriority());

		// Setting priority to the minimum priority
		tp2.setPriority(Thread.MIN_PRIORITY);
		// Getting and printing the priority of the thread
		System.out.println("Thread Priority: " + tp2.getPriority());
	}
}
