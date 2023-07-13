package cookieImp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie1")
public class CookieClass1  extends HttpServlet{
@Override
public  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	
String name=req.getParameter("name");
String email=req.getParameter("email");
Cookie c1= new Cookie("name",name);
Cookie c2= new Cookie("email",email);

resp.addCookie(c1);
resp.addCookie(c2);
resp.sendRedirect("cookie2");


	}

}
