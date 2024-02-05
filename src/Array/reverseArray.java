package Array;
import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the of array of index :"+i);
            arr[i]=sc.nextInt();
        }
         System.out.println("Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println("Reverse Array: ");
        int i=0,j=size-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for( i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
