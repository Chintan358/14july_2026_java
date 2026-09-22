package A012_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C005_Linkedhashset {
	public static void main(String[] args) {
		
		//remove duplicate but preserve insertion order
		LinkedHashSet<String> sh = new LinkedHashSet<String>();
		sh.add("java");
		sh.add("python");
		sh.add("php");
		sh.add("android");
		sh.add("node");
		sh.add("java");
		
		Iterator<String> iter = sh.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
}
