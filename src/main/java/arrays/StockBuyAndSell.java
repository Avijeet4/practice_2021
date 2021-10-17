package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuyAndSell {
    static ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int mini=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(mini!=i-1){
                    res.add(new ArrayList<>(Arrays.asList(mini,i-1)));
                }
                mini=i;
            }

        }
        if(mini!=n-1){
            res.add(new ArrayList<>(Arrays.asList(mini,n-1)));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(stockBuySell(new int[]{100,180,160,310,40,535,695}, 7));
    }
}
