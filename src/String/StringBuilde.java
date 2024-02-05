package String;

public class StringBuilde {
    public static void main(String[] args) {
        //Declaration
       StringBuilder sb=new StringBuilder("A");
        System.out.println(sb);
       //Appednd 
        sb.append('n');
               System.out.println(sb);
         sb.append('k');
                System.out.println(sb);
          sb.append('i');
                 System.out.println(sb);
           sb.append('t');
                  System.out.println(sb);
        //Char at Index 0
        System.out.println(sb.charAt(0));
        
        //set char at index 0
        sb.setCharAt(0, 'N');
        System.out.println(sb);
        
        //insert char
        sb.insert(0,'S');
        System.out.println(sb);
             //insert char
        sb.insert(2,'n');
        System.out.println(sb);

        //delete the extra
        sb.delete(0,3);
         System.out.println(sb);

        sb.insert(0,'A');
        System.out.println(sb);
    }
    
}
