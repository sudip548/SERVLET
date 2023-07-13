package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/trial")
public class Trial extends HttpServlet {

	@Override
	protected  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.getWriter().print("doPost() executed");
	}
	
	@Override
	protected  void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.getWriter().print("doPost() executed");
	}
	
	@Override
	protected  void doPut(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.getWriter().print("doPost() executed");
	}
	
	@Override
	protected  void doDelete(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.getWriter().print("doPost() executed");
	}
}
