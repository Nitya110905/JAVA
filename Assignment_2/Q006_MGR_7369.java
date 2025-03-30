package Assignment_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q006_MGR_7369 {
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

	            String sql = "SELECT emp_no,e_name,salary,CONCAT(TIMESTAMPDIFF(YEAR, hire_date, CURDATE()), ' years,' ,TIMESTAMPDIFF(MONTH, hire_date, CURDATE()) % 12, ' months') AS exp FROM employee where mgr = 7396";
	            ResultSet rs = stmt.executeQuery(sql);

	            while (rs.next()) {
	                System.out.println("Employee_no:" + rs.getInt("emp_no") + "\tName:" + rs.getString("e_name") + "\tSalary:" + rs.getInt("salary") + "\tExperience:" + rs.getString("exp"));
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
