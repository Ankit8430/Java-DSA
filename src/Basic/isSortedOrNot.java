package Basic;
import java.util.*;

public class isSortedOrNot {
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the value of index: "+i);
            arr[i]=sc.nextInt();
        }

        if(isSorted(arr)){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Not Sorted Array");
        }
    }
}
