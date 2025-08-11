package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertingmultiplerecords  {
	public static void main(String[] args) throws Exception, ClassNotFoundException{
		String dbURL = "jdbc:mysql://localhost:3306/wiprodb";
		String username = "root";
		String password = "#Sneha@123";
		
		//Load MySql driver file
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create a connection to database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		//executing query
		String qry="insert into wiprodb.persons values(?,?,?,?,?)";
		//Create a preparedstatement Object
		PreparedStatement pstmt = con.prepareStatement(qry);
		//setting the data
		pstmt.setInt(1,104);
		pstmt.setString(2,"raja");
		pstmt.setString(3,"kishore");
		pstmt.setString(4, "Manipur");
		pstmt.setString(5, "Mizoram");
		//settingdata2
		pstmt.setInt(1,105);
		pstmt.setString(2,"ramu");
		pstmt.setString(3,"reddy");
		pstmt.setString(4, "Telangana");
		pstmt.setString(5, "xyz");
		// Execute the insert and get row count
        int rowsInserted = pstmt.executeUpdate();
        System.out.println("Rows inserted: " + rowsInserted);
        
		
	}
	}


