package Assignment_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q0045_ArrayList_Iteration {
	public static void main(String[] args) {
		List list = new ArrayList(100);
		
		
		//Adding an element
		list.add("java");
		list.add("12");
		list.add("false");
		list.add("34.34");
		list.add('d');
		list.add("668566354");
		list.add("12");
		System.out.println(list);
		list.add(0,"798776765654");
		System.out.println(list);
		
		//Removing an element
		list.remove(2);
		System.out.println(list);
		
		//reversing List
		System.out.println(list.reversed());
		
		//Searching an element
		System.out.println(list.contains("12"));
		
		//Replacing element with specified element
		list.set(1, "gub");
		System.out.println(list);
		
		//Iterating list
		Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
		//Copying list
		ArrayList<String> newlist = new ArrayList<>(list);
		System.out.println(newlist);
		
		//Swapping of elements
		Collections.swap(list, 0, 3);
		System.out.println(list);
		
		//Shuffling list
		Collections.shuffle(list);
		System.out.println(list);
		
		//Extracting a portion of list
		System.out.println(list.subList(0, 3));
		
		
		//Comparing two strings
		System.out.println(list.equals(newlist));
		
		//Joining Arraylist
		System.out.println(list.addAll(newlist));
		
		//Increase the size of an Arraylist
		((ArrayList) list).ensureCapacity(1);
		System.out.println(list);
		
		//Printing using position
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + ": " + list.get(i)); 
			}
		
		
		
	}
}
