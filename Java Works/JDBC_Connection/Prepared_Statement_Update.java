package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared_Statement_Update {

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

		// Create a PreparedStatement for updating data in the student table
		String updateQuery = "UPDATE student SET class = ?, age = ? WHERE rollno = ?";
		PreparedStatement ps = con.prepareStatement(updateQuery);

		// Set the values for the PreparedStatement
		ps.setString(1, "Sci"); // Set new class
		ps.setInt(2, 30); // Set new age
		ps.setInt(3, 5); // Specify the roll number of the student to update

		// Execute the update statement
		int rowsAffected = ps.executeUpdate();

		// Print a success message indicating the number of rows updated
		if (rowsAffected > 0) {
			System.out.println("Record Updated Successfully. Number of rows affected: " + rowsAffected);
		} else {
			System.out.println("No record found with the specified roll number.");
		}

		// Close the PreparedStatement and Connection to free resources
		ps.close();
		con.close();
	}
}
