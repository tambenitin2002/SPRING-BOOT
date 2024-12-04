package edu.jsp.center.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import jakarta.persistence.criteria.Order;

@RestController
public class PaymentController {

    @PostMapping("/payment/create")
    public String createOrder(@RequestParam double amount) throws RazorpayException {
        RazorpayClient razorpay = new RazorpayClient("YOUR_KEY", "YOUR_SECRET");

        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", amount * 100); // Convert to paise
        orderRequest.put("currency", "INR");
        orderRequest.put("receipt", "order_rcptid_11");

        Order order = (Order) razorpay.Orders.create(orderRequest);
        return order.toString();
    }
}
