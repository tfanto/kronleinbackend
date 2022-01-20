package org.kro.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopService {

	@Autowired
	private OrderRepository orderRepository;

}
