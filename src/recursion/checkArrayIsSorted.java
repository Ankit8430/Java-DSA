package recursion;

import java.util.Scanner;

public class checkArrayIsSorted {
    public static boolean checkSortedOrNot(int arr[],int idx){
        if(idx==arr.length-1){ //Base Condition
            return true;
        }
        if(arr[idx]>arr[idx+1]){
           return false;
        }
        return checkSortedOrNot(arr,idx+1);
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the value in the array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(checkSortedOrNot(arr,0)){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
}
