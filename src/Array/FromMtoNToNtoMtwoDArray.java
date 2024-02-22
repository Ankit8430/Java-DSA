package Array;

import java.util.Scanner;

public class FromMtoNToNtoMtwoDArray {
    public static void NtoMArray(int arr[][],int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col of array ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter value");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print M to N Array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Print N to M Array");
        NtoMArray(arr,row,col);
    }
}
