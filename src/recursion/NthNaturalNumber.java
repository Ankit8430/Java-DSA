package recursion;

import java.util.Scanner;

public class NthNaturalNumber {
    public static void print(int i,int n){
        if(n==i-1) return;
        System.out.print(i+" ");
        print(i+1,n);
    }
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Nth Number");
       int n=sc.nextInt();
       print(1,n);
    }
}
