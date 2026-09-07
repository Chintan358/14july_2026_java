package A009_Exception;

public class E001_ExceptionDemo {
	public static void main(String[] args) {
		
		
		System.out.println("Program started...");
		try 
		{
			
			int a = 10;
			int b = a/2;
			System.out.println(b);
			
//			int a[] = new int[5];
//			a[7]= 10;
			
		} 
//		catch (ArithmeticException e) 
//		{
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("always executable");
		}
		
		System.out.println("program ended");
		
		
		
//		finally {
//			System.out.println("test");
//		}
		
		
		
	}
}
