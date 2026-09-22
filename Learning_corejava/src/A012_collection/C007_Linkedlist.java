package A012_collection;

import java.util.Iterator;
import java.util.LinkedList;

public class C007_Linkedlist {
	public static void main(String[] args) {
		
		
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.remove(2);
		
		Iterator<Integer> iter = al.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
	}
}
