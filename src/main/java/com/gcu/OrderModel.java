package com.gcu;

public class OrderModel {
	private Long id;
	private String orderNo;
	private String productName;
	private float price;
	private int quantity;
	
	public OrderModel(Long Id, String OrderNo, String ProductName, float Price, int Quantity)
	{
		id = Id;
		orderNo = OrderNo;
		productName = ProductName;
		price = Price;
		quantity = Quantity;
	}
	
	public OrderModel()
	{
		
	}
	
	public Long getId()
	{
		return id;
	}
	
	public String getOrderNo()
	{
		return orderNo;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setId(Long Id)
	{
		id = Id;
	}
	
	public void setOrderNo(String OrderNo)
	{
		orderNo = OrderNo;
	}
	
	public void setProductName(String ProductName)
	{
		productName = ProductName;
	}
	
	public void setPrice(float Price)
	{
		price = Price;
	}
	
	public void setQuantity(int Quantity)
	{
		quantity = Quantity;
	}
	
}
