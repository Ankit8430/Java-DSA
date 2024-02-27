package recursion;

import java.util.Scanner;

public class printNto1Num {
    public static void print(int n){
        if(n==0) return; //Base Case
        System.out.print(n+" "); 
        print(n-1); //Rerusion
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth Number: ");
        int n=sc.nextInt();
        System.out.println("Print Value from N to 1");
        print(n);
    }
}
