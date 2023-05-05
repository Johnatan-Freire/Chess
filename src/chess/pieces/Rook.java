package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	//Converts the object into "R" to be printed on the board
	@Override
	public String toString() {
		return "R";
	}
	
}
