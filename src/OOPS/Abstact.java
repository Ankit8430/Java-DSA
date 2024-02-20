package OOPS;
abstract class Animal{
    Animal(){
        System.out.println("Hello, I am Animal");
    }
    public void breath(){
        System.out.println("breath");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse");
    }
    public void walk(){
        System.out.println("Walk");
    }
}
public class Abstact {
  public static void main(String[] args) {
    Horse an=new Horse();
    an.breath();
    an.walk();
  }  
  /*
    Hello, I am Animal
    Horse
    breath
    Walk 
*/
}
