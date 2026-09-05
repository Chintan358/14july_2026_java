package oops;

class Test
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("m1 : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("m2 : "+r);
	}
	
	public void add(double a, int b)
	{
		double r = a+b;
		System.out.println("m3 : "+r);
	}
}

public class O008_MethodOverloading {
	public static void main(String[] args) {
			
		Test t = new Test();
		t.add(10, 20);
		t.add(10, 20, 30);
		t.add(10.554, 20);
		
	}
	
	public static void main(int a)
	{
		
	}
}
