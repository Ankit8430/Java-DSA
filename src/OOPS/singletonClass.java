package OOPS;
//Contructor is Private
class singleton{
    private static singleton instance=null;
    private singleton(){

    }
    public static synchronized singleton getInstance(){
        if(instance==null)
            instance=new singleton();
        return instance;
    }
}
public class singletonClass {
    public static void main(String[] args) {
       System.out.println(singleton.getInstance());
    }
}
