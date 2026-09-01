package A008_impclasses;

import java.util.Scanner;

public class S003_StringPractice {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter name : ");
//		String st = sc.next();
//		String masked = "****".concat(st.substring(4));
//		System.out.println(masked);
		
		
		String s = "sun rises in east";
		
		//east in rises sun
		//tsae ni sesir nus
		//nus sesir ni tsae
		//east rises in sun
		
		String words[] = s.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
