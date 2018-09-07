package com.week2.factory;

public class NewYorkChocolate extends CakeFactory {

	
 double chocolate_price;

    public NewYorkChocolate() {
        name = "New York chocolate cake ";
        dough = "flour, water, chocolate_powder, mint and olive oil...";
        coloring = " adding chocolate coloring...";
        chocolate_price = 3.50;
        
        
    }
    
    
    @Override
    public void cook() {
        System.out.println("New York chocolate cake is ready!\n");
        
        System.out.println("Price for New York chocolate cake is : " + getBase_price() );
    }
    
    
    	double getBase_price() {
        		// Returns the price for chocolate cake + Cake base price 
    		base_price = 4.80;
    		return base_price; 
    	}


		public double getChocolate_price() {
			return chocolate_price;
		}


	  

}