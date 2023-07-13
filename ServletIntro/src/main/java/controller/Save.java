package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Save extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
  String name=req.getParameter("name");
  String email=req.getParameter("email");
  String phone=req.getParameter("phone");
  String dob=req.getParameter("dob");
  String adress=req.getParameter("adress");
  
  System.out.println(name);
  System.out.println(email);
  System.out.println(phone);
  System.out.println(dob);
  System.out.println(adress);
		System.out.println("save class getting executed");
	}
	public void  display() {
		System.out.println("display() from servelt");
	}

}
