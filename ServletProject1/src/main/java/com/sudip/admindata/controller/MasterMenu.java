package com.sudip.admindata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/masteradmin")
public class MasterMenu  extends HttpServlet{
	@Override
	public  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		PrintWriter out =resp.getWriter();
		
Object object=req.getAttribute("aa");

		System.out.println(object);
	out.write("<h1>"+"Welcome admin to the master admin menu"+"</h1>");
	out.write("<a herf=saveAdmin>To save new admin</a>");
	}

}
