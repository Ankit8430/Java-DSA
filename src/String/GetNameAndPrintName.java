package String;

import java.util.Scanner;

public class GetNameAndPrintName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name=sc.nextLine();

        System.out.println("Your name is : "+name);
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    
}
