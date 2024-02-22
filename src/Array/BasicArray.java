package Array;
import java.util.*;

public class BasicArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}