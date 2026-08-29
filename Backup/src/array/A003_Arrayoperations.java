package array;

public class A003_Arrayoperations {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,65,48,94,210,45,87,65,32};
		
//		double sum = 0;
//		for (int i = 0; i < a.length; i++) {
////			sum =sum+a[i];
//			sum+=a[i];
//		}	
//		System.out.println(sum);
//		System.out.println(sum/a.length);
//		
		int max = a[0]; //94
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max =a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
