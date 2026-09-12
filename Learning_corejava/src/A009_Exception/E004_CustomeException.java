package A009_Exception;


class InsufficentAmountException extends Exception
{
	public InsufficentAmountException(double amount) {
		super("Invalid amount you are sort of :"+amount);
	}
}

class Bank
{
	double balance;
	
	public void checkBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	public void deposite(double amount)
	{
		balance+=amount;
	}
	
	public void withdrow(double amount) throws InsufficentAmountException
	{
		if(balance<amount)
		{
			//System.out.println("insufficent amount");
			throw new InsufficentAmountException(amount-balance);
		}
		else
		{
			balance-=amount;
		}
	}
	
}


public class E004_CustomeException 
{
	public static void main(String[] args)
	{
		Bank b = new Bank();
		b.checkBalance();
		b.deposite(5000);
		b.deposite(2000);
		b.checkBalance();
		
		try {
			b.withdrow(2000);
		} catch (InsufficentAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		b.checkBalance();
		
		
	}
}
