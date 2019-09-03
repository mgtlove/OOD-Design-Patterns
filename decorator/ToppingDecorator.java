package com.collabera.designpatterns.decorator;

public abstract class ToppingDecorator implements Pizza {
	
	//Class Variables
		//Composition of interface
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

}
