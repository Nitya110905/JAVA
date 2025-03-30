package Assignment_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q026_StudentTable {
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


	            // 1. Add column Pin
	            String addColumnSQL = "ALTER TABLE student ADD Pin BIGINT;";
	            stmt.executeUpdate(addColumnSQL);
	            System.out.println("Column 'Pin' added successfully!");

	            // 2. Modify sname length
	            String modifyColumnSQL = "ALTER TABLE student MODIFY s_name VARCHAR(40);";
	            stmt.executeUpdate(modifyColumnSQL);
	            System.out.println("Column 'sname' modified successfully!");

	            // 3. Create trigger
	            String createTriggerSQL = "CREATE TRIGGER insert_data_trigger " +
	                                       "BEFORE INSERT ON student " +
	                                       "FOR EACH ROW " +
	                                       "BEGIN " +
	                                       "    SET NEW.Pin = NEW.Pin; " +
	                                       "END;";
	            stmt.executeUpdate(createTriggerSQL);
	            System.out.println("Trigger created successfully!");
	            
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
