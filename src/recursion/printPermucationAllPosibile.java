package recursion;

import java.util.Scanner;
public class printPermucationAllPosibile{
    public static void printPermucation(String str,String permucation){
        if(str.length()==0){
            System.out.println(permucation);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPermucation(newString, permucation+currChar);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        printPermucation(str,"");
    }
}
