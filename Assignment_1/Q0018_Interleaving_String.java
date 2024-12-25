package Assignment_1;

import java.util.HashSet;
import java.util.Set;

public class Q0018_Interleaving_String {
	public static void main(String[] args) {
		String a = "WX";
		String b = "YZ";
		
		Set<String> result = new HashSet<>();
		findInterleavings(a, b , "", result);
		System.out.println("The interleaving strings are: " + result);
	}
	public static void findInterleavings(String str1, String str2, String interleave, Set<String> result) {
		if (str1.length() == 0 && str2.length() == 0) {
			result.add(interleave); 
			return; 
			}
		if (str1.length() > 0) {
			findInterleavings(str1.substring(1), str2, interleave + str1.charAt(0), result);
}
		if (str2.length() > 0) {
			findInterleavings(str1, str2.substring(1), interleave + str2.charAt(0), result); 
			} 
		}
}
