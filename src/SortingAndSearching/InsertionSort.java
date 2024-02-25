package SortingAndSearching;

import java.util.Scanner;

public class InsertionSort {
    public static void insertion(int arr[],int n){
        int currentElement,j;
       for(int i=1;i<n;i++){
            currentElement=arr[i];
            j=i-1;
            while(j>=0 && currentElement<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentElement;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value in the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array Value before sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        insertion(arr,n);
        System.out.println("\nPrint Array  value after Insertion Sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
