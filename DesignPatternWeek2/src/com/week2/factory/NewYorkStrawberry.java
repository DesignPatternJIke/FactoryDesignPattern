package com.week2.factory;

public class NewYorkStrawberry extends CakeFactory {
	
	// Strawberry price
	 double strawberry_price;

    public NewYorkStrawberry() {
    	name = "New York strawberry cake";
        dough = "flour, water, mint and olive oil...";
        coloring = " adding strawberry coloring...";
        strawberry_price = 2.00;
    }
    @Override
    public void cook() {
        System.out.println("New York strawberry cake is ready!\n");
        //Print the price of the cake (cake base + flavor type prices)
        System.out.println("Price for NY strawberry cake is : " + getBase_price() );
    }
    
    
    	double getBase_price() {
        	//Assign the base price.
    		base_price = 5.50;
    		// Returns the price for Strawberry cake + Cake base price 
    		return base_price + getStrawberry_price(); 
    	}


		public double getStrawberry_price() {
			return strawberry_price;
		}
}
