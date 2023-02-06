package com.gcu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{
	
	@Autowired
	private OrderDataService service;
	
	@Override
	public void test() {
		System.out.println("Hello from the OrdersBusinessService");
	}

	@Override
	public List<OrderModel> getOrders() {
		// Get all the entity Orders
		List<OrderEntity> ordersEntity = service.findAll();
		
		// Iterate over the Entity Orders and create a List of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity)
		{
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		// Return list of Domain Orders
		return ordersDomain;
	}

	@Override
	public void init() {
		System.out.println("Hello from init method");	
	}

	@Override
	public void destroy() {
		System.out.println("Hello from destroy method");	
	}

}
