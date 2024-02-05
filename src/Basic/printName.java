package Basic;
import java.util.*;
public class printName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();

        String [] arr=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the name of index :"+i);
            arr[i]=sc.next();
        }

        System.out.println("Print the name of array");
        for(int i=0;i<size;i++){
            System.out.println(i+" : "+arr[i]);
        }
    }
}
