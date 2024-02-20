package OOPS;
interface Dog{
    void walk();
}
class PetDog implements Dog{
    public void walk(){
        System.out.println("Walk");
    }
}
public class interfaceClass {
    public static void main(String[] args) {
        PetDog pd=new PetDog();
        pd.walk();
    }
}
