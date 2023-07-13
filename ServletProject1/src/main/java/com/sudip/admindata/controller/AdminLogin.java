package com.sudip.admindata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sudip.admindata.dao.AdminDao;
import com.sudip.admindata.dto.AdminDto;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDao dao = new AdminDao();
		String userName = req.getParameter("username");
		String password = req.getParameter("password");

		req.setAttribute("servlet", new AdminDto());

		AdminDto admin = dao.adminLogin(userName, password);
		if (admin.getId() != 0) {
			if (admin.getDept().equals("master")) {
				RequestDispatcher rd = req.getRequestDispatcher("masteradmin");
				rd.forward(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("adminmenu");
				rd.forward(req, resp);
			}
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("invalidadmin");
			rd.forward(req, resp);

		}
	}
}
