package bits;

public class BinaryToGrayToBinary {
    static int getGray(int n) {
        // code here
        return n^(n>>1);
    }

    static int getBinary(int n){
        int res=n;
        while(n>0){
            n>>=1;
            res^=n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getGray(10));
        System.out.println(getBinary(15));

        System.out.println(BitDifference.numberToBits(20));
    }
}
