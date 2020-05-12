package com.company;

class Board
{

    Board(char[] A)
    {
        for(int i=0;i<A.length-1;i+=3)
        {
            System.out.println(String.format("%c|%c|%c", A[i], A[i+1], A[i+2]));
            System.out.println("_|_|_");
        }

    }

    /*the layout of the board is
     *  | |
     * _|_|_
     *  | |
     * _|_|_
     *  | |
     * _|_|_
     */


}
