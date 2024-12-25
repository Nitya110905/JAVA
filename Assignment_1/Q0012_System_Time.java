package Assignment_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q0012_System_Time {
	public static void main(String[] args) {
		// Get current date and time
		LocalDateTime now = LocalDateTime.now();
		// Define a formatter 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// Format the current time 
		String formattedNow = now.format(formatter);
		// Print the formatted current time 
		System.out.println("Current system time is: " + formattedNow);
		}
}
