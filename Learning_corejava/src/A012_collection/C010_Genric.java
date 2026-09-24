package A012_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C010_Genric {
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.25);
		al.add("tops");
		al.add('A');
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
