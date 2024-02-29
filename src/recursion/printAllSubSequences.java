package recursion;

import java.util.Scanner;

public class printAllSubSequences {
    public static void sequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(idx);

        //To be add
        sequences(str, idx+1, newString+currChar);
        //To be not add
        sequences(str, idx+1, newString);
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str=sc.next();
    sequences(str,0,"");
 }   
}
