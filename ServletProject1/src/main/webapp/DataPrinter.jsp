<%@page import="sessionImp.DataClass"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>This data printer</h1>
     <%HttpSession ses =request.getSession(); %>
     
<%List<DataClass>list=(List<DataClass>)session.getAttribute("list"); %>
 <% RequestDispatcher rd=request.getRequestDispatcher("DataPrinter2.jsp");%>
 <%request.setAttribute("dataList",list); %>
 <%rd.forward(request,response);%>
</body>
</html>