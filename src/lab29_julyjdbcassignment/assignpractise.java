package lab29_julyjdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class assignpractise {
    public static void main(String[] args) throws Exception{
        String dbURL = "jdbc:mysql://localhost:3306/hospitaldb";
        String username = "root";
        String password = "#Sneha@123";
         String dbname="hospitaldb";
        //Load and register with driverclass
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is loaded and registered");
        

         //establishing connection between javaapplication and databaseserver
           /* Connection con1 = DriverManager.getConnection(dbURL, username, password);
           //creating statement or platform for executing sqlqueries
            Statement stmt1=con1.createStatement();
            //query for creating database
            String sql1="create database hospitaldb";
            stmt1.executeUpdate(sql1);
            System.out.println("Connection established successfully.");
            System.out.println("Database name is:"+dbname);*/
            
            //creating table inside that database(i.ehospitaldb)
            Connection con2 = DriverManager.getConnection(dbURL, username, password);
            Statement stmt2=con2.createStatement();
            //query for table
            /*String sql2 = "CREATE TABLE patient3(" +
                    "id INT PRIMARY KEY, " +
                    "pname VARCHAR(50) NOT NULL, " +
                    "pdisease VARCHAR(30), " +
                    "page DECIMAL(10, 2),"
                    + "pgender VARCHAR(5))";
            stmt2.executeUpdate(sql2);
            System.out.println("table created successfully");
            
            
           
            
            //queries for inserting records into table
     String query1 ="INSERT INTO patient3(id,pname,pdisease,page)" + "values (101,'sneha','fever',21)";
     stmt2.executeUpdate(query1);
     String query2 ="INSERT INTO patient3(id,pname,pdisease,page)" + "values (102,'latha','cough',22)"; 
     stmt2.executeUpdate(query2);
     String query3 ="INSERT INTO patient3(id,pname,pdisease,page)" + "values (103,'anchala','cold',23)";
     stmt2.executeUpdate(query3);
     System.out.println("Three records inserted");*/
     
     //displaying records
    /* String display="Select * from patient3";
     ResultSet rs=stmt2.executeQuery(display);
     System.out.println("ID\tpname\tpdisease\tpage");
     while(rs.next()) {
    	 int id=rs.getInt("id");
    	String pname=rs.getString("pname");
    	String pdisease=rs.getString("pdisease");
    	String page=rs.getString("page");
    	 System.out.println(id + "\t" + pname + "\t" + pdisease + "\t" + page);
     }*/
            //updating the record
            /*String updatequery = "UPDATE patient3 SET pname='reddy' WHERE id=103";
            int rowsAffected = stmt2.executeUpdate(updatequery);
            System.out.println("Updated " + rowsAffected + " record(s).");
            //displaying the updates records
            String display="Select * from patient3";
            ResultSet rs=stmt2.executeQuery(display);
            System.out.println("ID\tpname\tpdisease\tpage");
            while(rs.next()) {
           	 int id=rs.getInt("id");
           	String pname=rs.getString("pname");
           	String pdisease=rs.getString("pdisease");
           	String page=rs.getString("page");
           	 System.out.println(id + "\t" + pname + "\t" + pdisease + "\t" + page);
            }*/
            //deletion of id
            String deletequery="DELETE from patient3 where id=101";
            int rowsaffected=stmt2.executeUpdate(deletequery);
            System.out.println("record deleted");
            //displaying after deletion
            String display="Select * from patient3";
            ResultSet rs=stmt2.executeQuery(display);
            System.out.println("ID\tpname\tpdisease\tpage");
            while(rs.next()) {
           	 int id=rs.getInt("id");
           	String pname=rs.getString("pname");
           	String pdisease=rs.getString("pdisease");
           	String page=rs.getString("page");
           	 System.out.println(id + "\t" + pname + "\t" + pdisease + "\t" + page);
            

            
            

            }      
    
}
}
