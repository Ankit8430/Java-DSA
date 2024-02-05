package Array;
public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
    
        int max=0;
        //O(N^3)
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);

        //O(N^2)
        max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
