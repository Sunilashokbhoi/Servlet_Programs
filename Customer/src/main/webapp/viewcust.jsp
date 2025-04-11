<%@page import="task02.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
CustomerBean cb = (CustomerBean)request.getAttribute("cbean");
out.println(cb.getId()+"&nbsp&nbsp"+cb.getName()+"&nbsp&nbsp"+cb.getMid()+"&nbsp&nbsp"+cb.getCity()+"&nbsp&nbsp");
%>
</body>
</html>