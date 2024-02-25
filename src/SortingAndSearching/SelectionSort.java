package SortingAndSearching;

import java.util.Scanner;

public class SelectionSort {
    public static void selection(int arr[],int n){
        int small,swap;
        for(int i=0;i<n-1;i++){
            small=i;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    small=j;
                }
            }
            swap=arr[i];
            arr[i]=arr[small];
            arr[small]=swap;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Value in the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Selection Sort");
        selection(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
