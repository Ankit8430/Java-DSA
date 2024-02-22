package Array;
import java.util.Scanner;

public class minAndMaxArrayValue {
    public static void findMinAndMaxValue(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
            else if(arr[i]<min) min=arr[i];
        }
        System.out.println("Max = "+max+" Min = "+min);
    }
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of array");
       int n=sc.nextInt();
       System.out.println("Enter the value in the array");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
       }
       System.out.println("Find the Max and Min Value");
       findMinAndMaxValue(arr, n);
    }
}
