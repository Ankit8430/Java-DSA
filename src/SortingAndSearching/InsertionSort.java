package SortingAndSearching;

public class InsertionSort {
    public static void insertion(){
        int arr[]={7,8,3,1,2};
        int n=arr.length;
        //Time Complexity ---> O(N^2)
        for(int i=1;i<n;i++){  // --> O(N)
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){  // O(N)
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        insertion();

    }
}
