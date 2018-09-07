package com.week2.factory.test;

import static org.junit.Assert.*;

import org.junit.Test;


import com.week2.factory.CakeFactory;
import com.week2.factory.CakeStore;
import com.week2.factory.ChicagoStore;
import com.week2.factory.NewYorkStore;


public class FactoryCakeTest {

	// Test for Chicago Chocolate cake
	@Test
	public void checkChicagoChocolateCake() {

		// create and initialize Chicago store object
		CakeStore chicagoChocloateStore = new ChicagoStore();

		// Chicago store access to CakeBaseFacrtory for Chicago specific cake base.
		CakeFactory chicagoChocoBase = chicagoChocloateStore.orderCakeBase("chicago_chocolate");
		
		// Compare and confirm the name of the chocolate cake object from the Factory
		assertEquals("Chicago chocolate cake ", chicagoChocoBase.getName());

	}
	
	// Test for New York Chocolate cake
	@Test
	public void checkNYChocolateCake() {

		// create and initialize NY store object
		CakeStore nyChocloateStore = new NewYorkStore();

		// Chicago store access to CakeBaseFacrtory for NY specific cake base.
		CakeFactory nyChocoBase = nyChocloateStore.orderCakeBase("ny_chocolate");
		
		// Compare and confirm the name of the chocolate cake object from the Factory
		assertEquals("New York chocolate cake ", nyChocoBase.getName());

	}
	

	// Test for Chicago strawberry cake
		@Test
		public void checkChicagoStrawberryCake() {

			// create and initialize Chicago store object
			CakeStore chicagoStrawberryStore = new ChicagoStore();

			// Chicago store access to CakeBaseFacrtory for Chicago specific cake base.
			CakeFactory chicagoStrawberryBase = chicagoStrawberryStore.orderCakeBase("chicago_strawberry");
			
			// Compare and confirm the name of the strawberry cake object from the Factory
			assertEquals("Chicago strawberry cake ", chicagoStrawberryBase.getName());

		}
		
		// Test for New York strawberry cake
		@Test
		public void checkNYStrawberryCake() {

			// create and initialize NY store object
			CakeStore nyStrawberryStore = new NewYorkStore();

			// Chicago store access to CakeBaseFacrtory for NY specific cake base.
			CakeFactory nyStrawberryBase = nyStrawberryStore.orderCakeBase("ny_strawberry");
			
			// Compare and confirm the name of the strawberry cake object from the Factory
			assertEquals("New York strawberry cake", nyStrawberryBase.getName());

		}


}
