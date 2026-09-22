package A012_collection;

import java.util.ArrayList;

public class C002_Arraylist {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		
		
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		//a2.addAll(a1);
		a2.add(100);
		a2.add(200);
		a2.add(300);
		//a2.removeAll(a1);
		
		
		for(int i : a2)
		{
			System.out.println(i);
		}
		
		
		
		
		
	}
}
