package SortingAndSearching;

import java.util.Scanner;

import Basic.print2DArray;

public class QuickShort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        int swap;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        
        return i;
    }
    public static void qShort(int arr[],int low,int high){
       if(low>high) return;
       int pivotIndex=partition(arr, low, high);
       qShort(arr, low, pivotIndex-1);
       qShort(arr, pivotIndex+1, high);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of Array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value in array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array Before Sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        qShort(arr,0,n-1);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
