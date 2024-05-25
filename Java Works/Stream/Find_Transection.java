package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Define Transaction class to represent individual transactions
class Transaction {
	String date; // Variable to store transaction date
	int amount; // Variable to store transaction amount

	// Constructor to initialize transaction with date and amount
	public Transaction(String date, int amount) {
		this.date = date;
		this.amount = amount;
	}

	// Getter method to retrieve transaction date
	public String getDate() {
		return date;
	}

	// Setter method to set transaction date
	public void setDate(String date) {
		this.date = date;
	}

	// Getter method to retrieve transaction amount
	public int getAmount() {
		return amount;
	}

	// Setter method to set transaction amount
	public void setAmount(int amount) {
		this.amount = amount;
	}

	// Overriding toString() method for better representation of Transaction object
	@Override
	public String toString() {
		return "Transaction [Date=" + date + ", Amount=" + amount + "]";
	}
}

// Main class to demonstrate finding the sum of transactions by day using Java Streams
public class Find_Transection {

	public static void main(String[] args) {
		// Creating a list of Transaction objects
		List<Transaction> transactions = Arrays.asList(new Transaction("2022-01-01", 100),
				new Transaction("2022-01-01", 200), new Transaction("2022-01-02", 300),
				new Transaction("2022-01-02", 400), new Transaction("2022-01-03", 500));

		// Using Java Streams to find the sum of transactions by day
		// Collecting transactions into a Map where keys are dates and values are sums
		// of amounts
		Map<String, Integer> sumByDay = transactions.stream()
				// Grouping transactions by date using groupingBy collector
				.collect(Collectors.groupingBy(Transaction::getDate,
						// Summing up amounts for each group using summingInt collector
						Collectors.summingInt(Transaction::getAmount)));

		// Printing the result
		System.out.println("Sum of Transactions by Day: " + sumByDay);
	}
}
