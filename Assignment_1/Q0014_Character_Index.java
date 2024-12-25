package Assignment_1;

import java.util.Scanner;

public class Q0014_Character_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "Tops Technologies!";
		System.out.println("Enter an index of the respective character from : Tops Technologies!");
		int b = sc.nextInt();
		for(int i = 0; i<=17;i++) {
			if(b==i) {
				System.out.println(a.charAt(i));
			}
		}
	}
}
