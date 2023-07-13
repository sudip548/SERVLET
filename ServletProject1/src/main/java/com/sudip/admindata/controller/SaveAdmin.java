package com.sudip.admindata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sudip.admindata.dao.AdminDao;
import com.sudip.admindata.dto.AdminDto;
@WebServlet("/saveAdmin")
public class SaveAdmin extends HttpServlet {
	@Override
	protected  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		
		String userName = req.getParameter("username");
		String dept =req.getParameter("dept");
		String password =req.getParameter("password");
		
		
		AdminDto dto = new AdminDto();
		dto.setDept(dept);
		dto.setUserName(userName);
		dto.setPassword(password);
		
		AdminDao dao = new AdminDao();
		PrintWriter out= resp.getWriter();
		out.println(dao.saveAdmin(dto));
		
		
}
}