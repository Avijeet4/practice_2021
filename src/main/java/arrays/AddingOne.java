package arrays;

import java.util.Vector;

public class AddingOne {
    static Vector<Integer> addOne(int[] a, int n) {
        // code here
        Vector<Integer> res=new Vector<>();
        int c=1;
        for(int i=n-1;i>=0;i--){
            if(a[i]+c==10){
                res.add(0,0);
                c=1;
            }else{
                res.add(0,a[i]+c);
                c=0;
            }
        }
        if(c==1){
            res.add(0,1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addOne(new int[]{5, 8, 7, 9}, 4));
    }
}
