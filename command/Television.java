package com.collabera.designpatterns.command;

public class Television implements ElectronicDevice{
	
	private int volume = 0;

	@Override
	public void on() {
		System.out.println("TV is on.");
	}

	@Override
	public void off() {
		System.out.println("TV is off.");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("TV volume is at " + volume);
	}

	@Override
	public void volumeDown() {
		if(volume > 0) {volume--;}
		System.out.println("TV volume is at " + volume);
	}
	
}
