package Assignment_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q024_CreateView {
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

	            String sql = "SELECT * FROM v1";
	            ResultSet rs = stmt.executeQuery(sql);

	            while (rs.next()) {
	                System.out.println("Name:" + rs.getString("e_name") + "\tJOB:" + rs.getString("job") + "\tDepartment Name:" + rs.getString("dept_name") + "\tLocation" + rs.getString("loc"));
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
