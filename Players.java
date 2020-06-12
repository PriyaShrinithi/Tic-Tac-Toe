package com.company;

import java.util.Scanner;

//figure out what kind of inheritance to do between players, board and the game
class Players extends Game
{

    private char player;
    Players()
    {

    }

    void playerMoves() {
        System.out.println("Enter option to be marked");
        Scanner scan = new Scanner(System.in);
        player = scan.next().charAt(0);
        if(player == players[0])
        {
            new Game().move(players[0]);
        }
        else
        {
            new Game().move(players[1]);
        }
    }
}
