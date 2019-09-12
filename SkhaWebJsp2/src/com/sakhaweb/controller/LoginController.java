package com.sakhaweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sakhaweb.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginService ls=new LoginService();
		try
		{
		
		if(ls.validLogin(Username, password))
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("username", Username);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
		//throw new Exception("Invalid user name/ password");
			response.sendRedirect("Error.jsp");
		}
		}
		catch(Exception e)
		{
	           response.sendError(500,e.getMessage());
	           //response.sendRedirect("error.jsp");
		}
	}

}
