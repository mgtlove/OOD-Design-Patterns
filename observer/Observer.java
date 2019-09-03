package com.collabera.designpatterns.observer;

//Interface for Observer - Watches Prices
public interface Observer {
	//Interface Methods
	public void update(double ibmPrice, double aaplPrice, double googPrice);
}
