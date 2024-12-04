<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Employee Details</h2>
    <p>Employee ID: <%= request.getAttribute("empId") %></p>
    <p>Employee Name: <%= request.getAttribute("ename") %></p>
    <p>Salary: <%= request.getAttribute("salary") %></p>
    <p>Email: <%= request.getAttribute("email") %></p>
    <p>Mobile: <%= request.getAttribute("mobile") %></p>
    <p>Date : <%= request.getAttribute("date") %></p>
</body>
</html>