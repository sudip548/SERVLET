package responseRedirectTrial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/respredirect")

public class RespClass1  extends HttpServlet{
	@Override
	protected  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		System.out.println("doPost in the first class called");
		resp.sendRedirect("respredirect2");
	}
}
