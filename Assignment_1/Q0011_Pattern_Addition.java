package Assignment_1;

import java.util.Scanner;

public class Q0011_Pattern_Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = sc.nextInt();
		int sum = a + (a*a) + (a*a*a);
		System.out.println(sum);
	}
}
