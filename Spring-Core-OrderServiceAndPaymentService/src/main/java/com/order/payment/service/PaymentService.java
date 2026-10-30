package com.order.payment.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	public void makePayment(int payment) {
		System.out.println("Payment done...Rs."+payment);
	}

}
