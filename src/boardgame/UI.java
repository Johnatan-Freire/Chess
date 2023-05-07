package boardgame;

import chess.ChessPiece;

public class UI {
	
	//Prints the board on the screen with column letters and row numbers
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i=0; i<pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}
	
	//If the position x of the matrix is ​​empty, it will return a "-", if a piece occupies this space x will display the letter of the piece
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}