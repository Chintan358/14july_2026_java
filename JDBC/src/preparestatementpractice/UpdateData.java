package preparestatementpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		
		

		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter email : ");
		String email = sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/14july_java","root","root");
		
			PreparedStatement st = cn.prepareStatement("update student set name=?,email=? where id=?");
			st.setInt(3, id);
			st.setString(1, name);
			st.setString(2, email);
			
			int i = st.executeUpdate();
			if(i>0)
			{
				System.out.println("Data Updated");
			}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
	
	
}
