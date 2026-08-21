package A007_oops;

class Parent
{
	public void display(int a)
	{
		System.out.println("parent");
	}
}

class child extends Parent
{
	@Override
	public void display(int a) {
		System.out.println("Child");
		//super.display();
	}
}

public class O012_MethodOverrinding {

	public static void main(String[] args) {
		
		child c = new child();
		//c.display();
		c.display(10);
		
	}
}
