package Basic;
import java.util.Scanner;

public class sort {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the value of Array:");
        for(int i=0;i<n;i++){
            System.out.print(i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Un Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the number to search on array");
        int num=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println(num+" is index of "+i);
            }
        }

        boolean as=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                as=true;
            }else{
                as=false;
            }
        }
        if(as==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
