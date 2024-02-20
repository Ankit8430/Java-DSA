package OOPS;
class D{
    public void D(){
        System.out.println("D");
    }
}
class E extends D{
    public void E(){
        System.out.println("E");
    }
}
class F extends D{
    public void F(){
        System.out.println("F");
    }
}
class G extends E{
    public void G(){
        System.out.println("G");
    }
}
public class hybidInheritance {
    public static void main(String[] args) {
        D d=new D();
        E e=new E();
        F f=new F();
        G g=new G();


        d.D();
        e.D();
        e.E();
        f.D();
        f.F();
        g.D();
        g.E();
        g.G();
    }
}
