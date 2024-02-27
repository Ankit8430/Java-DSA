package recursion;

import java.util.Scanner;

public class printFirstNthNaturalNumber {
    public static int printSum(int i,int n){
        if(n==i) return n;
        return i+printSum(i+1, n);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nth Number: ");
        int n=sc.nextInt();
        
        System.out.println("Print Nth Sum => "+printSum(1,n));
    }
}
