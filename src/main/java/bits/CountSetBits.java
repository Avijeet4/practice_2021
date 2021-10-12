package bits;

public class CountSetBits {
//    static int leftMostBitPos(int n){
//        int m=0;
//        while(n>>m >1)
//            m++;
//        return m;
//    }
//
//    static int countSetBits(int n){
//        if(n==0){
//            return 0;
//        }
//        int base=leftMostBitPos(n);
//        int remainingNum=n-(int) Math.pow(2,base);
//        return (base*(int)Math.pow(2,base-1))+( remainingNum+ 1)
//                + countSetBits(remainingNum);
//    }
    public static int countSetBits(int n){

        if(n==0){
            return 0;
        }

        int base = findMSB(n);
        int num = (int)Math.pow(2,base);

        return (base*num)/2 +
                (n-(num)+1) +
                countSetBits(n-num);

    }

    public static int findMSB(int n) {
        int i =0;
        while(n>>i >1){
//            n=n>>1;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(17));;
    }
}
