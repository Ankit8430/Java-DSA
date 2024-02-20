package OOPS;
class X{
    public void X(){
        System.out.println("X");
    }
}
class Y extends X{
    public void Y(){
        System.out.println("Y");
    }
}
class Z extends X{
    public void Z(){
        System.out.println("Z");
    }
}
public class hierarchicalInheritance {
    public static void main(String [] args){
        X x=new X();
        x.X();
        Y y=new Y();
        y.Y();
        y.X();
        Z z=new Z();
        z.Z();
        z.X();
    }
}
