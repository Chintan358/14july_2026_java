package A009_Exception;

class Demo
{
	public void get() throws ClassNotFoundException
	{
//		try {
//			Class.forName("com.Demo");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Class.forName("com.Demo");
	}
}

public class E002_Compiletime {
	public static void main(String[] args) {
		
		
//		try {
//			
//			Class.forName("com.Demo");
//			
//		} 
//		catch (ClassNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Demo d = new Demo();
		try {
			d.get();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
