package Assignment_1;

import java.util.Scanner;

public class Q0003_LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0 ) {
			System.out.println(i + " is a Leap Year!");
		}
		else {
			System.out.println(i + " is not a Leap Year!");
		}
		
	}
}
