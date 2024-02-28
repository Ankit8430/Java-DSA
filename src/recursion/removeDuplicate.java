package recursion;

import java.util.Scanner;

public class removeDuplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicateString(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char curChar=str.charAt(idx);
        if(!map[curChar-'a']){ 
            newString+=curChar;
            map[curChar-'a']=true;
        }
        removeDuplicateString(str, idx+1, newString);
    }
    public static void main(String[] args) {
         System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String newString="";
        removeDuplicateString(str, 0, newString);
    }   
}
