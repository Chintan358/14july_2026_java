package oops;

//parent - super - base
class A
{
	int id = 20;
	public void display()
	{
		System.out.println("display calling from A");
	}
}


//child - sub - derived
class B extends A
{
	int id = 100;
	public void sample()
	{
		int id = 300;
		System.out.println(id);
		System.out.println(super.id);
		System.out.println(this.id);
		System.out.println("sample calling from B");
	}
}

//class C extends B
//{
//	
//}

//class C extends A
//{
//	
//}

//--multiple inheritance - not supported
//class C extends A,B
//{
//	
//}




public class O004_InheritanceDemo {
	public static void main(String[] args) 
	{
//		B b  =new B();
//		b.sample();
		
		//upcasting
//		A a = new B();
		
		//downcasting
//		B b = new A();
	}
}
