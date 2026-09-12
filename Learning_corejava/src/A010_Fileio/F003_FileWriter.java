package A010_Fileio;

import java.io.FileWriter;

public class F003_FileWriter {
	public static void main(String[] args) {
		
		
			try(FileWriter fw = new FileWriter("D://files//home.txt"))
			{
				String str = "Hello java, Hello tops";
				fw.write(str);
				fw.flush();
			} 
			catch (Exception e) {
				// TODO: handle exception
			}
		
		
		
	}
}
