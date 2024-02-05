package BitManipulation;

public class Bit {
    public static void getBit(){
        int n=5; // 0101
        int pos=2;
        int bitMask= 1<<pos; // 1<< 2// 0001<<2 --> 0100
        
        if((bitMask & n)==0){ //0100 & 0101 ==0 --> 0100 ==0 --> NO
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
    public static void setBit(){
        int n=5;
        int pos=2;

        int bitMask= 1<<pos;

        int newNumber=bitMask | n;
        System.out.println(newNumber);
    }
    public static void clearBit(){

        int n=5;
        int pos=2;

        int bitMask=1 <<pos;
        int notBitMask= ~(bitMask);
        int newNumber=notBitMask & n;
         System.out.println(newNumber);
    }
    public static void updateBit(){
        int n=5;
        int pos=1;
        int numToUpdate=0;
        int updateNum;
        int bitMask= 1 <<pos;
        if(numToUpdate==0){
            int notBit=~(bitMask);
            updateNum= notBit & n;
        }else{
            updateNum= bitMask | n;
        }
         System.out.println(updateNum);
    } 
    public static void main(String[] args) {
      //getBit();
     //setBit();
     //clearBit();
     //updateBit();
    }
}
