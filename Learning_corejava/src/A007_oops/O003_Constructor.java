package A007_oops;

class Test
{
	static int i=0;
	Test()
	{
		i++;
		System.out.println("calling");
		
	}
	
}


public class O003_Constructor {
	public static void main(String[] args) {
		
		
		Test t  =new Test();
		Test t1  =new Test();
		Test t2  =new Test();
		Test t3  =new Test();
		
		System.out.println(Test.i);
		
	}
}
