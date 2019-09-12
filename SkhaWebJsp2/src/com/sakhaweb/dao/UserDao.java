package com.sakhaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

	 public boolean getData(String user,String password) throws Exception
	 {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sakhadb","suresh","Suresh@6123");
		 PreparedStatement pstmt=con.prepareStatement("select * from user where username=? and password=?");
		 pstmt.setString(1, user);
		 pstmt.setString(2, password);
		 ResultSet res=pstmt.executeQuery();
		 if(res.next())
		 {
			 return true;
		 }
		 
		 return false;
	 }
	
}
