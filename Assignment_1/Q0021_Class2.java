package Assignment_1;

class intchar{
	public void method1(int a, char c) {
		System.out.println("integer : " + a + " , character: " + c);
	}
	public void method1(char c, int a) {
		System.out.println("integer : " + a + " , character: " + c);
	}
}

public class Q0021_Class2 {
	public static void main(String[] args) {
		intchar z = new intchar();
		z.method1(1, 'a');
		z.method1('c', 2);
	}
}
