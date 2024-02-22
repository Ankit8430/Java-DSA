package SortingAndSearching;

import java.util.Scanner;

public class BinarSearch {
    public static boolean bSearch(int arr[],int start,int n,int x){
       int l=start,r=n-1;
       int mid;
       if(l>r) return false;
       while(l<r){
            mid=l+(r-l)/2;
            if(arr[mid]==x) return true;
            else if(arr[mid]<x) l=mid+1;
            else r=mid-1;
       }
       return false;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of array: ");
       int n=sc.nextInt();
       System.out.println("Enter the value in the array");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Enter the value which want to find it");
       int x=sc.nextInt();
       if(bSearch(arr, 0, n, x)){
            System.out.println("Found it");
       }else{
            System.out.println("Not Found it");
       }
    }
}
