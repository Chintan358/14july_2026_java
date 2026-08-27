package A007_oops;

abstract class Account
{
	double balance;
	abstract public void deposite(double amount);
	abstract public void withdrow(double amount);
	public void getBalance()
	{
		System.out.println("current balance is : "+balance);	
	}
}

class Saving extends Account
{

	@Override
	public void deposite(double amount) {
		balance+=amount;
	}

	@Override
	public void withdrow(double amount) {
		
		if(amount>balance)
		{
			System.out.println("Insuffient amount");
		}
		else
		{
			balance-=amount;
		}
		
	}	
}

class Loan extends Account
{

	@Override
	public void deposite(double amount) {
		
		if(amount>balance)
		{	
			double k = amount-balance;
			System.out.println("Laon cleared - return amount  : "+k);
			balance=0;
		}
		else
		{
			balance-=amount;
		}
		
	}

	@Override
	public void withdrow(double amount) {
		balance+=amount;
		
	}
	
}

public class O014_AbstractDemo {
	public static void main(String[] args) {
		
//		Saving s = new Saving();
//		s.getBalance();
//		s.deposite(5000);
//		s.deposite(3000);
//		s.getBalance();
//		s.withdrow(1000);
//		s.getBalance();
		
		Loan l = new Loan();
		l.getBalance();
		l.withdrow(5000);
		l.getBalance();
		l.deposite(1000);
		l.getBalance();
		
	}
}
