<%@page import="register.RegistrationBean"%>
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
	RegistrationBean rb = (RegistrationBean)request.getAttribute("rbean");
	out.println(rb.getName()+"&nbsp&nbsp"+rb.getEmail()+"&nbsp&nbsp"+rb.getPassword());
%>
</body>
</html>