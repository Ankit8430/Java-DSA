package recursion;

import java.util.Scanner;

public class towerOfHanoi {
    public static void towerOfHanoI(int n,String src,String help,String dest){
      if(n==1){
        System.out.println("Transfter Disk "+n+" from "+src+" to "+dest);
        return;
      }
      towerOfHanoI(n-1, src, dest, help);
      System.out.println("Transfter Disk "+n+" from "+src+" to "+dest);
      towerOfHanoI(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Ring Number:");
        int n=sc.nextInt();
        towerOfHanoI(n, "S", "H", "D");
    }
}