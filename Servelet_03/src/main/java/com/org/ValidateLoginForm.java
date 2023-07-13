 package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class ValidateLoginForm  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		
		
		if(email.equals("abc@gmail.com")&& password.equals("1234")) {
		RequestDispatcher rd =req.getRequestDispatcher("Home.jsp");
		rd.forward(req, res);
		}else {
			
			PrintWriter pw=res.getWriter();
			String msg="<html><body><h1></h1></html></body>";
            pw.write(msg);
			
			RequestDispatcher rd =req.getRequestDispatcher("loginform.jsp");
			rd.include(req, res);	
		}
	}

}
