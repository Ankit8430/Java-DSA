package Array;
import java.util.*;
public class reverseArray {
    public static void reverse(int arr[],int n){
        System.out.println("Print Reverse Array");
        int l=0,r=n-1;
        int temp;
        while(l<=r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of array ");
       int n=sc.nextInt();
       System.out.println("Enter the value in the array");
       int arr[] =new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Print the array");
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       reverse(arr,n);
    }
}
