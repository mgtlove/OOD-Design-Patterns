package com.collabera.designpatterns.factory;

//Abstract class to associate subclasses for Factory Design
public abstract class EnemyShip {
	
	//Class Attributes
	private String name;
	private double amtDamage;
	
	//Class Methods
	public String getName() {return name;}
	public void setName(String newName) {name = newName;}
	
	public double getDamage() {return amtDamage;}
	public void setDamage(double newDamage) {amtDamage = newDamage;}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero.");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen.");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage());
	}
}
