package OOPS;
class ankit{
    public String name;
    protected int age;
    private String sex;
    ankit(){

    }
    ankit(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void getInfo(){
        System.out.println("Name ==> "+this.name+" Age ==> "+this.age+" Sex ==>"+this.sex);
    }
}
class aman extends ankit{
    
    aman(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println("Name ==> "+this.name+" Age ==> "+this.age);
    }
}
public class accessModifier {
    public static void main(String[] args) {
        ankit an=new ankit("Ankit",30,"Male");
        an.getInfo();
        aman am=new aman("Aman", 32);
        am.getInfo();

        an.name="Naman";
        an.age=30;
        an.getInfo();
        
    }
}
