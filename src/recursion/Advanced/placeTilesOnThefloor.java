package recursion.Advanced;

import java.util.Scanner;

public class placeTilesOnThefloor {
    //Place Tiles of size 1 x M in a floor of size N x M.
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){ //Only One Way to Place Tile --> Only Horizontal
            return 1;
        }
        //Vertically
        int vertical=placeTiles(n-m, m);
        //Horizontally
        int horizontal=placeTiles(n-1, m);

        return vertical+horizontal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N and M: ");
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(placeTiles(n, m));

    }
}
