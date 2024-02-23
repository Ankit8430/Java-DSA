package String;

import java.util.Scanner;

public class getAndPrintString{
    public static void main(String[] args){
        System.out.println("Enter the length of String");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println("Print String");
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}