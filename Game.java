package com.company;

public class Game extends Board
{

    Game(char[] A)
    {
        super(A);
    }

    /*the plan is to enter the move as an argument
     * as long it is 'O' or 'X or 'o' or 'x', and the block is empty, proceed
     * else warn the player
    */

    private void move(char pMove)
    {
        switch (pMove)
        {
            case ('X'):
                    //do something
                break;
            case ('O'):
                //do something
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pMove);
        }
    }
}
