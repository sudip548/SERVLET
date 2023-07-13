package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login1  extends HttpServlet{
	

	public  void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter writer= res.getWriter();
		if(req.getParameter("name").equals("sudip")&& req.getParameter("password").equals("1234")) {
	    	writer.write("Welcome Sudip"); 
	     }
	     else {
	    	 writer.write("Invalid User and password");
	     }
		
	}

}
