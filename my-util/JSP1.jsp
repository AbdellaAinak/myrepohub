<%@page import="com.ma.ainak.util.Util"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test 1 </title>
</head>
<body>
 <h2>la date d'aujourd'hui </h2>
 <%=Util.formatDate(new Date(),"dd/MM/yyyy") %>
</body>
</html>