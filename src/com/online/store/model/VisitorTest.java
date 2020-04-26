package com.online.store.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class VisitorTest {
	
	@Test
	public void testVisitBrandShirt() {
		Shirt ferragamo = new Shirt("Ferragamo", "A35GADF5", 40);
		//Test that Ferragamo is brand
		assertEquals(ferragamo.getBrand(), "Ferragamo");
	}
	
	@Test
	public void testVisitBrandPants() {
		Pants prada = new Pants("Prada", "GA532AG7", 50);
		//Test that Prada is brand
		assertEquals(prada.getBrand(), "Prada");
	}
	
	@Test
	public void testVisitSerialShirt() {
		Shirt ferragamo = new Shirt("Ferragamo", "HA35GAG5", 50);
		//Test that HA35GAG5 is serial number
		assertEquals(ferragamo.getSerialNumber(), "HA35GAG5");
	}
	
	@Test
	public void testVisitSerialPants() {
		Pants prada = new Pants("Prada", "PI53GAS6", 60);
		//Test that PI53GAS6 is serial number
		assertEquals(prada.getSerialNumber(), "PI53GAS6");
	}
	
	@Test
	public void testVisitPriceShirt() {
		ShipmentVisitorImpl ship = new ShipmentVisitorImpl();
		Shirt ferragamo = new Shirt("Ferragamo", "HAG35AYL", 60);
		//Test that Ferragamo shirt price is 60 + 90
		assertEquals(ship.visit(ferragamo), 150);
	}
	
	@Test
	public void testVisitPricePants() {
		ShipmentVisitorImpl ship = new ShipmentVisitorImpl();
		Pants prada = new Pants("Prada", "G635GASA", 70);
		//Test that Prada pants price is 70 + 100
		assertEquals(ship.visit(prada), 170);
	}
}
