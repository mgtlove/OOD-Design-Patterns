package com.collabera.designpatterns.prototype;

import java.util.List;

public class TestCloning {

	public static void main(String[] args) {
		//Create Animal Prototype Maker
		CloneFactory animalMaker = new CloneFactory();
		//Create Initial Animals
		Sheep sally = new Sheep();
		Cat mittens = new Cat();
		//Use Prototype Animal Factory to clone a cat and sheep from same super class
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		Cat clonedCat = (Cat) animalMaker.getClone(mittens);
		List<Animal> thisListHasDifferentClasses;
		
		//Output the Sheep Stats from Prototype Animal
		System.out.println(sally);
		System.out.println(clonedSheep);
		System.out.println("Sally hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
		System.out.println("Clone hashcode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
	
		//Output the Cat Stats from Prototype Animal
		System.out.println(mittens);
		System.out.println(clonedCat);
		System.out.println("Mittens hashcode: " + System.identityHashCode(System.identityHashCode(mittens)));
		System.out.println("Clone hashcode: " + System.identityHashCode(System.identityHashCode(clonedCat)));
	}

}
