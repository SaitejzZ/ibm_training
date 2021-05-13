package com.day2.session2.productstack;

public class Product {
	private int id;
	private String name;
	private double price;
	private double discount;
	
	public Product(int id, String name, double price, double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=")
		.append(id)
		.append(", name=")
		.append(name)
		.append(", price=")
		.append(price)
		.append(", discount=")
		.append(discount)
		.append("]");
		return builder.toString();
	}


	
	
}
