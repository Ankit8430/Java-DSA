package Basic;
import java.util.*;
public class sumTwoNumberReturn {
    public static int sumOfTwoNumber(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=sumOfTwoNumber(a,b);
        System.out.println("Sum "+sum);
    }
    
}
