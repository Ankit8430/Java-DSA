package String;

import java.util.Scanner;

public class printUserNameFromEmail {
    public static void main(String[] args) {
        System.out.println("Enter the Email");
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        String username="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            username+=email.charAt(i);
        }
        System.out.println("UserName => "+username);
    }
}
