package Assignment_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q011_Emp_no_not_78 {
	  private static final String URL = "jdbc:mysql://localhost:3306/assignment";
	    private static final String USER = "root";
	    private static final String PASSWORD = "";
	    
	    
	    public static void main(String[] args) {
	        Connection conn = null;
	        Statement stmt = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Connected to the database!");

	            stmt = conn.createStatement();

	            String sql = "SELECT * from employee where emp_No NOT LIKE '78%'";
	            ResultSet rs = stmt.executeQuery(sql);

	            while (rs.next()) {
	                System.out.println("Employee_no:" + rs.getInt("emp_no") + "\tName:" + rs.getString("e_name") + "\tJOB:" + rs.getString("job") + "\tMGR:" + rs.getInt("mgr") + "\tHireDate:" + rs.getString("hire_date") + "\tSalary:" + rs.getInt("salary") + "\tCOMM:" + rs.getInt("comm") + "\tDepartment_no:" + rs.getInt("dept_no"));
	            }

	            rs.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Database connection failed!");
	            e.printStackTrace();
	        } finally {
	            // Close resources
	            try {
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}

//NOT LIKE '78%': The NOT LIKE operator excludes all employee numbers that start with 78. The % wildcard matches any number of characters after 78.
