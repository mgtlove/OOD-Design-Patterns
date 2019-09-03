package com.collabera.designpatterns.prototype;

public class Cat implements Animal{

	@Override
	public Animal makeCopy() {
		System.out.println("Cat is being made.");
		Cat catObject = null;
		
		try {
			catObject = (Cat)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return catObject;
	}
	
	public String toString() {
		return "MeowMeow is my hero.";
	}

}
