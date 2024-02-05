package Array;
import java.util.Scanner;

public class transpose {
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
        System.out.println("Print array:");
        for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        System.out.println(i+" and "+j+" : "+arr[i][j]);
                    }
                }
        System.out.println("Enter the number to search in array");
        int num=sc.nextInt();
            for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        if(arr[i][j]==num){
                            System.out.println(i+" and "+j+" : "+arr[i][j]);
                        }
                    }
                }
         System.out.println("Transpose Array:");
           
           for(int j=0;j<col;j++){
                    for(int i=0;i<row;i++){
                            System.out.println(i+" and "+j+" : "+arr[i][j]);
                    }
                }
        }
}
