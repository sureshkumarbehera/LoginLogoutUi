package com.sakhaweb.signupDao;


	import java.sql.Connection;
import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class SignDao {

		 public boolean getData(String username,String password,String email,long phone) throws Exception
		 {
			 
			 
			 
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sakhadb","suresh","Suresh@6123");
			 PreparedStatement pstmt=con.prepareStatement(" insert into  user values(?,?,?,?)");
			 System.out.println(email);
			 System.out.println(phone);
			 pstmt.setString(1, username);
			 pstmt.setString(2, password);
			 pstmt.setString(3, email);
			 pstmt.setLong(4, phone);
			 int x=pstmt.executeUpdate();
			 System.out.println(x);
			 if(x>0)
			 {
				 return true;
			 }
			 
			 return false;
		 }
		
	}
