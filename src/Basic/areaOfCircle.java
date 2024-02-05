package Basic;
import java.util.*;
public class areaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of Circle is :"+area);
    }
}
