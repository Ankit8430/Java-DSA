package SortingAndSearching;

public class BubbleSort {
    //Bubble Sort
    public static void bubbleSort1(){
        int arr[]={7,8,3,1,2};
        int n=arr.length;
        int temp;
        // Time Complexity --> O(N^2)
        for(int i=n-1;i>0;i--){ // n-1
            for(int j=0;j<i;j++){ // n-1, n-2, n-3, n-4, -----   -> O(N)
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
       bubbleSort1();
    }
}
