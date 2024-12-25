package Assignment_1;

import java.util.Scanner;

public class Q0008_No_of_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int a = sc.nextInt();
		int temp = 0;
		if (a<=0) {
			System.out.println("Enter a positive integer");
		} else {
		do {
			a = a/10;
			temp++;
			
		}while(a!=0);
		System.out.println("No. of digits: " + temp);
	}
	}
}
