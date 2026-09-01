package practice;

class Payment
{
	public void processPayment()
	{
		System.out.println("Payment prccessed");
	}
}

class CardPayment extends Payment
{
	@Override
	public void processPayment() {
		System.out.println("Card payment done");
	}
}

class Test
{
	
}

public class Demo {
	
	public static void main(String[] args) {
//		Payment p = new CardPayment();
//		p.processPayment();
		
		
		
		try {
			System.out.println("hello");
		} 
		catch(Exception e){
			
		}
		
		String st = "WAL1234";
		String masked = "****"+st.substring(4);
		System.out.println(masked);
		     
		
		 
	}

}
