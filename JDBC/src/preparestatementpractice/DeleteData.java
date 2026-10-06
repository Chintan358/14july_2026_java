package preparestatementpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		
		

		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/14july_java","root","root");
		
			PreparedStatement st = cn.prepareStatement("delete from student where id=?");
			st.setInt(1, id);
			
			
			int i = st.executeUpdate();
			if(i>0)
			{
				System.out.println("Data deleted");
			}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
	
	
}
