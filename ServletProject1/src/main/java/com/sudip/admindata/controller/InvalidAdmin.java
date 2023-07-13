package com.sudip.admindata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/invalidadmin")
public class InvalidAdmin  extends HttpServlet{
	@Override
	public  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		PrintWriter out =resp.getWriter();
		
	out.write("<h1>+"+"Invalid Username or Password"+"</h1>");
	out.write("<a herf = adminLog.in.html>To go back</a>");
	}
}
