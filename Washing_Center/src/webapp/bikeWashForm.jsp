<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="/api/v1/bike-wash" method="post">
        <label>Customer Name:</label>
        <input type="text" name="customerName" required />
        
        <label>Vehicle Type:</label>
        <input type="text" name="vehicleType" placeholder="Basic, Advanced, etc." required />
        
        <label>Service Date:</label>
        <input type="datetime-local" name="serviceDate" required />
        
        <label>Cost:</label>
        <input type="number" step="0.01" name="cost" required />
        
        <button type="submit">Submit</button>
    </form>

</body>
</html>