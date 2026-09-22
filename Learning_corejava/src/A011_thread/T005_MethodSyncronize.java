package A011_thread;

class Table
{
	synchronized public void test(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+(a*i));
		}
		
	}
}

class Calc extends Thread
{
	Table t1;
	public Calc(Table t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		t1.test(5);
	}
}

public class T005_MethodSyncronize {
	public static void main(String[] args) {
		
		Table t1 = new Table();
		
		Calc c1 = new Calc(t1);
		Calc c2 = new Calc(t1);
		Calc c3 = new Calc(t1);
		
		c1.start();
		c2.start();
		c3.start();
		
		
	}
}
