 package A012_collection;

import java.util.HashMap;
import java.util.Iterator;

public class C015_WordCounter {
	public static void main(String[] args) {
		
		String str = "Hello Hello java Hello tops tops"; 
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String words[] = str.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			if(map.get(words[i])==null)
			{
				map.put(words[i], 1);
			}
			else
			{
				int k = map.get(words[i]);
				k++;
				map.put(words[i], k);
			}
			
		}
		System.out.println(map);
		
		
		
		
	}
}
