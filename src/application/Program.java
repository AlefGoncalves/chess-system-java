package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {		
		
		UI.printBoard(new ChessMatch().getPieces());
		
	}

}
