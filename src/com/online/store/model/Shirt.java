package com.online.store.model;

public class Shirt implements Clothes {

	private String brand;
	private String serialNumber;
	private int price;
	
	public Shirt(String brand, String serialNumber, int price) {
		this.brand = brand;
		this.serialNumber = serialNumber;
		this.price = price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	@Override
	public int accept(ShipmentVisitor visitor) {
		return visitor.visit(this);
	}

}
