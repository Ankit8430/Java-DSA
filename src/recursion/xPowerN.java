package recursion;

import java.util.Scanner;

public class xPowerN {
    public static int power(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;

        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int x=sc.nextInt();
        System.out.println("Enter the Power Number");
        int n=sc.nextInt();
        System.out.println("Power of "+n+" of the "+x+" is => "+power(x, n));
    
    }
}
