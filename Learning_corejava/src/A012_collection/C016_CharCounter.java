 package A012_collection;

import java.util.HashMap;
import java.util.Iterator;

public class C016_CharCounter {
	public static void main(String[] args) {
		
		String str = "Hello Hello java Hello tops tops"; 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char words[] = str.toCharArray();
		
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
