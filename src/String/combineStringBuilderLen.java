package String;

import java.util.Scanner;

public class combineStringBuilderLen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int toLen=0;
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            StringBuilder sb=new StringBuilder(sc.next());
            toLen+=sb.length();
        }
        System.out.println(toLen);
    }  
}
