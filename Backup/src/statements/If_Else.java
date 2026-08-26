package statements;

public class If_Else {
	public static void main(String[] args) {
		
			
//		int age = 17;	
//		if(age>18)
//		{
//			System.out.println("Elegeble for vote");
//		}
//		else
//		{
//			System.out.println("Not Elegeble for voting");
//		}
		
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		
//		if(a>b)
//		{
//			if(a>c) {
//				System.out.println("A is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//			
//		}
//		else
//		{
//			if(b>c) {
//				System.out.println("B is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//			
//		}
//		
		
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
	}
}
