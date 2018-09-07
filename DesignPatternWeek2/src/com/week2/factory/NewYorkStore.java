package com.week2.factory;

import com.week2.factory.CakeStore;

public class NewYorkStore extends CakeStore {
    @Override
    public CakeFactory createBase(String type) {

    	 if (type.equals("ny_strawberry")) {
             return new NewYorkStrawberry();
         }else if (type.equals("ny_chocolate")) {
             return new NewYorkChocolate();

         }else  {System.out.println("Error: Invalid type of Cake");
     	return null;
         
         } 
    }
}
