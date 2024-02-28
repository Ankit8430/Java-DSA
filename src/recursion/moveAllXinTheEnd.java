package recursion;

import java.util.Scanner;

public class moveAllXinTheEnd {
    //public static String newString=' ';
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+="x";
            }
            System.out.println("New String ==> "+newString);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
        }else{
            newString+=str.charAt(idx);
        }
        moveAllX(str,idx+1,count,newString);
    }
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String newString="";
        moveAllX(str,0,0,newString);  
    } 
}
