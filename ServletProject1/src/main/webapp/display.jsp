<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%System.out.println("Hello world");
System.out.println(a);
%>

<%="Hey there" %>
<%! int a=10; %>


<%!List<Integer>list =new ArrayList<>(); %>

<%
list.add(12);
list.add(156);
list.add(158);
list.add(152);
list.add(100);
%>
<%
for(Integer ee:list){
%>
<h1><%=ee%></h1><br>
<%
}
%>


</head>
<body>
<h1>Program executed successfully</h1>
</body>
</html>