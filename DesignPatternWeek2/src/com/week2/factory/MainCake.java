package com.week2.factory;

import com.week2.factory.CakeStore;
import com.week2.factory.CakeFactory;

/**
 * @author Justice Ike Object Oriented Design Pattern Course Week 2: Factory Design Pattern
 * 
 *         Activity: Extended Week 1 decorator design pattern project with
 *         factory design pattern: 
 *         Cake base was split into : NewYorkStore and ChicagoStore respectively. 
 *         Each Cake base has it's own price.
 *         A customer can place order for cakes with different bases + different flavors(e.g: Strawberry or Chocolate). 
 *         The total price for each cake ordered, include respective price for NY or Chicago cake base, plus additional flavor (strawberry or Chocolate) type price.
 * 
 *  References: 
 *         
 *          JAVA:
 *			https://www.udemy.com/java-design-patterns-the-complete-masterclass/learn/v4/t/lecture/8768068?start=0
 *			https://www.udemy.com/design-patterns-in-java-concepts-hands-on-projects/learn/v4/t/lecture/9579610?start=0
 *			
 *			C++:
 *			https://www.udemy.com/patterns-cplusplus/learn/v4/t/lecture/7736712?start=0
 *			
 *			How to run the program:
 *
 *			Main: MainCake.java
 *			JUnitTest: FactoryCakeTest.java
 *        
 *			 **/
public class MainCake {

	public static void main(String[] args) {

		// create and initialize Chicago store object
		CakeStore chicagoStore = new ChicagoStore();

		//Chicago store access to CakeBaseFacrtory for Chicago specific cake base.
		CakeFactory chicagoBase = chicagoStore.orderCakeBase("chicago_strawberry");

		//Print the order
		System.out.println("\nBoxing Smith's " + chicagoBase.getName() + ".\n");

		////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nNext order......\n");
		//////////////////////////////////////////////////////////////////////////////////////////


		// create and initialize Chicago store object
		CakeStore nyStore = new NewYorkStore();

		//Chicago store access to CakeBaseFacrtory for Chicago specific cake base.
		CakeFactory nyBase = nyStore.orderCakeBase("ny_strawberry");

		//Print the order
		System.out.println("\nBoxing Smith's " + nyBase.getName() + ".\n");
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nNext order........\n");
		////////////////////////////////Chicago Chocolate Section ////////////////////////////////////////////////////////////////////////////////
		
		// create and initialize Chicago store object
		CakeStore chicagoChocloateStore = new ChicagoStore();

		//Chicago store access to CakeBaseFacrtory for Chicago specific cake base.
		CakeFactory chicagoChocoBase = chicagoChocloateStore.orderCakeBase("chicago_chocolate");

	
		//Print the order
		System.out.println("\nBoxing Steve's " + chicagoChocoBase.getName() + ".\n");
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nNext order........\n");
		//////////////////////////////// New York Chocolate Section ////////////////////////////////////////////////////////////////////////////////
		
		// create and initialize NY store object
		CakeStore nyChocolateStore = new NewYorkStore();
		
		//NY store access to CakeBaseFacrtory for NY specific cake base.
		 CakeFactory nyChocoBase = nyChocolateStore.orderCakeBase("ny_chocolate");

		//Print the order
			System.out.println("\nBoxing Bill's " + nyChocoBase.getName() + ".\n");
	
		
	}
}
