package SortingAndSearching;

import java.util.Scanner;
//Time Complexity --> O(N)   Space Complexity --> O(1)
public class LinearSearch {
    public static boolean Linear(int arr[],int n,int x){
       for(int i=0;i<n;i++){
        if(arr[i]==x)
            return true;
       }
       return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of the array ");
        int n=sc.nextInt();
        System.out.println("Enter the value of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value which you want to find in the array");
        int x=sc.nextInt();
        if(Linear(arr, n, x)){
            System.out.println("Found it");
        }else{
            System.out.println("Not Found it");
        }
    }
}