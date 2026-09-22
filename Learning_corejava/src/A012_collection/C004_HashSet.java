package A012_collection;

import java.util.HashSet;
import java.util.Iterator;

public class C004_HashSet {
	public static void main(String[] args) {
		
		//remove duplicate but stored in random manner
		//default :16
		//load factor : 0.75
		//new will be double to old size when load factor
		HashSet<String> sh = new HashSet<String>();
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
