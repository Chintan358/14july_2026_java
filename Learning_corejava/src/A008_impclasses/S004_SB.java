package A008_impclasses;

public class S004_SB {
	public static void main(String[] args) {
		
		//sync - slow
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<1000000;i++)
		{
			sb.append("java");
		}
		double endTime = System.currentTimeMillis();
		
		
		//async -fast
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<1000000;i++)
		{
			sb1.append("java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("time tkane by buffer is : "+(endTime-startTime));
		System.out.println("time taken by builder is : "+(endTime1-startTime1));
		
	}
}
