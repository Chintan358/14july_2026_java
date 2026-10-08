package project;

import java.util.Scanner;

/*Digital Wallet Console App”Duration: 
 * 2–3 sessions (integrated within 18 sessions)Objective:
 * 
 * Develop a console-based “Digital Wallet” where users can create accounts,
 * log in, check balance, deposit or spend money, and view transaction
 * history.
 * 
 * Core Functionalities:
 * Registration & Login:
 * 
 * Store users
 * temporarily using ArrayList or HashMap.Use encapsulation to 
 * secure credentials. / use database
 * 
 * Transaction Management:
 * Add/Spend funds, 
 * validate balance, 
 * update transaction list
*/

public class DigitalWallet 
{
		public static void main(String[] args)
		{
			String cont = "y";
			do {
			Scanner sc = new Scanner(System.in);
			System.out.println("***** Expanse Manager *****");
			System.out.println("Select Opration : ");
			System.out.println("1 : Registration");
			System.out.println("2 : Login");
			int choice = sc.nextInt();
			
			Opration op = new Opration();
			if(choice==1)
			{
				System.out.println("*****USER REGISTRATION*****");
				System.out.println("enter username : ");
				String uname = sc.next();
				System.out.println("enter password :");
				String pass = sc.next();
				int i = op.Registration(uname,pass);
				if(i>0)
				{
					System.out.println("Registration successfully !!!");
				}
			}
			else if(choice==2)
			{
				System.out.println("*****USER LOGIN*****");
				System.out.println("enter username : ");
				String uname = sc.next();
				System.out.println("enter password :");
				String pass = sc.next();
				int i = op.login(uname,pass);
				if(i>0)
				{
					System.out.println("****Login success****");
				}
				else
				{
					System.out.println("Invlaid credentials !");
				}
			}
			else
			{
				System.out.println("Invalid Opration");
			}
			
			System.out.println("Do you want to continue ? press y or n");
			cont = sc.next();
			
			}while(cont.equals("y"));
		}
}
