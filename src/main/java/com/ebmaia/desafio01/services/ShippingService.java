package com.ebmaia.desafio01.services;

import org.springframework.stereotype.Service;

import com.ebmaia.desafio01.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double value = 0.0;
		if (order.getBasic() < 100.0) {
			value = 20.00;
		} else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
			value = 12.0;
		} else {
			value = 0.0;
		}
		return value;
	}
}