package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws Exception, ClassNotFoundException {
		//Fetch DbUrl, username, password
		String dbURL = "jdbc:mysql://localhost:3306/wiprodb";
		String username = "root";
		String password = "#Sneha@123";
		
		//Load MySql driver file
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create a connection to database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		//Create a statement Object
		Statement st = con.createStatement();
		
		//Execute the queries
		String stquery = "SELECT FirstName, Address, city FROM persons;";
		
		//Pass the select query to resultset
		ResultSet rs = st.executeQuery(stquery);	
		
		//Result set in JDBC
		while (rs.next()) {
            String name = rs.getString("FirstName");
            String address = rs.getString("Address");
            String city = rs.getString("city");
            
            System.out.println("Name: " + name + ", Address: " + address + ", City: " + city);
        }
        

	}

}

