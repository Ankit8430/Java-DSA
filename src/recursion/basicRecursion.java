package recursion;

import java.util.*;


public class basicRecursion {
    public static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    public static void print1toN(int n,int count){
        if(n==count-1){
            return;
        }
        System.out.println(count);
        print1toN(n, count+1);
    }
    public static int sumOfNthNaturalNumber(int n,int count){
        if(n==count){
            return n;
        }
        return count+sumOfNthNaturalNumber(n, count+1);
    }
    public static int factorialOfNthNum(int n){
        if(n==1 || n==0) return 1;
        return n*factorialOfNthNum(n-1);
    }
    public static void fibo(int a,int b,int n){
        if(n==0) return;
        int c=a+b;
        System.out.print(c+" ");
        fibo(b, c, n-1);
    }
    public static int xPowerNStackHeightN(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;

        return x*xPowerNStackHeightN(x, n-1);
    }
    public static int xPowerNStackHeightLogN(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;

        if(n%2==0){
            return xPowerNStackHeightLogN(x,n/2)*xPowerNStackHeightLogN(x,n/2);
        }else{
            return xPowerNStackHeightLogN(x,n/2)*xPowerNStackHeightLogN(x,n/2)*x;
        }
    }
    public static void reverseString(String str,int idx,String reverseString){
        if(idx==-1){
            System.out.println(reverseString);
            return;
        }
        char currChar=str.charAt(idx);
        reverseString(str,idx-1,reverseString+currChar);
    }
    public static int first=-1,last=-1;
    public static void findFirstAndLastOccurance(String str,char ele,int idx){
        if(idx==str.length()){
            System.out.println("First = "+first+" Last = "+last);
            return;
        }
        if(str.charAt(idx)==ele){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findFirstAndLastOccurance(str, ele, idx+1);
    }
    public static boolean isSortedOrNot(int arr[],int idx){
        if(idx==arr.length){
            return true;
        }

        if(arr[idx-1]>arr[idx]){
            return false;
        }
        return isSortedOrNot(arr, idx+1);
    }
    public static void moveAllXinTheEnd(String str,int idx,int count,String newString){
        if(idx==str.length()){
           for(int i=0;i<count;i++){
             newString+="x";
           }
           System.out.println(newString);
           return;
        }

        if(str.charAt(idx)=='x'){
            count++;
        }else{
            newString+=str.charAt(idx);
        }
        
        moveAllXinTheEnd(str, idx+1, count, newString);
    }
    public static void towerOfHanoi(int n,String src,String hel,String desc){
        if(n==1){
            System.out.println("Disk "+n+" is from  "+src+" to "+desc);
            return;
        }

        towerOfHanoi(n-1, src,desc, hel);
        
        System.out.println("Disk "+n+" is from "+src+" to "+desc);

        towerOfHanoi(n-1, hel, src, desc);
    }
    public static boolean[] map=new boolean[26];
    public static void removeDuplicate(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(!map[currChar-'a']){
            newString+=currChar;
            map[currChar-'a']=true;
        }
        removeDuplicate(str, idx+1, newString);
    }
    public static void printAllSubSequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);

        printAllSubSequence(str, idx+1, newString+currChar);
        printAllSubSequence(str, idx+1, newString);
    }
    public static void printUniqueSubSequence(String str,int idx,HashSet<String>set,String newString){
        if(idx==str.length()){
           if(!set.contains(newString)){
                System.out.println(newString);
                set.add(newString);
           }
           return;
        }

        char currChar=str.charAt(idx);
        printUniqueSubSequence(str, idx+1, set, newString+currChar);
        printUniqueSubSequence(str, idx+1, set, newString);
    }
    public static String[] keypad={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printAllKeypadCombination(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printAllKeypadCombination(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void printPermucataion(String str,String permucation){
        if(str.length()==0){
            System.out.println(permucation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPermucataion(newString, permucation+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the Number: ");
        //int n=sc.nextInt();
        System.out.println("Enter the String");
        String str=sc.next();
        printPermucataion(str,"");
       // printAllKeypadCombination(str,0,"");
        //HashSet<String> set=new HashSet<String>();
       // printUniqueSubSequence(str, 0, set, "");
        //printAllSubSequence(str,0,"");
        //removeDuplicate(str, 0, "");
        //towerOfHanoi(n,"S","H","D");
        /*
            moveAllXinTheEnd(str,0,0,"");
        */
        /*
            System.out.println("Enter Value in the Array: ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(isSortedOrNot(arr, 1)){
                System.out.println("Array is Sorted");
            }else{
                System.out.println("Array is not Sorted");
            }
        */
       // findFirstAndLastOccurance(str,'a',0);
        //reverseString(str, str.length()-1, "");
        //printNto1(n);
        //print1toN(n, 1);
        //System.out.println("Sum of "+n+" Natual Number is: "+sumOfNthNaturalNumber(n,0));
        //System.out.println("Factorial of "+n+" is =: "+factorialOfNthNum(n));
        /*
            Fibo
            int a=0,b=1;
            System.out.print(a+" "+b+" ");
            fibo(a, b, n-2);
        */
        /*
         xPowerNStackHeightN
            System.out.println("Which value do you want to power: ");
            int x=sc.nextInt();
            System.out.println(x+" power of "+n+" is =: "+xPowerNStackHeightN(x, n));
         */
        /* 
            xPowerNStackHeightLogN
            System.out.println("Which value do you want to power: ");
            int x=sc.nextInt();
            System.out.println(x+" power of "+n+" is =: "+xPowerNStackHeightLogN(x, n));
        */


    }
}
