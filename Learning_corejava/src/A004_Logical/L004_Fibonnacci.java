package A004_Logical;

public class L004_Fibonnacci {
	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21 34 55 89 
		
		int length  = 15;
		
		int a = 0; 
		int b = 1; 
		
		System.out.print(a+" "+b);
		
		for(int i=1;i<=length;i++)
		{
			int c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
			
		}
		
		
	}
}
