package Assignment_1;

import java.util.Scanner;

class Complex {
	double real;
	double imag;
    Complex(double real, double imag) { 
    	this.real = real;
    	this.imag = imag;
    	}
    Complex add(Complex other) {
    	return new Complex(this.real + other.real, this.imag + other.imag); 
    	}  
    Complex subtract(Complex other) {
    	return new Complex(this.real - other.real, this.imag - other.imag); 
    	} 
    Complex multiply(Complex other) {
    	double realPart = (this.real * other.real) - (this.imag * other.imag);
    	double imagPart = (this.real * other.imag) + (this.imag * other.real);
    	return new Complex(realPart, imagPart); }
    void display() {
    	System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class Q0027_Complex_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the real part of the first complex number: ");
		double real1 = scanner.nextDouble();
		System.out.print("Enter the imaginary part of the first complex number: ");
		double imag1 = scanner.nextDouble();
		System.out.print("Enter the real part of the second complex number: ");
		double real2 = scanner.nextDouble();
		System.out.print("Enter the imaginary part of the second complex number: ");
		double imag2 = scanner.nextDouble();
		Complex c1 = new Complex(real1, imag1);
		Complex c2 = new Complex(real2, imag2);
		Complex sum = c1.add(c2);
		Complex difference = c1.subtract(c2);
		Complex product = c1.multiply(c2);
		System.out.print("Sum: ");
		sum.display();
		System.out.print("Difference: ");
		difference.display();
		System.out.print("Product: ");
		product.display();
	}
}
