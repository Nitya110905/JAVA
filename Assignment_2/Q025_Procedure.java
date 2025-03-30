package Assignment_2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Q025_Procedure {
	  private static final String URL = "jdbc:mysql://localhost:3306/assignment";
	    private static final String USER = "root";
	    private static final String PASSWORD = "";
	    
	    
	    public static void main(String[] args) {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Connected to the database!");

	            String sql = "CREATE PROCEDURE GetEmployeeAndDepartment(IN DNO INT) " +
	                     "BEGIN " +
	                     "    SELECT e.e_name, d.dept_name " +
	                     "    FROM employee e " +
	                     "    INNER JOIN department d ON e.dept_no = d.dept_no " +
	                     "    WHERE e.dept_no = DNO; " +
	                     "END";
	           
	           Statement stmt = conn.createStatement();
	           
	           int departmentNumber = 20;

	            stmt.execute(sql);
	            System.out.println("Procedure created successfully!");
	            CallableStatement stmt1 = conn.prepareCall("{CALL GetEmployeeAndDept(?)}");

	            // Set the input parameter
	            stmt1.setInt(1, departmentNumber);

	            // Execute the procedure
	            ResultSet rs = stmt1.executeQuery();

	            // Process the result set
	            while (rs.next()) {
	                String employeeName = rs.getString("e_name");
	                String departmentName = rs.getString("dept_name");
	                System.out.println("Employee Name: " + employeeName + ", Department Name: " + departmentName);
	            }

	            stmt1.close();
	            rs.close();
	            


	            stmt.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Database connection failed!");
	            e.printStackTrace();
	        }
	    }
}
