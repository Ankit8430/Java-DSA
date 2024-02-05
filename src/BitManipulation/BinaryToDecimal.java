package BitManipulation;

public class BinaryToDecimal {
    public static void binaryToDec(int num){
        int dec=0,base=1;
        while(num>0){
            int last_digit=num%10;
            dec+=last_digit*base;
            base*=2;
            num/=10; //Binary To Decimal
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        int num=10101001;
        binaryToDec(num);
    }
    
}
