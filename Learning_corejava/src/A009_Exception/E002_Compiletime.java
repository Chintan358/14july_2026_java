package A009_Exception;

class Demo
{
	public void display() throws ClassNotFoundException
	{
		Class.forName("com.Demo");
	}
}


public class E002_Compiletime
{
	public static void main(String[] args) 
	{
		    Demo d = new Demo();
		    try {
				d.display();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
