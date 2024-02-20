package OOPS;
class employee{
    String name;
    int age;
    employee(){
        System.out.println("Non Parameter Constructor");
    }
    employee(String name,int age){
        System.out.println("Parameter Constructor");
        this.name=name;
        this.age=age;
    }
   employee(employee s2){
        System.out.println("Copy Constructor");
        this.name=s2.name;
        this.age=s2.age;
    }
    public void getInfo(){
        System.out.println("Name ==> "+name);
        System.out.println("Age ==>"+age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        //"Non Parameter Constructor"
        employee s1=new employee();
        s1.name="Ankit Gupta";
        s1.age=20;
        s1.getInfo();

        //Parameter Constructor
        employee s2=new employee("Aman Gupta",30);
        s2.getInfo();
        //Copy Constructor
        employee s3=new employee(s2);
        s3.getInfo();

    }
}
