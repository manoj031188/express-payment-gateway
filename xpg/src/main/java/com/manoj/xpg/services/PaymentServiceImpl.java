package com.manoj.xpg.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.manoj.xpg.payment.handlers.BasePaymentHandler;
import com.manoj.xpg.payment.handlers.PaymentHandlerFactory;
import com.manoj.xpg.web.request.PaymentRequest;
import com.manoj.xpg.web.response.Response;

public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentHandlerFactory factory;
	
	@Override
	public Response getAllPaymentMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response pay(PaymentRequest paymentRequest) {
		BasePaymentHandler baseHandler = factory.getPaymentHandler(paymentRequest.getPaymentMethod());
		baseHandler.pay();
		return null;
	}

}
