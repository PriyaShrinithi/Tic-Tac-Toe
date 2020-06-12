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
        }

    //when someone wins, stop the match

    void move(char pMove) {
        try
        {
            if(count==8) //check if all spaces are occupied
            {
                throw new GameException();
            }
            position();
            if (Board.emptyBoard[pos] == ' ')
            {
                emptyBoard[pos] = pMove;
                Board.makeBoard();
            }

            if (score())
            {
                System.out.println("Winner: " +pMove);
                throw new GameException();
            }
        }
        catch(ArrayIndexOutOfBoundsException | GameException a)
        {
            System.out.println("Invalid Input");
        }
        changePlay(pMove);
        count++;
    }
    private void changePlay(char pMove)
    {
        if(pMove == players[0])
            move(players[1]);
        else
            move(players[0]);
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

    private boolean endGame()
    {
        //case draw: all boxes are filled

        if(Board.emptyBoard[0] != ' ' && Board.emptyBoard[1] != ' ' && Board.emptyBoard[2] != ' '&&
           Board.emptyBoard[3] != ' ' && Board.emptyBoard[4] != ' '&& Board.emptyBoard[5] != ' ' &&
           Board.emptyBoard[6] != ' ' && Board.emptyBoard[7] != ' '&& Board.emptyBoard[8] != ' ')
        {
            return true;
        }

        return false;
    }


}
