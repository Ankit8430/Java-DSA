package Array;
import java.util.Scanner;

public class kadanesAlgo {
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
        System.out.println("Maximum Subarray:");
        int sum=0,max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            System.out.println(sum+" : "+max);
        }
        System.out.println(max);
    }
}
