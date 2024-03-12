package LinkedList;
import java.util.*;
public class LinkedListCollectionFrameWork {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        //Add First
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("This");

        //Add Last
        list.add("Last");
        System.out.println(list);

        //Print
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"--->");
        }
        System.out.println("Null");

        //Remove First
        list.removeFirst();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"--->");
        }
        System.out.println("Null");
        
        //Remove Last
        list.removeLast();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"--->");
        }
        System.out.println("Null");

        System.out.println("Size -->"+list.size());
    }
}
