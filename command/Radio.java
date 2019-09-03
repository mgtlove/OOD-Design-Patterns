package com.collabera.designpatterns.command;

public class Radio implements ElectronicDevice {

	private int volume = 0;

	@Override
	public void on() {
		System.out.println("Radio is on.");
	}

	@Override
	public void off() {
		System.out.println("Radio is off.");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Radio volume is at " + volume);
	}

	@Override
	public void volumeDown() {
		if(volume > 0) {volume--;}
		System.out.println("Radio volume is at " + volume);
	}

}
