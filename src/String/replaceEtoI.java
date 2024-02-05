package String;

import java.util.Scanner;

public class replaceEtoI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.next();
        String result="";

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='e'){
                result+='i';
            }else if(name.charAt(i)=='i'){
                result+='e';
            }else{
                 result+=name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
