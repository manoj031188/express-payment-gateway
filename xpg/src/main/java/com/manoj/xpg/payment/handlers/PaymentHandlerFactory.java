package com.manoj.xpg.payment.handlers;

import org.springframework.stereotype.Component;

/**
 * @author manoj
 *
 */
@Component
public class PaymentHandlerFactory {

	public BasePaymentHandler getPaymentHandler(String channel) {
		if (channel == null || channel.isEmpty())
			return null;
		if ("UPI".equals(channel)) {
			return new UpiPaymentHandler();
		} else if ("Credit".equals(channel)) {
			return new CreditCardPaymentHandler();
		} else if ("Wallet".equals(channel)) {
			return new WalletPayementHandler();
		}
		return null;
	}

}
