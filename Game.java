package com.company;

import java.util.Scanner;

class Game extends Board
{
    Game()
    {
        super();
    }
    //win case conditions


    char[] players = {'X', 'O'};


    /*the plan is to enter the move as an argument
     * as long it is 'O' or 'X or 'o' or 'x', and the block is empty, proceed
     * else warn the player
    */
    private int pos;
    private int count = 0;
    //switch position to be entered from 1 rather than 0
    private void position()
    {
        System.out.println("Enter position");
        Scanner scan = new Scanner(System.in);
        pos = scan.nextInt();

        /*handle exception:
         * pos occupied is false
         */

        }

    //when someone wins, stop the match

    void move(char pMove)
    {
        try
        {
            position();
            if (Board.emptyBoard[pos] == ' ')
            {
                emptyBoard[pos] = pMove;
                Board.makeBoard();
                if (score())
                {
                    System.out.println("Winner: " + pMove);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Input");
        }
        if(pMove == players[0])
        {
            move(players[1]);
        }

        else
        {
            move(players[0]);

        }
        count++;
    }

    private boolean score()
    {
        return Board.emptyBoard[0] == Board.emptyBoard[1] && Board.emptyBoard[0] == Board.emptyBoard[2] && Board.emptyBoard[0] != ' '||
        Board.emptyBoard[0] == Board.emptyBoard[3] && Board.emptyBoard[0] == Board.emptyBoard[6] && Board.emptyBoard[0] != ' '||
        Board.emptyBoard[0] == Board.emptyBoard[4] && Board.emptyBoard[0] == Board.emptyBoard[8] && Board.emptyBoard[0] != ' '||
        Board.emptyBoard[1] == Board.emptyBoard[4] && Board.emptyBoard[1] == Board.emptyBoard[7] && Board.emptyBoard[1] != ' '||
        Board.emptyBoard[2] == Board.emptyBoard[5] && Board.emptyBoard[2] == Board.emptyBoard[8] && Board.emptyBoard[2] != ' '||
        Board.emptyBoard[6] == Board.emptyBoard[7] && Board.emptyBoard[6] == Board.emptyBoard[8] && Board.emptyBoard[6] != ' '||
        Board.emptyBoard[2] == Board.emptyBoard[4] && Board.emptyBoard[2] == Board.emptyBoard[6] && Board.emptyBoard[2] != ' '||
        Board.emptyBoard[3] == Board.emptyBoard[4] && Board.emptyBoard[3] == Board.emptyBoard[5] && Board.emptyBoard[3] != ' ';

    }
}
