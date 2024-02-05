package Basic;
import java.util.Scanner;

public class LinearSearc {
    public static boolean linear(int [] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
                return true;
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int [] arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the value of "+i+" index");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value to find the array: ");
        int num=sc.nextInt();
        if(linear(arr,num)){
            System.out.println("Find it");
        }
        else{
            System.out.println("Not Find it");
        }
    }
}
