package Basic;
import java.util.Scanner;

public class transponseArray {
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
        System.out.println("Before Transpose");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("The value of "+i+" and "+j+" is: "+arr[i][j]);
            }
        }

        System.out.println("After Transponse");
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.println("The value of "+j+" and "+i+" is: "+arr[i][j]);
            }
        }
    }
}
