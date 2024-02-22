package Array;

import java.util.Scanner;

public class BasicTwoDArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col of array");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter the value in the 2D Array");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print 2D Array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
