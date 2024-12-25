package Assignment_1;

class Printnumber{
	public void printn(int n) {
		System.out.println("Integer: " + n);
	}
	public void printn(float n) {
		System.out.println("Decimal: " + n);
	}
	public void printn(double n) {
		System.out.println("Double: " + n);
	}
	public void printn(char n) {
		System.out.println("Char: " + n);
	}
	public void printn(String n) {
		System.out.println("String: " + n);
	}
}

public class Q0020_Class {
	public static void main(String[] args) {
		Printnumber printer = new Printnumber();
		printer.printn(1);
		printer.printn(1.3);
		printer.printn(11.4567);
		printer.printn('a');
		printer.printn("Name is");
	}
}
