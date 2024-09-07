package com.ebmaia.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebmaia.desafio01.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		return order.getBasic()*((100-order.getDiscount())/100)+shippingService.shipment(order);
	}
	
}
