package Assignment_1;

import java.util.Scanner;

abstract class Marks{
	abstract float getPercentage();
}

class A extends Marks{
	int a,b,c;
	 A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	float getPercentage() {
		// TODO Auto-generated method stub
		float percent = ((a+b+c)*100)/300;
		return percent;
	}
	
}

class B extends Marks{
	int a,b,c,d;
	B(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	@Override
	float getPercentage() {
		// TODO Auto-generated method stub
		float percent = ((a+b+c+d)*100)/400;
		return percent;
	}
	
}

public class Q0030_Abstraction_Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 subject marks for student A");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println("Enter 4 subject marks for student B");
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();
		A a = new A(c,d,e);
		B b = new B(f,g,h,i);

		System.out.println("Percentage of student A is : " + a.getPercentage() + "%");
		System.out.println("Percentage of student B is : " + b.getPercentage() + "%");
	}
}
