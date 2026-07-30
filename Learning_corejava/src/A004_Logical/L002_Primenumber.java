package A004_Logical;

public class L002_Primenumber {
	public static void main(String[] args) {
		
		int number = 7;
		int flag = 0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
		
	}
}
