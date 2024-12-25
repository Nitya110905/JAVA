package Assignment_1;

import java.util.Scanner;

class valid{
	int validate(int n) {
		if(n<18) {
			System.out.println("not valid");
		}
		else {
			System.out.println("Welcome to voting");
		}
		return n;
	}
}
public class Q0036_Vote_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int a = sc.nextInt();
try {
	valid v = new valid();
	v.validate(a);
} catch (ArithmeticException e) {
	// TODO: handle exception
	System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
}
	}
}
