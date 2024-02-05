package Basic;

public class Operators {
    public static void main(String[] args) {
        int a=10,b=0;
        //Pre Increment
        b=a++;
        System.out.print("a: "+a+" b: "+b);
        System.out.println();

        //Post Increment
        a=10;
        b=0;
        b=++a;
        System.out.print("a: "+a+" b: "+b);
        System.out.println();
       
        //Post Decrement
        a=10;
        b=0;
        b=a--;
        System.out.print("a: "+a+" b: "+b);
        System.out.println();

        //Pre Decrement
        a=10;
        b=0;
        b=--a;
        System.out.print("a: "+a+" b: "+b);
        System.out.println();
    }
}
