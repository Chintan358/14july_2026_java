package A012_collection;

import java.util.ArrayList;

public class C001_Arraylist {
	public static void main(String[] args) {
		
		//default size : 10
		//runtime grawable
		//newsize = (oldsize*3/2)+1 = 16
		//preserve insertion order
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(null);
		al.add(50);
		
		
		
//		al.add(1,200);
//		al.set(1, 200);
//		al.remove(2);
//		System.out.println(al.size());
//		System.out.println(al.get(0));
//		System.out.println(al.contains(50));
		
		for(Integer i : al)
		{
			System.out.println(i);
		}
		
		
		
		
		
	}
}
