package String;

import java.util.Scanner;

public class TakeArrayAndPrintTotalLen {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array: ");
     int size=sc.nextInt();
     String arr[]=new String[size];
     int toLen=0;
     for(int i=0;i<size;i++){
        arr[i]=sc.next();
        toLen+=arr[i].length();
     }
     System.out.println(toLen);
    }
}
