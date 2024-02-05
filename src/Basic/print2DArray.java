package Basic;
import java.util.Scanner;

public class print2DArray {
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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("the value of "+i+" and "+j+" is: "+arr[i][j]);
            }
        }

        System.out.println("Enter the value to search in array:");
        int val=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==val){
                    System.out.println("The value of "+i+" and "+j+" is: "+arr[i][j]);
                }
            }
        }
    }
    
}
