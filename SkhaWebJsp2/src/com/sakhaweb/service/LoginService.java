package com.sakhaweb.service;

import com.sakhaweb.dao.UserDao;

public class LoginService {

	
	public boolean validLogin(String username,String password) throws Exception
	{
		UserDao dao=new UserDao();
		return dao.getData(username, password);
	}
	
}
