package Assignment_1;

import java.util.Scanner;

class Factorial{
	int n;
	public int fact(int n) {
			if(n==0) {
				return 1;
			}
			int result = 1;
			for(int i = 1; i<=n; i++) {
				result*=i;
			}
			return result;
	}
}

public class Q0031_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a desired no.");
		int a = sc.nextInt();
		Factorial f = new Factorial();
		int res = f.fact(a);
		System.out.println("Factorial : " + res);
	}
}
