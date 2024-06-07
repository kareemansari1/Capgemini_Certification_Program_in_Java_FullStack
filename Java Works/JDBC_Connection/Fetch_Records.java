package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch_Records {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Load the MySQL JDBC driver
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/demo"; // URL of the MySQL database
		String username = "root"; // MySQL username
		String password = "root"; // MySQL password
		Class.forName(driver);

		// 2. Establish the connection to the database
		Connection conn = DriverManager.getConnection(url, username, password);

		// 3. Create a Statement object for sending SQL statements to the database
		Statement stmt = conn.createStatement();

		// 4. Define the SQL query to fetch all records from the 'emp' table
		String sql = "SELECT * FROM emp";

		// 5. Execute the SQL query and retrieve the results
		ResultSet rs = stmt.executeQuery(sql);

		// Declare variables to store the values retrieved from each column
		int eid;
		String ename, ecity, eage, esal, eemail;

		// Print the column headers
		System.out.println("eid\tename\tecity\teage\tesal\teemail");
		System.out.println("-------------------------------------------------------------------------------------");
		// 6. Iterate through the ResultSet and print each record
		while (rs.next()) {
			// Retrieve values from the current row of the ResultSet
			eid = rs.getInt(1);
			ename = rs.getString(2);
			ecity = rs.getString(3);
			eemail = rs.getString(4);
			eage = rs.getString(5);
			esal = rs.getString(6);

			// Print the values of the current row
			System.out.println(eid + "\t" + ename + "\t" + ecity + "\t" + eage + "\t" + esal + "\t" + eemail);
		}

		// 7. Close the ResultSet and Statement objects
		rs.close();
		stmt.close();

		// 8. Close the connection to the database
		conn.close();
	}
}
