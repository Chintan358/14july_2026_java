package A008_impclasses;

public class S001_String {
	public static void main(String[] args) {
		
		//string literal
//		String s = "Yash";
		
		//string object
//		String str = new String("Manoj");
		
	
//		String s1 = s.concat("Tandel");
//		System.out.println(s1);
		
		
		
		String s1 = "Java";
		String s2 = "Php";
		String s3 = "Java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		
		System.out.println("**************************");
		
		String str1 = new String("Java");
		String str2 = new String("Php");
		String str3 = new String("Java");
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
		
		
	}
}
