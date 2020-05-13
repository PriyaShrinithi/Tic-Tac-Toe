package com.company;

class Board {
    public static char[] emptyBoard = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    static void makeBoard()
    {
        for(int i=0;i<emptyBoard.length-1;i+=3)
        {
            System.out.println(String.format("%c|%c|%c", emptyBoard[i], emptyBoard[i+1], emptyBoard[i+2]));
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
