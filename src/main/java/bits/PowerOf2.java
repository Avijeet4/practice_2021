package bits;

public class PowerOf2 {
    public static boolean isPowerOfTwo(long n){
//        return n==0?false:(n&(n-1))==0;
        double e=Math.log10(n)/Math.log10(2);
        return e==(int)e;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1024));
    }
}
