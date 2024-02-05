package BitManipulation;

public class power {
    public static boolean power2(int n){
        int count=0;
        while(n>0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        return false;
    }
        public static void main(String[] args) {
            int num=3;
            if(power2(num)) System.out.println("YES");
            else System.out.println("No");
        }    
}
