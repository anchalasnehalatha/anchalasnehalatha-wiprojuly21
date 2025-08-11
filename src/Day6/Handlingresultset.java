package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Handlingresultset {

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

            // Create statement
            Statement st = con.createStatement();

            // SQL query
            String stquery = "SELECT personid, firstname, lastname, Address, city FROM persons;";

            // Execute query
            ResultSet rs = st.executeQuery(stquery);

            // Loop through results
            while (rs.next()) {
                int id = rs.getInt("personid");
                String fname = rs.getString("firstname");
                String lname = rs.getString("lastname");
                String address = rs.getString("Address");
                String city = rs.getString("city");

                System.out.println("ID: " + id);
                System.out.println("First Name: " + fname);
                System.out.println("Last Name: " + lname);
                System.out.println("Address: " + address);
                System.out.println("City: " + city);
                System.out.println("----------------------------");
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
