<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String uName = request.getParameter("uname");
	out.println("Welcome User : "+uName+"<br>");
	out.println("*****ServletContext*****<br>");
	out.println("ServletInfo : "+application.getServerInfo()+"<br>");
	out.println("ContectInfo : "+application.getInitParameter("x")+"<br>");
	out.println("Session_Time : "+application.getSessionTimeout()+"<br>");

	
	%>
</body>
</html>