package BitManipulation;

public class Bit {
    //	Bit Mask: 1<<i
	//  Operation: AND
    public static void getBit(){
       int n=5;
       int pos=2;
       int bitMask=1<<pos;

       if((bitMask & n)==0){
        System.out.println("Number is Zero");
       }
       else{
        System.out.println("Number is One");
       }
    }
    
    //Bit Mask: 1<<i
	//Operation: OR

    public static void setBit(){
     int n=5;
     int pos=2;
     int bitMask=1<<pos;
     int newNum=bitMask | n;
     System.out.println(newNum);
    }
    
    //i) Bit Mask: 1<<i
	//ii) Operation: AND with NOT

    public static void clearBit(){
        int n=5,pos=2;
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);

        int finalNum=notBitMask & n;
        System.out.println(finalNum);
    }
   
	//For 0:  BitMask: 1<<i  , Operation: AND with Not
	//For 1: BitMask: 1<<i  Operation: OR 

    public static void updateBit(){
        int n=5,pos=1;
        int numToBeUpdate=1;

        int bitMask=1<<pos;
        int finalNum;
        if(numToBeUpdate==0){
            int notBitMask=~(bitMask);
            finalNum=notBitMask & n;
        }else{
            finalNum=bitMask | n;
        }
        System.out.println(finalNum);
    } 
    public static void main(String[] args) {
      getBit();
     setBit();
     clearBit();
     updateBit();
    }
}
