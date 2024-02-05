package Basic;
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        int b=1;
        System.out.print(a+" ");
        for(int i=1;i<n;i++){
            System.out.print(b+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
