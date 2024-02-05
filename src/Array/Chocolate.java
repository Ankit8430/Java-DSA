package Array;
import java.util.*;
public class Chocolate {
    public static void main(String[] args) {
        int m=5;
        int arr[]={3,4,1,9,56,7,9,12};
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            if(min_diff>arr[i+m-1]-arr[i]){
                min_diff=arr[i+m-1]-arr[i];
            }
        }
        System.out.println(min_diff);
    }
}
