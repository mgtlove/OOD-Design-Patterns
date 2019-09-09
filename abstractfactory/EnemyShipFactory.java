package com.collabera.designpatterns.abstractfactory;

public interface EnemyShipFactory {
	public ESWeapon addESGun();
	public ESEngine addESEngine();
}
