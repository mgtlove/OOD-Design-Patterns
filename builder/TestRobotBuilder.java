package com.collabera.designpatterns.builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		//Define Specific Blueprint
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		//Give Blueprint to Engineer
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		//Engineer make Robot
		robotEngineer.makeRobot();
		//Get the produced robot from engineer
		Robot firstRobot = robotEngineer.getRobot();
		//Output Robot to see if built correctly
		System.out.println("Robot Built");
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Head Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Head Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Head Type: " + firstRobot.getRobotLegs());
	}

}
