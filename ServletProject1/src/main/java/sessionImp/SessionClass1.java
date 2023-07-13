package sessionImp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session1")
public class SessionClass1 extends HttpServlet {
	@Override
	protected  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	String name= req.getParameter("name");
	String email= req.getParameter("email");
	int age= Integer.parseInt(req.getParameter("age"));
	DataClass dataclass = new DataClass(age,name,email);
	HttpSession session =req.getSession();
	session.setAttribute("data",dataclass);
	resp.sendRedirect("session2");
	
	}
	
	

}
