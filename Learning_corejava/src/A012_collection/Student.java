package A012_collection;

public class Student implements Comparable<Student> {
	
		int id;
		String name;
		String email;
		
		public Student(int id, String name, String email) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
		}
		
		public void display()
		{
			System.out.println(id+" "+name+" "+email);
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
		}

		@Override
		public int compareTo(Student o) {
			
			int exist_id = o.id;  //12
			int new_id = this.id; //10
			
			
			int i=0;
			if(new_id>exist_id)
			{
				i = -1;
			}
			else if(new_id<exist_id)
			{
				i = 1;
			}
			else
			{
				i = 0;
			}
			return i;
		}
		
		
		
}
