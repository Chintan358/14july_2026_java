package array;

public class A005_2D_Array {
	public static void main(String[] args) {
		
		
//		int[][] a = new int[3][2];
//		
//		a[0][0] = 20;
//		a[0][1] = 30;
//		
//		a[1][0] = 40;
//		a[1][1] = 10;
//		
//		a[2][0] = 40;
//		a[2][1] = 60;
//		
//		
//		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<2;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
