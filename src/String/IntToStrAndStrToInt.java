package String;

import java.util.Scanner;

public class IntToStrAndStrToInt {
    public static void intToStr(int n){
        String str=Integer.toString(n);
        System.out.println(str);
    }
    public static void strToInt(String str){
        int num=Integer.parseInt(str);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer");
        int n=sc.nextInt();
        System.out.println("Converted Integer to string");
        intToStr(n);
        System.out.println("Enter the String");
        String str=sc.next();
        System.out.println("Converted String to Integer");
        strToInt(str);
    }
    
}
