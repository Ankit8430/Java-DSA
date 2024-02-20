package OOPS;
class ram{
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println("Name ==> "+name);
    }
    public void displayInfo(String name,int age){
        System.out.println("Name ==>"+name+" age ==> "+age);
    }
}
public class polyOverLoading {
    public static void main(String[] args) {
        ram st=new ram();
        st.displayInfo("Ankit");
        st.displayInfo("Ankit",20);
    }
}
