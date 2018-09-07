package com.week2.factory;

public abstract class CakeFactory {
    public String name;
    public String dough;
    public String coloring;
    public double base_price; 
   


    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Mixing dough..." + dough);
        System.out.println("Adding coloring ..." + coloring);


    }
    public void cook(){
        System.out.println("Cooking...");
    }
    public void box(){
        System.out.println("Boxing...");
    }

    public String getName() {
        return name;
    }
	
	public double getPrice() {
		return base_price;
	}
	
    
   
}
