package A012_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class C014_Map {
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 50);
		map.put("php", 60);
		map.put("python", 56);
		map.put("node", 40);
		map.put("java", 60);
		
		System.out.println(map.get("java"));
		
		//System.out.println(map);
		
//		Set s = map.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
//		for(Entry<String, Integer> m: map.entrySet())
//		{
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
//		}
//		
		
		
		
		
		
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
//		map.put("java", 50);
//		map.put("php", 60);
//		map.put("python", 56);
//		map.put("node", 40);
//		map.put("java", 60);
//		System.out.println(map);
		

		
//		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
//		map.put("java", 50);
//		map.put("php", 60);
//		map.put("python", 56);
//		map.put("node", 40);
//		map.put("java", 60);
//		System.out.println(map);
		
		
		
		
		
		
		
	}
}
