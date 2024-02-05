package Basic;

import java.util.Scanner;

public class ArrayBasic {
    public static void Array1D(){
        System.out.println("Enter the len of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Array2D(){
        System.out.println("Enter the row and col of array: ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the value of array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print Array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.println(arr[i][j]);
        }
    }
    }
    public static void main(String[] args){
       Array1D();
       Array2D();
    }
}
