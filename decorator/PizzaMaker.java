package com.collabera.designpatterns.decorator;

public class PizzaMaker {

	public static void main(String[] args) {
		
		//Build pizza, plain must be inner most, two variations of build below
		System.out.println("Pizza 1");
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Pizza 2");
		Pizza anotherPizza = new Mozzarella(new TomatoSauce(new PlainPizza()));
		
		//Output first pizza build
		System.out.println("Pizza 1 Ingredients: " + basicPizza.getDescription());
		System.out.println("Pizza 1 Total Cost: " + basicPizza.getCost());
		//Output second pizza build
		System.out.println("Pizza 2 Ingredients: " + anotherPizza.getDescription());
		System.out.println("Pizza 2 Total Cost: " + anotherPizza.getCost());
	}

}
