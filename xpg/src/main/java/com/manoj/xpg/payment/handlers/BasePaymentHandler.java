package com.manoj.xpg.payment.handlers;

import com.manoj.xpg.beans.UserDetails;

public abstract class BasePaymentHandler {

	public abstract String pay();
	
	
	public UserDetails getUserInfo() {
		return null;
	}
}
