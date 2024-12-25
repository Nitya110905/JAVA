package Assignment_1;

import java.util.Scanner;

public class Q0033_try_catch_exception {
	public static void main(String[] args) {
		System.out.println("Enter numerator and denominator");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int deno = sc.nextInt();
		try {
			 int result = num / deno;
			 System.out.println("Result: " + result);
			 }
		catch (ArithmeticException e){
			System.out.println("Exception caught: Division by zero is not allowed.");
			}
		finally {
			 System.out.println("This is the finally block.");
			 }
		System.out.println("End of program."); 
	}
}
