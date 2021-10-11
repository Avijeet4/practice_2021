package bits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
//Example
//        Input: A = 10, B = 20
//        Output: 4
//        Explanation:
//        A  = 01010
//        B  = 10100
//        As we can see, the bits of A that need
//        to be flipped are 01010. If we flip
//        these bits, we get 10100, which is B.
//
//Expected Time Complexity: O(log N).
//Expected Auxiliary Space: O(1).
//
//Constraints:
//1 ≤ A, B ≤ 106
public class BitDifference {
    public static int countBitsFlipApproach1(int a, int b){

        // Your code here
        List<Long> bitsA=numberToBits(a);
        List<Long> bitsB=numberToBits(b);
        int i=0;
        int res=0;
        while(i<bitsA.size()&&i<bitsB.size()){
            if(bitsA.get(i)!=bitsB.get(i)){
                res++;
            }
            i++;
        }
        while(i<bitsA.size()){
            if(bitsA.get(i)==1){
                res++;
            }
            i++;
        }
        while(i<bitsB.size()){
            if(bitsB.get(i)==1)
                res++;
            i++;
        }
        return res;
    }

    static List<Long> numberToBits(long n){
        List<Long> bits=new ArrayList<>();
        while(n>0){
            bits.add(n%2);
            n/=2;
        }
        return bits;
    }

    public static int countBitsFlipApproach2(int a, int b){

        // Your code here
        return countSetBits(a^b);

    }

    public static int countSetBits(int n){
        int cnt=0;
        while (n>0){
            cnt++;
            n&=n-1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        System.out.println(countBitsFlipApproach1(1012328123,2131231321));
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        start=System.currentTimeMillis();
        System.out.println(countBitsFlipApproach2(1012328123,2131231321));
        end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
