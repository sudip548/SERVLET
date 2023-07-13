<%@page import="sessionImp.DataClass"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<DataClass>list=(List<DataClass>)session.getAttribute("dataList"); %>

<%for(DataClass e:list){%>
	<h2>
	<%=e%></h2>	
<br>
<%
}
%>
<%for(int a=0;a<4;a++){ %>
<h2>${(list.get(a))}
</h2>
<br>
<%
}
%>
</body>
</html>