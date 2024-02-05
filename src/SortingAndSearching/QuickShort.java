package SortingAndSearching;

import Basic.print2DArray;

public class QuickShort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int swap=arr[i];
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
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            qShort(arr, low, pivotIndex-1);
            qShort(arr,pivotIndex+1, high);
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        int len=arr.length;
        qShort(arr,0,len-1);
        System.out.println("Sorted Array: ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
