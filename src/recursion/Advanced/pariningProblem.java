package recursion.Advanced;

import java.util.Scanner;

public class pariningProblem {
    //Friends pairing problem → Find the number of ways in which you can invite N people to your party, single or in pairs.
    public static int findpairs(int n){
        if(n<=1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        //Single Pairs
        int singlePairs=findpairs(n-1);

        //Double Pairs
        int doublePairs=(n-1)*findpairs(n-2);

        //total Pair
        return singlePairs+doublePairs;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Geust: ");
        int n=sc.nextInt();
        System.out.println(findpairs(n));
    }
}
