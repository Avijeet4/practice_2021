package bits;
//Swap all odd and even bits
//Easy Accuracy: 60.12% Submissions: 14925 Points: 2
//Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.
//
//Example 1:
//
//Input: N = 23
//Output: 43
//Explanation:
//Binary representation of the given number
//is 00010111 after swapping
//00101011 = 43 in decimal.Swap all odd and even bits
//Easy Accuracy: 60.12% Submissions: 14925 Points: 2
//Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.
//
//Example 1:
//
//Input: N = 23
//Output: 43
//Explanation:
//Binary representation of the given number
//is 00010111 after swapping
//00101011 = 43 in decimal.
public class SwapOddAndEvenBits {
    public static int swapBits(int n)
    {
        int res=0;
//        int i=0;
//        while(1<<i <= n){
//            res|=((1<<i)&n)<<1;
//            res|=((1<<(i+1))&n)>>1;
//            i+=2;
//        }
        int i=0;
        while(n>>i > 0){
            res|=(n&(1<<i))<<1;
            res|=(n&(1<<(i+1)))>>1;
            i+=2;
        }
//        for(int i=31;i>=0;i-=2){
//            res|=(n<<i)<<1;
//            res|=(n<<(i+1))>>1;
//        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(swapBits(2));
    }
}
