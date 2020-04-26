package com.online.store.view;

import com.online.store.model.Clothes;
import com.online.store.model.Pants;
import com.online.store.model.ShipmentVisitor;
import com.online.store.model.ShipmentVisitorImpl;
import com.online.store.model.Shirt;

public class ShipmentClient {

	public static void main(String[] args) {
		
		System.out.println("\t\t\t**********************PRICE PER ITEM BELOW***************************");
		
		Clothes[] clothes = new Clothes[] {new Shirt("Ferragamo", "13BAF525", 50),
			new Shirt("Guess", "24GBAS52", 25),
			new Pants("Prada", "63SAF6GS", 60),
			new Pants("Izod", "98ARI242", 20)};
		
		int total = total(clothes);
		System.out.println("Total: " + total);
		}
	
	public static int total(Clothes[] clothes) {
		ShipmentVisitor visitor = new ShipmentVisitorImpl();
		int sum = 0;
		for(Clothes c : clothes) {
			sum = sum + c.accept(visitor);
		}
		return sum;
	}
		
	}
