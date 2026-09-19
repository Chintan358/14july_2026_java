package A011_thread;

import java.util.Scanner;

class Account
{
	double balance;
	public Account(double amount) {
		this.balance = amount;
	}
	
	public boolean checkBalance(double amount)
	{
		boolean b = false;
		if(amount>balance)
		{
			b = false;
		}
		else
		{
			b  =true;
		}
		
		return b;
	}
	
	public void withdrow(double amount)
	{
		balance-=amount;
	}
}

class Customer implements Runnable
{
	String name;
	Account ac;
	public Customer(String name,Account ac) {
		this.name = name;
		this.ac = ac;
	}

	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {

		synchronized (ac) {
			System.out.println("enter amount By : "+name);
			double amount  =sc.nextDouble();
			if(ac.checkBalance(amount))
			{
					ac.withdrow(amount);
					System.out.println(amount+" wihdrowd by :"+name);
			}
			else
			{
				System.out.println("Insufficent amount");
			}
		}
		
	}
	
}



public class T004_syncroinzation_block {
	public static void main(String[] args) {
		
		Account ac = new Account(10000);
		
		Customer c1 = new Customer("Manoj",ac);
		Customer c2 = new Customer("OM",ac);
		
		Thread th1 = new Thread(c1);
		Thread th2 = new Thread(c2);
		
		th1.start();
		th2.start();
		
		
		
	}
}
