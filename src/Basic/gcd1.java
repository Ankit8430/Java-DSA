package Basic;
import java.util.Scanner;

public class gcd1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of n1 and n2");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        while(n1!=n2){
            if(n1>n2) n1=n1-n2;
            if(n2>n1) n2=n2-n1;
        }
        System.out.println("GCD is = "+n2);
    }
}
