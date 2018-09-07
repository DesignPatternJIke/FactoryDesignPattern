package com.week2.factory;

public class ChicagoChocolate extends CakeFactory {

// Price for chocolate flavor cake.
 double chocolate_price;

    public ChicagoChocolate() {
        name = "Chicago chocolate cake ";
        dough = "flour, water, chocolate_powder and olive oil...";
        coloring = " adding chocolate coloring...";
        chocolate_price = 2.50;
        
        
    }
    
    
    @Override
    public void cook() {
        System.out.println("Chicago chocolate cake is ready!\n");
        
        System.out.println("Price for Chicago chocolate cake  base is : " + getBase_price() );
    }
    
    
    	double getBase_price() {
        	//Assign price to Chocolate cake
    		base_price = 3.50;
    		// Returns the price for Chocolate cake + Cake base price 
    		return base_price + getChocolate_price(); 
    	}


		public double getChocolate_price() {
			return chocolate_price;
		}


		
}