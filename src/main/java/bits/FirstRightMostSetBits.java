package bits;

public class FirstRightMostSetBits {
    public static int getFirstSetBit(int n){

        // Your code here
//        if(n==0){
//            return 0;
//        }
//        if(n%2==1){
//            return 1;
//        }else
//            return 1+getFirstSetBit(n>>1);
         int res=1;
         while(n>0){
             if(n%2==1){
                 return res;
             }
             n/=2;
             res++;
         }
         return 0;
    }

    public static void main(String[] args) {
        System.out.println(getFirstSetBit(20));
    }
}
