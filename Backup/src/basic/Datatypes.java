package basic;

public class Datatypes {
	public static void main(String[] args) {
		
//		byte b = -128;
//		short s = 5665;
//		int i = 255656;
//		long l = 56565656565l;
//		
//		float f = 456.5895656f;
//		double d = 65656.665656565;
		
//		System.out.println(f);
//		System.out.println(d);
		
//		char ch = 'C';
//		
//		boolean bool = true;
		
		//widning - implicite
		int i = 200;		
		long l = i;
		
		//nerrowing - explicite
		long a = 66565;
		int b = (int) a;
		
		
		char c = 65;
		System.out.println(c);
		
		int x = 'A';
		System.out.println(x);
	}
}
