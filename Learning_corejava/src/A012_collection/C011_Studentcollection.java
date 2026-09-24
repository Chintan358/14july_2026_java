package A012_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C011_Studentcollection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(11, "Manoj", "manoj@gmial.com"));
		st.add(new Student(12, "Yash", "yash@gmail.com"));
		st.add(new Student(10, "Om", "om@gmail.com"));
		
		
		Collections.sort(st);
		
		Iterator<Student> iter = st.iterator();
		while(iter.hasNext())
		{
			//Student s = iter.next();
//			s.display();
			//System.out.println(s);
			System.out.println(iter.next());
		}
		
		
	}
}
