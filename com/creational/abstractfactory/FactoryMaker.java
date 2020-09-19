package com.creational.abstractfactory;

public class FactoryMaker {
	
	public enum GameType {
		Chess, SnakeAndLadder;
	}
	
	public static GameFactory makeFactory(GameType gameType) {
		
		switch (gameType) {
		
			case Chess : return new ChessFactory();
			
			case SnakeAndLadder : return new SnakeAndLadderFactory();
			
			default : throw new IllegalArgumentException("Game not defined");
			
		}
	}
}
