package arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangePositiveNegative {
    static void rearrange(int arr[], int n) {
        // code here
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        for(int x:arr){
            if(x<0)
                neg.add(x);
            else
                pos.add(x);
        }
        int i=0;
        int posi=0;
        int negi=0;
        while(i<n && posi<pos.size() && negi<neg.size()){
            if(i%2==0) {
                arr[i] = pos.get(posi);
                posi++;
            }else {
                arr[i] = neg.get(negi);
                negi++;
            }
            i++;
        }
        while(i<n && posi<pos.size()){
            arr[i]=pos.get(posi);
            i++;
            posi++;
        }
        while(i<n && negi<neg.size()){
            arr[i]=neg.get(negi);
            i++;
            negi++;
        }
    }

    public static void main(String[] args) {
        rearrange(new int[]{9, 4, -2, -1, 5, 0, -5, -3, 2,3,4,5}, 13);
        System.out.println();
    }
}
