package A010_Fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_OPStreamDemo  
{
	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name : ");
			String name = sc.next();
			System.out.println("enter email : ");
			String email = sc.next();
		
			try(FileOutputStream fos = new FileOutputStream("D:\\files\\"+name+".txt"))
			{
				
				//String str = "This is my first io program";
				byte b[] = email.getBytes();
				fos.write(b);
				System.out.println("File created");
				
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
	}
}
