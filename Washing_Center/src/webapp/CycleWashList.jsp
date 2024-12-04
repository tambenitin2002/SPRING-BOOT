<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Cycle Wash Bookings</h1>
<table>
    <tr>
        <th>Customer Name</th>
        <th>Cycle Type</th>
        <th>Date</th>
        <th>Cost</th>
    </tr>
    <c:forEach var="cycleWash" items="${cycleWashes}">
        <tr>
            <td>${cycleWash.customerName}</td>
            <td>${cycleWash.cycleType}</td>
            <td>${cycleWash.bookingDate}</td>
            <td>${cycleWash.cost}</td>
            <td>
                <a href="/cycle-wash/delete/${cycleWash.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/cycle-wash/add">Add New Booking</a>

</body>
</html>