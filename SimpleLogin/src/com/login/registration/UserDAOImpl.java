package com.login.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UserDAOImpl implements UserDAO {

	MyConnectionProvider myConnection= new MyConnectionProvider();
	 Connection con;
	 PreparedStatement ps;
	@Override
	public int insertUser(User u) {
		
		int status=0;
		try {
			System.out.println("data inserting into database");
			con=myConnection.getCon();
			System.out.println("connection established");
			ps=con.prepareStatement("insert into user_info values(?,?,?,?,?,?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getCpassword());
			ps.setString(4, u.getFirstName());
			ps.setString(5, u.getLastName());
			ps.setString(6, u.getEmail());
			ps.setLong(7, u.getPhoneNumber());
			
			status=ps.executeUpdate();
			System.out.println("query executed");
			System.out.println("row inserted "+status);
			con.close();
			
			
		} catch (Exception e) {
System.out.println(e);	
}
		return status;
	}

	@Override
	public User getUser(String username, String pass) {

		User u=new User();
		
		try {
			
			con=myConnection.getCon();
			
			ps=con.prepareStatement("select * from user_info where uname=? and upass=?");
			ps.setString(1, username);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setCpassword(rs.getString(3));
				u.setFirstName(rs.getString(4));
				u.setLastName(rs.getString(5));
				u.setEmail(rs.getString(6));
				u.setPhoneNumber(rs.getLong(7));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);		}
		return u;
	}

	
	
	

}
