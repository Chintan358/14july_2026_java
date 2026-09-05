package oops;

class Parent
{
	public void display(int id)
	{
		System.out.println("display calling from parent");
	}
}

class Child extends Parent
{
	@Override
	public void display(int id) {
		System.out.println("display calling from child");
//		super.display();
	}
}
public class O009_MethodOverriding {
	public static void main(String[] args) {
		
		Child c  =new Child();
		//c.display();
		
	}
}
