package SortingAndSearching;

public class SelectionSort {
    public static void selection(){
        int arr[]={7,8,3,1,2};
        int n=arr.length;
        int small;
        //Time Complexity --> O(N^2)
        for(int i=0;i<n-1;i++){ // n-1, n-2,n-3,n-4 --------- ---> n
            small=i;
            for(int j=i+1;j<n;j++){ //n
                if(arr[small]>arr[j]){
                    small=j;
                } 
            }
            int swap=arr[i];
            arr[i]=arr[small];
            arr[small]=swap;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        selection();
    }
}
