package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the String: ");
           String name=sc.next();
           StringBuilder sb=new StringBuilder(name);
           int front=0,back=sb.length()-1;
           while(front<back){
                char temp=sb.charAt(front);
                sb.setCharAt(front, sb.charAt(back));
                sb.setCharAt(back, temp);
                front++;
                back--;
           }
           System.out.println(sb);
    }
}
