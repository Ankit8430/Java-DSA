package SortingAndSearching;

public class BinarSearch {
    public static boolean bSearch(int arr[],int start,int n,int x){
        if(n<0) return false;
        int l=start,r=n-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(arr[mid]==x){
               return true;
            }else if(arr[mid]<x){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10,12,14};
        int n=arr.length;
        if(bSearch(arr,0,n,9)){
            System.out.println("Value is Present in array");
        }else{
            System.out.println("Value is not present in array");
        }
    }
}
