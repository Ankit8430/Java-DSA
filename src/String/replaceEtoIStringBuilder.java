package String;

import java.util.Scanner;

public class replaceEtoIStringBuilder {
     public static void replaceEtoI(StringBuilder sb){
        for(int a=0;a<sb.length();a++){
            if(sb.charAt(a)=='e'){
                sb.setCharAt(a, 'i');
            }else if(sb.charAt(a)=='i'){
                sb.setCharAt(a, 'e');
            }
        }
    
     }
      public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       StringBuilder sb=new StringBuilder(sc.next());
       replaceEtoI(sb);
       System.out.println(sb);
    }  
}
