package com.collabera.designpatterns.builder;

public class OldRobotBuilder implements RobotBuilder{
	
	//Class Attributes
	private Robot robot;
	
	//Class Methods
		//Default Constructor
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}
}
