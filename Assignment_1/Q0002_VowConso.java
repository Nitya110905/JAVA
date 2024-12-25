package Assignment_1;

import java.util.Scanner;

public class Q0002_VowConso {
	public static void main(String[] args) {
		System.out.println("Enter a single* character");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(!Character.isLetter(c)) {
			System.out.println("Error!");
		}
		else {
			switch(c) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println(c + " is vowel");
			
			break;
			default:
				System.out.println(c + " is consonant");
			break;
			}
		}
	}
}
