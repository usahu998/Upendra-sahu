package com.login.registration;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider {
	
 Connection con=null;

public  Connection getCon()
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","admin@123456");
	} catch (Exception e) {
		System.out.println(e);
	}
	return con;
	}
}
