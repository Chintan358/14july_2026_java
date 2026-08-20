package A007_oops;

class Calc1
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("a :"+r);
	}
	
	public void add(int a, int b,int c)
	{
		int r = a+b+c;
		System.out.println("b :"+r);
	}
	
	public void add(int a, double b)
	{
		double r = a+b;
		System.out.println("c :"+r);
	}
}

public class O011_Methodoverloading {
	public static void main(String[] args) {
		
		
		Calc1 c = new Calc1();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10, 20.56);
	}
}
