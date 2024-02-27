package recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==1 || n==0) return 1;//Base Condition
        return n*fact(n-1);  // n=5 --> 4*fact(3) ---> 3*fact(2) --> 2*fact(1)  --> return 1 --> return 1*2 --> 
                            //  reutrn 2 --> return 3*2 --> return 6 --> return 6*4 --> return 24
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nth Number: ");
        int n=sc.nextInt();

        System.out.println("Factorial of "+n+" is = "+fact(n));
    }
}
