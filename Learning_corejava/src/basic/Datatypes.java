package basic;

public class Datatypes {
	public static void main(String[] args) {
		
		
//		byte b = 127;
//		short s = 32767;
//		int i = 152;
//		long l = 564564564545l;
//		
//		float f = 4444.555656546546f;
//		double d = 45656.8898966456;
//		System.out.println(f);
//		System.out.println(d);
//		
//		char ch = 'a';
//		
//		boolean bool = true;
		
		
		//widening - implicite
		int a = 10;
		long b = a;
		
		//nerrowing - explicite
		long i = 2147483648445554l;
		int j = (int)i;
		//System.out.println(j);
		
		
		char c = 65;
		System.out.println(c);
		
		int d  ='a';
		System.out.println(d);
		
	}
}
