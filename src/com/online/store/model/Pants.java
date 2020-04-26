package com.online.store.model;

public class Pants implements Clothes {
	
	private String brand;
	private String serialNumber;
	private int price;
	
	public Pants(String brand, String serialNumber, int price) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public int accept(ShipmentVisitor visitor) {
		return visitor.visit(this);
	}
	
	
}
