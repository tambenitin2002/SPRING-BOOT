<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Bike Wash Bookings</h1>
<table>
    <tr>
        <th>Customer Name</th>
        <th>Bike Model</th>
        <th>Date</th>
        <th>Cost</th>
    </tr>
    <c:forEach var="bikeWash" items="${bikeWashes}">
        <tr>
            <td>${bikeWash.customerName}</td>
            <td>${bikeWash.bikeModel}</td>
            <td>${bikeWash.bookingDate}</td>
            <td>${bikeWash.cost}</td>
            <td>
                <a href="/bike-wash/delete/${bikeWash.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/bike-wash/add">Add New Booking</a>

</body>
</html>