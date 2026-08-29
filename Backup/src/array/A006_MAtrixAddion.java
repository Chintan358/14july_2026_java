package array;

public class A006_MAtrixAddion {
	public static void main(String[] args) {

		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int b[][] = { { 11, 30, 40 }, { 45, 57, 68 }, { 67, 89, 91 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("*****************");
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
