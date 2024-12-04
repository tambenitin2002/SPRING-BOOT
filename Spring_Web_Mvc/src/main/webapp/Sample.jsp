<%@page import="java.util.List"%>
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
 int number=(Integer)request.getAttribute("number");
 List<String> sub=(List) request.getAttribute("listOfSubject");
 %>
 <h1><%= number %></h1>
 <h1><%= sub %></h1>
</body>
</html>