package OOPS;
class Shape{
    public void area(){
        System.out.println("Hi Shape");
    }
}
class triangle extends Shape{
    public void area(){
        System.out.println("Hi triangle");
    }
}
public class polyOverRidding {
    public static void main(String[] args){
        triangle t=new triangle();
        t.area();
    }
}
