package SortingAndSearching;

import java.util.Scanner;

public class BubbleSort {
    //Bubble Sort
    public static void bubbleSort1(int arr[],int n){
        int swap;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        System.out.println("Enter the value in array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Bubble Sort: ");
       bubbleSort1(arr,n);
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }
    }
}
