package com.order.payment.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.order.payment.config.AppConfig;
import com.order.payment.service.OrderService;

public class AppTest {
	public static void main(String[] args) {
          ApplicationContext cntxt=new AnnotationConfigApplicationContext(AppConfig.class);
          OrderService ordObj = cntxt.getBean(OrderService.class);
          ordObj.doOrder(2000);
	}
}
