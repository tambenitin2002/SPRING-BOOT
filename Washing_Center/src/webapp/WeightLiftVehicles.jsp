<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Weight-Lift Vehicle Wash Bookings</h1>
<table>
    <tr>
        <th>Customer Name</th>
        <th>Vehicle Type</th>
        <th>Wheels No</th>
        <th>Date</th>
        <th>Cost</th>
    </tr>
    <c:forEach var="weightLiftVehicleWash" items="${weightLiftVehicleWashes}">
        <tr>
            <td>${weightLiftVehicleWash.customerName}</td>
            <td>${weightLiftVehicleWash.vehicleType}</td>
            <td>${weightLiftVehicleWash.wheelsNo}</td>
            <td>${weightLiftVehicleWash.bookingDate}</td>
            <td>${weightLiftVehicleWash.cost}</td>
            <td>
                <a href="/weight-lift-vehicle-wash/delete/${weightLiftVehicleWash.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/weight-lift-vehicle-wash/add">Add New Booking</a>

</body>
</html>