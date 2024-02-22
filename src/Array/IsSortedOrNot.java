package Array;

import java.util.Scanner;

public class IsSortedOrNot {
    public static boolean isSorted(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        System.out.println("Enter the value in the array ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Check this array is Sorted or Not");
        if(isSorted(arr,n)){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
}
