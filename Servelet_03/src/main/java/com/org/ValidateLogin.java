package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lin")
public class ValidateLogin  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		String html1="<html><body><h1>LOGIN SUCESS</h1></html></body>";
		String html2="<html><body><h1>LOGIN FAILED</h1></html></body>";
		PrintWriter pw=res.getWriter();
		
		if(email.equals("abc@gmail.com")&& password.equals("1234")) {
			pw.write(html1);
			
		}else {
			pw.write(html2);
		}

	}

}
