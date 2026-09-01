package A008_impclasses;

public class S002_StringMethods {
	public static void main(String[] args) {
		
		
		String s = "Sun rises in East";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('s'));
		System.out.println(s.lastIndexOf('s'));
		System.out.println(s.concat("hello"));
		System.out.println(s.startsWith("Su"));
		System.out.println(s.endsWith("ast"));
		System.out.println(s.substring(4,8));
		System.out.println(s.replace("rises","K"));
		System.out.println(s.strip());
		System.out.println(s.contains("in"));

		System.out.println("*******************");
		
		String words[] = s.split("s");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		System.out.println("***********************");
		
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("****************************");
		
		byte b[]  = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
	}
}
