package com.company;

import java.util.Scanner;

class Game extends Board
{
    Game()
    {
        super();
    }
    //win case conditions
    private boolean case1 = Board.emptyBoard[0] == Board.emptyBoard[1] && Board.emptyBoard[0] == Board.emptyBoard[2] && Board.emptyBoard[0] != ' ';
    private boolean case2 = Board.emptyBoard[0] == Board.emptyBoard[3] && Board.emptyBoard[0] == Board.emptyBoard[6] && Board.emptyBoard[0] != ' ';
    private boolean case3 = Board.emptyBoard[0] == Board.emptyBoard[4] && Board.emptyBoard[0] == Board.emptyBoard[8] && Board.emptyBoard[0] != ' ';
    private boolean case4 = Board.emptyBoard[1] == Board.emptyBoard[4] && Board.emptyBoard[1] == Board.emptyBoard[7] && Board.emptyBoard[1] != ' ';
    private boolean case5 = Board.emptyBoard[3] == Board.emptyBoard[4] && Board.emptyBoard[3] == Board.emptyBoard[5] && Board.emptyBoard[3] != ' ';
    private boolean case6 = Board.emptyBoard[6] == Board.emptyBoard[7] && Board.emptyBoard[6] == Board.emptyBoard[8] && Board.emptyBoard[6] != ' ';
    private boolean case7 = Board.emptyBoard[2] == Board.emptyBoard[5] && Board.emptyBoard[2] == Board.emptyBoard[8] && Board.emptyBoard[2] != ' ';
    private boolean case8 = Board.emptyBoard[2] == Board.emptyBoard[4] && Board.emptyBoard[2] == Board.emptyBoard[6] && Board.emptyBoard[2] != ' ';



    /*the plan is to enter the move as an argument
     * as long it is 'O' or 'X or 'o' or 'x', and the block is empty, proceed
     * else warn the player
    */
    private int pos;
    private void position()
    {
        System.out.println("Enter postion");
        Scanner scan = new Scanner(System.in);
        pos = scan.nextInt();
        /*handle exception:
         * pos >=9 is false
         * pos occupied is false
         */
    }

    //figure out alternating players

    void move(char pMove)
    {
        position();
        if(Board.emptyBoard[pos]==' ')
        {
            emptyBoard[pos] = pMove;
        }
        Board.makeBoard();
        score(pMove);
    }


    void score(char pMove)
    {

        if(case1 || case2 || case3 || case4 || case5 || case6 || case7 || case8)
        {
            System.out.println("Winner: " +pMove);
        }
    }

}
