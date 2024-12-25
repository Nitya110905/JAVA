package Assignment_1;

import java.util.Scanner;

public class Q0009_Count_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		int letters = 0;
		int spaces = 0;
		int digits = 0;
		int others = 0;
		
		for (char ch : s.toCharArray()) { 
			if (Character.isLetter(ch)) {
				letters++; 
				} 
			else if (Character.isDigit(ch)) {
				digits++; 
				}
			else if (Character.isWhitespace(ch)) {
				spaces++; 
				}
			else {
				others++; 
				} 
			}
		System.out.println("Letters: " + letters);
		System.out.println("Spaces: " + spaces);
		System.out.println("Numbers: " + digits);
		System.out.println("Other characters: " + others);
		
	}
}
