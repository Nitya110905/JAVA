package Assignment_1;

public class Q0013_Divisible_by {
	public static void main(String[] args) {
		System.out.print("No.s divisible by only 3 are: ");
		for(int i = 1;i <= 100;i++ ) {
			if(i%3 == 0 && i%5 !=0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("No.s divisible by only 5 are: ");
		for(int i = 1;i <= 100;i++ ) {
			if(i%5 == 0 && i%3 !=0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("No.s divisible by both 3 & 5 are: ");
		for(int i = 1;i <= 100;i++ ) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
