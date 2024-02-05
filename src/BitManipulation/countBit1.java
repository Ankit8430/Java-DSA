package BitManipulation;

public class countBit1 {
    public static void main(String[] args) {
        int n=2;
        int count=0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        System.out.println(count);
    }
    
}
