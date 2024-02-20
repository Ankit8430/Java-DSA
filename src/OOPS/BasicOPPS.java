package OOPS;
class student{
    String name;
    int age;
    public void getInfo(){
        System.out.println("Name ==> "+name);
        System.out.println("Age ==> "+age);
    }

}
public class BasicOPPS {
    public static void main(String[] args){
        student st=new student();
        st.name="Ankit Gupta";
        st.age=20;
        st.getInfo();
    }
}
