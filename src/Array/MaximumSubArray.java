package Array;
public class MaximumSubArray{
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        int  n=arr.length;
        int max=0;
         for(int i=0;i<=n;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
            }
            if(sum>max){
                max=sum;
            }
         }
         System.out.println("Maximum SubArray: "+max);
    }
}