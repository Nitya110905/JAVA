package Assignment_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q0046_Hashset {
	public static void main(String[] args) {
		Set set = new HashSet();
		Set set2 = new HashSet();
		
		//Adding element
		set.add(123);
		set2.add("java");
		set2.add(123);
		set.add(false);
		set.add(345.345);
		set2.add('g');
		set.add(123);
		System.out.println(set);
		
		//Set size
		System.out.println(set.size());
		
		//Retaining common elements of two sets
		System.out.println("Set1 : " + set);
		System.out.println("Set1 : " + set2);
		set.retainAll(set2);

		
		//Convert Hashset to Arraylist
		ArrayList a = new ArrayList(set);
		System.out.println(a);
		
		//Hasset to array
		
		System.out.println(set.toArray());
		
		
		//Iteration
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
