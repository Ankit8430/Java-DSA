package recursion;

import java.util.Scanner;

public class xPowerNforLogNStack {
    public static int power(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;

        if(n%2==0){
            return power(x, n/2)*power(x, n/2);
        }else{
            return x*power(x, n/2)*power(x, n/2);
        }
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
