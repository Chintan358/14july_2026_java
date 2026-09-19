package A011_thread;



class T1 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("Th1 : "+i);	
		}
	}
}


class T2 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("Th2 : "+i);	
		}
	}
}

public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
//		t1.run();
//		t2.run();
		
		//t2.setPriority(Thread.MAX_PRIORITY);
		//t1.setPriority(Thread.MIN_PRIORITY);
		
//		t2.setPriority(10);
//		t1.setPriority(9);
		
//		t1.setName("Manoj");
//		t2.setName("Yash");
//		
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
//		
		t1.start();
		t2.start();
		
	}
}
