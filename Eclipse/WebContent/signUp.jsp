<%@page import="java.util.*"%>
<%@page import="backend.*"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%

	String user = request.getParameter("New User");
	String pass = request.getParameter("New Pass");
	String phone = request.getParameter("Phone Number");
	

	DataBase.addUser(user, pass, phone);
	
	
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp!</title>
</head>
<body>

</body>
</html>