package my;

import java.util.Scanner;

public class tic_tac_toe {
    public static void main(String[] args){
        char[][]board = new char[3][3];
        for (int row=0; row<board.length; row++){
            for(int col=0; col<board.length; col++){
                board[row][col] =' ';
            }
        }

        char player = 'x';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player "+player+" enter: (1 to 9)");
            
            // first and simple method
            // int row = sc.nextInt();
            // int col = sc.nextInt();

            //second method easy for players to play
            int input=sc.nextInt();
            int row = (input - 1) / 3;
            int col = (input - 1) % 3;

            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    System.out.println("Player "+player+" won");
                }else{
                    if(player =='x'){
                        player = 'o';
                    }else{
                        player = 'x';
                    }
                }
            }else{
                System.out.println("Invalid move..... Try again! ");
            }

        }
        printBoard(board);
    }

    //winner algorithm 
    public static boolean haveWon(char board[][], char player){
        //for row
        for(int row=0; row<board.length; row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        //for col
        for(int col=0; col<board.length; col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //for diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[2][0]==player && board[1][1]==player && board[0][2]==player){
            return true;
        }
        return false;
    }

    //printing board
    public static void printBoard(char[][]board){
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board.length-1; col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();

            if(row<board.length-1){
                System.out.println("--+---+--");
            }
        }
    }
}