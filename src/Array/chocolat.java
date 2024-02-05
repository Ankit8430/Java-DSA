package Array;
import java.util.*;

public class chocolat {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value in the array: ");
        for(int i=0;i<n;i++){
            System.out.print(i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n Find Minium distribution chocolate: ");
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        int m=5,diff;
        for(int i=0;i+m-1<n;i++){
            diff=arr[i+m-1]-arr[i];
            if(min_diff>diff){
                min_diff=diff;
            }
        }
        System.out.println(min_diff);
    }
}
