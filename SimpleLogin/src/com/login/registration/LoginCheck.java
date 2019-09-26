package com.login.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NullPointerException {
	UserDAO ud=new UserDAOImpl();
	String userName=request.getParameter("uname");
	String password=request.getParameter("password");
	String submitType=request.getParameter("submit");
	User u=ud.getUser(userName, password);
	if(submitType.equals("login") && u!=null && u.getUsername()!=null)
	{
		request.setAttribute("message",u.getUsername());
		request.getRequestDispatcher("member.jsp").forward(request, response);
		
		
	}else if(submitType.equals("register"))
	{
	
		u.setFirstName(request.getParameter("fname"));
		u.setPassword(password);
		u.setUsername(userName);
		request.setAttribute("successmessage","Registration Done , please Login to continue  !!!");
		request.getRequestDispatcher("Login.jsp").forward(request, response);
		
	}else {
		request.setAttribute("message","Data Not Found,click on Register  !!!");
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
	
	}

}
