package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	//Converts the object into "K" to be printed on the board
	@Override
	public String toString() {
		return "K";
	}

}
