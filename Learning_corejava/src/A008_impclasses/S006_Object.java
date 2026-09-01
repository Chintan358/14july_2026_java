package A008_impclasses;

class A
{
//	@Override
//	public String toString() {
//		
//		return "Hello";
//	}
	
	int a;
	int b;
	A(int a, int b)
	{
		this.a = a;
		this.b = b;			
	}
	
	@Override
	public boolean equals(Object obj) {
		
		A ob = (A) obj;
		return this.a==ob.a && this.b==ob.b;
	}
}


public class S006_Object {
	public static void main(String[] args) {
		
//		A a = new A();
//		System.out.println(a);	
//		System.out.println(a.getClass());
		
		
		A a1 = new A(10,20);
		A a2 = new A(10,20);
		System.out.println(a1.equals(a2));
		
		
	}
}
