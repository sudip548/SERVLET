package responseRedirectTrial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/respredirect2")
public class RespClass2 extends HttpServlet{
	@Override
	public  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	System.out.println("doPost in 2nd Servlet class");
	}
	@Override
	public  void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		String name =req.getParameter("name");
		String email= req.getParameter("email");
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(email);
	System.out.println("doGet in 2nd servlet class");
	}
}
