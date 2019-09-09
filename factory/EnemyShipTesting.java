package com.collabera.designpatterns.factory;

import java.util.*;

//This is the correct Factory Pattern Example
//Below this code, is a commented out bad example of choosing enemy ship type

//Driver Class For Factory Design Method
public class EnemyShipTesting{
	
	public static void main(String[] args) {
		//Driver Variables
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		//User Input, choose ship type
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship? (U/R/B)?");
		//Run through input options, generate corresponding enemy type
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null) {
			doStuffEnemy(theEnemy);
		}
		else {System.out.println("Enter a U, R, or B next time.");}
		userInput.close();
	}
	//Comprehensive Behavior of Enemy
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
//Example of Bad Coding and why to use Factory Pattern
/*
public class EnemyShipTesting {
	
	public static void main(String[] args) {
		EnemyShip theEnemy = new UFOEnemyShip();
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		
		System.out.println("What type of ship? (U/R)");
		
		if(userInput.hasNextLine()) {
			enemyShipOption = userInput.nextLine();
		}
		
		if (enemyShipOption.equals("U")) {
			theEnemy = new UFOEnemyShip();
		}
		else {
			if (enemyShipOption.equals("R")) {
				theEnemy = new RocketEnemyShip();
			}
		}
		
		doStuffEnemy(theEnemy);
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
*/