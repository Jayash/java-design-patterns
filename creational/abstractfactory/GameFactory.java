package creational.abstractfactory;

public interface GameFactory {
	
	BoardGame createBoardGame();
	
	Pieces createPiece();
	
}
