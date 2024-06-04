package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared_Statement_Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load and register the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Define the URL of the database
		String url = "jdbc:mysql://localhost:3306/school";

		// Establish the connection to the database
		// Parameters: URL, username, password
		Connection con = DriverManager.getConnection(url, "root", "root");

		// Print a success message if the connection is established
		System.out.println("Database school connection successfully established");

		// Create a PreparedStatement for deleting data from the student table
		String deleteQuery = "DELETE FROM student WHERE rollno = ?";
		PreparedStatement ps = con.prepareStatement(deleteQuery);

		// Set the value for the PreparedStatement
		ps.setInt(1, 6); // Specify the roll number of the student to delete

		// Execute the delete statement
		int rowsAffected = ps.executeUpdate();

		// Print a success message indicating the number of rows deleted
		if (rowsAffected > 0) {
			System.out.println("Record Deleted Successfully. Number of rows affected: " + rowsAffected);
		} else {
			System.out.println("No record found with the specified roll number.");
		}

		// Close the PreparedStatement and Connection to free resources
		ps.close();
		con.close();
	}
}
