package Array;

import java.util.Scanner;

public class MaximumSubArrayKadanesAlgo{
    public static int maximumSubArray(int arr[],int n){
        int sum=0,max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter value");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Print Maximum Sub Array "+maximumSubArray(arr, n));
    }
}