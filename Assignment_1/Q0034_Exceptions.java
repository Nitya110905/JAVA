package Assignment_1;




public class Q0034_Exceptions {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
		} catch(ArithmeticException e ) {
			System.out.println("Deno should be greater than numer");
		}
		catch(IndexOutOfBoundsException e ) {
			System.out.println("index out of bounds exception");
		}
		catch(Exception e ) {
			System.out.println(e);
		}
	}
}
