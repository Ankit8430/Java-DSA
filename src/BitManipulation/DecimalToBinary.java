package BitManipulation;

public class DecimalToBinary {
    public static void buteforce(int n){
        int arr[]=new int[32];
        int i=0;
        while(n!=0){   // O(Log N)
            arr[i]=n%2;
            n/=2;
            i++;
        }
        for(int j=i-1;j>=0;j--){ // O(N)
            System.out.println(arr[j]);
        }
    }
    public static void bestApporch(int n){
        int binaryNumber=0;
        int count=0;
        while(n!=0){
            int rem=n%2;
            double power=Math.pow(10,count);
            binaryNumber+=rem*power;
            n/=2;
            count++;
        }
        System.out.println(binaryNumber);
    }
    public static void main(String[] args) {
        int n=10;
        buteforce(n); // O(N) --> time  O(1) --> Space
        bestApporch(n); //O(log n)--> time  O(1) --> Space
    }
}
