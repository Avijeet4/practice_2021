package arrays;

import java.util.HashMap;
import java.util.Map;

public class MedianOfTwoArray {
    static class  Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) {
        System.out.println(getMedian(new int[]{2}, new int[]{}));
//        Pair pair=getPair(new int[]{3,3}, 6);
//        System.out.println(pair.x+"  "+ pair.y);
    }

    static double getMedian(int[] a, int[] b){
        int n=a.length;
        int m=b.length;

        int tot=n+m;

        int x=(tot-1)/2;
        int y=tot/2;

        Double num1=null;
        Double num2=null;

        int i=0,j=0;

        while(num1==null || num2==null){
            int ai=Integer.MAX_VALUE;
            int bj=Integer.MAX_VALUE;
            if(i<n){
                ai=a[i];
            }
            if(j<m)
                bj=b[j];
            if(i+j==x){
                num1=ai<bj?(double)ai:bj;
            }
            if(i+j==y){
                num2=ai<bj?(double)ai:bj;
            }
            if(ai<bj){
                i++;

            }else{
                j++;
            }
        }
        return (num1+num2)/2;
    }

    static Pair getPair(int[] a, int target){
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<a.length; i++){
            if(map.containsKey(a[i])){
                return new Pair(map.get(a[i]), i);
            }
            map.put(target-a[i], i);
        }
        return null;
    }
}
