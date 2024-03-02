package recursion.Advanced;

import java.util.*;

public class findtotalSubSet {
    /*
        Subsets of a set  → Print all the subsets of a set of first N natural Numbers.
        Note: Har Element ke pass ek choice hoti hai ki wo subset mai aana chata hai ya nhi.
    */

    public static void printSubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void totalSubSet(int n,ArrayList<Integer>subset){
        if(n==0){
            printSubset(subset); //Print karana hai subset.
            return;
        }
        //Add Hoga
        subset.add(n);
        totalSubSet(n-1, subset);

        //Add Nhi hoga too Subset se remove karna hoga
        subset.remove(subset.size()-1); //Last value remove  beacuse abhi-abhi subset mai value add hui hai
        totalSubSet(n-1, subset);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth Natural Number : ");
        int n=sc.nextInt();
        ArrayList<Integer> subset=new ArrayList<Integer>();
        totalSubSet(n,subset);
    }   
}
