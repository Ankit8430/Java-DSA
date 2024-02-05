package recursion;

public class xPowerNforLogNStack {
    public static int power(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;
        if(n%2==0){//Even
            return power(x, n/2) *power(x, n/2);
        }else{//odd
            return power(x, n/2) *power(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=3;
        System.out.print(power(x,n));
    }
}
