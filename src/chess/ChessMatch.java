package chess;

import boardgame.Board;
import chess.piece.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	//board size
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	//method to receive chess coordinates.
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());;
	}
	
	//Start of the game informing which piece, its position and its color
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('a', 4, new King(board, Color.WHITE));
		placeNewPiece('e', 4, new Rook(board, Color.BLACK));
		placeNewPiece('d', 5, new King(board, Color.BLACK));
	}
}
