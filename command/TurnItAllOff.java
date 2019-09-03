package com.collabera.designpatterns.command;

import java.util.List;

public class TurnItAllOff implements Command {
	
	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		theDevices = newDevices;
	}

	@Override
	public void execute() {
		for (ElectronicDevice device : theDevices) {
			device.off();
		}
	}
}
