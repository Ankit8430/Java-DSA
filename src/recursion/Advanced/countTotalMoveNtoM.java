package recursion.Advanced;

import java.util.Scanner;

/*
    Count total Move
    Condition
        1) Only Move Right
        2) Only Move Downward.
*/
public class countTotalMoveNtoM {
    public static int totalCount(int i,int j,int n,int m){
        if(i==n || j==m){ //Last Box beacuse you cann't move any side
            return 0;
        }
        if(i==n-1 || j==n-1){ //Conner box beacuse you can only move one side
            return 1;  
        }

        //Downward
        int downward=totalCount(i+1, j, n, m);

        //Right
        int right=totalCount(i, j+1, n, m);

        //Return
        return downward+right;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows and Cols: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Total Move: "+totalCount(0, 0, n, m));
    }
}
