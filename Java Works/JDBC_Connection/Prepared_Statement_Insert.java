package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared_Statement_Insert {

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

		// Create a PreparedStatement for inserting data into the student table
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");

		// Set the values for the PreparedStatement
		ps.setInt(1, 6); // Set roll number
		ps.setString(2, "Pooja"); // Set student name
		ps.setString(3, "Civil"); // Set class
		ps.setString(4, "1999-10-21"); // Set date of birth
		ps.setInt(5, 24); // Set age

		// Execute the insert statement
		ps.executeUpdate();

		// Print a success message after the record is inserted
		System.out.println("Record Inserted Successfully");

		// Close the PreparedStatement and Connection to free resources
		ps.close();
		con.close();
	}
}
