package OOPS;
class hape{
    public void area(){
        System.out.println("Hi Shape");
    }
}
class riangle extends hape{
    public void areaTriangle(){
        System.out.println("Hi triangle");
    }
}
public class singleInhertance {
    public static void main(String[] args){
        riangle t=new riangle();
        t.areaTriangle();
        t.area();
    }
}
