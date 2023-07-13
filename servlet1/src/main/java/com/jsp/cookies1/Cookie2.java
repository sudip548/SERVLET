package com.jsp.cookies1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("cookie2")
public class Cookie2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		
		for(Cookie cc:cookies) {
			if(cc.getName().equals("name")) {
				System.out.println(cc.getValue());
			}
			if(cc.getName().equals("email")) {
				System.out.println(cc.getValue());
			}
		}
	}

}
