package recursion.Advanced;
import java.util.*;
/*
    *Write a program to solve a Sudoku puzzle by filling the empty cells.
        *A sudoku solution must satisfy all of the following rules:
            *Each of the digits 1-9 must occur exactly once in each row.
            *Each of the digits 1-9 must occur exactly once in each column.
            *Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
    The '.' character indicates empty cells.
 */
public class sudokuSolver {
    public static boolean isSafe(char[][]board,int row,int col,int num){
        //row & column
        for(int i=0;i<board.length;i++){
            if(board[i][col]==(char)(num+'0')){ //Check for Row Line
                return false;
            }
            if(board[row][i]==(char)(num+'0')){ //Check for Col Line
                return false;
            }
        }   
        //Grid
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==(char)(num+'0')){ //Check on Grid Level Line
                    return false;
                }
            }
        }
         return true;
    }
    public static boolean helper(char[][]board,int row,int col){
        if(row==board.length){ //Base Condition
            return true;
        }
        int nrow=0,ncol=0;
        if(col!=board.length-1){ //For Columns Changes
            nrow=row;
            ncol=col+1;
        }else{ //For Row Changes
            nrow=row+1;
            ncol=0;
        }

        if(board[row][col]!='.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){ //Check Value is Safe or not
                    board[row][col]=(char)(i+'0'); //If Sava Store Value
                    if(helper(board, nrow, ncol)){ //Again call Helper and check Safe or not
                        return true;
                    }else{ //If Not Remove previous value
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][]board=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=sc.next().charAt(0);
            }
        }
        helper(board, 0, 0);
        for(int i=0;i<9;i++){
            System.out.print("[ ");
            for(int j=0;j<9;j++){
                System.out.print("[ "+board[i][j]+" ]");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
}
