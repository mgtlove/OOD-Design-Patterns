package com.collabera.designpatterns.singleton;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) {
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println(newInstance.getLetterList());
		
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
		
	}

}
