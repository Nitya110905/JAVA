package Assignment_1;

import java.util.Scanner;

public class Q0010_ASCII_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		int asciival = (int) c;
		System.out.println("The ASCII Value of " + c + " is: " + asciival);
	}
}
