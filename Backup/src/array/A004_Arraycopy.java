package array;

import java.util.Arrays;
import java.util.Iterator;

public class A004_Arraycopy {
	public static void main(String[] args) {
		
//		
//		int a[] = {10,20,30,40,50,60,70};
//		int b[] = new int[10];
//		
//		System.arraycopy(a, 3, b, 4, 4);
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
//		for (int i = 0; i < a.length; i++) {
//			b[i] = a[i];
//		}	
//		System.out.println(Arrays.toString(b));
//		
		
		//task 1: find second highest from array
		//task 2 : merge 2 array into single array
		
		int a[] = {10,20,30};
		int b [] = {30,40,50};
		int c [] = new int[a.length+b.length];
		
		System.out.println(Arrays.toString(c));
		
		
	}
}
