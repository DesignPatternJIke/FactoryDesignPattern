package com.week2.factory;

public class ChicagoStrawberry extends CakeFactory {

	double strawberry_price;

	public ChicagoStrawberry() {
		name = "Chicago strawberry cake ";
		dough = "flour, water and olive oil...";
		coloring = " adding strawberry coloring...";
		strawberry_price = 2.00;

	}

	@Override
	public void cook() {
		System.out.println("Chicago strawberry cake is ready!\n");

		System.out.println("Price for Chicago strawberry cake is : " + getBase_price());
	}

	double getBase_price() {
		// Assign the base price.
		base_price = 3.50;
		// Returns the price for Strawberry cake + Cake base price
		return base_price + getStrawberry_price();
	}

	public double getStrawberry_price() {
		return strawberry_price;
	}

}
