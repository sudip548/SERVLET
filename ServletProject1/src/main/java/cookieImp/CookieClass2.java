package cookieImp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

//import org.apache.tomcat.util.http.parser.Cookie;
@WebServlet("/")
public class CookieClass2 extends HttpServlet{
	@Override
	public  void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	Cookie[] cookies = req.getCookies();
		String name="";
		String email="";
		for(Cookie cc:cookies) {
			if(cc.getName().equals("name")) {
				name=cc.getValue();
			}if(cc.getName().equals("email")) {
				email=cc.getValue();
			}
			
		}

	System.out.println(name);
	System.out.println(email);
	}	
}
