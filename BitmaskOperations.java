import java.util.*;
public class BitmaskOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //this logic for finding the bit in a position of a number
        int n=5;
        int pos=1;
        int Bitmask =1<<pos;
        if((n & Bitmask)!=0){
            System.out.println("the no at position 2 is 1");
        }
        else{
            System.out.println("the no at position 2 is 0");
        }
        //logic for adding 1 to the position to a number
        int newnumber=Bitmask | n;
        System.out.println(newnumber);
        //clearimg the bit with position
        pos=2;
        Bitmask= 1<<pos;
        int notBitmask=~(Bitmask);
        int clearedmask = n & notBitmask;
        System.out.println(clearedmask);
        //update bit mask
        pos=2;
        Bitmask=1<<2;
        int updated=Bitmask ^ n;
        System.out.println("the no after updated is as follows"+updated);



    }
}
// 
