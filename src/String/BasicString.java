package String;

import java.util.Scanner;

public class BasicString {
    public static void fullName(String firstName,String lastName){
        String fullName=firstName+" "+lastName;
        System.out.println("FullName => "+fullName);
    }
    public static void printChar(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName=sc.next();
        System.out.println("Enter the last name");
        String lastName=sc.next();
        System.out.println("Print Full Name");
        fullName(firstName, lastName);
        System.out.println("Print Char one by one");
        printChar(firstName);
        printChar(lastName);
    }
}
