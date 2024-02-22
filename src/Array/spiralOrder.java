package Array;
import java.util.Scanner;

public class spiralOrder {
    public static void sprial(int arr[][],int row,int col){
        int row_start=0,row_end=row-1,col_start=0,col_end=col-1;
        while(row_start<=row_end  &&  col_start<=col_end){
            System.out.println("\nPrint L to R");
            for(int i=col_start;i<=col_end;i++){
                System.out.print(arr[row_start][i]+"  ");
            }
            row_start++;
            System.out.println("\nPrint U to D");
            for(int i=row_start;i<=row_end;i++){
                System.out.print(arr[i][col_end]+"  ");
            }
            col_end--;
            System.out.println("\nPrint R to L");
            for(int i=col_end;i>=col_start;i--){
                System.out.print(arr[row_end][i]+"  ");
            }
            row_end--;
            System.out.println("\nPrint D to U");
            for(int i=row_end;i>=row_start;i--){
                System.out.print(arr[i][col_start]+"  ");
            }
            col_start++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter the value in array");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Before Sprial Order");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Sprial Order");
        sprial(arr,row,col);
    }
}
