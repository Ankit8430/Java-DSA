package recursion.Advanced;

import java.util.Scanner;

public class printAllPermucations {
    public static void printPermucation(String str,String permucation){
        if(str.length()==0){
            System.out.println(permucation);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            //newString=str.substring(0, 0)+str.substring(0+1) ==> newString=str.substring(0, 0)+str.substring(1);
            //newString=str.substring(0, 0)+str.substring(1);   ==>newString=""+"bc"; ==> newString="bc";
            printPermucation(newString, permucation+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        printPermucation(str,"");
    }
}
