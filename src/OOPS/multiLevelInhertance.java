package OOPS;
class A{
    public void A(){
        System.out.println("A");
    }
}
class B extends A{
    public void B(){
        System.out.println("B");
    }
}
class C extends B{
    public void C(){
        System.out.println("C");
    }
}
public class multiLevelInhertance {
    public static void main(String[] args) {
        A a=new A();
        a.A();
        B b=new B();
        b.A();
        b.B();
        C c=new C();
        c.A();
        c.B();
        c.C();
    }
}
