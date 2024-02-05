package Array;
public class MaximumSubArrayFind {
      public static void main(String[] args) {
        int arr[]= {5,4,-1,7,8};
        int  n=arr.length;
        int max=0;
        int sum=0;
        //O(N)
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        
         System.out.println("Maximum SubArray: "+max);
        //O(N^^2)
        max=0;
        for(int i=0;i<=n-1;i++){
            sum=0;
            for(int j=0;j<=i;j++){
                    sum+=arr[j];
            }
                if(sum>=max){   max=sum; }
         }
         System.out.println("Maximum SubArray: "+max);
        //O(N^^3)
        max=0;
         for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                 sum=0;
                for(int k=j;k<=i;k++){
                    sum+=arr[k];
                }
                if(sum>=max){   max=sum; }
            }
         }
         System.out.println("Maximum SubArray: "+max);

    }
}
