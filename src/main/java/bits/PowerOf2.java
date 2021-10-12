package bits;

public class PowerOf2 {
    public static boolean isPowerOfTwo(long n){
        return n==0?false:(n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
}
