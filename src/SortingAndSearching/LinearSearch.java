package SortingAndSearching;

public class LinearSearch {
    public static boolean Linear(int arr[],int n,int x){
        if(n<0) return false;
        for(int i=0;i<n;i++){
            if(arr[i]==x) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]={2,4,6,7,8,9};
        int n=arr.length;
        int x=6;
        if(Linear(arr,n,x)){
            System.out.println("Found it");
        }else{
            System.out.println("Not Found it");
        }
    }
}