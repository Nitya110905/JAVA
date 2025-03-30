package Assignment_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q022_MinSalary {
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

	            String sql = "SELECT * from employee e1 where salary = (SELECT MIN(salary) from employee e2 where e2.job = e1.job) ORDER BY salary ASC";
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

//Subquery (SELECT MIN(Sal) FROM employee e2 WHERE e2.job = e1.job):Finds the minimum salary for each job by filtering rows of the same job (e2.job = e1.job).
