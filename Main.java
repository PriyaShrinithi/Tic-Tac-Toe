package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //display the empty board

        new Board();
        Board.makeBoard();

        Game game = new Game();

        new Players().playerMoves();

        //receive the first player's (not be confused with player1) mark or piece






    }
}
