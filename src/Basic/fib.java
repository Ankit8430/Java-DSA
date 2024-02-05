package Basic;
import java.util.*;
public class fib {
        public static void fibo(int n){
            int a=0,b=1;
            System.out.print(a+" , ");
            for(int i=2;i<=n;i++){
                System.out.print(b+" , ");
                int temp=b;
                b=temp+a;
                a=temp;
            }
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term of the Fibonacci");
        int n=sc.nextInt();
        fibo(n);
    }
}
