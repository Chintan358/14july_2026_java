package oops;

import java.util.Arrays;

class Calc
{
	public void message()
	{
		System.out.println("Get message");
	}
	
	public void square(int a)
	{
		int r = a*a;
		System.out.println("Square of "+a+ " is "+r);
	}
	
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("addition of "+a+ " and "+b+ " is "+r);
	}
	
	
	public int cube(int a)
	{
		int c = a*a*a;
		return c;
	}
	
	
	public void arraySum(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum  : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int c = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[c] = a[i];
			c++;
		}
		
		return b;
	}
	
	public void varArgs(int...a)
	{
		System.out.println(Arrays.toString(a));
	}
}

public class O003_MethodManipulation {
	
	
	
	public static void main(String[] args) {
		
		
		Calc c = new Calc();
//		c.message();
//		c.square(10);
//		c.add(100, 20);
//		
//		int r = c.cube(10);
//		System.out.println(r);
//		System.out.println(c.cube(50));
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {100,200,300};
//		c.arraySum(b);
		
		int k[] = c.revArray(b);
		System.out.println(Arrays.toString(k));
		
		c.varArgs(10,20,30,40,60,70,80);
	}
}
