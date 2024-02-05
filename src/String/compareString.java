package String;
import java.util.*;
public class compareString {
    public static void main(String[] args) {
        String name1="Tony";
        String name2="Tony";
        //1. s1>s2 :+ve value return
        //2. s1==s2 : 0 return
        //3. s1<s2 :-ve return
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }

    //Note : Hm == bhi use kar sakte the but wo kabhi kabhi fail ho jati hai.
    }
    
}
