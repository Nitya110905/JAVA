package Assignment_1;

import java.util.Scanner;

public class Q0005_Sum_Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1;i <= 5;i++) {
			System.out.println("Enter your " + i + " no.");
				int a = sc.nextInt();
				sum += a;
		}
		double avg = sum/5;
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + avg);
		
	}
}
