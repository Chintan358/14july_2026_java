package A012_collection;

import java.util.ArrayList;
import java.util.Collections;

public class C013_SortCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(40);
		al.add(60);
		al.add(10);
		al.add(2);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
	}
}
