package Array;
import java.util.Scanner;

public class spiralOrder {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cols of the arrays: ");
        int row=sc.nextInt(),col=sc.nextInt();

        int arr[][]=new int[row][col];

        System.out.println("Enter the value of array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(i+" and "+j+" : ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sprial Order array:");
        int row_start=0,row_end=row-1,col_start=0,col_end=col-1;
        
        while(row_start<=row_end && col_start<=col_end){
            for(int i=col_start;i<=col_end;i++){
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;
            for(int i=row_start;i<=row_end;i++){
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;
            for(int i=col_end;i>=col_start;i--){
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;
            for(int i=row_end;i>=row_start;i--){
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
}
