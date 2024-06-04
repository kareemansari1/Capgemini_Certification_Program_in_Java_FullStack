package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		String createTableSQL = "CREATE TABLE Learner1 (" + "lid INT PRIMARY KEY, " + "lname VARCHAR(255) UNIQUE, "
				+ "lage INT CHECK (lage > 18), " + "degree VARCHAR(255) NOT NULL, "
				+ "city VARCHAR(255) DEFAULT 'mumbai'" + ");";

		try {
			// Load and register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection to the database
			Connection con = DriverManager.getConnection(url, user, password);

			// Print a success message if the connection is established
			System.out.println("Database connection successfully established");

			// Create a Statement object
			Statement stmt = con.createStatement();

			// Execute the SQL CREATE TABLE statement
			stmt.executeUpdate(createTableSQL);
			System.out.println("Table Learner created successfully");

			// Close the Statement and Connection to free resources
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL exception occurred");
			e.printStackTrace();
		}
	}
}
