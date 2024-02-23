package String;

import java.util.Scanner;

public class combineStringLength {
    public static void main(String[] args) {
        System.out.println("Enter the lenght of String");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        int sum=0;
        for(int i=0;i<n;i++){
            str[i]=sc.next();
            sum+=str[i].length();
        }
        System.out.println("Sum "+sum);
    }
}
