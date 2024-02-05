package Basic;
import java.util.Scanner;

public class spiralOrderMatix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and columns of the 2D Array: ");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the value of "+i+" and "+j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Spiral Order Matrix: ");

        int row_start=0,row_end=row-1,col_start=0,col_end=col-1;

        while(row_start<=row_end && col_start<=col_end){
            
            //Print First Row
            for(int i=col_start;i<=col_end;i++){
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;

            //Print Last Column
            for(int i=row_start;i<=row_end;i++){
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;

            //Print Last Row
            for(int i=col_end;i>=col_start;i--){
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;

            //Print First Column
            for(int i=row_end;i>=row_start;i--){
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
}
