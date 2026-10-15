package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Opration 
{
	Connection cn=null;
	public Opration() {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/14july_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int Registration(String uname, String pass)
	{
		int i=0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, pass);
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	
	public int login(String uname,String pass)
	{
		
		int uid=0;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				uid = rs.getInt(1);
			}
			else
			{
				uid=0;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return uid;
		
		
		
		
	}
	
	//System.out.println("***********Transaction*******************");
	
	public void checkBalance(int uid)
	{
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from transaction where uid=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			double c = 0;
			double d = 0;
			while(rs.next())
			{
				if(rs.getString(2).equals("credit"))
				{
					c+=rs.getDouble(4);
				}
				else if(rs.getString(2).equals("debit"))
				{
					d+=rs.getDouble(4);
				}
			}
			
			double balance = c-d;
			System.out.println("current balance is : "+balance);
		} catch (SQLException e) {
			
			System.out.println("Transaction not found for this user");
		}
	}
	
	public int deposite(int uid,double amount, String details)
	{
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("insert into transaction values(?,?,?,?,?)");
		
			ps.setInt(1, 0);
			ps.setString(2, "credit");
			ps.setString(3, details);
			ps.setDouble(4, amount);
			ps.setInt(5, uid);
			
			 i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}

	public int expance(int uid, double amount, String details) {
		
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("insert into transaction values(?,?,?,?,?)");
		
			ps.setInt(1, 0);
			ps.setString(2, "debit");
			ps.setString(3, details);
			ps.setDouble(4, amount);
			ps.setInt(5, uid);
			
			 i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	
	public void histroy(int uid)
	{
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from transaction where uid=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}
					
					
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
