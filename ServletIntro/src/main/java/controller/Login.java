package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Login")
public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     PrintWriter writer =res.getWriter();
     if(req.getParameter("name").equals("sudip")&& req.getParameter("password").equals("1234")) {
    	writer.write("Welcome Sudip"); 
     }
     else {
    	 writer.write("Invalid User and password");
     }
	}

}
