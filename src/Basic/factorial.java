package Basic;
import java.util.Scanner;

public class factorial {
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Factorial of "+n+" is: "+fact(n));
    }
}
