package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Update {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Load and register the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Define the URL of the database
		String url = "jdbc:mysql://localhost:3306/school";

		// Establish the connection to the database
		// Parameters: URL, username, password
		Connection con = DriverManager.getConnection(url, "root", "root");

		// Print a success message if the connection is established
		System.out.println("Database school connection successfully established");

		// Create a Statement object to execute SQL queries
		Statement stmt = con.createStatement();

		// Define the SQL update statement
		String s = "update student set class='bio' where rollno=5";

		// Execute the update statement
		stmt.executeUpdate(s);

		// Execute a query to retrieve all records from the student table
		ResultSet rs = stmt.executeQuery("select * from student");

		// Print the student records
		System.out.println("Get Student records:");
		while (rs.next()) {
			System.out.println("rollno: " + rs.getInt(1));
			System.out.println("stu_name: " + rs.getString(2));
			System.out.println("class: " + rs.getString(3));
			System.out.println("stu_dob: " + rs.getDate(4));
		}

		// Close the ResultSet
		rs.close();

		// Close the Statement
		stmt.close();

		// Close the Connection
		con.close();
	}
}
