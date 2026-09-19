package A011_thread;

class Sample extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(currentThread().getName()+" : "+i);
		}
	}
}

public class T003_Thread {
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		
		s1.start();
		s2.start();
		s3.start();
		
	}
}
