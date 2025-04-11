<%@page import="task05.StudentBean"%>
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
	StudentBean sb = (StudentBean)request.getAttribute("sbean");
	out.println(sb.getId()+"&nbsp"+sb.getName()+"&nbsp"+sb.getCourse());
%>
</body>
</html>