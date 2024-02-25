package SortingAndSearching;

import java.util.Scanner;

public class MergeSort {
    public static void conquer(int arr[],int si, int mid, int ei){
        int mergeArray[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                mergeArray[x++]=arr[idx1++];
            }else{
                mergeArray[x++]=arr[idx2++];
            }
        }
        while (idx1<=mid) {
            mergeArray[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            mergeArray[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<mergeArray.length;i++,j++){
            arr[j]=mergeArray[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei) return;
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter value in the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array before sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        divide(arr, 0, n-1); //Total Time Complexity --> O(N Log N), Space Complexity --> O(N)
        System.out.println("\nPrint Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
