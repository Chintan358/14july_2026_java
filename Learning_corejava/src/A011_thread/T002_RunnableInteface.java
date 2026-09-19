package A011_thread;

class Demo
{
	
} 
class Th1 extends Demo implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("th1 : "+i);
		}
	}
}

class Th2 implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("th2 : "+i);
		}
		
	}
	
}

public class T002_RunnableInteface
{
	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
	}
}
