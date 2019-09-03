package com.collabera.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {
		
		//Turn the tv on
			//Pair remote to tv
		ElectronicDevice newDevice = TVRemote.getDevice();
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		//----------------------------------------------
		
		//Turn the tv off
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		onPressed = new DeviceButton(offCommand);
		onPressed.press();
		
		//----------------------------------------------
		
		//Turn the tv volume up
		TurnTVUp upCommand = new TurnTVUp(newDevice);
		onPressed = new DeviceButton(upCommand);
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		//-----------------------------------------------
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
	}

}