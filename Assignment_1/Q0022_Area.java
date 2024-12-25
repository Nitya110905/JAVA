package Assignment_1;

import java.util.Scanner;

class Area{
	public void rect(int l, int b) {
		System.out.println("Area of rectangle : " + l*b);
	}
	public void sq(int l) {
		System.out.println("Area of square : " + l*l);
	}
}
public class Q0022_Area {
	public static void main(String[] args) {
		System.out.println("Enter length and breadth");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		Area a = new Area();
		a.rect(l, b);
		a.sq(l);
	}
}
