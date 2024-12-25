package Assignment_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Q0047_HashMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"c");
		map.put(2,"c++");
		map.put("java","c"); 
		map.put(454.3,"python");
		map.put(false,"kotlin");
		map.put(6,"dart");
		map.put(null,null);
		System.out.println(map);
		System.out.println("\n\n" + map.size() + "\n\n");
		
		//Map Empty or not
		if (map.isEmpty()) {
			System.out.println("The map is empty.");
			} else {
				System.out.println("The map is not empty."); 
				}
		System.out.println(map);
		
		//Collection View
		Collection<String> values = map.values();
		System.out.println("Collection view of values: " + values);
		
		Set set = map.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
		}
		
	}
}
