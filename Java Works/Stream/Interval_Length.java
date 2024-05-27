package Stream;

import java.util.Arrays;
import java.util.List;

// Class representing an interval with a start and end point
class Interval {
	private int start;
	private int end;

	// Constructor to initialize the interval
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	// Getter for the start point of the interval
	public int getStart() {
		return start;
	}

	// Getter for the end point of the interval
	public int getEnd() {
		return end;
	}
}

public class Interval_Length {

	public static void main(String[] args) {
		// Create a list of intervals
		List<Interval> intervals = Arrays.asList(new Interval(1, 3), // Interval from 1 to 3
				new Interval(5, 8), // Interval from 5 to 8
				new Interval(10, 12) // Interval from 10 to 12
		);

		// Calculate the total covered length by summing up the lengths of each interval
		int totalCoveredLength = intervals.stream()
				// Map each interval to its length (end - start)
				.mapToInt(interval -> interval.getEnd() - interval.getStart())
				// Sum up all the lengths
				.sum();

		// Print the total covered length
		System.out.println("Total covered length: " + totalCoveredLength);
	}
}
