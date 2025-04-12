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
	out.println("Welcome User :"+uName+"<br>");
	out.println("*****ServletConfig*****<br>");
	ServletConfig scf = (ServletConfig)request.getAttribute("scf");
	out.println("Servlet-Name: "+scf.getServletName()+"<br>");
	out.println("Config_Value: "+scf.getInitParameter("p")+"<br>");
	
	out.println("**** JSP-Config) ****<br>");
	out.println("Servlet-Name: "+config.getServletName()+"<br>");
	
	%>
</body>
</html>