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


        /*
         *  issues to deal with
         *  1. Exception Handling
         *
         *
         *  4. On the event of Invalid position, player switch should not happen.
         */



    }
}
