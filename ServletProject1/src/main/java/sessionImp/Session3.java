package sessionImp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session3")
public class Session3 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session =req.getSession();
	Object object= session.getAttribute("data");
	DataClass.data=(DataClass)session.getAttribute("data");
	DataClass data = null;
	System.out.println(data);
	List<DataClass>list=new ArrayList<>();
	list.add(new DataClass(100,"sudip","sudipu21@gmail.com"));
	list.add(new DataClass(102,"sudipu","sudipu241@gmail.com"));
	list.add(new DataClass(103,"sudi","sudipu231@gmail.com"));
	list.add(new DataClass(104,"sudap","sudipu281@gmail.com"));
	list.add(new DataClass(105,"sudipa","sudipu291@gmail.com"));
	list.add(data);
	
	session.setAttribute("list", list);
	System.out.println(object);
	
	
	session.setMaxInactiveInterval(600);//time session
	resp.sendRedirect("display.jsp");
   }
}
