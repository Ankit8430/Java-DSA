package recursion;

import java.util.Scanner;

public class NthNaturalNumber {
    public static void printSum(int i,int n,int sum){
        if(i==n){ //Base Case
            sum+=i;
            System.out.print(sum+" ");
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static void main(String [] args){
        System.out.println("Enter the Nth Natural Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printSum(0,n,0);
    }
}
