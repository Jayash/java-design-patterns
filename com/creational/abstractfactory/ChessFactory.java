package com.creational.abstractfactory;

public class ChessFactory implements GameFactory {

	@Override
	public BoardGame createBoardGame() {
		return new Chess();
	}

	@Override
	public Pieces createPiece() {
		return new ChessPiece();
	}

}
