<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Car Wash Bookings</h1>
<table>
    <tr>
        <th>Customer Name</th>
        <th>Vehicle Type</th>
        <th>Date</th>
        <th>Cost</th>
        
    </tr>
    <c:forEach var="carWash" items="${carWashes}">
        <tr>
            <td>${carWash.customerName}</td>
            <td>${carWash.vehicleType}</td>
            <td>${carWash.bookingDate}</td>
            <td>${carWash.cost}</td>
            <td>
                <a href="/car-wash/delete/${carWash.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/car-wash/add">Add New Booking</a>

</body>
</html>