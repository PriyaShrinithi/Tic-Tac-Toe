package com.company;

import java.util.Scanner;

//figure out what kind of inheritance to do between players, board and the game
class Players extends Game
{
    char player1;
    char player2;
    Players()
    {
        //Player moves
        player1 = 'X';
        player2 ='O';
    }

    void playerMoves()
    {
        System.out.println("Enter option to be marked");
        Scanner scan = new Scanner(System.in);
        char player = scan.next().charAt(0);

        if(player == player1)
        {
            new Game().move(player1);
        }
        else if(player == player2)
        {
            new Game().move(player2);
        }
        else
        {
            //redo
        }
    }
}
