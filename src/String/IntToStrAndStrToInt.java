package String;

public class IntToStrAndStrToInt {
    public static void main(String[] args) {
        //String to Integer --> Integer.parseInt(str)
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);
        //Integer to String --> Integer.toString(number);
         int num=123;
        String str1=Integer.toString(num);
        System.out.println(str1);
    }
    
}
