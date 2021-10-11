package bits;

import java.util.Collections;
import java.util.List;

//Check if two numbers are bit rotations of each other or not
//Given two positive integers x and y, check if one integer is obtained by rotating bits of other.

public class BitRotation {
    public static boolean isRotation(long x, long y){
        long x64=x|(x<<32);
        while(x64>=y){
            if(unsigned(x64)==y){
                return true;
            }
            x64 >>= 1;
        }
        return false;
    }
    static long unsigned(long x64){
        return x64 & (2*(long)Integer.MAX_VALUE +1);
    }

    public static void main(String[] args) {
        System.out.println(isRotation(122, 2147483678l));
    }

    public static void printBits(long n){
        List<Long> bits = BitDifference.numberToBits(n);
        Collections.reverse(bits);
        bits.stream().forEach(System.out::print);
        System.out.println(" - "+bits.size());
    }
}
