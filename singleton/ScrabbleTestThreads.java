package com.collabera.designpatterns.singleton;

public class ScrabbleTestThreads {

	public static void main(String[] args) {
		
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTiles).start();

	}

}
