package A007_oops;

class Calc
{
	public void test()
	{
		System.out.println("test calling....");
	}
	
	
	public void square(int a)
	{
		int r= a*a;
		System.out.println("square is : "+r);
	}
	
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("additon is : "+r);
	}
	
	public int cube(int a)
	{
		int c = a*a*a;
		return c;
	}
	
	public String message()
	{
		return "Hello tops";
	}
	
	
	public void array_sum(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum is : "+sum);
	}
	
	
	public int[] rev_array(int a[])
	{
		int k[] = new int[a.length];
		int c = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			k[c] = a[i];
			c++;
		}
		
		return k;
	}
	
	public void all(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
}

public class O010_MethodMAnipulation {
	public static void main(String[] args) {
		
		
		
		Calc c = new Calc();
//		c.test();
//		c.square(20);
//	    c.add(20, 50);
//	    
//		int cb = c.cube(10);
//		System.out.println(cb);
//		System.out.println(c.cube(50));
//		
//		
//		String msg = c.message();
//		System.out.println(msg);
		
//		int k[] = {10,20,30,400,50};
	//	c.array_sum(k);
		
		
//		int r[] = c.rev_array(k);
//		for (int i = 0; i < r.length; i++) {
//			System.out.println(r[i]);
//		}
		
		
		
		c.all(10,20,30,40,50,90);
		
		
		
	}
}	





