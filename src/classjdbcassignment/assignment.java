package classjdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class assignment {
public static void main(String[] args)  throws Exception{
	String dbURL = "jdbc:mysql://localhost:3306/wiprodb";
	String username = "root";
	String password = "#Sneha@123";
	String dbName = "companydb";
	
	//Load MySql driver file
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	Connection con1 = DriverManager.getConnection(dbURL, username, password);
    Statement stmt1 = con1.createStatement();
    stmt1.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
    System.out.println("Database 'companydb' created.");
    
    // Create the table inside companydb
    String dbUrl = "jdbc:mysql://localhost:3306/" + dbName;
    Connection con2 = DriverManager.getConnection(dbUrl, username, password);
    Statement stmt2 = con2.createStatement();
    
    //creating companytable inside the db
    String createTableQuery = "CREATE TABLE IF NOT EXISTS employees ("
                            + "id INT PRIMARY KEY, "
                            + "name VARCHAR(50), "
                            + "department VARCHAR(50), "
                            + "salary DOUBLE"
                            + ")";
    stmt2.executeUpdate(createTableQuery);
    System.out.println("Table 'employees' created in 'companydb'.");
    
    //inserting records
   String insertQuery1 = "INSERT INTO employees (id, name, department, salary) "
            + "VALUES (101, 'Alice', 'HR', 50000.00)";
stmt2.executeUpdate(insertQuery1);
String insertQuery2 = "INSERT INTO employees (id, name, department, salary) "
        + "VALUES (102, 'Bob', 'IT', 65000.00)";
stmt2.executeUpdate(insertQuery2);    
String insertQuery3 = "INSERT INTO employees (id, name, department, salary) "
        + "VALUES (103, 'Charlie', 'Sales', 60000.00)";
stmt2.executeUpdate(insertQuery3);



//displaying table
String selectQuery = "SELECT * FROM employees";
ResultSet rs = stmt2.executeQuery(selectQuery);
System.out.println("ID\tName\tDepartment\tSalary");
while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    String dept = rs.getString("department");
    double salary = rs.getDouble("salary");

    System.out.println(id + "\t" + name + "\t" + dept + "\t" + salary);
}
   
    
//display 102 record
/*String selectQuery="select * from employees where id=102";
ResultSet rs=stmt2.executeQuery(selectQuery);
while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    String department = rs.getString("department");
    double salary = rs.getDouble("salary");
    
    System.out.println("ID: " + id + ", Name: " + name + 
                       ", Department: " + department + ", Salary: " + salary);
}*/

    
//display ITdepartment record
   /* String selectQuery="select * from employees where department='IT'";
    ResultSet rs=stmt2.executeQuery(selectQuery);
    while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String department = rs.getString("department");
        double salary = rs.getDouble("salary");
        
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Department: " + department + ", Salary: " + salary);
    }*/
//updating departmentof Alice
    /*String updateQuery = "UPDATE employees SET department = 'Finance' WHERE name = 'Alice'";
    int rowsUpdated = stmt2.executeUpdate(updateQuery);
    System.out.println(rowsUpdated + " row(s) updated.");*/

//displaying updates table
    /*String selectQuery="select * from employees";
    ResultSet rs=stmt2.executeQuery(selectQuery);
    while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String department = rs.getString("department");
        double salary = rs.getDouble("salary");
        
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Department: " + department + ", Salary: " + salary);
    }*/
   //deletion of id
    /*String deleteQuery = "DELETE from  employees  where id=103;";
    int rowsUpdated = stmt2.executeUpdate(deleteQuery);
    System.out.println(rowsUpdated + " row(s) updated.");
    
    
//displaying afterdeleting table
    String selectQuery="select * from employees";
    ResultSet rs=stmt2.executeQuery(selectQuery);
    while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String department = rs.getString("department");
        double salary = rs.getDouble("salary");
        
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Department: " + department + ", Salary: " + salary);
    }*/


  //deletion of department
    /*String deleteQuery = "DELETE from  employees  where department='sales';";
    int rowsUpdated = stmt2.executeUpdate(deleteQuery);
    System.out.println(rowsUpdated + " row(s) updated.");
    
    
//displaying afterdeleting table
    String selectQuery="select * from employees";
    ResultSet rs=stmt2.executeQuery(selectQuery);
    while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String department = rs.getString("department");
        double salary = rs.getDouble("salary");
        
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Department: " + department + ", Salary: " + salary);
    }*/
   
}
}
