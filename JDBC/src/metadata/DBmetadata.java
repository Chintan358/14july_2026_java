package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBmetadata {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/14july_java","root","root");
		
//			DatabaseMetaData dbm = cn.getMetaData();
//			System.out.println(dbm.getDriverMajorVersion());
//			System.out.println(dbm.getDriverName());
			
			
			
			
			
			
			
			PreparedStatement st = cn.prepareStatement("select * from student");		
		    ResultSet rs = st.executeQuery();

		    ResultSetMetaData rsm = rs.getMetaData();
			System.out.println(rsm.getColumnCount());
			System.out.println(rsm.getColumnLabel(1));
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
