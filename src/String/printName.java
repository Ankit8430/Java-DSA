package String;

import java.util.Scanner;

public class printName{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Your name is : "+name);
        
        //concatenation
        String firstName="Ankit";
        String lastName="Gupta";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

    }
}