package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetStudentData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        String gender =req.getParameter("gender");
        
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(gender);
        
        String html="<html><body><h1>GOOD EVENING"+name+"</h1></body></html>";
        PrintWriter pw=res.getWriter();
        pw.write(html);
	}

}
