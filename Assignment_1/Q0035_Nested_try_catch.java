package Assignment_1;

public class Q0035_Nested_try_catch {
	public static void main(String[] args) {
		try {
			try {
				int a[] = new int[5];
				a[5] = 30 / 0;
				 }
			catch (ArithmeticException e) {
				System.out.println("Inner catch: Division by zero is not allowed.");
				}
			}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch: Array index is out of bounds.");
			}
		finally {
			System.out.println("This is the finally block."); 
			}
	}
}
