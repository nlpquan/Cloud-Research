package com.gcu.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public class OrderEntity {

	@Id
	Long id;
	
	@Column("ORDER_NO")
	String orderNo;
	
	@Column("PRODUCT_NAME")
	String productName;
	
	@Column("PRICE")
	float price;
	
	@Column("QUANTITY")
	int quantity;
	
	public OrderEntity(long id, String orderNo, String productName, float price, int quantity) {
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getOrderNo() {
		// TODO Auto-generated method stub
		return orderNo;
	}

	public String getProductName() {
		// TODO Auto-generated method stub
		return productName;
	}

	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}
}
