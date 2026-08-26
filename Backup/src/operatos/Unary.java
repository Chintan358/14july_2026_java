package operatos;

public class Unary {
	public static void main(String[] args) {
		
		
		// ++pre, post++ , --pre, post--
		
		int a = 10;
		int b = a++ + a++ - a--;
		       // 10  + 11  - 12
		System.out.println(a); //11
		System.out.println(b);
		
		
	}
}
