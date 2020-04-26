package com.online.store.model;

public class ShipmentVisitorImpl implements ShipmentVisitor {

	@Override
	public int visit(Shirt shirt) {
		int price = 0;
		if (shirt.getBrand().equals("Ferragamo")) {
			price = shirt.getPrice() + 90;
			}
		else {
			price = shirt.getPrice();
		}
		System.out.println("Brand: " + shirt.getBrand() + "\nPrice: "
		+ price + "\n-----");	
		return price;
	}

	@Override
	public int visit(Pants pants) {
		int price = 0;
		if (pants.getBrand().equals("Prada")) {
			price = pants.getPrice() + 100;
			}
		else {
			price = pants.getPrice();
		}
		System.out.println("Brand: " + pants.getBrand() + "\nPrice: "
		+ price + "\n-----");	
		return price;
	}

}
