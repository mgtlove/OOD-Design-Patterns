package com.collabera.designpatterns.decorator;

public class TomatoSauce extends ToppingDecorator{
	
	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding tomato sauce");
	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", tomato sauce";
	}

	public double getCost() {
		return tempPizza.getCost() + .35;
	}	
}
