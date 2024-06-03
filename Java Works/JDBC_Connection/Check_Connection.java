package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Check_Connection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Load and register the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Define the URL of the database
		String url = "jdbc:mysql://localhost:3306/demo";

		// Establish the connection to the database
		// Parameters: URL, username, password
		Connection con = DriverManager.getConnection(url, "root", "root");

		// Print a success message if the connection is established
		System.out.println("Database demo connection successfully established");
	}
}
