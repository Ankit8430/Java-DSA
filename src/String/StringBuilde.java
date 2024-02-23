package String;

public class StringBuilde {
    public static void main(String[] args) {
        //Deleration
       StringBuilder sb=new StringBuilder("Ankit");
       System.out.println(sb);
       System.out.println("Print Value index 0 => "+sb.charAt(0));
       //Set Value index 0
       sb.setCharAt(0, 'N');
       System.out.println(sb);
       //Insert Char
       sb.insert(0,'A');
       System.out.println(sb);
       //Delete Char
       sb.delete(1, 2);
       System.out.println(sb);
       //Append
       StringBuilder str=new StringBuilder("A");
       System.out.println(str);
       str.append('M');
       System.out.println(str);
       str.append('A');
       System.out.println(str);
       str.append('N');
       System.out.println(str);
    }
    
}
