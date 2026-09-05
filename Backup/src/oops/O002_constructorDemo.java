package oops;

class Student
{
	Student()
	{
		System.out.println("const calling");
	}
	
	Student(int id)
	{
		System.out.println("Id  :"+id);
	}
	
	Student(String name)
	{
		System.out.println("Name is : "+name);
	}
	
	int id;
	String name;
	String email;
	
	Student(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
}

public class O002_constructorDemo {
	public static void main(String[] args) {
		
		Student st = new Student(1,"yash","yash@gmial.com");
		st.display();
		
		Student st1 = new Student(2,"Manoj", "manoj@gmail.com");
		st1.display();
		
	}
}
