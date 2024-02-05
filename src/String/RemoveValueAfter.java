package String;

import java.util.Scanner;

public class RemoveValueAfter{
    public static void main(String[] args) {
        //Remove value After @
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email: ");
        String email=sc.next();

        String userName="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            userName+=email.charAt(i);
        }
        System.out.println(userName);
    }
}
