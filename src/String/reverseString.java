package String;

import java.util.Scanner;

public class reverseString {
    public static void reverseString(StringBuilder str){
        int start=0,end=str.length()-1;
        char temp;
        while(start<end){
            temp=str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
           System.out.println("Enter the String");
           Scanner sc=new Scanner(System.in);
           String name=sc.next();
           StringBuilder sb=new StringBuilder(name);
           reverseString(sb);
    }
}
