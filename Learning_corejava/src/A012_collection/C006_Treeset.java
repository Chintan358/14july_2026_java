package A012_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C006_Treeset {
	public static void main(String[] args) {
		
		//remove duplicates and stored in assending or decending
		TreeSet<String> sh = new TreeSet<String>();
		sh.add("java");
		sh.add("python");
		sh.add("php");
		sh.add("android");
		sh.add("node");
		sh.add("java");
		
//		Iterator<String> iter = sh.iterator();
		Iterator<String> iter = sh.descendingIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
	}
}
