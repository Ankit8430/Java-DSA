package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class printAllUniqueSubSquences {
    public static void sequences(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(!set.contains(newString)){
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        //Current Char
        char currChar=str.charAt(idx);
        
        //To be Added
        sequences(str, idx+1, newString+currChar, set);
        //To not be Added
        sequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        HashSet<String> set=new HashSet<String>();
        sequences(str,0,"",set);
    }
}
