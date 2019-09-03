package com.collabera.designpatterns.builder;

public class Robot implements RobotPlan{

	//Class Attributes
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	//Class Methods
	@Override
	public void setRobotHead(String head) {
		robotHead = head;
	}
	
	public String getRobotHead() {
		return robotHead;
	}

	@Override
	public void setRobotTorso(String torso) {
		robotTorso = torso;
	}
	
	public String getRobotTorso() {
		return robotTorso;
	}

	@Override
	public void setRobotArms(String arms) {
		robotArms = arms;
	}
	
	public String getRobotArms() {
		return robotArms;
	}
	
	@Override
	public void setRobotLegs(String legs) {
		robotLegs = legs;
	}

	public String getRobotLegs() {
		return robotLegs;
	}
}
