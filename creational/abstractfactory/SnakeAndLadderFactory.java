package creational.abstractfactory;

public class SnakeAndLadderFactory implements GameFactory {

	@Override
	public BoardGame createBoardGame() {
		return new SnakeAndLadder();
	}

	@Override
	public Pieces createPiece() {
		return new SnakesAndLaddedPiece();
	}

}
