<%@page import="java.awt.Container"%>
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
 Object ob = request.getAttribute("msg") ;

 if(ob  instanceof Object){
 	RegistrationBean rb = (RegistrationBean)request.getAttribute("msg");
 	out.println(rb.getName()+"&nbsp&nbsp"+rb.getEmail()+"&nbsp&nbsp"+rb.getPassword()+"&nbsp&nbsp"+rb.getPhno());
 }else if(ob instanceof String){
	 String msg = (String)request.getAttribute("msg");
	 out.println(msg);
 }
 %>
</body>
</html>