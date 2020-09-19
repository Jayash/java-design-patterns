package com.creational.builder;

import java.util.Date;

public class Chess {
	
	private String playerOneName;
	private String playerTwoName;
	private Date startTime;
	
	public String getPlayerOneName() {
		return playerOneName;
	}
	public void setPlayerOneName(String playerOneName) {
		this.playerOneName = playerOneName;
	}
	public String getPlayerTwoName() {
		return playerTwoName;
	}
	public void setPlayerTwoName(String playerTwoName) {
		this.playerTwoName = playerTwoName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public static ChessBuilder builder() {
		return new ChessBuilder();
	}
	
	
	public static class ChessBuilder {
		
		private String playerOneName;
		private String playerTwoName;
		private Date startTime;
		
		public ChessBuilder setPlayerOneName(String playerOneName) {
			this.playerOneName = playerOneName;
			return this;
		}
		public ChessBuilder setPlayerTwoName(String playerTwoName) {
			this.playerTwoName = playerTwoName;
			return this;
		}
		public ChessBuilder setStartTime(Date startTime) {
			this.startTime = startTime;
			return this;
		}
		
		public Chess build() {
			Chess chess = new Chess();
			chess.setPlayerOneName(this.playerOneName);
			chess.setPlayerTwoName(this.playerTwoName);
			chess.setStartTime(this.startTime);
			return chess;
		}
		
	}
	
}
