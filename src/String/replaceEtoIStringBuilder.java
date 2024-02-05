package String;

import java.util.Scanner;

public class replaceEtoIStringBuilder {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }else if(sb.charAt(i)=='i'){
                sb.setCharAt(i, 'e');
            }
        }
        System.out.println(sb);

    }  
}
