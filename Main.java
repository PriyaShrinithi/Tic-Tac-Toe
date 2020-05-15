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
         *  2. Finding the winner as soon as the winning combination is dealt
         *  3. Stop the game as soon as someone wins or when all spaces are occupied
         */



    }
}
