package com.manoj.xpg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.xpg.services.PaymentService;
import com.manoj.xpg.web.request.PaymentRequest;
import com.manoj.xpg.web.response.Response;

@RestController
public class PaymentController {

	
	@Autowired
	PaymentService paymentServiceImpl;
	
	@GetMapping("payment-methods")
	public Response getAllPaymentMethod() {
		return paymentServiceImpl.getAllPaymentMethods();
		
	}
	
	@PostMapping("initiate-payment")
	public Response initiatePayment(@RequestBody PaymentRequest paymentRequest) {
		return paymentServiceImpl.pay(paymentRequest);
	}
}
