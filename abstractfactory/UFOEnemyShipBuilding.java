package com.collabera.designpatterns.abstractfactory;

import com.collabera.designpatterns.factory.EnemyShip;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
	
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		UFOEnemyShip theEnemyShip = null;
		
		if (typeOfShip.equals("UFO")) {
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		}
		else {
			if (typeOfShip.equals("UFO BOSS")) {
				EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
				theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
				theEnemyShip.setName("UFO Boss Ship");
			}
		}
		return theEnemyShip;
	}
	
}
