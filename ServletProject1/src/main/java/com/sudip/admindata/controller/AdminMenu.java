package com.sudip.admindata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/adminmenu")
public class AdminMenu  extends HttpServlet{
@Override
protected void  doPost (HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	PrintWriter writer =resp.getWriter();
	writer.print("<h1>"+"Welcome Admin to the admin menu "+"</h1>");
	}
}
