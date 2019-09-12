package com.sakhaweb.signcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sakhaweb.signupDao.SignDao;

/**
 * Servlet implementation class SignController
 */
@WebServlet("/SignController")
public class SignController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	boolean x;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Username=request.getParameter("username");
		String password=request.getParameter("password");
		String Email=request.getParameter("email");
		long Phone=Long.parseLong(request.getParameter("phone"));
		
		SignDao sd=new SignDao();
		
		try
		{
		
		x=sd.getData(Username,password,Email,Phone);
		//}
		//else
	     // {
		//throw new Exception("Invalid user name/ password");
			//response.sendRedirect("Error.jsp");
		//}
		}
		catch(Exception e)
		{
			e.printStackTrace();
	           //response.sendError(500,e.getMessage());
	           //response.sendRedirect("error.jsp");
		}
		if(x==true)
		{
			response.sendRedirect("Login.jsp");
		}
	}

}
