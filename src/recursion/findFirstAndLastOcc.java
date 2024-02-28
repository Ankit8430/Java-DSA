package recursion;

import java.util.Scanner;

public class findFirstAndLastOcc {
    public static int first=-1;
    public static int last=-1;
    public static void printFirstAndLastOcc(String str,char ele,int idx){
        if(idx==str.length()){ //Base Condition
            System.out.println("First Index "+first+"  Last Index "+last+" element of "+ele);
            return;
        }
        if(str.charAt(idx)==ele){
            if(first==-1) first=idx;
            else last=idx;
        }
        printFirstAndLastOcc(str,ele,idx+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter the Element which you want to find: ");
        printFirstAndLastOcc(str,'a',0);
    }
}
