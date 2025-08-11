package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class preparedstmt {
    public static void main(String[] args) {
        // Database details
        String dbURL = "jdbc:mysql://localhost:3306/wiprodb";
        String username = "root";
        String password = "#Sneha@123";

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(dbURL, username, password);

            // ------------------------------
            // 1. SELECT with one parameter
            // ------------------------------
            String query1 = "SELECT * FROM persons WHERE firstname = ?";
            PreparedStatement pstmt1 = con.prepareStatement(query1);
            pstmt1.setString(1, "sneha");

            ResultSet rs1 = pstmt1.executeQuery();
            while (rs1.next()) {
                System.out.println("Firstname: " + rs1.getString("firstname"));
            }

            // ------------------------------
            // 2. SELECT with two parameters
            // ------------------------------
            String query2 = "SELECT * FROM persons WHERE personid = ? AND firstname = ?";
            PreparedStatement pstmt2 = con.prepareStatement(query2);
            pstmt2.setInt(1, 6677);
            pstmt2.setString(2, "sneha");

            ResultSet rs2 = pstmt2.executeQuery();
            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("personid"));
                System.out.println("Firstname: " + rs2.getString("firstname"));
            }

            // Close resources
            rs1.close();
            rs2.close();
            pstmt1.close();
            pstmt2.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
