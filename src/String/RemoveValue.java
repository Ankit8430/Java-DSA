package String;

import java.util.Scanner;

public class RemoveValue {
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Email");
      StringBuilder sb=new StringBuilder(sc.next());
      for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)=='@'){
            sb.delete(i, sb.length());
        }
      }
      System.out.println("UserName ==> "+sb);
    }  
}
