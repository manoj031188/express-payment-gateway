package com.manoj.xpg.services;

import com.manoj.xpg.web.request.PaymentRequest;
import com.manoj.xpg.web.response.Response;

public interface PaymentService {

	Response getAllPaymentMethods();

	Response pay(PaymentRequest paymentRequest);

}
