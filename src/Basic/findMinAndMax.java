package Basic;
import java.util.Scanner;

public class findMinAndMax {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the value of index: "+i);
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Max: "+max+" Min: "+min);
    }   
}
