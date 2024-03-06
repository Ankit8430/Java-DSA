package recursion;

import java.util.*;

public class NQueens {
    public static void save(char boards[][],List<List<String>> allBoards){
        String row="";
        List<String> newBoards=new ArrayList<>();
        for(int i=0;i<boards.length;i++){
            row="";
            for(int j=0;j<boards[0].length;j++){
                if(boards[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoards.add(row);
        }
        allBoards.add(newBoards);
    }
    public static boolean isSafe(int row,int col,char boards[][]){
        //Horizontal
        for(int j=0;j<boards.length;j++){
            if(boards[row][j]=='Q'){
                return false;
            }
        }
        //Vertical
        for(int i=0;i<boards[0].length;i++){
            if(boards[i][col]=='Q'){
                return false;
            }
        }
        //Upper Left
        int r=row;
        for(int c=col;c>=0 && r>=0 ; c--,r--){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        //Upper Right
        r=row;
        for(int c=col;c<boards.length && r>=0; c++,r--){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        //Down Left
        r=row;
        for(int c=col;c>=0 && r<boards.length;c--,r++){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        //Down Right
        r=row;
        for(int c=col;c<boards.length && r<boards.length;c++,r++){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void helper(char boards[][],List<List<String>> allBoards,int col){
        if(col==boards.length){
            save(boards,allBoards);
            return;
        }
        for(int row=0;row<boards.length;row++){
            if(isSafe(row,col,boards)){
                boards[row][col]='Q';
                helper(boards, allBoards, col+1);
                boards[row][col]='.';
            }
        }
    }
    public static List<List<String>> solveNQueeens(int n){
        List<List<String>> allBoards=new ArrayList<>();
        char[][] boards=new char[n][n];
        helper(boards,allBoards,0);
        return allBoards;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N Queens: ");
        int n=sc.nextInt();
        List<List<String>> printQueenProsition=solveNQueeens(n);
        for (List<String> board : printQueenProsition) {
            System.out.print("[");
            for (String cell : board) {
                System.out.print("["+cell + "]");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
