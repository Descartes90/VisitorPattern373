package com.online.store.model;

public interface ShipmentVisitor {
	int visit(Shirt shirt);
	int visit(Pants pants);
}
