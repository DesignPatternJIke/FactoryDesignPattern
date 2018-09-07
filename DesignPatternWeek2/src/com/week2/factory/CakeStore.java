package com.week2.factory;

import com.week2.factory.CakeFactory;

public abstract class CakeStore {

	public CakeFactory orderCakeBase(String type) {
		CakeFactory cakeBase;

		// Declare createBase in the orderCakeBase instead of in Main.cpp
		cakeBase = createBase(type);

		cakeBase.prepare();
		cakeBase.cook();
	//	cakeBase.box();
		cakeBase.getPrice();

		return cakeBase;

	}

	abstract public CakeFactory createBase(String type);

}
