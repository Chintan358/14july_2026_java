package A010_Fileio;

import java.io.File;
import java.io.IOException;

public class F004_FileClass {
	public static void main(String[] args) {
		
			
			File f = new File("D://files//abc");
			
			
			//f.mkdir(); - create folder
			
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
			
			
//			if(f.exists()) {
//				System.out.println("file available");
//				f.delete();
//				System.out.println("file deleted");
//			}
//			else
//			{
//				System.out.println("file not available");
//				
//				try {
//					f.createNewFile(); // create file
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				System.out.println("file created");
//				
//			}
				
		
		
		
	}
}
