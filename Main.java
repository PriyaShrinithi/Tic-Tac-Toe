package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Player move
        char player1 = 'X';
        char player2 ='O';
        new Board().makeBoard();
        new Game().move(player1);

    }
}
