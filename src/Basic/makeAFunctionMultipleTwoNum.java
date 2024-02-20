package Basic;

import java.util.Scanner;

public class makeAFunctionMultipleTwoNum {
    public static int product(int n1,int n2){
        return n1*n2;
    }
    public static int sum(int n1,int n2){
        return n1+n2;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of 1 and 2");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Product of "+num1+" and "+num2+" is = "+product(num1,num2));
        System.out.print("Sum of "+num1+" and "+num2+" is = "+sum(num1,num2));
    }
}