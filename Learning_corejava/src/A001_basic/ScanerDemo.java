package A001_basic;

import java.util.Scanner;

public class ScanerDemo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("enter value of b :");
		double b = sc.nextDouble();
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("Enter full name :");
		sc.nextLine();
		String fname = sc.nextLine();
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		System.out.println(fname);
		
	}
}
