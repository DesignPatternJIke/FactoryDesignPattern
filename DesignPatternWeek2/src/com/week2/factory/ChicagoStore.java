package com.week2.factory;

import com.week2.factory.CakeStore;

public class ChicagoStore extends CakeStore  {
    @Override
    public CakeFactory createBase(String type) {

        if (type.equals("chicago_strawberry")) {
            return new ChicagoStrawberry();
        }else if (type.equals("chicago_chocolate")) {
            return new ChicagoChocolate();

        }else  {System.out.println("Error: Invalid type of Cake");
        	return null;
        }
        

    }
}


