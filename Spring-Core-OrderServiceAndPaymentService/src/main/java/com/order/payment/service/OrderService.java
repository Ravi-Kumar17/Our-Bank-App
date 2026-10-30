package com.order.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	private final PaymentService payService;

	@Autowired
	public OrderService(PaymentService payService) {
		this.payService = payService;
	}
	
	public void doOrder(int amount) {
		System.out.println("Order Placed Successfully...");
		payService.makePayment(amount);
		
	}

}
